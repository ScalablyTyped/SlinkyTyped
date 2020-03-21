package typingsSlinky.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "oneHot")
@js.native
object oneHot
  extends TopLevel[
      js.Function4[
        /* indices */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* depth */ Double, 
        /* onValue */ js.UndefOr[Double], 
        /* offValue */ js.UndefOr[Double], 
        Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]

