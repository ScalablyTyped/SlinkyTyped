package typingsSlinky.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "stridedSlice")
@js.native
object stridedSlice
  extends TopLevel[
      js.Function9[
        /* x */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* begin */ js.Array[Double], 
        /* end */ js.Array[Double], 
        /* strides */ js.UndefOr[js.Array[Double]], 
        /* beginMask */ js.UndefOr[Double], 
        /* endMask */ js.UndefOr[Double], 
        /* ellipsisMask */ js.UndefOr[Double], 
        /* newAxisMask */ js.UndefOr[Double], 
        /* shrinkAxisMask */ js.UndefOr[Double], 
        Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]
