package typingsSlinky.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnimation extends js.Object {
  /**
    * Sets the transparency level of backgrounds, borders, and lines. Values must range between 0.0 and 1.0, with 0.0 being completely t
    * ransparent and 1.0 being completely opaque. Note that values require the leading zero before the decimal point. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  var animation: js.UndefOr[Anon1] = js.native
  /**
    * Modifies how data points appear on a chart. Refer to the applicable chart types page for more information. Options by Chart Type:
    * "segmented" | "spline" | "stepped" | "jumped" | "cone" | "histogram" | ...
    */
  var aspect: js.UndefOr[String] = js.native
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g. "red", "blue", "yellow"), in hexadecimal notation (e.
    * g. "#FF0000", "#0000FF", "#FFFF00"), or in RGB notation (e.g. "rgb(255,0,0)", "rgb(0,0,255)", "rgb(255,255,0)"). One color will se
    * t a solid background color, two colors will, by default, create a horizontal gradient. For more complex gradients, use "gradient-c
    * olors" and "gradient-stops". "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  /**
    * Sets the first color of a 2 color background gradient of the object. To be used with "background-color-2". "none" | "transparent"
    * | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-1`: js.UndefOr[String] = js.native
  /**
    * Sets the second color of a 2 color background gradient of the object. To be used with "background-color-1". "none" | "transparent"
    *  | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
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
  var `background-marker`: js.UndefOr[AnonFilloffsety] = js.native
  /**
    * Sets the position of the background when the "background-repeat" value is "no-repeat". "0 0" | "50 100" | "80% 60%" | ...
    */
  var `background-position`: js.UndefOr[String] = js.native
  /**
    * Sets the repeating mode for the background image. "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
    */
  var `background-repeat`: js.UndefOr[String] = js.native
  var `background-state`: js.UndefOr[AnonFilltype] = js.native
  /**
    * Nested Pie Charts Only: This attribute is used to set the space between band in nested pie charts ("type":"nestedpie"). 5 | 10 | .
    * ..
    */
  var `band-space`: js.UndefOr[Double] = js.native
  /**
    * Bar Charts and Bullet Charts Only: Sets the max width of bars. "10" | "10%" | "10px"
    */
  var `bar-max-width`: js.UndefOr[Double] = js.native
  /**
    * Bar Charts and Bullet Charts Only: Sets the amount of space between each bar in a single plot index. "10" | "10%" | "10px"
    */
  var `bar-space`: js.UndefOr[Double] = js.native
  /**
    * Bar Charts and Bullet Charts Only: Sets the width of each bar. "10" | "10%" | "10px"
    */
  var `bar-width`: js.UndefOr[Double] = js.native
  /**
    * Bar Charts and Bullet Charts Only: Defines how much the bars in each plot index should overlap. "10" | "10%" | "10px"
    */
  var `bars-overlap`: js.UndefOr[Double] = js.native
  /**
    * Bar Charts and Bullet Charts Only: Defines the spacing to the left of the bars at each index position. "10" | "10%" | "10px"
    */
  var `bars-space-left`: js.UndefOr[Double] = js.native
  /**
    * Bar Charts and Bullet Charts Only: Defines the spacing to the right of the bars at each index position. "10" | "10%" | "10px"
    */
  var `bars-space-right`: js.UndefOr[Double] = js.native
  /**
    * Sets the border color of the object, applicable on closed shapes. See also "line-color" for closed shapes. "none" | "transparent"
    * | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  /**
    * Sets the object's border radius, for rounded corners. Larger values create rounder corners, while smaller values create sharper co
    * rners. A single value will affect all 4 corners, while multiple values will have separate effects on each corner, with the first v
    * alue affecting the top-left corner, the second value affecting the top-right corner, and so on, in a clockwise direction. A negati
    * ve value will cut a corner off without rounding. 4 | "6px" | "6px 10px 3px 5px" | "-10px" | ...
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
    * Sets the border width of the object, applicable on closed shapes. See also "line-width" for closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.native
  /**
    * Sets whether an object will have a callout arrow or not. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.native
  /**
    * Sets the height of the object's callout arrow. A larger value will create a taller callout arrow. 4 | "6px" | ...
    */
  var `callout-height`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the point of the tip of the callout arrow to a specified coordinate on the chart, with the starting point of [0,0] being the
    * top left corner of the chart. [200, 50] | ...
    */
  var `callout-hook`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the offset along the callout direction of the arrow's base. Positive and negative values can be used to offset the callout ar
    * row up, down, left, or right depending on the "callout-position". 4 | "6px" | ...
    */
  var `callout-offset`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the position for the object's callout arrow. The position is "bottom" by default. "top" | "right" | "bottom" | "left"
    */
  var `callout-position`: js.UndefOr[String] = js.native
  /**
    * Sets the width of the object's callout arrow. A larger value will create a wider callout arrow. 4 | "6px" | ...
    */
  var `callout-width`: js.UndefOr[js.Any] = js.native
  /**
    * By defalut null values within series arrays will create a blank space within a plot. Setting connected-nulls to true will connect
    * values through a null data point. true | false | 1 | 0
    */
  var `connect-nulls`: js.UndefOr[Boolean] = js.native
  /**
    * Area Charts Only: Sets whether the contour lines on area plots will be on top of all areas or will be hidden by the next area plot
    *  on top of it. You will notice when the attribute is set to true the lines are all set above the shaded regions. true | false | 1
    * | 0
    */
  var `contour-on-top`: js.UndefOr[Boolean] = js.native
  /**
    * Sets the style of the cursor when hovering over a node. "hand" | "normal"
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * This attribute allows you to create custom tokens and associate static or dynamic data to them. This attribute can be used almost
    * anywhere in a chart. "Some Text" | ...
    */
  @JSName("data-...")
  var `data-DotDotDot`: js.UndefOr[String] = js.native
  /**
    * Using the decimals attribute will allow you to set the number of decimal places associated to each value. 5 | 10 | ...
    */
  var decimals: js.UndefOr[Double] = js.native
  /**
    * The "decimals-separator": attribute allows you to set what type of punctuation the will be used in the decimal place. "." | "," |
    * ...
    */
  var `decimals-separator`: js.UndefOr[String] = js.native
  /**
    * This attribute sets description text for the plot which can be addressed in various areas with the %plot-description token. "Some
    * Text" | ...
    */
  var description: js.UndefOr[String] = js.native
  var error: js.UndefOr[AnonLinegapsize] = js.native
  var errors: js.UndefOr[js.Array[js.Object]] = js.native
  /**
    * By default ZingChart uses sampling when rendering charts. This helps improve rendering speeds and typically does not effect the ap
    * pearance of the chart. However, using the attribute "exact": true within the "plot": { } object forces ZingChart to render all nod
    * es. true | false | 1 | 0
    */
  var exact: js.UndefOr[Boolean] = js.native
  /**
    * This attribute sets the values to scientific notation true | false | 1 | 0
    */
  var exponent: js.UndefOr[Boolean] = js.native
  /**
    * This attribute set the number of decimals to be used when using exponents for scientific notation 5 | 10 | ...
    */
  var exponentDecimals: js.UndefOr[Double] = js.native
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
  var goal: js.UndefOr[AnonHeight] = js.native
  /**
    * Bullet Charts Only: Accepts numerical values. Determines where goals are set for all plots. The "goals": [ ] values can also be se
    * t individually within each value set. [45, 70, 60]
    */
  var goals: js.UndefOr[js.Any] = js.native
  /**
    * Sets a set of colors for a complex background gradient consisting of 2 or more colors. To be used with "gradient-stops". "#f00 #0f
    * 0 #00f" | ...
    */
  var `gradient-colors`: js.UndefOr[String] = js.native
  /**
    * Sets the gradient stops for a complex background gradient consisting of 2 or more colors. To be used with "gradient-colors". "0.1
    * 0.5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.native
  /**
    * When true, automatically selects all nodes with the same scale index as the selected node. The selection-mode attribute must also
    * be set. true | false | 1 | 0
    */
  var `group-selections`: js.UndefOr[Boolean] = js.native
  var `guide-label`: js.UndefOr[AnonFontsize] = js.native
  var `highlight-marker`: js.UndefOr[AnonLinewidth] = js.native
  var `highlight-state`: js.UndefOr[AnonLinewidth] = js.native
  var `hover-marker`: js.UndefOr[AnonGradientcolors] = js.native
  var `hover-state`: js.UndefOr[AnonAlphaarea] = js.native
  /**
    * Venn Diagrams Only: This attribute allow you to set the values for the area to be shared between each node. [30]
    */
  var join: js.UndefOr[js.Any] = js.native
  var `legend-item`: js.UndefOr[AnonBorderradiusbottomleft] = js.native
  var `legend-marker`: js.UndefOr[AnonCursor] = js.native
  /**
    * The "legend-text": attribute is typically used within "series": [ ] value sets. Using this attribute allows you to associate both
    * a "text":" " and "legend-text":" " to each value set "Some Text" | ...
    */
  var `legend-text`: js.UndefOr[String] = js.native
  /**
    * Sets the line color of the object, applicable on non-closed shapes. See also "border-color"for closed shapes. "none" | "transparen
    * t" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.native
  /**
    * Can be used to create custom dashed or dotted lines when used with "line-segment-size". This will control the size of the gaps bet
    * ween each line segment. 4 | "6px" | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.native
  /**
    * Can be used to create custom dashed or dotted lines when used with "line-gap-size". This will control the size of the visible segm
    * ent of line. 4 | "6px" | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed"
    */
  var `line-style`: js.UndefOr[String] = js.native
  /**
    * Sets the line width of the object, applicable on non-closed shapes. See also "border-width" for closed shapes. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.native
  var marker: js.UndefOr[AnonGradientstops] = js.native
  /**
    * Applies to charts such as line and area which have markers. When there are too many markers for the chart ZingChart does not displ
    * ay all markers. Example 1000 nodes on a 300px wide chart. Setting max-nodes will override the default setting and force nodes to b
    * e displayed. 5 | 10 | ...
    */
  var `max-nodes`: js.UndefOr[Double] = js.native
  /**
    * Heat Maps Only: Sets a maximum ratio applied to the value of the node when calculating its aspect. 0 | 0.4 | ...
    */
  var `max-ratio`: js.UndefOr[Double] = js.native
  /**
    * Bubble Charts and Bubble Pie Charts Only: Defines the maximum size of the bubble if the value representing size is not sharing the
    *  same ratio with the value scale. 5 | 10 | ...
    */
  var `max-size`: js.UndefOr[Double] = js.native
  /**
    * Sets the maximum numbers of nodes for which a tracking area will be created. This is best used to optimize charts with large sets
    * of data. 5 | 10 | ...
    */
  var `max-trackers`: js.UndefOr[Double] = js.native
  /**
    * Sets whether or not a node is wrapped equally before and after its position. true | false | 1 | 0
    */
  var `mid-point`: js.UndefOr[Boolean] = js.native
  /**
    * Heat Maps Only: Sets a minimum ratio applied to the value of the node when calculating its aspect. 0 | 0.4 | ...
    */
  var `min-ratio`: js.UndefOr[Double] = js.native
  /**
    * Bubble Charts and Bubble Pie Charts Only: Defines the minimum size of the bubble if the value representing size is not sharing the
    *  same ratio with the value scale. 5 | 10 | ...
    */
  var `min-size`: js.UndefOr[Double] = js.native
  /**
    * Sets whether monotone interpolation is used for charts using the "spline" aspect. true | false | 1 | 0
    */
  var monotone: js.UndefOr[Boolean] = js.native
  /**
    * Setting "multiplier": true will take large numbers such as thousands, millions, etc and replace the full number with an abbreviate
    * d notation with a short unit such as K, M, B, etc true | false | 1 | 0
    */
  var multiplier: js.UndefOr[Boolean] = js.native
  /**
    * This attribute will determine how negative values are handled. When using "format":"$%v" setting "negation":"currency" will move t
    * he - symbol to the outside of the $ sign. When using "negation" within the "plot": { } object you will see changes in things such
    * as tooltips or anywhere else series data is used to populate values. You need to set "negation" in things such as "scale-y": { } s
    * eparately. "standard" | "currency"
    */
  var negation: js.UndefOr[String] = js.native
  /**
    * Sets an X offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.native
  /**
    * Sets a Y offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.native
  /**
    * Pie Charts Only: Use this to transform the shape of the pie slices.
    */
  var `pie-transformpieTransform`: js.UndefOr[String] = js.native
  var preview: js.UndefOr[AnonType] = js.native
  /**
    * Pie Charts Only: Provides the ability to rotate the chart. 5 | 10 | ...
    */
  var `ref-angle`: js.UndefOr[Double] = js.native
  /**
    * Heat Maps Only: Sets the value (default 'plot-max') which is used as a reference for calculating node aspect. "plot-max" | "plot-t
    * otal" | "chart-max" | "chart-total"
    */
  var reference: js.UndefOr[String] = js.native
  var rules: js.UndefOr[js.Array[AnonRule]] = js.native
  /**
    * By default ZingChart uses sampling when rendering large datasets. If you are trying to render 10000 data points on a chart which i
    * s only 500px wide there is not enough space for each data point. ZingChart will automatically determine which data points to show.
    *  The "sampling-step": attribute allows you to set the step for sampling. For example if you have 10000 data points and set "sampli
    * ng-step":10 it will show point 1,10,20,... Also note the "exact": true attribute if you want to force all data points. 5 | 10 | ..
    * .
    */
  var `sampling-step`: js.UndefOr[Double] = js.native
  /**
    * Specifies the scales used by the series item. scale-x,scale-y | scale-x,scale-y-2 | ...
    */
  var scales: js.UndefOr[String] = js.native
  /**
    * Bubble Charts and Bubble Pie Charts Only: Sets the method used to relate the bubble numerical value to it's aspect. "radius" | "sq
    * rt" | "area"
    */
  var scaling: js.UndefOr[String] = js.native
  /**
    * When scrolling is enabled for a chart, ZingChart automatically samples the data in order to maintain performance during the re-ren
    * dering of the chart that occurs during scrolling. By default, ZingChart will automatically sample every other item (scroll-step-mu
    * ltiplier:2). Setting scroll-step-multiplier to 1 will force the library to sample every data point, essentially disabling sampling
    * . 5 | 10 | ...
    */
  var `scroll-step-multiplier`: js.UndefOr[Double] = js.native
  /**
    * Line Charts and Area Charts Only: Allows you to specify whether tooltips are activated by the markers and lines (default) or the m
    * arkers only. true (default) | false
    */
  var `segment-trackers`: js.UndefOr[Boolean] = js.native
  var `selected-marker`: js.UndefOr[AnonOffsetx] = js.native
  var `selected-state`: js.UndefOr[AnonShadow] = js.native
  /**
    * Sets whether the object's shadow is visible or not. Has limited effect on HTML5 implementation. true | false | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.native
  /**
    * Sets the transparency of the shadow of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and
    * 1.0 being completely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
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
    * Setting "short": true will abbreviate long numbers such as 100000 to 1K or 1000000 to 1M. When set within the "plot": {} object th
    * is change will be noticed anywhere values are pulled from series data. This can also be used in places such as "scale-y, scale-x,
    * etc" true | false | 1 | 0
    */
  var short: js.UndefOr[Boolean] = js.native
  /**
    * By default when setting "short": true ZingChart will round to the nearest short unit (ie 100000 to 100K and 1000000 to 1M). You ca
    * n set the short-unit and ZingChart will round all numbers to that unit. Note when setting this within the "plot": { } object the c
    * hanges will only effect values which are pulled from the series values. Things such as scale are set separately. "k" | "K" | "m" |
    *  "M" | "b" | "B"
    */
  var `short-unit`: js.UndefOr[String] = js.native
  /**
    * On bar charts, when the value of a bar is 0, setting `show-zero`: true will add 1 pixel to the height of the bar so that it is onl
    * y just visible. true | false | 1 | 0
    */
  var `show-zero`: js.UndefOr[Boolean] = js.native
  /**
    * Bubble Charts and Bubble Pie Charts Only: Sets a multiplier (default 1) used to increase/decrease the bubble size 5 | 10 | ...
    */
  var `size-factor`: js.UndefOr[Double] = js.native
  /**
    * Nested Pie Charts Only: Sets the initial offset of the pie layers when making a nestedpie 5 | 10 | ...
    */
  var `slice-start`: js.UndefOr[Double] = js.native
  /**
    * A boolean to smart sample and render data at a sampled size. Used in conjuction with exact:false true | false
    */
  var `smart-sampling`: js.UndefOr[Boolean] = js.native
  /**
    * Using the "stack": attribute allows you to assign which plot index you want to each value set associated with when using a stacked
    *  chart. 5 | 10 | ...
    */
  var stack: js.UndefOr[Double] = js.native
  /**
    * Setting "stacked": true will take each of the "series": [ ] value sets and stack them on top of one another true | false | 1 | 0
    */
  var stacked: js.UndefOr[Boolean] = js.native
  /**
    * Applicable on aspect=stepped, sets the location of the stepping relative to two consecutive nodes. "before" | "middle" | "after"
    */
  var `step-start`: js.UndefOr[String] = js.native
  /**
    * Sets the url's target for the link associated with the object. Use with "url". "_blank" | ...
    */
  var target: js.UndefOr[String] = js.native
  /**
    * Sets the thickness of pie3d charts. 5 | 10 | ...
    */
  var thickness: js.UndefOr[Double] = js.native
  /**
    * When you set the "thousands-separator": attribute the punctuation which is used will be placed to separate digits which go into 1,
    * 000's 10,000's etc. When placed in the "plot": { } object this will only effect values which are pulled directly from the series d
    * ata. Objects such as "scale-y": { }, "scale-x": { }, etc..., will need to be set separately. "." | "," | ...
    */
  var `thousands-separator`: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[AnonBackgroundfit] = js.native
  /**
    * Using the "tooltip-text":" " attribute allows you to set text for tooltips. This can also be done using a variety of other tokens
    * "Some Text" | ...
    */
  var `tooltip-text`: js.UndefOr[String] = js.native
  var trend: js.UndefOr[AnonAlphaBackgroundcolor] = js.native
  /**
    * Sets the URL for the link associated with the object. "http://www.domain.com/link.php" | "link.asp" | ...
    */
  var url: js.UndefOr[String] = js.native
  var `value-box`: js.UndefOr[AnonCallout] = js.native
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Sets the z-axis end point on 3d charts. 10 | "10px" | ...
    */
  var `z-end`: js.UndefOr[Double] = js.native
  /**
    * Sets the z-axis start point on 3d charts. 10 | "10px" | ...
    */
  var `z-start`: js.UndefOr[Double] = js.native
}

object AnonAnimation {
  @scala.inline
  def apply(): AnonAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAnimation]
  }
  @scala.inline
  implicit class AnonAnimationOps[Self <: AnonAnimation] (val x: Self) extends AnyVal {
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
    def withAnimation(value: Anon1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAspect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect")(js.undefined)
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
    def `withBackground-marker`(value: AnonFilloffsety): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-marker`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-marker")(js.undefined)
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
    def `withBackground-state`(value: AnonFilltype): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-state`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-state")(js.undefined)
        ret
    }
    @scala.inline
    def `withBand-space`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("band-space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBand-space`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("band-space")(js.undefined)
        ret
    }
    @scala.inline
    def `withBar-max-width`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar-max-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBar-max-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar-max-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withBar-space`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar-space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBar-space`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar-space")(js.undefined)
        ret
    }
    @scala.inline
    def `withBar-width`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBar-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withBars-overlap`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bars-overlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBars-overlap`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bars-overlap")(js.undefined)
        ret
    }
    @scala.inline
    def `withBars-space-left`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bars-space-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBars-space-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bars-space-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withBars-space-right`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bars-space-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBars-space-right`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bars-space-right")(js.undefined)
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
    def `withConnect-nulls`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect-nulls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutConnect-nulls`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect-nulls")(js.undefined)
        ret
    }
    @scala.inline
    def `withContour-on-top`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contour-on-top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContour-on-top`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contour-on-top")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def `withData-DotDotDot`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-...")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutData-DotDotDot`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-...")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(js.undefined)
        ret
    }
    @scala.inline
    def `withDecimals-separator`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals-separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDecimals-separator`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals-separator")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: AnonLinegapsize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
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
    def withExponent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent")(js.undefined)
        ret
    }
    @scala.inline
    def withExponentDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponentDecimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExponentDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponentDecimals")(js.undefined)
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
    def withGoal(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goal")(js.undefined)
        ret
    }
    @scala.inline
    def withGoals(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goals")(js.undefined)
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
    def `withGroup-selections`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group-selections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGroup-selections`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group-selections")(js.undefined)
        ret
    }
    @scala.inline
    def `withGuide-label`(value: AnonFontsize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guide-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGuide-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guide-label")(js.undefined)
        ret
    }
    @scala.inline
    def `withHighlight-marker`(value: AnonLinewidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight-marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHighlight-marker`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight-marker")(js.undefined)
        ret
    }
    @scala.inline
    def `withHighlight-state`(value: AnonLinewidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight-state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHighlight-state`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight-state")(js.undefined)
        ret
    }
    @scala.inline
    def `withHover-marker`(value: AnonGradientcolors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover-marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHover-marker`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover-marker")(js.undefined)
        ret
    }
    @scala.inline
    def `withHover-state`(value: AnonAlphaarea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover-state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHover-state`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover-state")(js.undefined)
        ret
    }
    @scala.inline
    def withJoin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.undefined)
        ret
    }
    @scala.inline
    def `withLegend-item`(value: AnonBorderradiusbottomleft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend-item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLegend-item`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend-item")(js.undefined)
        ret
    }
    @scala.inline
    def `withLegend-marker`(value: AnonCursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend-marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLegend-marker`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend-marker")(js.undefined)
        ret
    }
    @scala.inline
    def `withLegend-text`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend-text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLegend-text`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend-text")(js.undefined)
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
    def withMarker(value: AnonGradientstops): Self = {
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
    def `withMax-nodes`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-nodes`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-nodes")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-ratio`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-ratio`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-ratio")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-size`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-trackers`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-trackers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-trackers`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-trackers")(js.undefined)
        ret
    }
    @scala.inline
    def `withMid-point`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMid-point`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-point")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-ratio`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-ratio`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-ratio")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-size`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-size")(js.undefined)
        ret
    }
    @scala.inline
    def withMonotone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monotone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonotone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monotone")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiplier(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withNegation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negation")(js.undefined)
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
    def `withPie-transformpieTransform`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie-transformpieTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPie-transformpieTransform`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie-transformpieTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withPreview(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.undefined)
        ret
    }
    @scala.inline
    def `withRef-angle`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref-angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRef-angle`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref-angle")(js.undefined)
        ret
    }
    @scala.inline
    def withReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[AnonRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def `withSampling-step`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampling-step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSampling-step`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampling-step")(js.undefined)
        ret
    }
    @scala.inline
    def withScales(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scales")(js.undefined)
        ret
    }
    @scala.inline
    def withScaling(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling")(js.undefined)
        ret
    }
    @scala.inline
    def `withScroll-step-multiplier`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll-step-multiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScroll-step-multiplier`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll-step-multiplier")(js.undefined)
        ret
    }
    @scala.inline
    def `withSegment-trackers`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment-trackers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSegment-trackers`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment-trackers")(js.undefined)
        ret
    }
    @scala.inline
    def `withSelected-marker`(value: AnonOffsetx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected-marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSelected-marker`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected-marker")(js.undefined)
        ret
    }
    @scala.inline
    def `withSelected-state`(value: AnonShadow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected-state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSelected-state`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected-state")(js.undefined)
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
    def withShort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(js.undefined)
        ret
    }
    @scala.inline
    def `withShort-unit`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short-unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShort-unit`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short-unit")(js.undefined)
        ret
    }
    @scala.inline
    def `withShow-zero`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-zero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShow-zero`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-zero")(js.undefined)
        ret
    }
    @scala.inline
    def `withSize-factor`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size-factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSize-factor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size-factor")(js.undefined)
        ret
    }
    @scala.inline
    def `withSlice-start`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSlice-start`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice-start")(js.undefined)
        ret
    }
    @scala.inline
    def `withSmart-sampling`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smart-sampling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSmart-sampling`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smart-sampling")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withStacked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStacked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacked")(js.undefined)
        ret
    }
    @scala.inline
    def `withStep-start`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStep-start`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step-start")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(js.undefined)
        ret
    }
    @scala.inline
    def `withThousands-separator`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousands-separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutThousands-separator`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousands-separator")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: AnonBackgroundfit): Self = {
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
    def `withTooltip-text`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip-text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTooltip-text`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip-text")(js.undefined)
        ret
    }
    @scala.inline
    def withTrend(value: AnonAlphaBackgroundcolor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trend")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def `withValue-box`(value: AnonCallout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value-box")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutValue-box`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value-box")(js.undefined)
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
    def `withZ-end`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutZ-end`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-end")(js.undefined)
        ret
    }
    @scala.inline
    def `withZ-start`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutZ-start`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-start")(js.undefined)
        ret
    }
  }
  
}

