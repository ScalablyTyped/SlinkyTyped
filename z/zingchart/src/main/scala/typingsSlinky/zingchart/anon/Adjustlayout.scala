package typingsSlinky.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adjustlayout extends js.Object {
  /**
    * Forces the plotarea to consider the legend positioning and prevent overlapping with it. true | false | 1 | 0
    */
  var `adjust-layout`: js.UndefOr[Boolean] = js.native
  /**
    * Automatically aligns the legend and adjusts "plotarea" margins accordingly. "left" | "center" | "right"
    */
  var align: js.UndefOr[String] = js.native
  /**
    * Sets the transparency of the object. The higher the value, the less transparent the object appears. Requires the formatting 0.x. 0
    * .3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g. "red", "blue", "yellow"), in hexadecimal notation (e.
    * g. "#FF0000", "#0000FF", "#FFFF00"), or in RGB notation (e.g. "rgb(255,0,0)", "rgb(0,0,255)", "rgb(255,255,0)"). One color will se
    * t a solid background color, two colors will, by default, create a horizontal gradient. For more complex gradients, use gradient-co
    * lors and gradient-stops. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  /**
    * Sets the first color of a 2 color background gradient of the object. To be used with background-color-2. "none" | "transparent" |
    * "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-1`: js.UndefOr[String] = js.native
  /**
    * Sets the second color of a 2 color background gradient of the object. To be used with background-color-1. "none" | "transparent" |
    *  "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-2`: js.UndefOr[String] = js.native
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
    * Sets the object's bottom border style. Accepts solid, dotted, and dashed. Also accepts named colors. If color is not set properly,
    *  will default to black. "2px solid #f00" | ...
    */
  var `border-bottom`: js.UndefOr[String] = js.native
  /**
    * Sets the border color of the object, applicable on closed shapes. See also line-color for closed shapes. "none" | "transparent" |
    * "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  /**
    * Sets the object's left border style. Accepts solid, dashed, and dotted styles. "2px solid #f00" | ...
    */
  var `border-left`: js.UndefOr[String] = js.native
  /**
    * Sets the object's border radius, for rounded corners. The higher the value, the more rounded the corners appear. 4 | "6px" | "6px
    * 10px 3px 5px" | "-10px" | ...
    */
  var `border-radius`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's bottom-left border radius, for rounded corners. Larger values create rounder corners, while smaller values creat
    * e sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-left`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's bottom-right border radius, for rounded corners. Larger values create rounder corners, while smaller values crea
    * te sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-right`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's top-left border radius, for rounded corners. Larger values create rounder corners, while smaller values create s
    * harper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-left`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's top-right border radius, for rounded corners. Larger values create rounder corners, while smaller values create
    * sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-right`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's right border style. Accepts solid, dashed, and dotted styles. "2px solid #f00" | ...
    */
  var `border-right`: js.UndefOr[String] = js.native
  /**
    * Sets the object's top border style. Values must include the border width, style, and color. Accepts solid, dashed, and dotted styl
    * es. "2px solid #f00" | ...
    */
  var `border-top`: js.UndefOr[String] = js.native
  /**
    * Sets the border width of the object, applicable on closed shapes. See also line-width for closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.native
  /**
    * Sets whether an object will have a callout arrow or not. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.native
  /**
    * Sets the length for an extension line off the tip of the callout arrow. 4 | "6px" | ...
    */
  var `callout-extension`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the height of the object's callout arrow. A larger value will create a taller callout arrow. 4 | "6px" | ...
    */
  var `callout-height`: js.UndefOr[js.Any] = js.native
  /**
    * Sets a location for the point of the tip of the callout arrow. Uses XY coordinates. [200, 50] | ...
    */
  var `callout-hook`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the offset for the origin of the callout arrow. Uses positive or negative values to move the arrow right/left/up/down. 4 | "6
    * px" | ...
    */
  var `callout-offset`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the position for the object's callout arrow. The position is "bottom" by default. "top" | "right" | "bottom" | "left"
    */
  var `callout-position`: js.UndefOr[String] = js.native
  /**
    * Sets which edge will be the location for the object's callout arrow. 4 | "6px" | ...
    */
  var `callout-width`: js.UndefOr[js.Any] = js.native
  /**
    * Sets legend to be collapsed by default true | false | 1 | 0
    */
  var collapse: js.UndefOr[Boolean] = js.native
  /**
    * Sets the handler used to drag the legend: icon will create a dragging icon on the legend header, which will be the only area on wh
    * ich you can click and drag, header will make the whole header object active for dragging the legend. "header" | "icon"
    */
  var `drag-handler`: js.UndefOr[String] = js.native
  /**
    * Sets whether the legend can be dragged or not. true | false | 1 | 0
    */
  var draggable: js.UndefOr[Boolean] = js.native
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
  var footer: js.UndefOr[Backgroundposition] = js.native
  /**
    * Sets a set of colors for a complex background gradient (more than 2 colors). To be used with gradient-stops. "#f00 #0f0 #00f" | ..
    * .
    */
  var `gradient-colors`: js.UndefOr[String] = js.native
  /**
    * Sets the position for the introduction of each color for a complex background gradient (more than 2 colors). To be used with gradi
    * ent-colors. "0.1 0.5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.native
  var header: js.UndefOr[Backgroundrepeat] = js.native
  /**
    * Sets the object's height. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[js.Any] = js.native
  /**
    * An alias for the "highlight" attribute in the "plot" object. Highlights the corresponding plot when the legend item is moused over
    * . true | false | 1 | 0
    */
  var `highlight-plot`: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[Linecolor] = js.native
  var item: js.UndefOr[Borderleft] = js.native
  var `item-off`: js.UndefOr[Borderbottom] = js.native
  /**
    * Sets the layout for the legend items. "horizontal" | "h" | "vertical" | "v" | "row x col" | "x col" | "row x" | "float"
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * Sets the object's margin/s from the top-left of the chart. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var margin: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's bottom margin. 4 | "6px" | ...
    */
  var `margin-bottom`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's left margin. 4 | "6px" | ...
    */
  var `margin-left`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's right margin. 4 | "6px" | ...
    */
  var `margin-right`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's top margin. 4 | "6px" | ...
    */
  var `margin-top`: js.UndefOr[js.Any] = js.native
  var marker: js.UndefOr[Fillangle] = js.native
  /**
    * Sets the maximum number of items displayed on the legend. To be used with overflow. 5 | 10 | ...
    */
  var `max-items`: js.UndefOr[Double] = js.native
  /**
    * Sets whether the legend can be minimized or not.
    */
  var minimize: js.UndefOr[Boolean] = js.native
  /**
    * Sets an X offset to apply when positioning the legend. A positive value moves the legend to the right. A negative value moves the
    * legend to the left. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.native
  /**
    * Sets a Y offset to apply when positioning the legend. A positive value moves the legend down. A negative value moves the legend up
    * . 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the display mode for legend items beyond max-items setting: none will display all items, hidden will display just top max-ite
    * ms items, page will enable the pagination module, scrollwill enable legend scrolling, with top max-items items per page. To be use
    * d with max-item. "none" | "hidden" | "page" | "scroll"
    */
  var overflow: js.UndefOr[String] = js.native
  var `page-off`: js.UndefOr[Filloffsetx] = js.native
  var `page-on`: js.UndefOr[Filloffsetx] = js.native
  var `page-status`: js.UndefOr[Bold] = js.native
  /**
    * Sets the object's position relative to its container. Similar results can be obtained by setting [margin] and [margin-...] attribu
    * tes. Uses x,y coordinates originating from the top left of the chart.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * Reverses the items in the legend
    */
  var `reverse-series`: js.UndefOr[Boolean] = js.native
  var scroll: js.UndefOr[Bar] = js.native
  /**
    * Sets whether the object's shadow is visible or not. Has limited effect on HTML5 implementation. true | false | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.native
  /**
    * Sets the transparency of the shadow of the object. The higher the value, the less transparent the shadow will be. 0.3 | 0.9 | ...
    */
  var `shadow-alpha`: js.UndefOr[Double] = js.native
  /**
    * Sets the angle of the shadow underneath the object. -45 | 115 | ...
    */
  var `shadow-angle`: js.UndefOr[Double] = js.native
  /**
    * Sets the blur effect size for the shadow of the object. Has limited effect on HTML5 implementation. 4 | "6px" | ...
    */
  var `shadow-blur`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the color of the shadow of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ..
    * .
    */
  var `shadow-color`: js.UndefOr[String] = js.native
  /**
    * Sets the distance between the shadow and the object. 4 | "6px" | ...
    */
  var `shadow-distance`: js.UndefOr[js.Any] = js.native
  /**
    * For graphsets with multiple chart objects, setting this attribute to true within the legend object of each chart will allow you to
    *  use one legend to toggle data on or off for each chart simultaneously. It should be noted that while each chart must have a legen
    * d object, the visible attribute can be set to false to hide a legend. true | false | 1 | 0
    */
  var shared: js.UndefOr[js.Any] = js.native
  /**
    * Sets the action performed on legend item toggle: hide will simply hide the respective plot, remove will repaint the chart without
    * considering the respective plot, disabled will not generate any action for the legend items/markers. "hide" | "remove" | "disabled
    * "
    */
  var `toggle-action`: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[Borderalpha] = js.native
  /**
    * Automatically aligns the legend and adjusts "plotarea" margins accordingly. "top" | "middle" | "bottom"
    */
  var `vertical-align`: js.UndefOr[String] = js.native
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Sets the object's width. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[js.Any] = js.native
  /**
    * Sets the X position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[js.Any] = js.native
  /**
    * Sets the Y position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[js.Any] = js.native
}

object Adjustlayout {
  @scala.inline
  def apply(): Adjustlayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Adjustlayout]
  }
  @scala.inline
  implicit class AdjustlayoutOps[Self <: Adjustlayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAdjust-layout`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjust-layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAdjust-layout`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjust-layout")(js.undefined)
        ret
    }
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
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
    def `withBackground-color-1`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color-1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-color-1`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color-1")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-color-2`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color-2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-color-2`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color-2")(js.undefined)
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
    def `withBorder-bottom`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-bottom`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-bottom")(js.undefined)
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
    def `withBorder-left`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-radius`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-radius`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-radius")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-radius-bottom-left`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-radius-bottom-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-radius-bottom-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-radius-bottom-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-radius-bottom-right`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-radius-bottom-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-radius-bottom-right`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-radius-bottom-right")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-radius-top-left`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-radius-top-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-radius-top-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-radius-top-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-radius-top-right`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-radius-top-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-radius-top-right`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-radius-top-right")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-right`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-right`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-right")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-top`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-top`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-top")(js.undefined)
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
    def withCallout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout")(js.undefined)
        ret
    }
    @scala.inline
    def `withCallout-extension`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout-extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCallout-extension`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout-extension")(js.undefined)
        ret
    }
    @scala.inline
    def `withCallout-height`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCallout-height`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout-height")(js.undefined)
        ret
    }
    @scala.inline
    def `withCallout-hook`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout-hook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCallout-hook`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout-hook")(js.undefined)
        ret
    }
    @scala.inline
    def `withCallout-offset`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCallout-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withCallout-position`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout-position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCallout-position`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout-position")(js.undefined)
        ret
    }
    @scala.inline
    def `withCallout-width`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCallout-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout-width")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def `withDrag-handler`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag-handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDrag-handler`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag-handler")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
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
    def withFooter(value: Backgroundposition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
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
    def withHeader(value: Backgroundrepeat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def `withHighlight-plot`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight-plot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHighlight-plot`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight-plot")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: Linecolor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: Borderleft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def `withItem-off`(value: Borderbottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item-off")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutItem-off`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item-off")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-bottom`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-bottom`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-bottom")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-left`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-right`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-right`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-right")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-top`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-top`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-top")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: Fillangle): Self = {
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
    def `withMax-items`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-items`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-items")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(js.undefined)
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
    def withOverflow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(js.undefined)
        ret
    }
    @scala.inline
    def `withPage-off`(value: Filloffsetx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-off")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPage-off`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-off")(js.undefined)
        ret
    }
    @scala.inline
    def `withPage-on`(value: Filloffsetx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPage-on`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-on")(js.undefined)
        ret
    }
    @scala.inline
    def `withPage-status`(value: Bold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPage-status`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-status")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
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
    def withScroll(value: Bar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
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
    def withShared(value: js.Any): Self = {
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
    def `withToggle-action`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutToggle-action`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-action")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: Borderalpha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def `withVertical-align`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical-align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutVertical-align`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical-align")(js.undefined)
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
    @scala.inline
    def withWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
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

