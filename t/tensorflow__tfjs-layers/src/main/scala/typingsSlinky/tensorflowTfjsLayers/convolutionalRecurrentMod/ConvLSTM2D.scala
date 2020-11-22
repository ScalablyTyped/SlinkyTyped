package typingsSlinky.tensorflowTfjsLayers.convolutionalRecurrentMod

import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2D")
@js.native
class ConvLSTM2D protected () extends ConvRNN2D {
  def this(args: ConvLSTM2DArgs) = this()
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2D")
@js.native
object ConvLSTM2D extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
  
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}
