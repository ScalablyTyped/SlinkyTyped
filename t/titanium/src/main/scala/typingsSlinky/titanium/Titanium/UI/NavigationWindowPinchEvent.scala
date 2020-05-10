package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the device detects a pinch gesture.
		 */
@js.native
trait NavigationWindowPinchEvent extends NavigationWindowBaseEvent {
  /**
  			 * The average distance between each of the pointers forming the gesture in progress through
  			 * the focal point.
  			 */
  var currentSpan: Double = js.native
  /**
  			 * The average X distance between each of the pointers forming the gesture in progress through
  			 * the focal point.
  			 */
  var currentSpanX: Double = js.native
  /**
  			 * The average Y distance between each of the pointers forming the gesture in progress through
  			 * the focal point.
  			 */
  var currentSpanY: Double = js.native
  /**
  			 * The X coordinate of the current gesture's focal point.
  			 */
  var focusX: Double = js.native
  /**
  			 * The Y coordinate of the current gesture's focal point.
  			 */
  var focusY: Double = js.native
  /**
  			 * Returns `true` if a scale gesture is in progress, `false` otherwise.
  			 */
  var inProgress: Boolean = js.native
  /**
  			 * The previous average distance between each of the pointers forming the gesture in progress through
  			 * the focal point.
  			 */
  var previousSpan: Double = js.native
  /**
  			 * The previous average X distance between each of the pointers forming the gesture in progress through
  			 * the focal point.
  			 */
  var previousSpanX: Double = js.native
  /**
  			 * The previous average Y distance between each of the pointers forming the gesture in progress through
  			 * the focal point.
  			 */
  var previousSpanY: Double = js.native
  /**
  			 * The scale factor relative to the points of the two touches in screen coordinates.
  			 */
  var scale: Double = js.native
  /**
  			 * The event time of the current event being processed.
  			 */
  var time: Double = js.native
  /**
  			 * The time difference in milliseconds between the previous accepted scaling event and the
  			 * current scaling event.
  			 */
  var timeDelta: Double = js.native
  /**
  			 * The velocity of the pinch in scale factor per second.
  			 */
  var velocity: Double = js.native
}

object NavigationWindowPinchEvent {
  @scala.inline
  def apply(
    currentSpan: Double,
    currentSpanX: Double,
    currentSpanY: Double,
    focusX: Double,
    focusY: Double,
    inProgress: Boolean,
    previousSpan: Double,
    previousSpanX: Double,
    previousSpanY: Double,
    scale: Double,
    source: NavigationWindow,
    time: Double,
    timeDelta: Double,
    velocity: Double
  ): NavigationWindowPinchEvent = {
    val __obj = js.Dynamic.literal(currentSpan = currentSpan.asInstanceOf[js.Any], currentSpanX = currentSpanX.asInstanceOf[js.Any], currentSpanY = currentSpanY.asInstanceOf[js.Any], focusX = focusX.asInstanceOf[js.Any], focusY = focusY.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], previousSpan = previousSpan.asInstanceOf[js.Any], previousSpanX = previousSpanX.asInstanceOf[js.Any], previousSpanY = previousSpanY.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeDelta = timeDelta.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationWindowPinchEvent]
  }
  @scala.inline
  implicit class NavigationWindowPinchEventOps[Self <: NavigationWindowPinchEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentSpanX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSpanX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentSpanY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSpanY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInProgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousSpanX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSpanX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousSpanY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSpanY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

