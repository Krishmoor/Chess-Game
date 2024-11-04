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
        Piece pawnPiece1=new Pawn((byte)1,(byte)0,(byte)0,"BP1");
        Piece pawnPiece2=new Pawn((byte)1,(byte)1,(byte)0,"BP2");
        Piece pawnPiece3=new Pawn((byte)1,(byte)2,(byte)0,"BP3");
        Piece pawnPiece4=new Pawn((byte)1,(byte)3,(byte)0,"BP4");
        Piece pawnPiece5=new Pawn((byte)1,(byte)4,(byte)0,"BP5");
        Piece pawnPiece6=new Pawn((byte)1,(byte)5,(byte)0,"BP6");
        Piece pawnPiece7=new Pawn((byte)1,(byte)6,(byte)0,"BP7");
        Piece pawnPiece8=new Pawn((byte)1,(byte)7,(byte)0,"BP8");
        Piece rook1=new Rook((byte)0, (byte)0, (byte)0,"BR1");
        Piece knight1=new Knight((byte)0, (byte)1, (byte)0,"BN1");
        Piece bishop1=new Bishop((byte)0, (byte)2, (byte)0, "BB1");
        Piece Queen1=new Queen((byte)0, (byte)3, (byte)0, "BQ1");
        Piece king1=new King((byte)0, (byte)4, (byte)0, "BK1");
        Piece bishop2=new Bishop((byte)0, (byte)5, (byte)0, "BB2");
        Piece knight2=new Knight((byte)0, (byte)6, (byte)0, "BN2");
        Piece rook2=new Rook((byte)0, (byte)7, (byte)0,"BR2");
        board[1][0]=pawnPiece1;
        board[1][1]=pawnPiece2;
        board[1][2]=pawnPiece3;
        board[1][3]=pawnPiece4;
        board[1][4]=pawnPiece5;
        board[1][5]=pawnPiece6;
        board[1][6]=pawnPiece7;
        board[1][7]=pawnPiece8;
        board[0][0]=rook1;
        board[0][1]=knight1;
        board[0][2]=bishop1;
        board[0][3]=Queen1;
        board[0][4]=king1;
        board[0][5]=bishop2;
        board[0][6]=knight2;
        board[0][7]=rook2;
        
        Piece pawnPiece11=new Pawn((byte)6,(byte)0,(byte)1,"WP1");
        Piece pawnPiece12=new Pawn((byte)6,(byte)1,(byte)1,"WP2");
        Piece pawnPiece13=new Pawn((byte)6,(byte)2,(byte)1,"WP3");
        Piece pawnPiece14=new Pawn((byte)6,(byte)3,(byte)1,"WP4");
        Piece pawnPiece15=new Pawn((byte)6,(byte)4,(byte)1,"WP5");
        Piece pawnPiece16=new Pawn((byte)6,(byte)5,(byte)1,"WP6");
        Piece pawnPiece17=new Pawn((byte)6,(byte)6,(byte)1,"WP7");
        Piece pawnPiece18=new Pawn((byte)6,(byte)7,(byte)1,"WP8");
        Piece rook11=new Rook((byte)7, (byte)0, (byte)1,"WR1");
        Piece knight11=new Knight((byte)7, (byte)1, (byte)1, "WN1");
        Piece bishop11=new Bishop((byte)7, (byte)2, (byte)1, "WB1");
        Piece queen2=new Queen((byte)7, (byte)3, (byte)1, "WQ1");
        Piece king2=new King((byte)7, (byte)4, (byte)1, "WK1");
        Piece bishop12=new Bishop((byte)7, (byte)5, (byte)0, "WB2");
        Piece knight12=new Knight((byte)7, (byte)6, (byte)1, "WN2");
        Piece rook12=new Rook((byte)7, (byte)7, (byte)1,"WR2");
        
        board[6][0]=pawnPiece11;
        board[6][1]=pawnPiece12;
        board[6][2]=pawnPiece13;
        board[6][3]=pawnPiece14;
        board[6][4]=pawnPiece15;
        board[6][5]=pawnPiece16;
        board[6][6]=pawnPiece17;
        board[6][7]=pawnPiece18;
        board[7][0]=rook11;
        board[7][1]=knight11;
        board[7][2]=bishop11;
        board[7][3]=queen2;
        board[7][4]=king2;
        board[7][5]=bishop12;
        board[7][6]=knight12;
        board[7][7]=rook12;
                
    }
}
