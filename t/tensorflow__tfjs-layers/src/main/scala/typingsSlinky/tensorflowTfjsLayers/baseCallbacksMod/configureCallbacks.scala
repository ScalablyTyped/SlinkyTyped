package typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "configureCallbacks")
@js.native
object configureCallbacks extends js.Object {
  
  def apply(
    callbacks: js.Array[BaseCallback],
    verbose: ModelLoggingVerbosity,
    epochs: Double,
    initialEpoch: Double,
    numTrainSamples: Double,
    stepsPerEpoch: Double,
    batchSize: Double,
    doValidation: Boolean,
    callbackMetrics: js.Array[String]
  ): typingsSlinky.tensorflowTfjsLayers.anon.CallbackList = js.native
}
