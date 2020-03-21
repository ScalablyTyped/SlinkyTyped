package typingsSlinky.tensorflowTfjsLayers.wrappersMod

import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", "Wrapper")
@js.native
abstract class Wrapper protected () extends Layer {
  def this(args: WrapperLayerArgs) = this()
  val layer: Layer = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", "Wrapper")
@js.native
object Wrapper extends js.Object {
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
}

