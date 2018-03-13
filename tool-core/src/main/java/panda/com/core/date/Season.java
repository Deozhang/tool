package panda.com.core.date;

/**
 * @author: zhangyong
 * @descrption: 季度枚举
 * @date:2018-03-13 16:59
 * @modified By:
 */
public enum Season {

    SPRING(1),
    SUMMER(2),
    AUTUMN(3),
    WINTER(4);

    private int value;

    private Season(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Season of(int intValue) {
        switch (intValue) {
            case 1:
                return SPRING;
            case 2:
                return SUMMER;
            case 3:
                return AUTUMN;
            case 4:
                return WINTER;
            default:
                return null;
        }

    }
}