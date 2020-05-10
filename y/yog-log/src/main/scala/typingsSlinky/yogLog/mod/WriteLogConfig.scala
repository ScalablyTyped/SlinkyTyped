package typingsSlinky.yogLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteLogConfig extends js.Object {
  var errno: Double = js.native
  var escape_msg: Boolean = js.native
  var filename_suffix: String = js.native
}

object WriteLogConfig {
  @scala.inline
  def apply(errno: Double, escape_msg: Boolean, filename_suffix: String): WriteLogConfig = {
    val __obj = js.Dynamic.literal(errno = errno.asInstanceOf[js.Any], escape_msg = escape_msg.asInstanceOf[js.Any], filename_suffix = filename_suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteLogConfig]
  }
  @scala.inline
  implicit class WriteLogConfigOps[Self <: WriteLogConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrno(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errno")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEscape_msg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape_msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename_suffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename_suffix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

