package typingsSlinky.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object engineMod {
  type CustomGradientFunc[T /* <: typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */] = js.Function1[
    /* repeated */ typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | typingsSlinky.tensorflowTfjsCore.tensorTypesMod.GradSaveFunc, 
    typingsSlinky.tensorflowTfjsCore.AnonGradFunc[T]
  ]
  type ForwardFunc[T] = js.Function2[
    /* backend */ typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend, 
    /* save */ js.UndefOr[typingsSlinky.tensorflowTfjsCore.tensorTypesMod.GradSaveFunc], 
    T
  ]
  type ScopeFn[T /* <: typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainer */] = js.Function0[T]
}
