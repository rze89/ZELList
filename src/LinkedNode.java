public class LinkedNode<T> extends ZELLItemType<T>{
  
	private LinkedNode<T> link;
    
	private T info;

    public LinkedNode(T info)
    //constructor
    {
      this.info = info;
      link = null;
    }

    public void setInfo(T info)
    // Sets the info to the node
    {
      this.info = info;
    }

    public T getInfo()
    // Returns the info of the selected node
    {
      return info;
    }

    public void setLink(LinkedNode<T> link)
    // Sets the link of the selected node
    {
      this.link = link;
    }

    public LinkedNode<T> getLink()
    // goes and returns the lnik of the node
    {
      return link;
    }
}