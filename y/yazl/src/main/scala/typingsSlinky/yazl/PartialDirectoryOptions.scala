package typingsSlinky.yazl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<yazl.yazl.DirectoryOptions> */
@js.native
trait PartialDirectoryOptions extends js.Object {
  var mode: js.UndefOr[Double] = js.native
  var mtime: js.UndefOr[js.Date] = js.native
}

object PartialDirectoryOptions {
  @scala.inline
  def apply(): PartialDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDirectoryOptions]
  }
  @scala.inline
  implicit class PartialDirectoryOptionsOps[Self <: PartialDirectoryOptions] (val x: Self) extends AnyVal {
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
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMtime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtime")(js.undefined)
        ret
    }
  }
  
}

