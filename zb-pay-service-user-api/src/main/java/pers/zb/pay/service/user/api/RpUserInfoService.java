/*
 * ====================================================================
 * 【个人网站】：http://www.2b2b92b.com
 * 【网站源码】：http://git.oschina.net/zhoubang85/zb
 * 【技术论坛】：http://www.2b2b92b.cn
 * 【开源中国】：https://gitee.com/zhoubang85
 *
 * 【支付-微信_支付宝_银联】技术QQ群：470414533
 * 【联系QQ】：842324724
 * 【联系Email】：842324724@qq.com
 * ====================================================================
 */
package pers.zb.pay.service.user.api;

import pers.zb.pay.common.core.page.PageBean;
import pers.zb.pay.common.core.page.PageParam;
import pers.zb.pay.service.user.entity.RpUserInfo;
import pers.zb.pay.service.user.exceptions.PayBizException;

import java.util.List;

/**
 * 用户信息service接口
 *
 * @author zhoubang
 * @date 2017年10月17日 20:21:33
 *
 */
public interface RpUserInfoService{
	
	/**
	 * 保存
	 */
	void saveData(RpUserInfo rpUserInfo) throws PayBizException;

	/**
	 * 更新
	 */
	void updateData(RpUserInfo rpUserInfo) throws PayBizException;

	/**
	 * 根据id获取数据
	 * 
	 * @param id
	 * @return
	 */
	RpUserInfo getDataById(String id) throws PayBizException;
	

	/**
	 * 获取分页数据
	 * 
	 * @param pageParam
	 * @return
	 */
	PageBean listPage(PageParam pageParam, RpUserInfo rpUserInfo) throws PayBizException;
	
	/**
     * 用户线下注册
     * 
     * @param userName
     *            用户名
     * @return
     */
    void registerOffline(String userName)  throws PayBizException;

	/**
	 * 根据商户编号获取商户信息
	 * @param merchantNo
	 * @return
	 */
	RpUserInfo getDataByMerchentNo(String merchantNo) throws PayBizException;
	
	/**
	 * 获取所有用户
	 * @return
	 */
	List<RpUserInfo> listAll() throws PayBizException;
	
}