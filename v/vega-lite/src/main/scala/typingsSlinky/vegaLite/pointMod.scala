package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.baseMod.MarkCompiler
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaLite.vegaSchemaMod.VgEncodeEntry
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointMod {
  
  @JSImport("vega-lite/build/src/compile/mark/point", "circle")
  @js.native
  val circle: MarkCompiler = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/point", "point")
  @js.native
  val point: MarkCompiler = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/point", "shapeMixins")
  @js.native
  def shapeMixins(model: UnitModel, config: Config[ExprRef | SignalRef]): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/point", "shapeMixins")
  @js.native
  def shapeMixins_circle(
    model: UnitModel,
    config: Config[ExprRef | SignalRef],
    fixedShape: typingsSlinky.vegaLite.vegaLiteStrings.circle
  ): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/point", "shapeMixins")
  @js.native
  def shapeMixins_square(
    model: UnitModel,
    config: Config[ExprRef | SignalRef],
    fixedShape: typingsSlinky.vegaLite.vegaLiteStrings.square
  ): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/point", "square")
  @js.native
  val square: MarkCompiler = js.native
}
