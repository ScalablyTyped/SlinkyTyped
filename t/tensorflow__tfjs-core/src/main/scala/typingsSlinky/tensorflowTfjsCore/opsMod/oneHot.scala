package typingsSlinky.tensorflowTfjsCore.opsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "oneHot")
@js.native
object oneHot
  extends TopLevel[
      js.Function4[
        /* indices */ Tensor[Rank] | TensorLike, 
        /* depth */ Double, 
        /* onValue */ js.UndefOr[Double], 
        /* offValue */ js.UndefOr[Double], 
        Tensor[Rank]
      ]
    ]
