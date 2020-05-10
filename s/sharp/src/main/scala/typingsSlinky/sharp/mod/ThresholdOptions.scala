package typingsSlinky.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThresholdOptions extends js.Object {
  /** alternative spelling for greyscale. (optional, default true) */
  var grayscale: js.UndefOr[Boolean] = js.native
  /** convert to single channel greyscale. (optional, default true) */
  var greyscale: js.UndefOr[Boolean] = js.native
}

object ThresholdOptions {
  @scala.inline
  def apply(): ThresholdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThresholdOptions]
  }
  @scala.inline
  implicit class ThresholdOptionsOps[Self <: ThresholdOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrayscale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grayscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrayscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grayscale")(js.undefined)
        ret
    }
    @scala.inline
    def withGreyscale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greyscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreyscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greyscale")(js.undefined)
        ret
    }
  }
  
}

