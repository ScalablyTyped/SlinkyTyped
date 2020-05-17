package typingsSlinky.vueScrollto.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import typingsSlinky.vueScrollto.vueScrolltoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollOptions extends js.Object {
  var cancelable: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[ElementDescriptor] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[String | (js.Tuple4[Double, Double, Double, Double])] = js.native
  var el: js.UndefOr[ElementDescriptor] = js.native
  var element: js.UndefOr[ElementDescriptor] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[
    Double | (js.Function2[/* element */ ElementDescriptor, /* container */ ElementDescriptor, Double])
  ] = js.native
  var onCancel: js.UndefOr[(js.Function2[/* event */ Event, /* element */ Element, _]) | `false`] = js.native
  var onDone: js.UndefOr[(js.Function1[/* element */ Element, _]) | `false`] = js.native
  var onStart: js.UndefOr[(js.Function1[/* element */ Element, _]) | `false`] = js.native
  var x: js.UndefOr[Boolean] = js.native
  var y: js.UndefOr[Boolean] = js.native
}

object ScrollOptions {
  @scala.inline
  def apply(): ScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollOptions]
  }
  @scala.inline
  implicit class ScrollOptionsOps[Self <: ScrollOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: ElementDescriptor): Self = {
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
    def withEasing(value: String | (js.Tuple4[Double, Double, Double, Double])): Self = {
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
    def withElElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEl(value: ElementDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(js.undefined)
        ret
    }
    @scala.inline
    def withElementElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: ElementDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetFunction2(value: (/* element */ ElementDescriptor, /* container */ ElementDescriptor) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOffset(
      value: Double | (js.Function2[/* element */ ElementDescriptor, /* container */ ElementDescriptor, Double])
    ): Self = {
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
    @scala.inline
    def withOnCancelFunction2(value: (/* event */ Event, /* element */ Element) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnCancel(value: (js.Function2[/* event */ Event, /* element */ Element, _]) | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoneFunction1(value: /* element */ Element => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDone(value: (js.Function1[/* element */ Element, _]) | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDone")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartFunction1(value: /* element */ Element => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnStart(value: (js.Function1[/* element */ Element, _]) | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

