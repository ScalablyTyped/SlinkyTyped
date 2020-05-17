package typingsSlinky.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Offsety extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * Sets the rotation angle of the object/shape. -45 | 115 | ...
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g. "red", "blue", "yellow"), in hexadecimal notation (e.
    * g. "#FF0000", "#0000FF", "#FFFF00"), or in RGB notation (e.g. "rgb(255,0,0)", "rgb(0,0,255)", "rgb(255,255,0)"). One color will se
    * t a solid background color, two colors will, by default, create a horizontal gradient. For more complex gradients, use gradient-co
    * lors and gradient-stops. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  /**
    * Sets the direction/s on which the background image is being "stretched". "x" | "y" | "xy"
    */
  var `background-fit`: js.UndefOr[String] = js.native
  /**
    * Sets a background image for the object. Value can be a local file or a web image's location. "image.png" | ...
    */
  var `background-image`: js.UndefOr[String] = js.native
  /**
    * Sets the position of the background when the background-repeat value is no-repeat. "0 0" | "50 100" | "80% 60%" | ...
    */
  var `background-position`: js.UndefOr[String] = js.native
  /**
    * Sets the repeating mode for the background image. "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
    */
  var `background-repeat`: js.UndefOr[String] = js.native
  /**
    * Sets the border color of the object, applicable on closed shapes. See also line-color for closed shapes. "none" | "transparent" |
    * "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  /**
    * Sets the border width of the object, applicable on closed shapes. See also line-width for closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the angle of the axis along which the linear gradient is drawn. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.native
  /**
    * Sets an X offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-x`: js.UndefOr[js.Any] = js.native
  /**
    * Sets an Y offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-y`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the background gradient fill type to either linear or radial. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.native
  /**
    * Sets a set of colors for a complex background gradient consisting of 2 or more colors. To be used with gradient-stops. "#f00 #0f0
    * #00f" | ...
    */
  var `gradient-colors`: js.UndefOr[String] = js.native
  /**
    * Sets the gradient stops for a complex background gradient consisting of 2 or more colors. To be used with gradient-colors. "0.1 0.
    * 5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.native
  /**
    * Sets an X offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.native
  /**
    * Sets a Y offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the size of the object/shape. 4 | "6px" | ...
    */
  var size: js.UndefOr[js.Any] = js.native
  /**
    * Sets the type of icon displayed on mobile devices to tap to bring up the drop-down menu. gear4 can be specified, this means that t
    * he gear icon shown will have four sprockets protruding from it. Gears can range from 3-9. star4 has 4 points, while star9 has 9 po
    * ints. Stars can range from 3-9 also. "gear4" | "gear9" | "star4" | "star9" | ...
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Sets the X position of the object. The context-menu button object must be positioned separately. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[js.Any] = js.native
  /**
    * Sets the Y position of the object. The context-menu button object must be positioned separately. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[js.Any] = js.native
}

object Offsety {
  @scala.inline
  def apply(): Offsety = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Offsety]
  }
  @scala.inline
  implicit class OffsetyOps[Self <: Offsety] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-fit`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-fit`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-fit")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-image`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-image`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-image")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-position`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-position`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-position")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-repeat`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-repeat`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-repeat")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-width`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-angle`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-angle`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-angle")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-offset-x`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-offset-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-offset-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-offset-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-offset-y`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-offset-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-offset-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-offset-y")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-type`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-type")(js.undefined)
        ret
    }
    @scala.inline
    def `withGradient-colors`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient-colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGradient-colors`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient-colors")(js.undefined)
        ret
    }
    @scala.inline
    def `withGradient-stops`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient-stops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGradient-stops`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient-stops")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-x`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-y`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-y")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: js.Any): Self = {
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
    def withY(value: js.Any): Self = {
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

