package typingsSlinky.tensorflowTfjsLayers.initializersMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "Initializer")
@js.native
abstract class Initializer () extends Serializable {
  
  /**
    * Generate an initial value.
    * @param shape
    * @param dtype
    * @return The init value.
    */
  @JSName("apply")
  def apply(shape: Shape): Tensor[Rank] = js.native
  @JSName("apply")
  def apply(shape: Shape, dtype: DataType): Tensor[Rank] = js.native
  
  def fromConfigUsesCustomObjects(): Boolean = js.native
}
