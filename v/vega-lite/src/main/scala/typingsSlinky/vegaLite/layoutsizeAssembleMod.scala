package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.layoutsizeComponentMod.LayoutSizeType
import typingsSlinky.vegaLite.modelMod.Model
import typingsSlinky.vegaLite.scaleComponentMod.ScaleComponent
import typingsSlinky.vegaTypings.signalMod.InitSignal
import typingsSlinky.vegaTypings.signalMod.NewSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutsizeAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/layoutsize/assemble", "assembleLayoutSignals")
  @js.native
  def assembleLayoutSignals(model: Model): js.Array[NewSignal] = js.native
  
  @JSImport("vega-lite/build/src/compile/layoutsize/assemble", "sizeExpr")
  @js.native
  def sizeExpr(scaleName: String, scaleComponent: ScaleComponent, cardinality: String): String = js.native
  
  @JSImport("vega-lite/build/src/compile/layoutsize/assemble", "sizeSignals")
  @js.native
  def sizeSignals(model: Model, sizeType: LayoutSizeType): js.Array[NewSignal | InitSignal] = js.native
}
