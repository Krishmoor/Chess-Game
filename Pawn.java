import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece
{
    Pawn(byte row, byte col, byte teamNo,String pieceName)
    {
        super(row,col,teamNo,pieceName);
    }
    public List<Byte[]> getMoves()
    {
        List<Byte[]> moves = new ArrayList<Byte[]>();
        return moves;
    }
    public void move(List<Byte[]> moves)
    {
        byte row=Input.getByte();
        byte col=Input.getByte();
        int[] currMove={row,col};
        if(moves.contains(currMove))
        {
            this.row=row;
            this.col=col;
        }
    }
}
