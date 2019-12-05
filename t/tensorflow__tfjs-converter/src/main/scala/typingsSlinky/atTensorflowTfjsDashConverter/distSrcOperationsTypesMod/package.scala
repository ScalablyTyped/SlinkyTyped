package typingsSlinky.atTensorflowTfjsDashConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcOperationsTypesMod {
  import typingsSlinky.atTensorflowTfjsDashConverter.distSrcDataTypesMod.NamedTensorsMap
  import typingsSlinky.atTensorflowTfjsDashConverter.distSrcExecutorExecutionUnderscoreContextMod.ExecutionContext
  import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
  import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank

  type InternalOpExecutor = js.Function3[
    /* node */ Node, 
    /* tensorMap */ NamedTensorsMap, 
    /* context */ ExecutionContext, 
    Tensor[Rank] | js.Array[Tensor[Rank]] | (js.Promise[Tensor[Rank] | js.Array[Tensor[Rank]]])
  ]
  type OpExecutor = js.Function1[
    /* node */ GraphNode, 
    Tensor[Rank] | js.Array[Tensor[Rank]] | (js.Promise[Tensor[Rank] | js.Array[Tensor[Rank]]])
  ]
  type ValueType = String | (js.Array[js.Array[Double] | Boolean | Double | String | Tensor[Rank]]) | Double | Boolean | Tensor[Rank]
}
