//피연산자 = operand
//연산자 = operator
//연산 = operation
/*순차구조-위에서 아래로
 *조건(분기)구조-이중분기 : ex)남자, 여자 = if ~else
               -다중분기 : ex)1반,2반,3반 = if else, else if
 *순환구조-N번 반복 - 결정루프 = 몇번 반복할지 알때 ex)구구단
                   -비결정루프 = 몇번 반복 할지 모를때 ex)사용자가 ok를 누를때까지 반복

 */
//switch ,case 문은 정수만 쓰는게 정석. 소수는 불가. 단,자바17이상부터는 문자열도 가능하지만 필드에선 17을 거의 안쓰기때문. 필드엔 안전성 확보 8,11이 가장 많음
//readability(리더빌리티) - 현대코딩에서 코드는 가독성을 높여주는게 덕목.
//if문과 switch문 쓰임새
//if문은 범위가 있을때 if문을 사용.
//switch문은 값이 딱 정해져 있을때 1반이면 1반 , 남자면 남자, 등등 이럴땐 switch문을 사용하는 것이 좋다.


public class day3 {
public static void main(String[] args) {

        //a가 10보다 큰지 작은지를 판단하는 
        int a = 10;
        
        //if문 안에 (조건식)은 boolean 결과를 도출.
        //그래서 (조건식)을 고급지게 표현하면 "boolean expression(조건 표현식)"이라 표현!
        if(a > 10)
        {
            System.out.println("a는10보다 큽니다.");
        }
        else
        {
            System.out.println("a는10보다 작습니다.");
        }
// 논리연산의 기호 !=(현업에서는 가급적 안쓴다) , == , >= , <= , && , || 

        // 
        int age = 0;
        if(age <= 9)
        {
            System.out.println("백신접종 대상이 아닙니다.");
        }
        else if((age >= 10) && (age <= 20))
        {
            System.out.println("백신접종 2회 대상입니다.");
        }
        else if((age >= 21) && (age <= 39))
        {
            System.out.println("백신접종 1회 대상입니다");
        }
        else if((age >= 40) && (age <= 60))
        {
            System.out.println("백신접종 2회 대상입니다.");
        }
        else if(age >= 61)
        {
            System.out.println("백신접종 2회 대상입니다.");
        }
        else
        {
            // 요구사항의 논리상 else조건은 필요 없음.(검토완료)
            // 반드시 else로 끝내고 위처럼 주석을 꼭 넣어 검토 마무리 꼭 지어주자!!
        }


        int x =0;
        if(true)
        {

        }
        else if (x > 0) // <-이 코드는 절대 실행 될 일이 없기때문에 죽은 코드 즉, dead code라 부른다.
        {

        }

        //switch문 코딩 요구사항.
        //1반 : 강의실 301호로 간다.
        //2반 : 강의실 304호로 간다.
        //3반 : 강의실 307호로 간다.
        //4반 : 강의실 307호로 간다.


        int cls = 4;

        switch(cls)
        {
            case 1 :
                System.out.println("강의실 301호");
                break; // break와 가장 가까운 제어구조에서 빠져나가게 하는 역할.
                
            case 2 :
                System.out.println("강의실 304호");
                break;
                
            case 3 :
                System.out.println("강의실 307호");
                break;

            case 4 :
                System.out.println("강의실 307호");
                break;    
            //나중에 유지보수를 생각해서 간결하고 묶지 않는게 최고의 코드임.

            default : 
                System.out.println("반이 잘 못 되었습니다.");
        }

        for(int i = 0; i < 5; i++ ) // <<-- 이 표현이 프로그래머들 사이에서 암묵적으로 약속된 형식!! 가장 알아보기 쉬움.  i=index의 약자로 C언어에서 파생된 전통적인 for문의 변수명.
        {
            System.out.println("AA");
        }

        // 2단을 출력하는 프로그램을 구현.
        // 변수명은 가급적 의미가 있는걸로 만들기
       int dan = 2;
       int mul = 1;
       
       for(int i = 0; i < 9; i++)
       {   
           System.out.println(dan + "X" + mul + "=" + (dan*mul));
           mul++;
       }



        //input / proccesing / output = I(입력)P(진행)O(출력)의 관점으로 코드를 짜기
        //변수는 변수의 용도의 맡게 사용해야됨!!


    }
    
}