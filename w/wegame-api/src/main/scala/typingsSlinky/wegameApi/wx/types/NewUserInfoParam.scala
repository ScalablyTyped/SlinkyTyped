package typingsSlinky.wegameApi.wx.types

import typingsSlinky.wegameApi.anon.DataReadonlyArray
import typingsSlinky.wegameApi.wegameApiStrings.en
import typingsSlinky.wegameApi.wegameApiStrings.zh_CN
import typingsSlinky.wegameApi.wegameApiStrings.zh_TW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 新版本wx.getUserInfo的参数，需要在开放数据域内调用
  */
@js.native
trait NewUserInfoParam extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 显示用户信息的语言
    */
  var lang: js.UndefOr[en | zh_CN | zh_TW] = js.native
  
  /**
    * 要获取信息的用户的 openId 数组，如果要获取当前用户信息，则将数组中的一个元素设为 'selfOpenId'
    */
  var openIdList: js.UndefOr[js.Array[String]] = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ DataReadonlyArray, Unit]] = js.native
}
object NewUserInfoParam {
  
  @scala.inline
  def apply(): NewUserInfoParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewUserInfoParam]
  }
  
  @scala.inline
  implicit class NewUserInfoParamMutableBuilder[Self <: NewUserInfoParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setLang(value: en | zh_CN | zh_TW): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setOpenIdList(value: js.Array[String]): Self = StObject.set(x, "openIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIdListUndefined: Self = StObject.set(x, "openIdList", js.undefined)
    
    @scala.inline
    def setOpenIdListVarargs(value: String*): Self = StObject.set(x, "openIdList", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ DataReadonlyArray => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
