package typingsSlinky.tensorflowTfjsLayers.recurrentMod

import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "SimpleRNN")
@js.native
class SimpleRNN protected () extends RNN_ {
  def this(args: SimpleRNNLayerArgs) = this()
}
/* static members */
object SimpleRNN {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "SimpleRNN")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "SimpleRNN.className")
  @js.native
  def className: String = js.native
  @scala.inline
  def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "SimpleRNN.fromConfig")
  @js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}
