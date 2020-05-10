package typingsSlinky.yazl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryOptions extends js.Object {
  var mode: Double = js.native
  var mtime: js.Date = js.native
}

object DirectoryOptions {
  @scala.inline
  def apply(mode: Double, mtime: js.Date): DirectoryOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryOptions]
  }
  @scala.inline
  implicit class DirectoryOptionsOps[Self <: DirectoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMtime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

