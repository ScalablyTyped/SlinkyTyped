package typingsSlinky.trtcJsSdk.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RtcError extends Error {
  /** 获取错误码, 详细错误码列表参见 [ErrorCode](https://trtc-1252463788.file.myqcloud.com/web/docs/module-ErrorCode.html) */
  def getCode(): String = js.native
}

object RtcError {
  @scala.inline
  def apply(getCode: () => String, message: String, name: String): RtcError = {
    val __obj = js.Dynamic.literal(getCode = js.Any.fromFunction0(getCode), message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RtcError]
  }
  @scala.inline
  implicit class RtcErrorOps[Self <: RtcError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCode")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

