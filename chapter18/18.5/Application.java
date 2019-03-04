import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import java.awt.*;
public class Application  extends JFrame implements TreeSelectionListener{
      TreeComponent  mainBody,branchOne,branchTwo , apple[];
      DefaultMutableTreeNode trunk,branch1,branch2, leaf[] ;
      JTree tree;
      final static int MAX=18;
      JTextArea text;
      public Application() {
          mainBody=new TreeBody("����",786);
          trunk=new  DefaultMutableTreeNode(mainBody);
          branchOne=new TreeBody("��֦",45); 
          branch1=new  DefaultMutableTreeNode(branchOne);
          branchTwo=new TreeBody("��֦",25);
          branch2=new  DefaultMutableTreeNode(branchTwo); 
          apple=new Apple[MAX];
          leaf=new DefaultMutableTreeNode[MAX];
          for(int i=0;i<MAX;i++){
                apple[i]=new Apple("ƻ��",0.25);
                leaf[i]=new DefaultMutableTreeNode(apple[i]); 
          }
          mainBody.add(branchOne);
          trunk.add(branch1);
          mainBody.add(branchTwo);
          trunk.add(branch2); 
          for(int i=0;i<=7;i++){
                 branchOne.add(apple[i]);
                 branch1.add(leaf[i]);
          }
          for(int i=8;i<MAX;i++){
                 branchTwo.add(apple[i]);
                 branch2.add(leaf[i]);
          }
          tree =new JTree(trunk);
          tree.addTreeSelectionListener(this);
          text=new JTextArea(20,20);
          text.setFont(new Font("����",Font.BOLD,12));
          text.setLineWrap(true);
          setLayout(new GridLayout(1,2));
          add(new JScrollPane(tree));
          add(new JScrollPane(text)); 
          setBounds(70,80,460,320);
          setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          setVisible(true);
      }
      public void valueChanged(TreeSelectionEvent e){
           text.setText(null);
           DefaultMutableTreeNode node=
           (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
           TreeComponent  treeComponent=(TreeComponent)node.getUserObject();
           String allName=Computer.getAllChildrenName(treeComponent);
           double weight=Computer.computerWeight(treeComponent);
           String mess=null;
           if(treeComponent.isLeaf())
                mess=allName+"������:\n"+weight+"����";
           else
               mess=allName+"����һ�������:\n"+weight+"����"; 
           text.append(mess+"\n");
           double unit=4;
           double value=Computer.computerValue(treeComponent,unit);
           String name=treeComponent.toString();
           if(treeComponent.isLeaf())
                mess=name+"�ļ�ֵ��"+unit+"Ԫ/kg��"+value+"Ԫ";
           else
                mess=name+"����ƻ���ļ�ֵ��"+unit+"Ԫ/kg��"+value+"Ԫ";
           text.append("\n"+mess);
      }
      public static void main(String args[]) {
           new Application();   
      }
}
