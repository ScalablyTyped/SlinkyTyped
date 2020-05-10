package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.Point
import typingsSlinky.titanium.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the value of the slider changes.
		 */
@js.native
trait SliderChangeEvent extends SliderBaseEvent {
  /**
  			 * Dictionary with properties `x` and `y` of the thumb's left-top corner in
  			 * the control. Available with custom thumb image.
  			 */
  var thumbOffset: Point = js.native
  /**
  			 * Dictionary with properties `width` and `height` of the size of the thumb.
  			 * Available with custom thumb image.
  			 */
  var thumbSize: Size = js.native
  /**
  			 * New value of the slider.
  			 */
  var value: Double = js.native
}

object SliderChangeEvent {
  @scala.inline
  def apply(source: Slider, thumbOffset: Point, thumbSize: Size, value: Double): SliderChangeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], thumbOffset = thumbOffset.asInstanceOf[js.Any], thumbSize = thumbSize.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderChangeEvent]
  }
  @scala.inline
  implicit class SliderChangeEventOps[Self <: SliderChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThumbOffset(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

