package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike1D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensor1dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor1d", "tensor1d")
  @js.native
  def tensor1d(values: TensorLike1D): Tensor1D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor1d", "tensor1d")
  @js.native
  def tensor1d(values: TensorLike1D, dtype: DataType): Tensor1D = js.native
}
