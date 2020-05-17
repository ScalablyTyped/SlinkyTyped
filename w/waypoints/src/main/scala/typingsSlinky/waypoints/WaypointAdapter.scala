package typingsSlinky.waypoints

import typingsSlinky.waypoints.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaypointAdapter extends js.Object {
  def innerHeight(): Double = js.native
  def innerWidth(): Double = js.native
  def off(event: String): js.UndefOr[scala.Nothing] = js.native
  def offset(): Left = js.native
  def on(event: String, handler: js.Function0[Unit]): js.UndefOr[scala.Nothing] = js.native
  def outerHeight(includeMargin: Boolean): Double = js.native
  def outerWidth(includeMargin: Boolean): Double = js.native
  def scrollLeft(): Double = js.native
  def scrollTop(): Double = js.native
}

object WaypointAdapter {
  @scala.inline
  def apply(
    innerHeight: () => Double,
    innerWidth: () => Double,
    off: String => js.UndefOr[scala.Nothing],
    offset: () => Left,
    on: (String, js.Function0[Unit]) => js.UndefOr[scala.Nothing],
    outerHeight: Boolean => Double,
    outerWidth: Boolean => Double,
    scrollLeft: () => Double,
    scrollTop: () => Double
  ): WaypointAdapter = {
    val __obj = js.Dynamic.literal(innerHeight = js.Any.fromFunction0(innerHeight), innerWidth = js.Any.fromFunction0(innerWidth), off = js.Any.fromFunction1(off), offset = js.Any.fromFunction0(offset), on = js.Any.fromFunction2(on), outerHeight = js.Any.fromFunction1(outerHeight), outerWidth = js.Any.fromFunction1(outerWidth), scrollLeft = js.Any.fromFunction0(scrollLeft), scrollTop = js.Any.fromFunction0(scrollTop))
    __obj.asInstanceOf[WaypointAdapter]
  }
  @scala.inline
  implicit class WaypointAdapterOps[Self <: WaypointAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInnerHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInnerWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOff(value: String => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOffset(value: () => Left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function0[Unit]) => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOuterHeight(value: Boolean => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOuterWidth(value: Boolean => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScrollLeft(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScrollTop(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

