//main() -> main함수 
//add() -> add함수
/* 주석을 사용하는 첫번째 방법
   여러줄의 주석을 사용할 때 사용(가급적 사용안함)*/
// <=한 줄 주석만 가능
// VScode에서 ctrl + / 는 그 범위 주석 토글키
/* VScode에서 한줄 삭제 ctrl + shift + k 
              한줄 복사 Shift + Alt + ↑ , Shift + Alt + ↓
              한줄 이동 Alt + ↑ , Alt + ↓ */
//함수란 = 수학적으로 엄밀한 관계, 원인과 결과가 확실히 있는 관계, 원인은 여러개 일수 있어도 결과는 1개 인 것
// void main(String[] args)에서 void는 결과(return값) , main은 변수명 , (String[] args)는 원인(Parameter,매개변수)라고 함.
// void는 결과(return값)가 없음을 표현 ex)자판기 품절
// System.out.println에서 .은 ~에,~의 속해있는 이라고 해석하면 됨
// 변수는 시작주소(16진수로 표기), size를 가지고 있고, 이를 쉽게 호출하기 위해 변수명을 부여한다.
// 여기서 시작주소를 16진수로 표기하는 이유는 2진수와의 호환성 그리고 가독성이 좋기때문
// CPU --INSTRUCTION(명령)--> controller(bridge) --INSTRUCTION(명령)-->  MOMORY                   
//     --ADDRESS(주소)------>                    --ADDRESS(주소)------>
//     --DATA(데이터)------->                    --DATA(데이터)------->
// DATA는 한번에 4byte씩 왔다갔다함, 메모리가 8줄 있다치면 4줄씩 묶어서 채널(CH)가 나뉜다. 한줄에 8bit, 4줄이면 32bit 고로 4byte.
// 보통 숫자를 표현할때 DATA Type를 INTEGER로 쓴다. byte나 short를 써도 특별히 속도가 빠른것이 아님.
// 메모리는 말했다시피 4줄씩 묶어서 즉, 4byte씩 왔다 갔다 하기때문에 오히려 속도면에서 유리.
// 1byte 데이터 타입과 2byte 데이터 타입을 쓸땐 모자란 부분의 패딩처리로 인해 그 시간을 할당해야되서 속도가 더 느려짐.
// ** 컴퓨터를 공부하는 방법 **
/*    1. 어떻게 만드냐?(create)
      2. 어떻게 쓰냐?(write)
      3. 어떻게 읽는가?(Read)     
*/

// JAVA는 생성과 동시에 초기화 해주는 것이 가장 인상적.
// DATA TYPE에는 2가지가 있다.
/* 1.PRIMITIVE TYPE(원시데이터 타입,기본형 타입)
   -정수형 대표 int 4byte
   -실수형 대표 double 8byte
   -논리형 대표 bloolean 1byte

   2.Reference Type(참조형 데이터 타입)
 */

public class day2 {
    public static void main(String[] args) {

        System.out.println("이진섭님 ");
        System.out.println("안녕하세요");
        System.out.println("반갑습니다");

        //1. 변수를 생성한다.
        int a = 5;      // 변수의 생성 및 초기화.
        int b = 20;
        
        a = 30; 

        int c;      // 변수의 생성 , 선언(초기화가 되지 않는 변수를 생성)
        c = 30;     // 변수에 값을 대입(white)

        //변수의 정체 = 시작주소(0x00123ff 주소는 16진수로 표기) + 크기(기본4byte)

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        double d = 3.0; // float보다 해상도(resolution)가 높다. 컴퓨터에서 실수 5.0은 5.0과 가장가까운수를 표현. 기기마다 그때그때 시스템에 따라 다름
        float f = 5.0f; // double보다 해상도가 낮다.
        //기본 소수점 계산은 double을 쓰는게 좋다. 정밀도가 더 높음.

        System.out.println(d);
        System.out.println(f);

        int a1 = 10; // 이 코드의 한줄을 statement라고 한다.
        int a2 = 3;
        int a3 = a1 / a2;
        int a4 = a1 % a2; //mod 연산이라고 함(나머지 연산)

        System.out.println(a3); //소수점은 버려지고 정수만 남는걸 묵시적 형변환이라 한다.
        System.out.println(a4); //소수점은 버려지고 정수만 남는걸 묵시적 형변환이라 한다.

        int x1 = 10;
        int x2 = x1++; // x1=x1+1의 의미를 가짐, ++는 단항 연산자라고 함
                       // 풀어서 쓰면 int x2 = x1;
                       //            x1 = x1 + 1;

        System.out.println(x2);
        System.out.println(x1);
        
        // 10나누기0은 왜 무한으로 나오는가? - 면접에 나옴
        // ->  CPU는 나누기 개념이 없고 빼어지는 피지수의 몫이 크다면 계속 빼는 연산을 하기 때문이다. 
        // 비트연산자, 삼항연산자는 일단 건너뛴다. 



    }
}                                             