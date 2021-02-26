package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.PartialRecordVgEncodeChan
import typingsSlinky.vegaLite.channeldefMod.StringFieldDef
import typingsSlinky.vegaLite.channeldefMod.StringFieldDefWithCondition
import typingsSlinky.vegaLite.channeldefMod.StringValueDefWithCondition
import typingsSlinky.vegaLite.channeldefMod.TextDef
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.srcTypeMod.StandardType
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaLite.vegaLiteStrings.datum
import typingsSlinky.vegaLite.vegaLiteStrings.datumDotdatum
import typingsSlinky.vegaLite.vegaLiteStrings.description
import typingsSlinky.vegaLite.vegaLiteStrings.href
import typingsSlinky.vegaLite.vegaLiteStrings.text
import typingsSlinky.vegaLite.vegaLiteStrings.url
import typingsSlinky.vegaLite.vegaSchemaMod.VgValueRef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "text")
  @js.native
  def text(model: UnitModel): PartialRecordVgEncodeChan = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef(channelDef: js.UndefOr[TextDef[String]], config: Config[ExprRef | SignalRef]): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef(channelDef: js.Array[StringFieldDef[String]], config: Config[ExprRef | SignalRef]): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef(channelDef: Null, config: Config[ExprRef | SignalRef]): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef(channelDef: StringFieldDefWithCondition[String], config: Config[ExprRef | SignalRef]): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef(channelDef: StringValueDefWithCondition[String, StandardType], config: Config[ExprRef | SignalRef]): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datum(channelDef: js.UndefOr[TextDef[String]], config: Config[ExprRef | SignalRef], expr: datum): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datum(channelDef: js.Array[StringFieldDef[String]], config: Config[ExprRef | SignalRef], expr: datum): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datum(channelDef: Null, config: Config[ExprRef | SignalRef], expr: datum): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datum(channelDef: StringFieldDefWithCondition[String], config: Config[ExprRef | SignalRef], expr: datum): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datum(
    channelDef: StringValueDefWithCondition[String, StandardType],
    config: Config[ExprRef | SignalRef],
    expr: datum
  ): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datumdatum(channelDef: js.UndefOr[TextDef[String]], config: Config[ExprRef | SignalRef], expr: datumDotdatum): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datumdatum(
    channelDef: js.Array[StringFieldDef[String]],
    config: Config[ExprRef | SignalRef],
    expr: datumDotdatum
  ): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datumdatum(channelDef: Null, config: Config[ExprRef | SignalRef], expr: datumDotdatum): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datumdatum(
    channelDef: StringFieldDefWithCondition[String],
    config: Config[ExprRef | SignalRef],
    expr: datumDotdatum
  ): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "textRef")
  @js.native
  def textRef_datumdatum(
    channelDef: StringValueDefWithCondition[String, StandardType],
    config: Config[ExprRef | SignalRef],
    expr: datumDotdatum
  ): VgValueRef = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "text")
  @js.native
  def text_description(model: UnitModel, channel: description): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "text")
  @js.native
  def text_href(model: UnitModel, channel: href): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "text")
  @js.native
  def text_text(model: UnitModel, channel: text): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/text", "text")
  @js.native
  def text_url(model: UnitModel, channel: url): PartialRecordVgEncodeChan = js.native
}
