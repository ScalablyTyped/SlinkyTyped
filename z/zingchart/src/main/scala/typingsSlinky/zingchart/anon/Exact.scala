package typingsSlinky.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exact extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * X-Axis Crosshairs Only: When true, plot nodes will be highlighted only when the guide is directly next to the node. When false (th
    * e default setting), the plot nodes closest to the guide will be highlighted. true | false | 1 | 0
    */
  var exact: js.UndefOr[Boolean] = js.native
  /**
    * Sets the line color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
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
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed"
    */
  var `line-style`: js.UndefOr[String] = js.native
  /**
    * Sets the line width of the object. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.native
  var marker: js.UndefOr[Backgroundcolor] = js.native
  var `plot-label`: js.UndefOr[Backgroundcolor1] = js.native
  /**
    * Reverses the order of items in plotLabel. Generally used with positive stacked charts.
    */
  var `reverse-series`: js.UndefOr[Boolean] = js.native
  var `scale-label`: js.UndefOr[Backgroundcolor2] = js.native
  /**
    * X-Axis Crosshairs Only: For graphsets with multiple chart objects, setting the attribute to true in "crosshair-x" will allow you t
    * o use crosshairs across all charts simultaneously. true | false | 1 | 0
    */
  var shared: js.UndefOr[Boolean] = js.native
  /**
    * X-Axis Crosshairs Only: Sets the mode used to display crosshair plot-labels. When set to "move" (the default setting), plot-labels
    *  for all nodes will be displayed. The "hover" setting will allow only one plot-label to be displayed at a time, with the visibilit
    * y of each label being triggered when the user hovers over a node. "move" | "hover"
    */
  var trigger: js.UndefOr[String] = js.native
  /**
    * Y-Axis Crosshairs Only: Sets the type of the "crosshair-y", either in single mode (one line for all scales) or multiple (a line fo
    * r every plot). "single" | "multiple"
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Exact {
  @scala.inline
  def apply(): Exact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exact]
  }
  @scala.inline
  implicit class ExactOps[Self <: Exact] (val x: Self) extends AnyVal {
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
    def withExact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(js.undefined)
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
    def withMarker(value: Backgroundcolor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def `withPlot-label`(value: Backgroundcolor1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plot-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPlot-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plot-label")(js.undefined)
        ret
    }
    @scala.inline
    def `withReverse-series`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse-series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutReverse-series`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse-series")(js.undefined)
        ret
    }
    @scala.inline
    def `withScale-label`(value: Backgroundcolor2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScale-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale-label")(js.undefined)
        ret
    }
    @scala.inline
    def withShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
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

