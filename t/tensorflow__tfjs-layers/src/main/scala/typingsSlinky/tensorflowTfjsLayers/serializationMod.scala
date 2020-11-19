package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/serialization", JSImport.Namespace)
@js.native
object serializationMod extends js.Object {
  
  def deserialize(config: ConfigDict): Serializable = js.native
  def deserialize(config: ConfigDict, customObjects: js.UndefOr[scala.Nothing], fastWeightInit: Boolean): Serializable = js.native
  def deserialize(config: ConfigDict, customObjects: ConfigDict): Serializable = js.native
  def deserialize(config: ConfigDict, customObjects: ConfigDict, fastWeightInit: Boolean): Serializable = js.native
}
