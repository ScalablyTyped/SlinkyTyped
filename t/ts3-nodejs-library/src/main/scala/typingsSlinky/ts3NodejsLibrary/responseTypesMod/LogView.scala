package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogView extends js.Object {
  var file_size: Double = js.native
  var l: String = js.native
  var last_pos: Double = js.native
}

object LogView {
  @scala.inline
  def apply(file_size: Double, l: String, last_pos: Double): LogView = {
    val __obj = js.Dynamic.literal(file_size = file_size.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], last_pos = last_pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogView]
  }
  @scala.inline
  implicit class LogViewOps[Self <: LogView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_pos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_pos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

