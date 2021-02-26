package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.HeaderBoolean
import typingsSlinky.vegaLite.componentMod.AxisComponent
import typingsSlinky.vegaLite.componentMod.AxisComponentIndex
import typingsSlinky.vegaLite.modelMod.Model
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.vegaLiteStrings.grid
import typingsSlinky.vegaLite.vegaLiteStrings.main
import typingsSlinky.vegaTypings.axisMod.Axis
import typingsSlinky.vegaTypings.signalMod.NewSignal
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assembleMod {
  
  @JSImport("vega-lite/build/src/compile/axis/assemble", "assembleAxes")
  @js.native
  def assembleAxes(axisComponents: AxisComponentIndex, config: Config[SignalRef]): js.Array[Axis] = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/assemble", "assembleAxisSignals")
  @js.native
  def assembleAxisSignals(model: Model): js.Array[NewSignal] = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/assemble", "assembleAxis")
  @js.native
  def assembleAxis_grid(axisCmpt: AxisComponent, kind: grid, config: Config[SignalRef]): Axis = js.native
  @JSImport("vega-lite/build/src/compile/axis/assemble", "assembleAxis")
  @js.native
  def assembleAxis_grid(axisCmpt: AxisComponent, kind: grid, config: Config[SignalRef], opt: HeaderBoolean): Axis = js.native
  @JSImport("vega-lite/build/src/compile/axis/assemble", "assembleAxis")
  @js.native
  def assembleAxis_main(axisCmpt: AxisComponent, kind: main, config: Config[SignalRef]): Axis = js.native
  @JSImport("vega-lite/build/src/compile/axis/assemble", "assembleAxis")
  @js.native
  def assembleAxis_main(axisCmpt: AxisComponent, kind: main, config: Config[SignalRef], opt: HeaderBoolean): Axis = js.native
}
