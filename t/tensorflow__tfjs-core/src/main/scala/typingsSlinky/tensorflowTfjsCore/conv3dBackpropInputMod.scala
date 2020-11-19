package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R4
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R5
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor5D
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/conv3d_backprop_input", JSImport.Namespace)
@js.native
object conv3dBackpropInputMod extends js.Object {
  
  @js.native
  object conv3DBackpropInput extends js.Object {
    
    def apply(
      xShape: js.Tuple4[Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: js.Tuple3[Double, Double, Double],
      pad: same_
    ): Tensor[R4] = js.native
    def apply(
      xShape: js.Tuple4[Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: js.Tuple3[Double, Double, Double],
      pad: valid_
    ): Tensor[R4] = js.native
    def apply(
      xShape: js.Tuple4[Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: Double,
      pad: same_
    ): Tensor[R4] = js.native
    def apply(
      xShape: js.Tuple4[Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: Double,
      pad: valid_
    ): Tensor[R4] = js.native
    def apply(
      xShape: js.Tuple5[Double, Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: js.Tuple3[Double, Double, Double],
      pad: same_
    ): Tensor[R4] = js.native
    def apply(
      xShape: js.Tuple5[Double, Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: js.Tuple3[Double, Double, Double],
      pad: valid_
    ): Tensor[R4] = js.native
    def apply(
      xShape: js.Tuple5[Double, Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: Double,
      pad: same_
    ): Tensor[R4] = js.native
    def apply(
      xShape: js.Tuple5[Double, Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: Double,
      pad: valid_
    ): Tensor[R4] = js.native
  }
}
