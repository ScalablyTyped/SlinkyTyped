package typingsSlinky.wegameApi.wx.types

import typingsSlinky.wegameApi.AnonDataReadonlyArray
import typingsSlinky.wegameApi.wegameApiStrings.en
import typingsSlinky.wegameApi.wegameApiStrings.zh_CN
import typingsSlinky.wegameApi.wegameApiStrings.zh_TW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 新版本wx.getUserInfo的参数，需要在开放数据域内调用
  */
@js.native
trait NewUserInfoParam extends js.Object {
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
  var success: js.UndefOr[js.Function1[/* res */ AnonDataReadonlyArray, Unit]] = js.native
}

object NewUserInfoParam {
  @scala.inline
  def apply(): NewUserInfoParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewUserInfoParam]
  }
  @scala.inline
  implicit class NewUserInfoParamOps[Self <: NewUserInfoParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: en | zh_CN | zh_TW): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenIdList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIdList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenIdList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIdList")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ AnonDataReadonlyArray => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

