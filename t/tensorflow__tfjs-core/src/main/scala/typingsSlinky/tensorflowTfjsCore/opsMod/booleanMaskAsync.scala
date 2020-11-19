package typingsSlinky.tensorflowTfjsCore.opsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "booleanMaskAsync")
@js.native
object booleanMaskAsync
  extends TopLevel[
      js.Function3[
        /* tensor */ Tensor[Rank] | TensorLike, 
        /* mask */ Tensor[Rank] | TensorLike, 
        /* axis */ js.UndefOr[Double], 
        js.Promise[Tensor[Rank]]
      ]
    ]
