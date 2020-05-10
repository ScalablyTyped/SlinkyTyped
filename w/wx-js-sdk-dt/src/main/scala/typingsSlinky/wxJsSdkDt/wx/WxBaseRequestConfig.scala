package typingsSlinky.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 所有通过wx对象调用的接口的基础请求参数
  * 见：https://mp.weixin.qq.com/wiki?action=doc&id=mp1421141115&t=0.08966560295638093#7
  */
@js.native
trait WxBaseRequestConfig extends js.Object {
  /**
    * 用户点击取消时的回调函数，仅部分有用户取消操作的api才会用到
    */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用完成时执行的回调函数，无论成功或失败都会执行
    */
  var complete: js.UndefOr[js.Function1[/* res */ js.UndefOr[js.Any], Unit]] = js.native
  /**
    * 接口调用失败时执行的回调函数
    */
  var fail: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]] = js.native
  /**
    * 接口调用成功时执行的回调函数
    */
  var success: js.UndefOr[js.Function1[/* res */ js.UndefOr[js.Any], Unit]] = js.native
}

object WxBaseRequestConfig {
  @scala.inline
  def apply(): WxBaseRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WxBaseRequestConfig]
  }
  @scala.inline
  implicit class WxBaseRequestConfigOps[Self <: WxBaseRequestConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: /* res */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: /* error */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ js.UndefOr[js.Any] => Unit): Self = {
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

