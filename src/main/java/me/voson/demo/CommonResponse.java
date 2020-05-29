package me.voson.demo;

/**
 * @author voson
 */
public class CommonResponse<T> {
    public final String OK = "ok";
    private String code;
    private String message;
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> CommonResponse<T> success(T data) {
        return new CommonResponse<>(data);
    }

    public static <T> CommonResponse<T> fail(String code, String message) {
        return new CommonResponse<>(code, message);
    }

    private CommonResponse(T data) {
        this.code = OK;
        this.message = OK;
        this.data = data;
    }

    private CommonResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
