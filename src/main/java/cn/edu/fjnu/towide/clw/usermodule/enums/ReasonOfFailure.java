package cn.edu.fjnu.towide.clw.usermodule.enums;

import cn.edu.fjnu.towide.enums.IReasonOfFailure;

public enum ReasonOfFailure implements IReasonOfFailure{
	USER_DOES_NOT_EXIST("User does not exist","用户不存在"),
	UPDATE_PASSWORD_FAILURE("The parameters submitted are incorrect","更新密码失败"),
	OLD_PASSWORD_ERROR("The parameters submitted are incorrect","原密码错误"),
	IDCARD_IS_IMPTY("The parameters submitted are incorrect","身份证号不能为空" ),
	PHONE_NUM_IS_EMPTY("The parameters submitted are incorrect","手机号不能为空" ),
	ADMISSION_NOTICE_ID_IS_EMPTY("The parameters submitted are incorrect", "录取通知书编号不能为空"), 
	PASSWORD_IS_EMPTY("The parameters submitted are incorrect", "密码不能为空"),
	OPENID_IS_WRONG("The parameters submitted are incorrect", "OpenId错误"),

	OPENID_IS_EMPTY("The parameters submitted are incorrect", "OpenId不能为空"),

	USER_NAME_IS_EMPTY("The parameters submitted are incorrect", "用户名不能为空");//此处添加枚举值

	private String en_msg;
	private String zh_msg;

	ReasonOfFailure(String en_msg, String zh_msg) {
		this.en_msg = en_msg;
		this.zh_msg = zh_msg;
	}

	@Override
	public String getZhMsgOfFailure() {
		return zh_msg;
	}

	@Override
	public String getEnMsgOfFailure() {
		return en_msg;
	}
	
	

}
