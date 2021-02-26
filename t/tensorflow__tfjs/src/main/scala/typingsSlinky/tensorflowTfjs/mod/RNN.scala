package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNNLayerArgs
import org.scalablytyped.runtime.StObject
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
object RNN {
  
  @JSImport("@tensorflow/tfjs", "RNN")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs", "RNN.className")
  @js.native
  def className: String = js.native
  @scala.inline
  def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs", "RNN.fromConfig")
  @js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  @JSImport("@tensorflow/tfjs", "RNN.fromConfig")
  @js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
}
