package typingsSlinky.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Borderright extends js.Object {
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require the leading 0 before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., "purple", "blue"), hexadecimal notation (e.g., "#666
    * 699", #33ccff"), or RGB notation (e.g., "rgb(255,0,0)", "rgb(0,0,255)"). "none" | "transparent" | "purple" | "#33ccff" | "rgb(100,
    *  15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  /**
    * Sets the styling for the bottom border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a s
    * tring. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-bottom`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the border color of the object. "none" | "transparent" | "purple" | "#33ccff" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  /**
    * Sets the styling for the left border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a str
    * ing. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-left`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the border radius (rounded corners) of the object. The higher the value, the more rounded the corners appear. 4 | "6px" | "6p
    * x 10px 3px 5px" | "-10px" | ...
    */
  var `border-radius`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the styling for the right border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a st
    * ring. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-right`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the styling for the top border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a stri
    * ng. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-top`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the border width of the object. 1 | 3 | | "6px" | ...
    */
  var `border-width`: js.UndefOr[Double] = js.native
  /**
    * Sets the object's height. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's width. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[js.Any] = js.native
}

object Borderright {
  @scala.inline
  def apply(): Borderright = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Borderright]
  }
  @scala.inline
  implicit class BorderrightOps[Self <: Borderright] (val x: Self) extends AnyVal {
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
    def `withBorder-bottom`(value: js.Any): Self = {
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
    def `withBorder-left`(value: js.Any): Self = {
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
    def `withBorder-right`(value: js.Any): Self = {
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
    def `withBorder-top`(value: js.Any): Self = {
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
    def `withBorder-width`(value: Double): Self = {
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
  }
  
}

