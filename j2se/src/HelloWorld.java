public class HelloWorld {
    public static void main(String[] args) {
 
        // Ѱ��ĳ��������������� ��ƽ�ָ�� 0.618���
        //
        // ��ĸ�ͷ��Ӳ���ͬʱΪż��
        // ��ĸ�ͷ��� ȡֵ��Χ��[1-20]
        int range = 20; // ȡֵ��Χ
        float breakPoint = 0.618f; // �ƽ�ָ��
 
        float minDiff = 100; // ��ƽ�ָ��Ĳ�ֵ
        int answerFenzi = 0; // �ҵ��ķ���
        int answerFenmu = 0; // �ҵ��ķ�ĸ
        for (int fenzi = 1; fenzi <= range; fenzi++) {
            for (int fenmu = 1; fenmu <= range; fenmu++) {
                // ��ĸ�ͷ��Ӳ���ͬʱΪż��
                if (0 == fenzi % 2 & 0 == fenmu % 2)
                    continue;
 
                // ȡֵ
                float value = (float) fenzi / fenmu;
                // ȡ��ƽ�ָ��Ĳ�ֵ
                float diff = value - breakPoint;
                // ����ֵ
                diff = diff < 0 ? 0 - diff : diff;
 
                // �ҳ���С�Ĳ�ֵ
                if (diff < minDiff) {
                    minDiff = diff;
                    answerFenzi = fenzi;
                    answerFenmu = fenmu;
                }
            }
        }
 
        System.out.println("��ƽ�ָ��(" + breakPoint + ")������������ദ��:" + answerFenzi + "/" + answerFenmu + "="
                + ((float) answerFenzi / answerFenmu));
 
    }
}