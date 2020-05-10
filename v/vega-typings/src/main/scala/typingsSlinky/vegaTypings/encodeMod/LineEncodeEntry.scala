package typingsSlinky.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineEncodeEntry
  extends EncodeEntry
     with DefinedProperty {
  var interpolate: js.UndefOr[ProductionRule[ScaledValueRef[Interpolate]]] = js.native
  var tension: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}

object LineEncodeEntry {
  @scala.inline
  def apply(): LineEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineEncodeEntry]
  }
  @scala.inline
  implicit class LineEncodeEntryOps[Self <: LineEncodeEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterpolate(value: ProductionRule[ScaledValueRef[Interpolate]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(js.undefined)
        ret
    }
    @scala.inline
    def withTension(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tension")(js.undefined)
        ret
    }
  }
  
}

