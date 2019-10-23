 package 字母频率统计;
 import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileInputStream;
 import java.io.FileNotFoundException;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.text.DecimalFormat;
 import java.util.*;
 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.Comparator;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import java.util.Map.Entry;
 public class test2 {
     public static void danci() throws FileNotFoundException {
         File file=new File("D:/QQ/1920126082/FileRecv/c1.txt");                  //读取文件
         Scanner input=new Scanner(file);
         HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
         while(input.hasNextLine()) {
             String line=input.nextLine();
             String[] lineWords=line.split("\\W+");          
             Set<String> wordSet=hashMap.keySet();
             for(int i=0;i<lineWords.length;i++) {
                 if(wordSet.contains(lineWords[i])) {
                     Integer number=hashMap.get(lineWords[i]);
                     number++;
                     hashMap.put(lineWords[i], number);  
                     }
                 else {
                     hashMap.put(lineWords[i], 1);
                 }
             }
         }
         for (String key : hashMap.keySet()) {
             System.out.println(key+"出现："+hashMap.get(key)+"次");
         }
     }
     
     public static void danci2() throws IOException {
         Scanner input=new Scanner(System.in);
         System.out.println("输入要统计的个数：");
         int n=input.nextInt();
         File file = new File("D:/QQ/1920126082/FileRecv/c1.txt");
         FileInputStream fis = new FileInputStream(file);
         InputStreamReader isr = new InputStreamReader(fis);
 
         int thechar;
         StringBuffer sb = new StringBuffer();
         HashMap<String, Integer> wordList = new HashMap<String, Integer>();
         
         while ((thechar = isr.read()) != -1) {
             char letter = (char) thechar;
             if ((letter >= 'a' && letter <= 'z')
                     || (letter >= 'A' && letter <= 'Z')) {
                 sb.append(letter);
             } else if (sb.length() != 0) {
                 String theword = new String(sb);
                 if (wordList.containsKey(theword)) {
                     wordList.put(theword, wordList.get(theword) + 1);
                 } else {
                     wordList.put(theword, 1);
                 }
                 sb.delete(0, sb.length());
             }
         }
         isr.close();
         
         List<Map.Entry<String, Integer>> words = new ArrayList<Map.Entry<String, Integer>>(
                wordList.entrySet());
         
         Collections.sort(words, new Comparator<Map.Entry<String, Integer>>() {
 
             @Override
             public int compare(Entry<String, Integer> o1,
                     Entry<String, Integer> o2) {
                 return -(o1.getValue() - o2.getValue());
             }
         });
         System.out.println("读取的文件中出现频率最多的"+n+"个单词是：");
         int i = 0;
         for (Map.Entry<String, Integer> node : words) {
             if (i < n) {
                 System.out.println(node.getKey() + " : " + node.getValue());
             } else {
                 break;
             }
             i++;
         }
     }
     public static void zimu() {
         DecimalFormat df = new DecimalFormat("0.00%");
         try {
             char shu[] = new char[100000];
             char zimu[] = new char[52];
             int j=0;
             int count[]=new int[52];
             String pathname="D:/QQ/1920126082/FileRecv/c1.txt";
             File filename=new File(pathname);
             InputStreamReader reader=new InputStreamReader(new FileInputStream(filename));
             BufferedReader br=new BufferedReader(reader);
             String line[]=new String[100000];;  
             for(int i=0;i<line.length;i++){
             line[i]=br.readLine();  
             }
             br.close();
             int k=0;
             while(line[k]!=null) {
                  for(int i=0;i<line[k].length();i++) {                              
                       shu[j]=line[k].charAt(i);
                       j++;                   
                  }
                  k++;
             }           
             for(int i=0;i<shu.length;i++) {
                  switch(shu[i]) {
                  case 'a':zimu[0]='a';count[0]++;break;
                  case 'b':zimu[1]='b';count[1]++;break;
                  case 'c':zimu[2]='c';count[2]++;break;
                  case 'd':zimu[3]='d';count[3]++;break;
                  case 'e':zimu[4]='e';count[4]++;break;
                  case 'f':zimu[5]='f';count[5]++;break;
                  case 'g':zimu[6]='g';count[6]++;break;
                  case 'h':zimu[7]='h';count[7]++;break;
                  case 'i':zimu[8]='i';count[8]++;break;
                  case 'j':zimu[9]='j';count[9]++;break;
                  case 'k':zimu[10]='k';count[10]++;break;
                  case 'l':zimu[11]='l';count[11]++;break;
                  case 'm':zimu[12]='m';count[12]++;break;
                  case 'n':zimu[13]='n';count[13]++;break;
                  case 'o':zimu[14]='o';count[14]++;break;
                  case 'p':zimu[15]='p';count[15]++;break;
                  case 'q':zimu[16]='q';count[16]++;break;
                  case 'r':zimu[17]='r';count[17]++;break;
                  case 's':zimu[18]='s';count[18]++;break;
                  case 't':zimu[19]='t';count[19]++;break;
                  case 'u':zimu[20]='u';count[20]++;break;
                  case 'v':zimu[21]='v';count[21]++;break;
                  case 'w':zimu[22]='w';count[22]++;break;
                  case 'x':zimu[23]='x';count[23]++;break;
                  case 'y':zimu[24]='y';count[24]++;break;
                  case 'z':zimu[25]='z';count[25]++;break;
                  case 'A':zimu[26]='A';count[26]++;break;
                  case 'B':zimu[27]='B';count[27]++;break;
                  case 'C':zimu[28]='C';count[28]++;break;
                  case 'D':zimu[29]='D';count[29]++;break;
                  case 'E':zimu[30]='E';count[30]++;break;
                  case 'F':zimu[31]='F';count[31]++;break;
                  case 'G':zimu[32]='G';count[32]++;break;
                  case 'H':zimu[33]='H';count[33]++;break;
                  case 'I':zimu[34]='I';count[34]++;break;
                  case 'J':zimu[35]='G';count[35]++;break;
                  case 'K':zimu[36]='K';count[36]++;break;
                  case 'L':zimu[37]='L';count[37]++;break;
                  case 'M':zimu[38]='M';count[38]++;break;
                  case 'N':zimu[39]='N';count[39]++;break;
                  case 'O':zimu[40]='O';count[40]++;break;
                  case 'P':zimu[41]='P';count[41]++;break;
                  case 'Q':zimu[42]='Q';count[42]++;break;
                  case 'R':zimu[43]='R';count[43]++;break;
                  case 'S':zimu[44]='S';count[44]++;break;
                  case 'T':zimu[45]='T';count[45]++;break;
                  case 'U':zimu[46]='U';count[46]++;break;
                  case 'V':zimu[47]='V';count[47]++;break;
                  case 'W':zimu[48]='W';count[48]++;break;
                  case 'X':zimu[49]='X';count[49]++;break;
                  case 'Y':zimu[50]='Y';count[50]++;break;
                  case 'Z':zimu[51]='Z';count[51]++;
                  }
             }   
             int ci=0;
             int sum=0;
             System.out.println("短文中各字母出现情况统计如下：");
             int a[]=new int[26];
             for(int i=0;i<26;i++)
             {
                 
                 a[i]=count[i]+count[i+26];              
                 int max=a[0];               
                 if(count[i]!=0) {                   
                     ci++;
                     sum+=count[i];          
                     System.out.println(ci+".字母"+zimu[i]+"或字母"+zimu[i+26]+"的出现次数是:"+a[i]);
                     }
             }
             for (int i = 0; i < 26; i++) {
                 //System.out.println(zimu[i]+"或字母"+zimu[i+26]+"出现的百分比为:"+df.format(count[i]*1.0/sum));
             }
             System.out.println("字母共计："+sum+"个");
         }catch (Exception e) {
             e.printStackTrace();
         }
     }
     
     public static void menu() {
         System.out.println("*****************************");
         System.out.println("欢迎访问本系统");
         System.out.println("1.统计字母出现情况");
         System.out.println("2.统计不重复单词情况");
         System.out.println("3.统计出现次数前n个单词");
         System.out.println("0.退出");
         System.out.println("*****************************");
         System.out.println("请选择：");
     }
    public static  void main(String[] args) throws IOException   {
     
     Scanner shuru=new Scanner(System.in);
     int a=1;
     
     while(a!=0) {
         menu();
         a=shuru.nextInt();
         switch(a)
         {
         case 1:zimu();break;
         case 2:danci();break;
         case 3:danci2();break;
         case 0:a=0;break;
         default:a=0;break;
         }
     }
 }
 }