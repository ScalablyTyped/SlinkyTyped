package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.channeldefMod.Value
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaLite.vegaSchemaMod.VgEncodeEntry
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object definedMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/defined", "defined")
  @js.native
  def defined(model: UnitModel): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/defined", "valueIfDefined")
  @js.native
  def valueIfDefined(prop: String, value: Value[ExprRef | SignalRef]): VgEncodeEntry = js.native
}
