package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanCodeSuccessRes extends js.Object {
  /**
    * 所扫码的字符集
    */
  var charSet: js.UndefOr[String] = js.native
  /**
    * 当所扫的码为当前应用的合法二维码时，会返回此字段，内容为二维码携带的 path。
    */
  var path: js.UndefOr[String] = js.native
  /**
    * 所扫码的内容
    */
  var result: js.UndefOr[String] = js.native
  /**
    * 所扫码的类型
    */
  var scanType: js.UndefOr[String] = js.native
}

object ScanCodeSuccessRes {
  @scala.inline
  def apply(): ScanCodeSuccessRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanCodeSuccessRes]
  }
  @scala.inline
  implicit class ScanCodeSuccessResOps[Self <: ScanCodeSuccessRes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charSet")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withScanType(value: String): Self = {
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
  }
  
}

