package typingsSlinky.yazl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<yazl.yazl.ReadStreamOptions> */
@js.native
trait PartialReadStreamOptions extends js.Object {
  var compress: js.UndefOr[Boolean] = js.native
  var forceZip64Format: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[Double] = js.native
  var mtime: js.UndefOr[js.Date] = js.native
  var size: js.UndefOr[Double] = js.native
}

object PartialReadStreamOptions {
  @scala.inline
  def apply(): PartialReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadStreamOptions]
  }
  @scala.inline
  implicit class PartialReadStreamOptionsOps[Self <: PartialReadStreamOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withForceZip64Format(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceZip64Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceZip64Format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceZip64Format")(js.undefined)
        ret
    }
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
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

