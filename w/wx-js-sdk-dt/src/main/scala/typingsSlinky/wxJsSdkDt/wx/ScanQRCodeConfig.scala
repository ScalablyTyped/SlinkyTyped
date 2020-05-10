package typingsSlinky.wxJsSdkDt.wx

import typingsSlinky.wxJsSdkDt.AnonResultStr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanQRCodeConfig extends WxBaseRequestConfig {
  /**
    * 默认为0，扫描结果由微信处理，1则直接返回扫描结果，
    */
  var needResult: js.UndefOr[Double] = js.native
  /**
    * ["qrCode","barCode"], 可以指定扫二维码还是一维码，默认二者都有
    */
  var scanType: js.UndefOr[js.Array[String]] = js.native
  /**
    * resultStr 是当 needResult 为 1 时，扫码返回的结果
    */
  @JSName("success")
  var success_ScanQRCodeConfig: js.UndefOr[js.Function1[/* res */ AnonResultStr, Unit]] = js.native
}

object ScanQRCodeConfig {
  @scala.inline
  def apply(): ScanQRCodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanQRCodeConfig]
  }
  @scala.inline
  implicit class ScanQRCodeConfigOps[Self <: ScanQRCodeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNeedResult(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needResult")(js.undefined)
        ret
    }
    @scala.inline
    def withScanType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanType")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ AnonResultStr => Unit): Self = {
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

