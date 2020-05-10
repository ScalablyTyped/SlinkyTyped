package typingsSlinky.tmp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirOptions extends TmpNameOptions {
  var keep: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[Double] = js.native
  var unsafeCleanup: js.UndefOr[Boolean] = js.native
}

object DirOptions {
  @scala.inline
  def apply(): DirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirOptions]
  }
  @scala.inline
  implicit class DirOptionsOps[Self <: DirOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep")(js.undefined)
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
    def withUnsafeCleanup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafeCleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafeCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafeCleanup")(js.undefined)
        ret
    }
  }
  
}

