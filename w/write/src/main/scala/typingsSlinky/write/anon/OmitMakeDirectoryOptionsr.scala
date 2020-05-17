package typingsSlinky.write.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<node.fs.MakeDirectoryOptions, 'recursive'> */
@js.native
trait OmitMakeDirectoryOptionsr extends js.Object {
  var mode: js.UndefOr[Double | String] = js.native
}

object OmitMakeDirectoryOptionsr {
  @scala.inline
  def apply(): OmitMakeDirectoryOptionsr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitMakeDirectoryOptionsr]
  }
  @scala.inline
  implicit class OmitMakeDirectoryOptionsrOps[Self <: OmitMakeDirectoryOptionsr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: Double | String): Self = {
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
  }
  
}

