package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typingsSlinky.tensorflowTfjsLayers.modelsMod.SequentialArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "Sequential")
@js.native
class Sequential_ ()
  extends typingsSlinky.tensorflowTfjs.mod.Sequential_ {
  def this(args: SequentialArgs) = this()
}
/* static members */
object Sequential_ {
  
  @JSImport("@tensorflow/tfjs-node", "Sequential")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-node", "Sequential.className")
  @js.native
  def className: String = js.native
  @scala.inline
  def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-node", "Sequential.fromConfig")
  @js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  @JSImport("@tensorflow/tfjs-node", "Sequential.fromConfig")
  @js.native
  def fromConfig[T /* <: Serializable */](
    cls: SerializableConstructor[T],
    config: ConfigDict,
    customObjects: js.UndefOr[scala.Nothing],
    fastWeightInit: Boolean
  ): T = js.native
  @JSImport("@tensorflow/tfjs-node", "Sequential.fromConfig")
  @js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
  @JSImport("@tensorflow/tfjs-node", "Sequential.fromConfig")
  @js.native
  def fromConfig[T /* <: Serializable */](
    cls: SerializableConstructor[T],
    config: ConfigDict,
    customObjects: ConfigDict,
    fastWeightInit: Boolean
  ): T = js.native
}
