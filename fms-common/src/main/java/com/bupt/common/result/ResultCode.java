package com.bupt.common;

/**
 * ��Ӧ��ö�٣��ο�HTTP״̬�������
 */
public enum ResultCode {
    SUCCESS(200),//�ɹ�
    FAIL(400),//ʧ��
    UNAUTHORIZED(401),//δ��֤��ǩ������
    NOT_FOUND(404),//�ӿڲ�����
    INTERNAL_SERVER_ERROR(500);//�������ڲ�����

    private final int code;

    ResultCode(int code) {
        this.code = code;
    }

    public int code() {
        return code;
    }
}
