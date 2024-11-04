import java.util.ArrayList;
import java.util.List;

public class King extends Piece
{
    King(byte row, byte col, byte teamNo,String pieceName)
    {
        super(row,col,teamNo,pieceName);
    }
    @Override
    public List<Byte[]> getMoves()
    {
        List<Byte[]> moves = new ArrayList<>();
        return moves;
    }
    @Override
    public void move(List<Byte[]> moves)
    {
        byte moveRow=Input.getByte();
        byte moveCol=Input.getByte();
        byte[] currMove={moveRow,moveCol};
        if(moves.contains(currMove))
        {
            this.row=moveRow;
            this.col=moveCol;
        }
    }
}