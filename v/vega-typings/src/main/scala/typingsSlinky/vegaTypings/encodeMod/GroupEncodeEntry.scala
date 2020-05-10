package typingsSlinky.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupEncodeEntry extends RectEncodeEntry {
  var clip: js.UndefOr[ProductionRule[BooleanValueRef]] = js.native
  var strokeForeground: js.UndefOr[ProductionRule[BooleanValueRef]] = js.native
  var strokeOffset: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}

object GroupEncodeEntry {
  @scala.inline
  def apply(): GroupEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupEncodeEntry]
  }
  @scala.inline
  implicit class GroupEncodeEntryOps[Self <: GroupEncodeEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClip(value: ProductionRule[BooleanValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeForeground(value: ProductionRule[BooleanValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeForeground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeForeground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeForeground")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOffset(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOffset")(js.undefined)
        ret
    }
  }
  
}

