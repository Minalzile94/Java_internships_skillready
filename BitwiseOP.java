//Bitwise operator performs operations at binary level
// 010101
//Bitwise and (&)
//Bitwise or (|)
//Bitwise XOR ^
//Bitwise left shift operator <<
//Bitwise right shift operator >>
class BitwiseOP{
    public static void main(String[] args) {
        int a=5;
        int b=3;
        System.out.println("bitwise AND OP="+(a&b));
        System.out.println("bitwise OR OP="+(a/b));
        System.out.println("XOR operator = " + (a^b));
        System.out.println("left shift op =" + (a<<b));//40
        System.out.println("right shift op = "+ (a >> b)); //110
    }
}