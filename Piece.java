import java.util.List;

abstract public class Piece
{
    final String pieceName;
    byte row;
    byte col;
    final byte teamNo;

    Piece(byte row, byte col, byte teamNo, String pieceName)
    {
        this.pieceName = pieceName;
        this.row = row;
        this.col = col;
        this.teamNo = teamNo;
    }
    abstract public List<Byte[]> getMoves();
    abstract public void move(List<Byte[]> moves);
}