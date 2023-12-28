package test1;
public class StarTree {
    public static void main(String[] args) {
        // 트리 높이 설정
        int height = 5;

        // 트리 출력
        printTree(height);
    }

    // 트리 출력 함수
    public static void printTree(int height) {
        printTreeRecursively(height, 0);
    }

    // 재귀적으로 트리 출력 함수
    private static void printTreeRecursively(int height, int currentLevel) {
        if (currentLevel > height) {
            return;
        }

        // 공백 출력
        printSpaces(height - currentLevel);

        // 별 출력
        printStars(2 * currentLevel + 1);

        // 다음 레벨로 재귀 호출
        printTreeRecursively(height, currentLevel + 1);
    }

    // 공백 출력 함수
    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    // 별 출력 함수
    private static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println(); // 줄 바꿈
    }
}