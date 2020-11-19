package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typingsSlinky.tensorflowTfjsLayers.modelsMod.SequentialArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "Sequential")
@js.native
class Sequential_ ()
  extends typingsSlinky.tensorflowTfjs.mod.Sequential_ {
  def this(args: SequentialArgs) = this()
}
/* static members */
@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "Sequential")
@js.native
object Sequential_ extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
  
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](
    cls: SerializableConstructor[T],
    config: ConfigDict,
    customObjects: js.UndefOr[scala.Nothing],
    fastWeightInit: Boolean
  ): T = js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](
    cls: SerializableConstructor[T],
    config: ConfigDict,
    customObjects: ConfigDict,
    fastWeightInit: Boolean
  ): T = js.native
}
