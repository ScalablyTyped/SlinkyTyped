package typingsSlinky.swiper.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MousewheelOptions extends js.Object {
  var eventsTarged: js.UndefOr[SelectableElement] = js.native
  var forceToAxis: js.UndefOr[Boolean] = js.native
  var invert: js.UndefOr[Boolean] = js.native
  var releaseOnEdges: js.UndefOr[Boolean] = js.native
  var sensitivity: js.UndefOr[Double] = js.native
}

object MousewheelOptions {
  @scala.inline
  def apply(): MousewheelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MousewheelOptions]
  }
  @scala.inline
  implicit class MousewheelOptionsOps[Self <: MousewheelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventsTargedHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsTarged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventsTarged(value: SelectableElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsTarged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventsTarged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsTarged")(js.undefined)
        ret
    }
    @scala.inline
    def withForceToAxis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceToAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceToAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceToAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withInvert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseOnEdges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseOnEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseOnEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseOnEdges")(js.undefined)
        ret
    }
    @scala.inline
    def withSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitivity")(js.undefined)
        ret
    }
  }
  
}

