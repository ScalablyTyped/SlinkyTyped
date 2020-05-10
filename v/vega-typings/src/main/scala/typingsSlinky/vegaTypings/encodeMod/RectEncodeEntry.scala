package typingsSlinky.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RectEncodeEntry extends EncodeEntry {
  var cornerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var cornerRadiusBottomLeft: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var cornerRadiusBottomRight: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var cornerRadiusTopLeft: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var cornerRadiusTopRight: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}

object RectEncodeEntry {
  @scala.inline
  def apply(): RectEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectEncodeEntry]
  }
  @scala.inline
  implicit class RectEncodeEntryOps[Self <: RectEncodeEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCornerRadius(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRadiusBottomLeft(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusBottomLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadiusBottomLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusBottomLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRadiusBottomRight(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusBottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadiusBottomRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusBottomRight")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRadiusTopLeft(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusTopLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadiusTopLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusTopLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRadiusTopRight(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusTopRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadiusTopRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusTopRight")(js.undefined)
        ret
    }
  }
  
}

