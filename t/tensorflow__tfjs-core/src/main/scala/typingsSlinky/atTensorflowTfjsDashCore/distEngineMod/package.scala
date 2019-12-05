package typingsSlinky.atTensorflowTfjsDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEngineMod {
  import typingsSlinky.atTensorflowTfjsDashCore.Anon_Dy
  import typingsSlinky.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend
  import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor
  import typingsSlinky.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.GradSaveFunc
  import typingsSlinky.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
  import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank

  type CustomGradientFunc[T /* <: Tensor[Rank] */] = js.Function1[/* repeated */ Tensor[Rank] | GradSaveFunc, Anon_Dy[T]]
  type ForwardFunc[T] = js.Function2[/* backend */ KernelBackend, /* save */ js.UndefOr[GradSaveFunc], T]
  type ScopeFn[T /* <: TensorContainer */] = js.Function0[T]
}
