package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.Expr
import typingsSlinky.vegaLite.anon.Signal
import typingsSlinky.vegaLite.channeldefMod.DatumDef
import typingsSlinky.vegaLite.channeldefMod.FieldDef
import typingsSlinky.vegaLite.channeldefMod.PrimitiveValue
import typingsSlinky.vegaLite.datetimeMod.DateTime
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.scaleMod.ScaleType
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.srcTimeunitMod.TimeUnit
import typingsSlinky.vegaLite.srcTypeMod.Type
import typingsSlinky.vegaLite.utilMod.Dict
import typingsSlinky.vegaLite.vegaLiteStrings.number
import typingsSlinky.vegaLite.vegaLiteStrings.time
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod {
  
  @JSImport("vega-lite/build/src/compile/format", "BIN_RANGE_DELIMITER")
  @js.native
  val BIN_RANGE_DELIMITER: /* " \\u2013 " */ String = js.native
  
  @JSImport("vega-lite/build/src/compile/format", "binFormatExpression")
  @js.native
  def binFormatExpression(
    startField: String,
    endField: String,
    format: String,
    formatType: String,
    config: Config[ExprRef | SignalRef]
  ): String = js.native
  @JSImport("vega-lite/build/src/compile/format", "binFormatExpression")
  @js.native
  def binFormatExpression(
    startField: String,
    endField: String,
    format: Dict[_],
    formatType: String,
    config: Config[ExprRef | SignalRef]
  ): String = js.native
  
  @JSImport("vega-lite/build/src/compile/format", "formatCustomType")
  @js.native
  def formatCustomType(hasFieldOrDatumDefFormatFormatTypeExprNormalizeStackConfigField: Expr): Signal = js.native
  
  @JSImport("vega-lite/build/src/compile/format", "formatSignalRef")
  @js.native
  def formatSignalRef(hasFieldOrDatumDefFormatFormatTypeExprNormalizeStackConfig: typingsSlinky.vegaLite.anon.Config): Signal = js.native
  
  @JSImport("vega-lite/build/src/compile/format", "guideFormat")
  @js.native
  def guideFormat(
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    `type`: Type,
    format: String,
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = js.native
  @JSImport("vega-lite/build/src/compile/format", "guideFormat")
  @js.native
  def guideFormat(
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    `type`: Type,
    format: Dict[_],
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = js.native
  @JSImport("vega-lite/build/src/compile/format", "guideFormat")
  @js.native
  def guideFormat(
    fieldOrDatumDef: FieldDef[String, _],
    `type`: Type,
    format: String,
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = js.native
  @JSImport("vega-lite/build/src/compile/format", "guideFormat")
  @js.native
  def guideFormat(
    fieldOrDatumDef: FieldDef[String, _],
    `type`: Type,
    format: Dict[_],
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = js.native
  
  @JSImport("vega-lite/build/src/compile/format", "guideFormatType")
  @js.native
  def guideFormatType(
    formatType: String,
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    scaleType: ScaleType
  ): time | number | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/format", "guideFormatType")
  @js.native
  def guideFormatType(formatType: String, fieldOrDatumDef: FieldDef[String, _], scaleType: ScaleType): time | number | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/format", "guideFormatType")
  @js.native
  def guideFormatType(
    formatType: SignalRef,
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    scaleType: ScaleType
  ): time | number | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/format", "guideFormatType")
  @js.native
  def guideFormatType(formatType: SignalRef, fieldOrDatumDef: FieldDef[String, _], scaleType: ScaleType): time | number | SignalRef = js.native
  
  @JSImport("vega-lite/build/src/compile/format", "isCustomFormatType")
  @js.native
  def isCustomFormatType(formatType: String): Boolean = js.native
  
  @JSImport("vega-lite/build/src/compile/format", "numberFormat")
  @js.native
  def numberFormat(`type`: Type, specifiedFormat: String, config: Config[ExprRef | SignalRef]): String = js.native
  @JSImport("vega-lite/build/src/compile/format", "numberFormat")
  @js.native
  def numberFormat(`type`: Type, specifiedFormat: Dict[_], config: Config[ExprRef | SignalRef]): String = js.native
  
  @JSImport("vega-lite/build/src/compile/format", "timeFormat")
  @js.native
  def timeFormat(
    specifiedFormat: String,
    timeUnit: TimeUnit,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = js.native
  
  @JSImport("vega-lite/build/src/compile/format", "timeFormatExpression")
  @js.native
  def timeFormatExpression(
    field: String,
    timeUnit: TimeUnit,
    format: String,
    rawTimeFormat: String,
    // should be provided only for actual text and headers, not axis/legend labels
  isUTCScale: Boolean
  ): String = js.native
  @JSImport("vega-lite/build/src/compile/format", "timeFormatExpression")
  @js.native
  def timeFormatExpression(
    field: String,
    timeUnit: TimeUnit,
    format: Dict[_],
    rawTimeFormat: String,
    // should be provided only for actual text and headers, not axis/legend labels
  isUTCScale: Boolean
  ): String = js.native
}
