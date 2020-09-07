package com.haer.classnumber;

public class EnumTest01 {
    public static void main(String[] args) {
        ResultVo resultVo = divide(10, 0);
        if (resultVo == ResultVo.SUCCESS) {
            System.out.println("�ɹ�");
        } else if (resultVo == ResultVo.FALL) {
            System.out.println("ʧ��");
        }
    }

    public static ResultVo divide(int a, int b) {
        try {
            int c = a / b;
            return ResultVo.SUCCESS;
        } catch (Exception e) {
            return ResultVo.FALL;
        }
    }
}
