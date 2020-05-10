package typingsSlinky.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitNavbarOptions extends js.Object {
  var align: js.UndefOr[String] = js.native
  var boundary: js.UndefOr[String] = js.native
  var `boundary-align`: js.UndefOr[Boolean] = js.native
  var `delay-hide`: js.UndefOr[Double] = js.native
  var `delay-show`: js.UndefOr[Double] = js.native
  var dropbar: js.UndefOr[Boolean] = js.native
  var `dropbar-mode`: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[String] = js.native
  var offset: js.UndefOr[Double] = js.native
}

object UIkitNavbarOptions {
  @scala.inline
  def apply(): UIkitNavbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitNavbarOptions]
  }
  @scala.inline
  implicit class UIkitNavbarOptionsOps[Self <: UIkitNavbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(js.undefined)
        ret
    }
    @scala.inline
    def `withBoundary-align`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary-align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBoundary-align`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary-align")(js.undefined)
        ret
    }
    @scala.inline
    def `withDelay-hide`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay-hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDelay-hide`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay-hide")(js.undefined)
        ret
    }
    @scala.inline
    def `withDelay-show`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay-show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDelay-show`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay-show")(js.undefined)
        ret
    }
    @scala.inline
    def withDropbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropbar")(js.undefined)
        ret
    }
    @scala.inline
    def `withDropbar-mode`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropbar-mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDropbar-mode`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropbar-mode")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
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
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

