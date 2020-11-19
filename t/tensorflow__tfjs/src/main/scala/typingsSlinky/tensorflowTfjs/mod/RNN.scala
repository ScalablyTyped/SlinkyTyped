package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNNLayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "RNN")
@js.native
class RNN protected ()
  extends typingsSlinky.tensorflowTfjsLayers.mod.RNN {
  def this(args: RNNLayerArgs) = this()
}
/* static members */
@JSImport("@tensorflow/tfjs", "RNN")
@js.native
object RNN extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
  
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
}
