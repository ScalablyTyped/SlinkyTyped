package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.PartialRecordVgEncodeChan
import typingsSlinky.vegaLite.anon.ReactiveGeom
import typingsSlinky.vegaLite.anon.Signal
import typingsSlinky.vegaLite.anon.Tooltip
import typingsSlinky.vegaLite.encodingMod.Encoding
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.srcStackMod.StackProperties
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/tooltip", "tooltip")
  @js.native
  def tooltip(model: UnitModel): PartialRecordVgEncodeChan | Tooltip = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/tooltip", "tooltip")
  @js.native
  def tooltip(model: UnitModel, opt: ReactiveGeom): PartialRecordVgEncodeChan | Tooltip = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/tooltip", "tooltipData")
  @js.native
  def tooltipData(encoding: Encoding[String], stack: StackProperties, config: Config[ExprRef | SignalRef]): js.Object = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/tooltip", "tooltipData")
  @js.native
  def tooltipData(
    encoding: Encoding[String],
    stack: StackProperties,
    config: Config[ExprRef | SignalRef],
    hasReactiveGeom: ReactiveGeom
  ): js.Object = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/tooltip", "tooltipRefForEncoding")
  @js.native
  def tooltipRefForEncoding(encoding: Encoding[String], stack: StackProperties, config: Config[ExprRef | SignalRef]): Signal = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/tooltip", "tooltipRefForEncoding")
  @js.native
  def tooltipRefForEncoding(
    encoding: Encoding[String],
    stack: StackProperties,
    config: Config[ExprRef | SignalRef],
    hasReactiveGeom: ReactiveGeom
  ): Signal = js.native
}
