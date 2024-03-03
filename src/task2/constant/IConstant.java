package task2.constant;

import java.util.regex.Pattern;

public interface IConstant {
    Pattern email=Pattern.compile("([a-z0-9_.-]+)@([a-z0-9_.-]+)\\.([a-z]{1,3})");
    Pattern docNumber=Pattern.compile("[1-9]{4}\\\\-[1-9]{4}\\\\-[1-9]{2}");
}
