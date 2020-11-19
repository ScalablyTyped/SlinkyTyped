package typingsSlinky.tensorflowTfjsLayers.callbacksMod

import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.BaseCallback
import typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/callbacks", "Callback")
@js.native
abstract class Callback () extends BaseCallback {
  
  /** Instance of `keras.models.Model`. Reference of the model being trained. */
  var model: LayersModel = js.native
}
