1.	import java.awt.FlowLayout;  
2.	import javax.swing.JFrame;  
3.	import javax.swing.JScrollPane;  
4.	import javax.swing.JtextArea;  
5.	  
6.	public class JScrollPaneExample {  
7.	    private static final long serialVersionUID = 1L;  
8.	  
9.	    private static void createAndShowGUI() {  
10.	  
11.	        // Create and set up the window.  
12.	        final JFrame frame = new JFrame("Scroll Pane Example");  
13.	  
14.	        // Display the window.  
15.	        frame.setSize(500, 500);  
16.	        frame.setVisible(true);  
17.	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
18.	  
19.	        // set flow layout for the frame  
20.	        frame.getContentPane().setLayout(new FlowLayout());  
21.	  
22.	        JTextArea textArea = new JTextArea(20, 20);  
23.	        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
24.	  
25.	        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
26.	        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
27.	  
28.	        frame.getContentPane().add(scrollableTextArea);  
29.	    }  
30.	    public static void main(String[] args) {  
31.	  
32.	  
33.	        javax.swing.SwingUtilities.invokeLater(new Runnable() {  
34.	  
35.	            public void run() {  
36.	                createAndShowGUI();  
37.	            }  
38.	        });  
39.	    }  
40.	}  
