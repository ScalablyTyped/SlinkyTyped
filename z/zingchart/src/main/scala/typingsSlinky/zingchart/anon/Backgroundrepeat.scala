package typingsSlinky.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backgroundrepeat extends StObject {
  
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
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
    * Sets whether the text is displayed with bold characters or not in the Header of the Legend. true | false | 1 | 0
    */
  var bold: js.UndefOr[Boolean] = js.native
  
  /**
    * Defaults to black if border-color is not set. "2px solid #f00" | ...
    */
  var `border-bottom`: js.UndefOr[String] = js.native
  
  /**
    * Defaults to 1px if border-width is not set. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ..
    * .
    */
  var `border-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the object's left border style. Accepts solid, dashed, and dotted styles. "2px solid #f00" | ...
    */
  var `border-left`: js.UndefOr[String] = js.native
  
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
    * Sets the object's right border style. Accepts solid, dashed, and dotted styles. "2px solid #f00" | ...
    */
  var `border-right`: js.UndefOr[String] = js.native
  
  /**
    * Sets the object's top border style. Values must include the border width, style, and color. Accepts solid, dashed, and dotted styl
    * es. "2px solid #f00" | ...
    */
  var `border-top`: js.UndefOr[String] = js.native
  
  /**
    * Requires border-color. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets whether an object will have a callout arrow or not. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the length of the extension that extends beyond the tip of the callout arrow. 4 | "6px" | ...
    */
  var `callout-extension`: js.UndefOr[js.Any] = js.native
  
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
    * row up, down, left, or right depending on the callout-position. 4 | "6px" | ...
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
    * Cuts off the text at a specified width. Requires a setting for width. true | false | 1 | 0
    */
  var `clip-text`: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the text's color in the Header of the Legend. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15
    * )" | ...
    */
  var color: js.UndefOr[String] = js.native
  
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
    * Sets the rotation angle of the Header of the Legend. Similar with angle. -45 | 115 | ...
    */
  var `font-angle`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the text's color of the Header of the Legend. Similar with color. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow
    * " | "rgb(100, 15, 15)" | ...
    */
  var `font-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the text's font family of the Footer of the Legend. "Arial" | "Tahoma,Verdana" | ...
    */
  var `font-family`: js.UndefOr[String] = js.native
  
  /**
    * Sets the text's font size of the Header of the Legend. 4 | "6px" | ...
    */
  var `font-size`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the text's font style of the Header of the Legend. Similar with italic. "none" | "italic" | "oblique"
    */
  var `font-style`: js.UndefOr[String] = js.native
  
  /**
    * Sets the text's font weight of the Header of the Legend. Similar with bold. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.native
  
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
    * Sets the object's height. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets whether the text of the Header of the Legend is displayed with italic characters or not. true | false | 1 | 0
    */
  var italic: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the maximum number of characters displayed by the text label of the Header of the Legend. If value is smaller than the length
    *  of the text, the original text will be trimmed and '...' will be appended at the end. 5 | 10 | ...
    */
  var `max-chars`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the maximum width of the text box. If text is longer than the max-width value, it will overlap the box or will wrap if wrap-t
    * ext is set to true. 10 | "20px" | 0.3 | "30%" | ...
    */
  var `max-width`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets an X offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets a Y offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's bottom padding around the text of the Header of the Legend. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var padding: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's bottom padding around the text of the Header of the Legend. 4 | "6px" | ...
    */
  var `padding-bottom`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's left padding around the text of the Header of the Legend. padding-left here may push the text out of the contain
    * ing legend if the number is big enough. 4 | "6px" | ...
    */
  var `padding-left`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's right padding around the text of the Header of the Legend. padding-right here will not push the text out of the
    * containing legend. 4 | "6px" | ...
    */
  var `padding-right`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the object's top padding around the text of the Header of the Legend. 4 | "6px" | ...
    */
  var `padding-top`: js.UndefOr[js.Any] = js.native
  
  /**
    * Renders text right-to-left. Default value is false. true | false | 1 | 0
    */
  @JSName("rtl (right-to-left)")
  var `rtl Leftparenthesisright-to-leftRightparenthesis`: js.UndefOr[Boolean] = js.native
  
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
    * Sets the text content of the object of the Header of the Legend. "Some Text" | ...
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * Sets the text's horizontal alignment relative to the box of the Header of the Legend. "left" | "center" | "right"
    */
  var `text-align`: js.UndefOr[String] = js.native
  
  /**
    * Sets the text's transparency of the Header of the Legend. 0.3 | 0.9 | ...
    */
  var `text-alpha`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the text's decoration of the Header of the Legend. Similar with underline. "none" | "underline"
    */
  var `text-decoration`: js.UndefOr[String] = js.native
  
  /**
    * Sets whether the text of the Header of the Legend is displayed with underlined characters or not. true | false | 1 | 0
    */
  var underline: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the text's vertical alignment relative to the object's box of the Header of the Legend. "top" | "middle" | "bottom"
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
    * Sets whether the text will wrap, depending on the width of the object. Requires a widthsetting. true | false | 1 | 0
    */
  var `wrap-text`: js.UndefOr[Boolean] = js.native
}
object Backgroundrepeat {
  
  @scala.inline
  def apply(): Backgroundrepeat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backgroundrepeat]
  }
  
  @scala.inline
  implicit class BackgroundrepeatMutableBuilder[Self <: Backgroundrepeat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-color-1`(value: String): Self = StObject.set(x, "background-color-1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-color-1Undefined`: Self = StObject.set(x, "background-color-1", js.undefined)
    
    @scala.inline
    def `setBackground-color-2`(value: String): Self = StObject.set(x, "background-color-2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-color-2Undefined`: Self = StObject.set(x, "background-color-2", js.undefined)
    
    @scala.inline
    def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    @scala.inline
    def `setBackground-fit`(value: String): Self = StObject.set(x, "background-fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-fitUndefined`: Self = StObject.set(x, "background-fit", js.undefined)
    
    @scala.inline
    def `setBackground-image`(value: String): Self = StObject.set(x, "background-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-imageUndefined`: Self = StObject.set(x, "background-image", js.undefined)
    
    @scala.inline
    def `setBackground-position`(value: String): Self = StObject.set(x, "background-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-positionUndefined`: Self = StObject.set(x, "background-position", js.undefined)
    
    @scala.inline
    def `setBackground-repeat`(value: String): Self = StObject.set(x, "background-repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-repeatUndefined`: Self = StObject.set(x, "background-repeat", js.undefined)
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def `setBorder-bottom`(value: String): Self = StObject.set(x, "border-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-bottomUndefined`: Self = StObject.set(x, "border-bottom", js.undefined)
    
    @scala.inline
    def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    @scala.inline
    def `setBorder-left`(value: String): Self = StObject.set(x, "border-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-leftUndefined`: Self = StObject.set(x, "border-left", js.undefined)
    
    @scala.inline
    def `setBorder-radius`(value: js.Any): Self = StObject.set(x, "border-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-radius-bottom-left`(value: js.Any): Self = StObject.set(x, "border-radius-bottom-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-radius-bottom-leftUndefined`: Self = StObject.set(x, "border-radius-bottom-left", js.undefined)
    
    @scala.inline
    def `setBorder-radius-bottom-right`(value: js.Any): Self = StObject.set(x, "border-radius-bottom-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-radius-bottom-rightUndefined`: Self = StObject.set(x, "border-radius-bottom-right", js.undefined)
    
    @scala.inline
    def `setBorder-radius-top-left`(value: js.Any): Self = StObject.set(x, "border-radius-top-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-radius-top-leftUndefined`: Self = StObject.set(x, "border-radius-top-left", js.undefined)
    
    @scala.inline
    def `setBorder-radius-top-right`(value: js.Any): Self = StObject.set(x, "border-radius-top-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-radius-top-rightUndefined`: Self = StObject.set(x, "border-radius-top-right", js.undefined)
    
    @scala.inline
    def `setBorder-radiusUndefined`: Self = StObject.set(x, "border-radius", js.undefined)
    
    @scala.inline
    def `setBorder-right`(value: String): Self = StObject.set(x, "border-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-rightUndefined`: Self = StObject.set(x, "border-right", js.undefined)
    
    @scala.inline
    def `setBorder-top`(value: String): Self = StObject.set(x, "border-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-topUndefined`: Self = StObject.set(x, "border-top", js.undefined)
    
    @scala.inline
    def `setBorder-width`(value: js.Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    @scala.inline
    def setCallout(value: Boolean): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCallout-extension`(value: js.Any): Self = StObject.set(x, "callout-extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCallout-extensionUndefined`: Self = StObject.set(x, "callout-extension", js.undefined)
    
    @scala.inline
    def `setCallout-height`(value: js.Any): Self = StObject.set(x, "callout-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCallout-heightUndefined`: Self = StObject.set(x, "callout-height", js.undefined)
    
    @scala.inline
    def `setCallout-hook`(value: js.Any): Self = StObject.set(x, "callout-hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCallout-hookUndefined`: Self = StObject.set(x, "callout-hook", js.undefined)
    
    @scala.inline
    def `setCallout-offset`(value: js.Any): Self = StObject.set(x, "callout-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCallout-offsetUndefined`: Self = StObject.set(x, "callout-offset", js.undefined)
    
    @scala.inline
    def `setCallout-position`(value: String): Self = StObject.set(x, "callout-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCallout-positionUndefined`: Self = StObject.set(x, "callout-position", js.undefined)
    
    @scala.inline
    def `setCallout-width`(value: js.Any): Self = StObject.set(x, "callout-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCallout-widthUndefined`: Self = StObject.set(x, "callout-width", js.undefined)
    
    @scala.inline
    def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    @scala.inline
    def `setClip-text`(value: Boolean): Self = StObject.set(x, "clip-text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setClip-textUndefined`: Self = StObject.set(x, "clip-text", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def `setFill-angle`(value: Double): Self = StObject.set(x, "fill-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-angleUndefined`: Self = StObject.set(x, "fill-angle", js.undefined)
    
    @scala.inline
    def `setFill-offset-x`(value: js.Any): Self = StObject.set(x, "fill-offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-offset-xUndefined`: Self = StObject.set(x, "fill-offset-x", js.undefined)
    
    @scala.inline
    def `setFill-offset-y`(value: js.Any): Self = StObject.set(x, "fill-offset-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-offset-yUndefined`: Self = StObject.set(x, "fill-offset-y", js.undefined)
    
    @scala.inline
    def `setFill-type`(value: String): Self = StObject.set(x, "fill-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-typeUndefined`: Self = StObject.set(x, "fill-type", js.undefined)
    
    @scala.inline
    def `setFont-angle`(value: Double): Self = StObject.set(x, "font-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-angleUndefined`: Self = StObject.set(x, "font-angle", js.undefined)
    
    @scala.inline
    def `setFont-color`(value: String): Self = StObject.set(x, "font-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-colorUndefined`: Self = StObject.set(x, "font-color", js.undefined)
    
    @scala.inline
    def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    @scala.inline
    def `setFont-size`(value: js.Any): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    @scala.inline
    def `setFont-style`(value: String): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    @scala.inline
    def `setFont-weight`(value: String): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    @scala.inline
    def `setGradient-colors`(value: String): Self = StObject.set(x, "gradient-colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGradient-colorsUndefined`: Self = StObject.set(x, "gradient-colors", js.undefined)
    
    @scala.inline
    def `setGradient-stops`(value: String): Self = StObject.set(x, "gradient-stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGradient-stopsUndefined`: Self = StObject.set(x, "gradient-stops", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    @scala.inline
    def `setMax-chars`(value: Double): Self = StObject.set(x, "max-chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-charsUndefined`: Self = StObject.set(x, "max-chars", js.undefined)
    
    @scala.inline
    def `setMax-width`(value: js.Any): Self = StObject.set(x, "max-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-widthUndefined`: Self = StObject.set(x, "max-width", js.undefined)
    
    @scala.inline
    def `setOffset-x`(value: js.Any): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    @scala.inline
    def `setOffset-y`(value: js.Any): Self = StObject.set(x, "offset-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-yUndefined`: Self = StObject.set(x, "offset-y", js.undefined)
    
    @scala.inline
    def setPadding(value: js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-bottom`(value: js.Any): Self = StObject.set(x, "padding-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-bottomUndefined`: Self = StObject.set(x, "padding-bottom", js.undefined)
    
    @scala.inline
    def `setPadding-left`(value: js.Any): Self = StObject.set(x, "padding-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-leftUndefined`: Self = StObject.set(x, "padding-left", js.undefined)
    
    @scala.inline
    def `setPadding-right`(value: Double): Self = StObject.set(x, "padding-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-rightUndefined`: Self = StObject.set(x, "padding-right", js.undefined)
    
    @scala.inline
    def `setPadding-top`(value: js.Any): Self = StObject.set(x, "padding-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-topUndefined`: Self = StObject.set(x, "padding-top", js.undefined)
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def `setRtl Leftparenthesisright-to-leftRightparenthesis`(value: Boolean): Self = StObject.set(x, "rtl (right-to-left)", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRtl Leftparenthesisright-to-leftRightparenthesisUndefined`: Self = StObject.set(x, "rtl (right-to-left)", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-alpha`(value: Double): Self = StObject.set(x, "shadow-alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-alphaUndefined`: Self = StObject.set(x, "shadow-alpha", js.undefined)
    
    @scala.inline
    def `setShadow-angle`(value: Double): Self = StObject.set(x, "shadow-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-angleUndefined`: Self = StObject.set(x, "shadow-angle", js.undefined)
    
    @scala.inline
    def `setShadow-blur`(value: js.Any): Self = StObject.set(x, "shadow-blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-blurUndefined`: Self = StObject.set(x, "shadow-blur", js.undefined)
    
    @scala.inline
    def `setShadow-color`(value: String): Self = StObject.set(x, "shadow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-colorUndefined`: Self = StObject.set(x, "shadow-color", js.undefined)
    
    @scala.inline
    def `setShadow-distance`(value: js.Any): Self = StObject.set(x, "shadow-distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-distanceUndefined`: Self = StObject.set(x, "shadow-distance", js.undefined)
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-align`(value: String): Self = StObject.set(x, "text-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-alignUndefined`: Self = StObject.set(x, "text-align", js.undefined)
    
    @scala.inline
    def `setText-alpha`(value: Double): Self = StObject.set(x, "text-alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-alphaUndefined`: Self = StObject.set(x, "text-alpha", js.undefined)
    
    @scala.inline
    def `setText-decoration`(value: String): Self = StObject.set(x, "text-decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-decorationUndefined`: Self = StObject.set(x, "text-decoration", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    @scala.inline
    def `setVertical-align`(value: String): Self = StObject.set(x, "vertical-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setVertical-alignUndefined`: Self = StObject.set(x, "vertical-align", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def `setWrap-text`(value: Boolean): Self = StObject.set(x, "wrap-text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWrap-textUndefined`: Self = StObject.set(x, "wrap-text", js.undefined)
  }
}
