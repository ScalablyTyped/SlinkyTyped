package typingsSlinky.tensorflowTfjsLayers.callbacksMod

import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.auto
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.max
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/callbacks", "EarlyStopping")
@js.native
class EarlyStopping_ () extends Callback {
  def this(args: EarlyStoppingCallbackArgs) = this()
  
  val baseline: Double = js.native
  
  var best: js.Any = js.native
  
  var getMonitorValue: js.Any = js.native
  
  val minDelta: Double = js.native
  
  val mode: auto | min | max = js.native
  
  val monitor: String = js.native
  
  /* protected */ def monitorFunc(currVal: Double, prevVal: Double): Boolean = js.native
  
  val patience: Double = js.native
  
  var stoppedEpoch: js.Any = js.native
  
  val verbose: Double = js.native
  
  @JSName("wait")
  var wait_FEarlyStopping_ : js.Any = js.native
}
