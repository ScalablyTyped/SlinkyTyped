package typingsSlinky.uniApp

import typingsSlinky.uniApp.uniAppStrings.facial
import typingsSlinky.uniApp.uniAppStrings.fingerPrint
import typingsSlinky.uniApp.uniAppStrings.speech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckIsSoterEnrolledInDeviceOptions extends js.Object {
  /**
    * 认证方式
    * - fingerPrint: 指纹识别
    * - facial: 人脸识别（暂未支持）
    * - speech: 声纹识别（暂未支持）
    */
  var checkAuthMode: js.UndefOr[fingerPrint | facial | speech] = js.native
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object CheckIsSoterEnrolledInDeviceOptions {
  @scala.inline
  def apply(): CheckIsSoterEnrolledInDeviceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceOptions]
  }
  @scala.inline
  implicit class CheckIsSoterEnrolledInDeviceOptionsOps[Self <: CheckIsSoterEnrolledInDeviceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckAuthMode(value: fingerPrint | facial | speech): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAuthMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckAuthMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAuthMode")(js.undefined)
        ret
    }
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
    def withSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction0(value))
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

