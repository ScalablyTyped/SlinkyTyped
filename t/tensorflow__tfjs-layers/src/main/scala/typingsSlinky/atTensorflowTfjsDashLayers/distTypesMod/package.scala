package typingsSlinky.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
  import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Scalar
  import typingsSlinky.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensorMap
  import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank

  type Kwargs = StringDictionary[js.Any]
  type LossOrMetricFn = js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]]
  type RegularizerFn = js.Function0[Scalar]
  type RnnStepFunction = js.Function2[
    /* inputs */ Tensor[Rank], 
    /* states */ js.Array[Tensor[Rank]], 
    js.Tuple2[Tensor[Rank], js.Array[Tensor[Rank]]]
  ]
  type TensorOrArrayOrMap = Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap
}
