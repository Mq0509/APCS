// Lemon Water: May Qiu, Emily Ortiz, Josiah Moltz
// APCS pd6
// APCS pd0
// HW69 -- maze solving (blind, depth-first)
// 2022-03-03
// time spent: 1 hrs

/***
CODE EXPLANATION:
  Base cases:
    Solved:
      If it is solved, we just need to go backwards along our path back to where we started.
      Thus, we just return the code as is.
    We are at the end of the maze:
      If we are at the end of the maze, we have just solved the maze. Thus we make _solved true, and return.
    We are looking off the map:
      If we are looking off the map, there is nothing to do but stop before we go off the map, so we just return.
  Body:
    Set current square to '@' to show that we are currently probing from this square.
    Attempt to solve the maze by sequentially checking every if a solution exists for each of the 4 squares we can move to.
    If no solution exists from this squre, replace the square with a '.' and return, since there is nothing left to do.
    
 * DISCO
 * 0. # is an OCTOTHORPE not a "hashtag" but May is going to call it a hastag anyways B)
 * 1. Default terminal window is 80X25
 * 2. Emily and May slayed at SING!
 * 3. System.Exit(0) terminates the JVM - intertrash
 * 4. The reason our code backed up after solving for a little bit, but then stopped was
      because we weren't actually calling another solve(), instead we had just checked in all directions
      and were replacing @ with .
  * 5. SING! was RIGGED >:(
 * QCC
 * 0. Why was System.Exit(0) required in the KnightTour?
 * 1. Was System.Exit(0) required as a base case in Maze.java?
 ***/

//enable file I/O
import java.io.*;
import java.util.*;


class MazeSolver
{
  final private int FRAME_DELAY = 50;

  private char[][] _maze;
  private int h, w; // height, width of maze
  private boolean _solved;

  //~~~~~~~~~~~~~  L E G E N D  ~~~~~~~~~~~~~
  final private char HERO =           '@';
  final private char PATH =           '#';
  final private char WALL =           ' ';
  final private char EXIT =           '$';
  final private char VISITED_PATH =   '.';
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public MazeSolver( String inputFile )
  {
    // init 2D array to represent maze
    // (80x25 is default terminal window size)
    _maze = new char[80][25];
    h = 0;
    w = 0;

    //transcribe maze from file into memory
    try {
      Scanner sc = new Scanner( new File(inputFile) );

      System.out.println( "reading in file..." );

      int row = 0;

      while( sc.hasNext() ) {

        String line = sc.nextLine();

        if ( w < line.length() )
          w = line.length();

        for( int i=0; i<line.length(); i++ )
          _maze[i][row] = line.charAt( i );

        h++;
        row++;
      }

      for( int i=0; i<w; i++ )
        _maze[i][row] = WALL;
      h++;
      row++;

    } catch( Exception e ) { System.out.println( "Error reading file" ); }

    //at init time, maze has not been solved:
    _solved = false;
  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, ESC
    //emacs shortcut: M-x quoted-insert, ESC

    int i, j;
    for( i=0; i<h; i++ ) {
      for( j=0; j<w; j++ )
        retStr = retStr + _maze[j][i];
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void solve(int x,int y) -- recursively finds maze exit (depth-first)
   * @param x starting x-coord, measured from left
   * @param y starting y-coord, measured from top
   **/
  public void solve( int x, int y )
  {
    delay( FRAME_DELAY ); //slow it down enough to be followable

    //primary base case
    if ( _solved ) {
	    return;
    }
    //other base cases
    else if ( _maze[x][y] == '$' ) {
	    _solved = true;
      System.out.println( this );
      return;
    }
    else if ( _maze[x][y] != '#' ) {  // VERY IFFY PLEASE CHECK MAYBE AT????
      return;
    }
    //otherwise, recursively solve maze from next pos over,
    //after marking current location
    else {
      _maze[x][y] = '@';
      System.out.println( this ); //refresh screen
      solve(x, y+1);
      solve(x+1, y);
      solve(x, y-1);
      solve(x-1, y);
      _maze[x][y] = '.';
      System.out.println( this ); //refresh screen
      return;
    }
  }

  //accessor method to help with randomized drop-in location
  public boolean onPath( int x, int y) {
    if (_maze[x][y] != '#'){
      return false;
    } else {
      return true;
    }
  }

}//end class MazeSolver


public class Maze
{
  public static void main( String[] args )
  {
    String mazeInputFile = null;

    try {
      mazeInputFile = args[0];
    } catch( Exception e ) {
      System.out.println( "Error reading input file." );
      System.out.println( "USAGE:\n $ java Maze path/to/filename" );
    }

    if (mazeInputFile==null) { System.exit(0); }

    MazeSolver ms = new MazeSolver( mazeInputFile );

    //clear screen
    System.out.println( "[2J" );

    //display maze
    System.out.println( ms );

    //drop hero into the maze (coords must be on path)
    // ThinkerTODO: comment next line out when ready to randomize startpos
    //ms.solve( 4, 3 );

    //drop our hero into maze at random location on path
    int startX = (int) (Math.random() * 80);
    int startY = (int) (Math.random() * 25);

    while (ms.onPath(startX, startY) == false){
      startX = (int) (Math.random() * 80);
      startY = (int) (Math.random() * 25);
    }

    ms.solve( startX, startY );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class Maze
