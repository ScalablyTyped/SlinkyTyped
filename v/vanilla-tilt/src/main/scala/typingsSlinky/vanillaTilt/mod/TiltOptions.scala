package typingsSlinky.vanillaTilt.mod

import typingsSlinky.vanillaTilt.vanillaTiltStrings.x
import typingsSlinky.vanillaTilt.vanillaTiltStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TiltOptions extends js.Object {
  /**
    * What axis should be disabled. Can be X or Y.
    */
  var axis: js.UndefOr[Null | x | y] = js.native
  /**
    * Easing on enter/exit.
    */
  var easing: js.UndefOr[String] = js.native
  // If true, parallax effect will listen to mouse move events on the whole document, not only the selected element
  var `full-page-listening`: js.UndefOr[Boolean] = js.native
  /**
    * if it should have a "glare" effect
    */
  var glare: js.UndefOr[Boolean] = js.native
  /**
    * false = VanillaTilt creates the glare elements for you, otherwise
    * you need to add .js-tilt-glare>.js-tilt-glare-inner by yourself
    */
  var `glare-prerender`: js.UndefOr[Boolean] = js.native
  // Boolean to enable/disable device orientation detection,
  var gyroscope: js.UndefOr[Boolean] = js.native
  // This is the top limit of the device angle on X axis,
  // meaning that a device rotated at this angle would tilt the element as if
  // the mouse was on the right border of the element;
  var gyroscopeMaxAngleX: js.UndefOr[Double] = js.native
  // This is the top limit of the device angle on Y axis,
  // meaning that a device rotated at this angle would tilt the element as if
  // the mouse was on the bottom border of the element;
  var gyroscopeMaxAngleY: js.UndefOr[Double] = js.native
  // This is the bottom limit of the device angle on X axis,
  // meaning that a device rotated at this angle would tilt the element as if
  // the mouse was on the left border of the element;
  var gyroscopeMinAngleX: js.UndefOr[Double] = js.native
  // This is the bottom limit of the device angle on Y axis,
  // meaning that a device rotated at this angle would tilt the element as if
  // the mouse was on the top border of the element;
  var gyroscopeMinAngleY: js.UndefOr[Double] = js.native
  //How many gyroscope moves to decide the starting position.
  var gyroscopeSamples: js.UndefOr[Double] = js.native
  /**
    * Max tilt rotation (degrees)
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * the maximum "glare" opacity
    */
  var `max-glare`: js.UndefOr[Double] = js.native
  // css-selector or link to HTML-element what will be listen mouse events
  var `mouse-event-element`: js.UndefOr[String] = js.native
  /**
    * Transform perspective, the lower the more extreme the tilt gets.
    */
  var perspective: js.UndefOr[Double] = js.native
  /**
    * If the tilt effect has to be reset on exit.
    */
  var reset: js.UndefOr[Boolean] = js.native
  /**
    * Reverse the tilt direction
    */
  var reverse: js.UndefOr[Boolean] = js.native
  /**
    * 2 = 200%, 1.5 = 150%, etc..
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * Speed of the enter/exit transition
    */
  var speed: js.UndefOr[Double] = js.native
  /**
    * Starting X tilt rotation (degrees)
    */
  var startX: js.UndefOr[Double] = js.native
  /**
    * Starting Y tilt rotation (degrees)
    */
  var startY: js.UndefOr[Double] = js.native
  /**
    * Set a transition on enter/exit.
    */
  var transition: js.UndefOr[Boolean] = js.native
}

object TiltOptions {
  @scala.inline
  def apply(): TiltOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TiltOptions]
  }
  @scala.inline
  implicit class TiltOptionsOps[Self <: TiltOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: x | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(null)
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
    def `withFull-page-listening`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full-page-listening")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFull-page-listening`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full-page-listening")(js.undefined)
        ret
    }
    @scala.inline
    def withGlare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glare")(js.undefined)
        ret
    }
    @scala.inline
    def `withGlare-prerender`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glare-prerender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGlare-prerender`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glare-prerender")(js.undefined)
        ret
    }
    @scala.inline
    def withGyroscope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroscope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGyroscope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroscope")(js.undefined)
        ret
    }
    @scala.inline
    def withGyroscopeMaxAngleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroscopeMaxAngleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGyroscopeMaxAngleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroscopeMaxAngleX")(js.undefined)
        ret
    }
    @scala.inline
    def withGyroscopeMaxAngleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroscopeMaxAngleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGyroscopeMaxAngleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroscopeMaxAngleY")(js.undefined)
        ret
    }
    @scala.inline
    def withGyroscopeMinAngleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroscopeMinAngleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGyroscopeMinAngleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroscopeMinAngleX")(js.undefined)
        ret
    }
    @scala.inline
    def withGyroscopeMinAngleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroscopeMinAngleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGyroscopeMinAngleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroscopeMinAngleY")(js.undefined)
        ret
    }
    @scala.inline
    def withGyroscopeSamples(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroscopeSamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGyroscopeSamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroscopeSamples")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-glare`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-glare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-glare`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-glare")(js.undefined)
        ret
    }
    @scala.inline
    def `withMouse-event-element`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse-event-element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMouse-event-element`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse-event-element")(js.undefined)
        ret
    }
    @scala.inline
    def withPerspective(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perspective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerspective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perspective")(js.undefined)
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
    def withReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
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
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withStartX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(js.undefined)
        ret
    }
    @scala.inline
    def withStartY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startY")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
  }
  
}

