public class Main {
    static Piece[][] board = new Piece[8][8];
    public static void main(String[] args) {
        initializeBoard();
        Main main = new Main();
        main.printBoard();
    }
    void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(board[i][j] == null){
                    System.out.print("  O  ");
                }
                else
                    System.out.printf(" %-3s ",board[i][j].pieceName);
            }
            System.out.println();
        }
    }
    public static void initializeBoard() {
        Piece pawnPiece1=new Pawn((byte)1,(byte)0,(byte)0,"WP1");
        Piece pawnPiece2=new Pawn((byte)1,(byte)1,(byte)0,"WP2");
        Piece pawnPiece3=new Pawn((byte)1,(byte)2,(byte)0,"WP3");
        Piece pawnPiece4=new Pawn((byte)1,(byte)3,(byte)0,"WP4");
        Piece pawnPiece5=new Pawn((byte)1,(byte)4,(byte)0,"WP5");
        Piece pawnPiece6=new Pawn((byte)1,(byte)5,(byte)0,"WP6");
        Piece pawnPiece7=new Pawn((byte)1,(byte)6,(byte)0,"WP7");
        Piece pawnPiece8=new Pawn((byte)1,(byte)7,(byte)0,"WP8");
        board[1][0]=pawnPiece1;
        board[1][1]=pawnPiece2;
        board[1][2]=pawnPiece3;
        board[1][3]=pawnPiece4;
        board[1][4]=pawnPiece5;
        board[1][5]=pawnPiece6;
        board[1][6]=pawnPiece7;
        board[1][7]=pawnPiece8;
        Piece pawnPiece11=new Pawn((byte)6,(byte)0,(byte)1,"BP1");
        Piece pawnPiece12=new Pawn((byte)6,(byte)1,(byte)1,"BP2");
        Piece pawnPiece13=new Pawn((byte)6,(byte)2,(byte)1,"BP3");
        Piece pawnPiece14=new Pawn((byte)6,(byte)3,(byte)1,"BP4");
        Piece pawnPiece15=new Pawn((byte)6,(byte)4,(byte)1,"BP5");
        Piece pawnPiece16=new Pawn((byte)6,(byte)5,(byte)1,"BP6");
        Piece pawnPiece17=new Pawn((byte)6,(byte)6,(byte)1,"BP7");
        Piece pawnPiece18=new Pawn((byte)6,(byte)7,(byte)1,"BP8");
        board[6][0]=pawnPiece11;
        board[6][1]=pawnPiece12;
        board[6][2]=pawnPiece13;
        board[6][3]=pawnPiece14;
        board[6][4]=pawnPiece15;
        board[6][5]=pawnPiece16;
        board[6][6]=pawnPiece17;
        board[6][7]=pawnPiece18;

    }
}