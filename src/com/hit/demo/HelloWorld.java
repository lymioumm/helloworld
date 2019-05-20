package com.hit.demo;

public class HelloWorld {
    public  static void main(String[] args)
    {
        System.out.println("HelloWorld！");
        /*long j=10000000000L;
        System.out.println(j);
        float f=12.345F;
        System.out.println(f);
        byte a=3;
        int b=4;
        byte c=(byte)(a+b);
        System.out.println(c);
        int d=a+b;
        System.out.println(d);
        byte b1=(byte)130;
        System.out.println("b1="+b1);
        System.out.println('a');
        System.out.println('a'+1);
        System.out.println("hello"+'a'+1);
        System.out.println('a'+1+"hello");
        System.out.println("5+5="+5+5);
        System.out.println(5+5+"=5+5");
        System.out.println(10/3.0);
        System.out.println(10%3);*/
        /*int a=3;
        int b=4;
        int c=a++;
        int d=b--;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("d:"+d);
        short s=1;
        s+=1;
        System.out.println("s="+s);*/
        /*int a=3;
        int b=4;
        int c=5;
        System.out.println((a>b)&&(a>c));
        System.out.println((a>b)&&(a<c));
        System.out.println((a<b)&&(a>c));
        System.out.println((a<b)&&(a<c));
        int x=0;
        int  y=0;
        boolean b1=((++x==3)&&(y++==4));
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println(b1);*/
        /*int a=3;
        int b=4;
        System.out.println(3&4);
        System.out.println(3|4);
        System.out.println(3^4);
        System.out.println(~3);
*/
        /*int a=10;
        int b=20;
        System.out.println(a^b^b);
        System.out.println(a^b^a);*/
        /*int a=10;
        int b=20;
        System.out.println("a:"+b+",b:"+a);*/
        /*int c=a;
        a=b;
        b=c;
        System.out.println("a:"+a+",b;"+b);
        System.out.println("-----------");*/
        /*a=a^b;
       b=a^b;
      a=a^b;*/
        /*a=a+b;
        b=a-b;
        a=a-b;*/
       /* b=(a+b)-(a=b);
        System.out.println("a:"+a+",b;"+b);*/
       /*System.out.println(3<<3);
       System.out.println(24>>3);
       System.out.println(24>>>3);
       System.out.println(24>>>2);*/
       /*int a=2;
       int b=3;
       switch(a)
       {
           default:
               b++;
           case 3:
               b=1;
           case 4:
               b--;
       }
       System.out.println(b);*/
       /*for(int x=0;x<10;x++)
       {
           if(x==3)
           {
               break;
           }
           System.out.println("Have a nice day!");
       }*/
       /*wc:for(int x=0;x<3;x++)
       {
           nc:for(int y=0;y<4;y++)
           {
               if(y==2)
               {
//                   break nc;
                   break wc;
               }
               System.out.println("*");
           }
           System.out.println();
       }*/
      /* int x=10;
       int y=20;
       sum(x,y);
       System.out.println(sum(x,y));
       System.out.println(30);
       int result=sum(x,y);
       System.out.println(result);*/
      /*System.out.println(sum(10,20));
      System.out.println(sum(10,20,30));
      System.out.println(sum(10,20,30,40));
      System.out.println(sum(10.5F,20));*/
      /*System.out.println("----arr-----");
      int[] arr=new int [3];
      arr[0]=88;
      arr[1]=33;
      arr[2]=66;
      System.out.println(arr);
      System.out.println(arr[0]);
      System.out.println(arr[1]);
      System.out.println(arr[2]);
      System.out.println("----arr1----");
        int[] arr1=new int [3];
        arr1[0]=22;
        arr1[1]=44;
        arr1[2]=55;
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("----arr2---");
        int[] arr2=arr;
        arr2[0]=100;
        arr2[1]=200;
//        arr2[2]=66;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);*/
      /*int[] arr={1,2,3};
      System.out.println("sequence:");
      System.out.println(arr[0]);
      System.out.println(arr[1]);
      System.out.println(arr[2]);
      reverse1(arr);
        System.out.println("DIS_sequence:");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);*/
//      System.out.println(arr[3]);
//        arr=null;
//        System.out.println(arr[0]);



//        二维数组



//        格式1


        //定义了一个二维数组arr
//        int[][] arr=new int[3][2];
//        这个二维数组有3个一维数组的元素
//        每一个一维数组有2个元素
//        输出二维数组名称
       /* System.out.println(arr);//地址值
//        输出二维数组的第一个元素一维数组的名称
        System.out.println(arr[0]);//地址值
        System.out.println(arr[1]);//地址值
        System.out.println(arr[2]);//地址值
//        输出二维数组的元素
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);*/



//       格式2



       /* int[][] arr=new int[3][];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//        动态的为每一个一维数组分配空间
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[1];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
//        ArrayIndexOutOfBoundsException
        System.out.println(arr[0][2]);//错误*/



//       格式1，格式2属于动态初始化




//       格式3


//        定义数组
        /*int[][] arr = {{1, 2, 3}, {4, 5}, {6}};
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[0][0]);
        System.out.println(arr[1][0]);
        System.out.println(arr[2][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][1]);//越界出错*/




//        二维数组的遍历


//        定义一个二维数组
//        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        arr[0]就是第一个数组
//        arr[0]={1,2,3}
        /*for (int x = 0; x < arr[0].length; x++) {
            System.out.println(arr[0][x]);
        }
        System.out.println("---------");
        for (int x = 0; x < arr[1].length; x++) {
            System.out.println(arr[1][x]);
        }
        System.out.println("----------");
        for (int x = 0; x < arr[2].length; x++) {
            System.out.println(arr[2][x]);
        }
        System.out.println("---------");*/
//        用循环改进
        /*for (int x = 0; x < 3; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.println(arr[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println("------------");*/


        /*int[][] arr = {{1, 2, 3}, {4, 5}, {6}};
        printArray2(arr);
        System.out.println(SumArray(arr));*/


        /*Java参数传递问题
        Java中的参数传递问题：
        基本类型：形式参数的改变对实际参数没有影响。
        引用类型：形式参数的改变直接影响实际参数。*/


       /* 在Java中，只有值传递，只不过基本类型传递的是基本类型的数据值，
        而引用类型传递的是地址值*/


        /*int a = 10;
        int b = 20;
        System.out.println("a:" + a + ",b:" + b);
        change(a, b);
        System.out.println("a:" + a + ",b:" + b);
        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(arr[1]);*/


//面向对象思想
        /*面向过程：强调的是每一个功能的步骤
        面向对象：强调的是对象，然后由对象去调用功能*/
       /* 面向对象的思想特点
        A:是一种更符合我们思想习惯的思想
        B:可以将复杂的事情简单化
        C:将我们从执行者变成了指挥者*/



    }


    public static void change(int a, int b) {
        System.out.println("a:" + a + ",b:" + b);
        a=b;
        b=a+b;
        System.out.println("----");
        System.out.println("a:"+a+",b:"+b);
    }

    public static void change(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 2 == 0) {
                arr[x]*=2;
            }
        }
    }

    private static int SumArray(int[][] arr) {
        int sum=0;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                sum += arr[x][y];
            }
        }
        return sum;
    }

    /*public static boolean  SumArrya(int[][] arr) {

    }*/
    public static void printArray2(int[][] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.println(arr[x][y] + " ");
            }
            System.out.println();
        }
    }
    public static void reverse(int[] arr)
    {
        for(int x=0;x<arr.length/2;x++)
        {
            int temp=arr[x];
            arr[x]=arr[arr.length-1-x];
            arr[arr.length-1-x]=temp;
        }
    }
    public static void reverse1(int[] arr)
    {
        for(int start=0,end=arr.length-1;start<=end;start++,end--)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }



    public static int sum(int a,int b)
    {
        System.out.println("int");
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }
    public static float sum(float a,float b)
    {
        System.out.println("float");
        return a+b;
    }
}
