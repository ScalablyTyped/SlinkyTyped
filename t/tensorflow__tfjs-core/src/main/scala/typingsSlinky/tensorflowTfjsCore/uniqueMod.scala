package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.anon.Values
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/unique", JSImport.Namespace)
@js.native
object uniqueMod extends js.Object {
  
  @js.native
  object unique extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](x: T): Values[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, axis: Double): Values[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): Values[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): Values[T] = js.native
  }
}
