package typingsSlinky.vanillaSwipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDelta extends js.Object {
  var delta: Double = js.native
  var element: Null = js.native
  var mouseTrackingEnabled: Boolean = js.native
  var preventDefaultTouchmoveEvent: Boolean = js.native
  var rotationAngle: Double = js.native
  var touchTrackingEnabled: Boolean = js.native
}

object AnonDelta {
  @scala.inline
  def apply(
    delta: Double,
    element: Null,
    mouseTrackingEnabled: Boolean,
    preventDefaultTouchmoveEvent: Boolean,
    rotationAngle: Double,
    touchTrackingEnabled: Boolean
  ): AnonDelta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], mouseTrackingEnabled = mouseTrackingEnabled.asInstanceOf[js.Any], preventDefaultTouchmoveEvent = preventDefaultTouchmoveEvent.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], touchTrackingEnabled = touchTrackingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelta]
  }
  @scala.inline
  implicit class AnonDeltaOps[Self <: AnonDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseTrackingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseTrackingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefaultTouchmoveEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultTouchmoveEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotationAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchTrackingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchTrackingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

