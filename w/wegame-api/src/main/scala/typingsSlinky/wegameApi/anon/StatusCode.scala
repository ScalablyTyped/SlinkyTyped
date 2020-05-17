package typingsSlinky.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusCode extends js.Object {
  var statusCode: Double = js.native
  var tempFilePath: js.UndefOr[String] = js.native
}

object StatusCode {
  @scala.inline
  def apply(statusCode: Double): StatusCode = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusCode]
  }
  @scala.inline
  implicit class StatusCodeOps[Self <: StatusCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTempFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFilePath")(js.undefined)
        ret
    }
  }
  
}

