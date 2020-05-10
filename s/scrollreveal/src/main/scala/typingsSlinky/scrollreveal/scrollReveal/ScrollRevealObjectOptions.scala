package typingsSlinky.scrollreveal.scrollReveal

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollRevealObjectOptions extends js.Object {
  var afterReset: js.UndefOr[js.Function1[/* domEl */ HTMLElement | (NodeListOf[Element with Node]), Unit]] = js.native
  var afterReveal: js.UndefOr[js.Function1[/* domEl */ HTMLElement | (NodeListOf[Element with Node]), Unit]] = js.native
  var beforeReset: js.UndefOr[js.Function1[/* domEl */ HTMLElement | (NodeListOf[Element with Node]), Unit]] = js.native
  var beforeReveal: js.UndefOr[js.Function1[/* domEl */ HTMLElement | (NodeListOf[Element with Node]), Unit]] = js.native
  var container: js.UndefOr[js.Any] = js.native
  var delay: js.UndefOr[Double] = js.native
  var distance: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[String] = js.native
  var interval: js.UndefOr[Double] = js.native
  var mobile: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var origin: js.UndefOr[String] = js.native
  var reset: js.UndefOr[Boolean] = js.native
  var rotate: js.UndefOr[ScrollRevealRotateObject] = js.native
  var scale: js.UndefOr[Double] = js.native
  var useDelay: js.UndefOr[String] = js.native
  var viewFactor: js.UndefOr[Double] = js.native
  var viewOffset: js.UndefOr[ScrollRevealPositionObject] = js.native
}

object ScrollRevealObjectOptions {
  @scala.inline
  def apply(): ScrollRevealObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollRevealObjectOptions]
  }
  @scala.inline
  implicit class ScrollRevealObjectOptionsOps[Self <: ScrollRevealObjectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterReset(value: /* domEl */ HTMLElement | (NodeListOf[Element with Node]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterReset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterReset")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterReveal(value: /* domEl */ HTMLElement | (NodeListOf[Element with Node]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterReveal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterReveal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterReveal")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeReset(value: /* domEl */ HTMLElement | (NodeListOf[Element with Node]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeReset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeReset")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeReveal(value: /* domEl */ HTMLElement | (NodeListOf[Element with Node]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeReveal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeReveal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeReveal")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDistance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
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
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: ScrollRevealRotateObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDelay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withViewFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withViewOffset(value: ScrollRevealPositionObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewOffset")(js.undefined)
        ret
    }
  }
  
}

