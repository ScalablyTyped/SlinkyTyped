package typingsSlinky.vegaTypings.encodeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodeEntry
  extends /* k */ StringDictionary[js.UndefOr[ProductionRule[ArbitraryValueRef]]] {
  var blend: js.UndefOr[ProductionRule[ScaledValueRef[Blend]]] = js.native
  var cursor: js.UndefOr[ProductionRule[StringValueRef]] = js.native
  var fill: js.UndefOr[ProductionRule[ColorValueRef]] = js.native
  var fillOpacity: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var height: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var opacity: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var stroke: js.UndefOr[ProductionRule[ColorValueRef]] = js.native
  var strokeCap: js.UndefOr[ProductionRule[StringValueRef]] = js.native
  var strokeDash: js.UndefOr[ProductionRule[ScaledValueRef[js.Array[Double]]]] = js.native
  var strokeDashOffset: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var strokeJoin: js.UndefOr[ProductionRule[StringValueRef]] = js.native
  var strokeMiterLimit: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var strokeOpacity: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var strokeWidth: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var tooltip: js.UndefOr[ProductionRule[StringValueRef]] = js.native
  var width: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var x: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var x2: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var xc: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var y: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var y2: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var yc: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var zindex: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}

object EncodeEntry {
  @scala.inline
  def apply(): EncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodeEntry]
  }
  @scala.inline
  implicit class EncodeEntryOps[Self <: EncodeEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlend(value: ProductionRule[ScaledValueRef[Blend]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: ProductionRule[StringValueRef]): Self = {
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
    def withFill(value: ProductionRule[ColorValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacity(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: ProductionRule[NumericValueRef]): Self = {
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
    def withOpacity(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: ProductionRule[ColorValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeCap(value: ProductionRule[StringValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeCap")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDash(value: ProductionRule[ScaledValueRef[js.Array[Double]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDash")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDashOffset(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeJoin(value: ProductionRule[StringValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeMiterLimit(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeMiterLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: ProductionRule[StringValueRef]): Self = {
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
    def withWidth(value: ProductionRule[NumericValueRef]): Self = {
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
    def withX(value: ProductionRule[NumericValueRef]): Self = {
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
    def withX2(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(js.undefined)
        ret
    }
    @scala.inline
    def withXc(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xc")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: ProductionRule[NumericValueRef]): Self = {
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
    @scala.inline
    def withY2(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(js.undefined)
        ret
    }
    @scala.inline
    def withYc(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yc")(js.undefined)
        ret
    }
    @scala.inline
    def withZindex(value: ProductionRule[NumericValueRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zindex")(js.undefined)
        ret
    }
  }
  
}

