package typingsSlinky.vanillaSwipe.typesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Event_
import typingsSlinky.vanillaSwipe.vanillaSwipeNumbers.`0`
import typingsSlinky.vanillaSwipe.vanillaSwipeNumbers.`10`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorProps extends js.Object {
  var delta: js.UndefOr[Double | `10`] = js.native
  var element: js.UndefOr[HTMLElement | Null] = js.native
  var mouseTrackingEnabled: js.UndefOr[Boolean] = js.native
  var onSwiped: js.UndefOr[EventHandler] = js.native
  var onSwiping: js.UndefOr[EventHandler] = js.native
  var onTap: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.native
  var preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.native
  var rotationAngle: js.UndefOr[Double | `0`] = js.native
  var touchTrackingEnabled: js.UndefOr[Boolean] = js.native
}

object ConstructorProps {
  @scala.inline
  def apply(): ConstructorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorProps]
  }
  @scala.inline
  implicit class ConstructorPropsOps[Self <: ConstructorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelta(value: Double | `10`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
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
    def withElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(null)
        ret
    }
    @scala.inline
    def withMouseTrackingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseTrackingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseTrackingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseTrackingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwiped(
      value: (/* e */ Event_, /* deltaX */ Double, /* deltaY */ Double, /* absX */ Double, /* absY */ Double, /* duration */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwiped")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutOnSwiped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwiped")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwiping(
      value: (/* e */ Event_, /* deltaX */ Double, /* deltaY */ Double, /* absX */ Double, /* absY */ Double, /* duration */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwiping")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutOnSwiping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwiping")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTap(value: /* e */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTap")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefaultTouchmoveEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultTouchmoveEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefaultTouchmoveEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultTouchmoveEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationAngle(value: Double | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchTrackingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchTrackingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchTrackingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchTrackingEnabled")(js.undefined)
        ret
    }
  }
  
}

