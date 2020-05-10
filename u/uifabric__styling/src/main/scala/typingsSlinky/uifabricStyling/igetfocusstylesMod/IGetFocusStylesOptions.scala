package typingsSlinky.uifabricStyling.igetfocusstylesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IRawStyle
import typingsSlinky.uifabricStyling.uifabricStylingStrings.absolute
import typingsSlinky.uifabricStyling.uifabricStylingStrings.relative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGetFocusStylesOptions extends js.Object {
  /**
    * Color of the border.
    * @defaultvalue theme.palette.white
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * Style for high contrast mode.
    */
  var highContrastStyle: js.UndefOr[IRawStyle] = js.native
  /**
    * The number of pixels to inset the border.
    * @defaultvalue 0
    */
  var inset: js.UndefOr[Double] = js.native
  /**
    * If the styles should apply on `:focus` pseudo element.
    * @defaultvalue true
    */
  var isFocusedOnly: js.UndefOr[Boolean] = js.native
  /**
    * Color of the outline.
    * @defaultvalue theme.palette.neutralSecondary
    */
  var outlineColor: js.UndefOr[String] = js.native
  /**
    * The positioning applied to the container.
    * Must be 'relative' or 'absolute' so that the focus border can live around it.
    * @defaultvalue 'relative'
    */
  var position: js.UndefOr[relative | absolute] = js.native
  /**
    * The width of the border in pixels.
    * @defaultvalue 1
    */
  var width: js.UndefOr[Double] = js.native
}

object IGetFocusStylesOptions {
  @scala.inline
  def apply(): IGetFocusStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetFocusStylesOptions]
  }
  @scala.inline
  implicit class IGetFocusStylesOptionsOps[Self <: IGetFocusStylesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHighContrastStyle(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highContrastStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighContrastStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highContrastStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFocusedOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocusedOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFocusedOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocusedOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: relative | absolute): Self = {
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
    def withWidth(value: Double): Self = {
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

