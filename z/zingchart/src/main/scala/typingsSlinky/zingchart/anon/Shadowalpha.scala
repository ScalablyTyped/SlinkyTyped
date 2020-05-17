package typingsSlinky.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shadowalpha extends js.Object {
  /**
    * Sets the transparency of the tick. In the example, the scale-x ticks are vertical lines | in red in between the months. 0.3 | 0.9
    * | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * Sets the line color of the object, applicable on non-closed shapes. See also border-color for closed shapes. "none" | "transparent
    * " | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.native
  /**
    * Can be used to create custom dashed or dotted lines when used with line-segment-size. This will control the size of the gaps betwe
    * en each line segment. 4 | "6px" | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.native
  /**
    * Can be used to create custom dashed or dotted lines when used with line-gap-size. This will control the size of the visible segmen
    * t of line. 4 | "6px" | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.native
  /**
    * Sets the line width of the object, applicable on non-closed shapes. See also border-width for closed shapes. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.native
  /**
    * Determines the placement of tick marks along an axis line. inner | cross | outer
    */
  var placement: js.UndefOr[String] = js.native
  /**
    * Sets whether the object's shadow is visible or not. Has limited effect on HTML5 implementation. true | false | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.native
  /**
    * Sets the transparency of the shadow of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and
    * 1.0 being completely opaque. Please note that values also require the leading 0 before the decimal. Has limited effect on HTML5 im
    * plementation. 0.3 | 0.9 | ...
    */
  var `shadow-alpha`: js.UndefOr[Double] = js.native
  /**
    * Sets the angle of the shadow underneath the object. Has limited effect on HTML5 implementation. -45 | 115 | ...
    */
  var `shadow-angle`: js.UndefOr[Double] = js.native
  /**
    * Sets the blur effect size for the shadow of the object. Has limited effect on HTML5 implementation. 4 | "6px" | ...
    */
  var `shadow-blur`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the color of the shadow of the object. Has limited effect on HTML5 implementation. "none" | "transparent" | "#f00" | "#f00 #0
    * 0f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `shadow-color`: js.UndefOr[String] = js.native
  /**
    * Sets the distance between the shadow and the object. Has limited effect on HTML5 implementation. 4 | "6px" | ...
    */
  var `shadow-distance`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the size of the object/shape. 4 | "6px" | ...
    */
  var size: js.UndefOr[js.Any] = js.native
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Shadowalpha {
  @scala.inline
  def apply(): Shadowalpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shadowalpha]
  }
  @scala.inline
  implicit class ShadowalphaOps[Self <: Shadowalpha] (val x: Self) extends AnyVal {
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
    def `withLine-color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-gap-size`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gap-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-gap-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gap-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-segment-size`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-segment-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-segment-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-segment-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-style`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-width`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-width")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def `withShadow-alpha`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow-alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShadow-alpha`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow-alpha")(js.undefined)
        ret
    }
    @scala.inline
    def `withShadow-angle`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow-angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShadow-angle`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow-angle")(js.undefined)
        ret
    }
    @scala.inline
    def `withShadow-blur`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow-blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShadow-blur`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow-blur")(js.undefined)
        ret
    }
    @scala.inline
    def `withShadow-color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShadow-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withShadow-distance`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow-distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShadow-distance`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow-distance")(js.undefined)
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
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

