package typingsSlinky.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEncodeEntry
  extends EncodeEntry
     with AlignProperty
     with ThetaProperty {
  var angle: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var baseline: js.UndefOr[ProductionRule[TextBaselineValueRef]] = js.undefined
  var dir: js.UndefOr[ProductionRule[ScaledValueRef[TextDirection]]] = js.undefined
  var dx: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var dy: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var ellipsis: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  var font: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  var fontSize: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var fontStyle: js.UndefOr[ProductionRule[FontStyleValueRef]] = js.undefined
  var fontWeight: js.UndefOr[ProductionRule[FontWeightValueRef]] = js.undefined
  var limit: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var lineBreak: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  /**
    * The height, in pixels, of each line of text in a multi-line text mark or a text mark with `"line-top"` or `"line-bottom"` baseline.
    */
  var lineHeight: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var radius: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var text: js.UndefOr[ProductionRule[TextValueRef]] = js.undefined
}

