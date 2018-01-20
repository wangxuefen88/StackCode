public class Stack_Array implements Stack {
 //数组容量默认
 public static final int Capacity = 1024;
 //数组实际容量
 public int Capacity_Array;
 //生命数组
 public Object s[];
 //栈顶
 public int top=-1;

//构造函数数组构造函数
public int Stack_Array(){
    this(category);
}
//实际数组
    public int Stack_Array(int Capacity_Array){
        return s=this(Capacity_Array);
    }
   //得到数量
    @Override
    public int getSize() {
        return (top+1);
    }
   //是否为空
    @Override
    public boolean isEmty() {
        return (top<0);
    }

    //取栈顶元素
    @Override
    public Object pop() {
        Object Arraytop= s[top];
        s[top--]=null;
        return Arraytop;
    }

    //查看栈顶元素
    @Override
    public Object top() {
        return s[top];
    }

   //入栈顶元素
    @Override
    public void push(Object element) {
        s[top++]=element;
    }
    

}
