package typingsSlinky.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxchars extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * Sets the background color of the object. A single color will create a solid background, while two colors will create a gradient. "
    * none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  /**
    * Sets the width of the object's border. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's font color. Similar to color. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)"
    * | ...
    */
  var `font-color`: js.UndefOr[String] = js.native
  /**
    * Sets the object's font family. "Arial" | "Tahoma,Verdana" | ...
    */
  var `font-family`: js.UndefOr[String] = js.native
  /**
    * Sets the object's font size. 4 | "6px" | ...
    */
  var `font-size`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's font style. Similar to italic. "none" | "italic" | "oblique"
    */
  var `font-style`: js.UndefOr[String] = js.native
  /**
    * Sets the object's font weight. Similar to bold. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.native
  /**
    * Sets the object's height. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[js.Any] = js.native
  /**
    * Sets the maximum numbers of characters displayed in the object. The value determines how many characters will be displayed before
    * the text is cut and appended with "..." 5 | 10 | ...
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
    * Sets the padding around the object's text. Up to four values can be used to set the padding around the text, with the first value
    * being the top padding, the second value being the right padding, the third value being the bottom padding, and the fourth value be
    * ing the left padding. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var padding: js.UndefOr[js.Any] = js.native
  /**
    * Sets the bottom padding for the object's text. 4 | "6px" | ...
    */
  var `padding-bottom`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the left padding for the object's text. 4 | "6px" | ...
    */
  var `padding-left`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the right padding for the object's text. 4 | "6px" | ...
    */
  var `padding-right`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the top padding for the object's text. 4 | "6px" | ...
    */
  var `padding-top`: js.UndefOr[js.Any] = js.native
  /**
    * Renders text right-to-left. Default value is false. true | false | 1 | 0
    */
  @JSName("rtl (right-to-left)")
  var `rtl Leftparenthesisright-to-leftRightparenthesis`: js.UndefOr[Boolean] = js.native
  /**
    * Sets the text content of the object. "Some Text" | ...
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Sets the horizontal alignment for the object's text. Horizontal alignment can be left, center, or right. "left" | "center" | "righ
    * t"
    */
  var `text-align`: js.UndefOr[String] = js.native
  /**
    * Sets the transparency of the object's text. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 bei
    * ng completely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var `text-alpha`: js.UndefOr[Double] = js.native
  /**
    * Sets the text's decoration to use underlined characters. Similar to underline. May not display properly in Mozilla Firefox when ch
    * arts are rendered using SVG. "none" | "underline"
    */
  var `text-decoration`: js.UndefOr[String] = js.native
  /**
    * Sets whether the context-menu button is visible or not. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Sets the width of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[js.Any] = js.native
  /**
    * Sets whether the text will wrap, depending on the width of the object. true | false | 1 | 0
    */
  var `wrap-text`: js.UndefOr[Boolean] = js.native
  /**
    * Sets the X position of the object. The context-menu gear object must be positioned separately. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[js.Any] = js.native
  /**
    * Sets the Y position of the object. The context-menu gear object must be positioned separately. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[js.Any] = js.native
}

object AnonMaxchars {
  @scala.inline
  def apply(): AnonMaxchars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxchars]
  }
  @scala.inline
  implicit class AnonMaxcharsOps[Self <: AnonMaxchars] (val x: Self) extends AnyVal {
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
    def `withFont-color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-family`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-family`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-size`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-style`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-weight`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-weight`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(js.undefined)
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
    def `withMax-chars`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-chars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-chars`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-chars")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-width`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-width")(js.undefined)
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
    def withPadding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-bottom`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-bottom`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-bottom")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-left`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-right`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-right`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-right")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-top`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-top`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-top")(js.undefined)
        ret
    }
    @scala.inline
    def `withRtl Leftparenthesisright-to-leftRightparenthesis`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl (right-to-left)")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRtl Leftparenthesisright-to-leftRightparenthesis`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl (right-to-left)")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-align`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-align`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-align")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-alpha`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-alpha`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-alpha")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-decoration`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-decoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-decoration`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-decoration")(js.undefined)
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
    def `withWrap-text`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap-text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutWrap-text`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap-text")(js.undefined)
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

