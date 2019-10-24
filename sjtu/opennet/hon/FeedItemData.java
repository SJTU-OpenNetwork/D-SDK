package sjtu.opennet.hon;

import sjtu.opennet.pb.View.Comment;
import sjtu.opennet.pb.View.Files;
import sjtu.opennet.pb.View.Ignore;
import sjtu.opennet.pb.View.Join;
import sjtu.opennet.pb.View.Leave;
import sjtu.opennet.pb.View.Like;
import sjtu.opennet.pb.View.Text;
import sjtu.opennet.pb.View.Announce;

public class FeedItemData {
    public FeedItemType type;
    public String block;
    public Text text;
    public Comment comment;
    public Like like;
    public Files files;
    public Ignore ignore;
    public Join join;
    public Leave leave;
    public Announce announce;
}
