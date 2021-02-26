package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.ClipHeight
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.legendComponentMod.LegendComponent
import typingsSlinky.vegaLite.modelMod.Model
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaTypings.legendMod.Legend
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/legend/assemble", "assembleLegend")
  @js.native
  def assembleLegend(legendCmpt: LegendComponent, config: Config[ExprRef | SignalRef]): ClipHeight = js.native
  
  @JSImport("vega-lite/build/src/compile/legend/assemble", "assembleLegends")
  @js.native
  def assembleLegends(model: Model): js.Array[Legend] = js.native
}
