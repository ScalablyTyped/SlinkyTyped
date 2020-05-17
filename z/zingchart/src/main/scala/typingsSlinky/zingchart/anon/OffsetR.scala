package typingsSlinky.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffsetR extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 being co
    * mpletely opaque. Note that the leading zero is required before the decimal. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * Sets the angle of the object. 'auto' | 30 | 90 | ...
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., 'purple', 'blue'), hexadecimal notation (e.g., '#666
    * 699', '#33ccff'), or RGB notation (e.g., 'rgb(255,0,0)', 'rgb(0,0,255)'). 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100
    * , 15, 15)' | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  /**
    * Sets the border color of the object. Colors can be entered by name (e.g., 'purple', 'blue'), hexadecimal notation (e.g., '#666699'
    * , '#33ccff'), or RGB notation (e.g., 'rgb(255,0,0)', 'rgb(0,0,255)'). 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100, 15
    * , 15)' | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  /**
    * Sets the border radius of the object. 2 | 3 | '5px' | ...
    */
  var `border-radius`: js.UndefOr[Double] = js.native
  /**
    * Sets the border width of the object. 1 | 3 | '6px' | ...
    */
  var `border-width`: js.UndefOr[Double] = js.native
  /**
    * Sets the font color of the object. 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100, 15, 15)' | ...
    */
  var `font-color`: js.UndefOr[String] = js.native
  /**
    * Sets the font family of the object. 'Arial' | 'Tahoma,Verdana' | ...
    */
  var `font-family`: js.UndefOr[String] = js.native
  /**
    * Sets the font size of the object. 10 | 12 | '20px' | ...
    */
  var `font-size`: js.UndefOr[Double] = js.native
  /**
    * Sets the font style of the object. 'italic' | 'normal'
    */
  var `font-style`: js.UndefOr[String] = js.native
  /**
    * Sets the font weight of the object. 'bold' | 'normal'
    */
  var `font-weight`: js.UndefOr[String] = js.native
  /**
    * Sets the placement of the object. Negative values move the scale items inward. Positive values move the scale items outward. 0 | -
    * 20 | 30 | ...
    */
  var offsetR: js.UndefOr[Double] = js.native
  /**
    * Sets the padding of the object. 3 | '5px' | '10px' | ...
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * Sets the text transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 bei
    * ng completely opaque. Note that the leading zero is required before the decimal. 0.3 | 0.4 | 0.9 | ...
    */
  var `text-alpha`: js.UndefOr[Double] = js.native
  /**
    * Sets the visibility of the object.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object OffsetR {
  @scala.inline
  def apply(): OffsetR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetR]
  }
  @scala.inline
  implicit class OffsetROps[Self <: OffsetR] (val x: Self) extends AnyVal {
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
    def `withBorder-radius`(value: Double): Self = {
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
    def `withFont-size`(value: Double): Self = {
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
    def withOffsetR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetR")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
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

