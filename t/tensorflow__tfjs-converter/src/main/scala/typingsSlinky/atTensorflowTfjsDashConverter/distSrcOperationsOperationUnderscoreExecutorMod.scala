package typingsSlinky.atTensorflowTfjsDashConverter

import typingsSlinky.atTensorflowTfjsDashConverter.distSrcDataTypesMod.NamedTensorsMap
import typingsSlinky.atTensorflowTfjsDashConverter.distSrcExecutorExecutionUnderscoreContextMod.ExecutionContext
import typingsSlinky.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.Node
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/operations/operation_executor", JSImport.Namespace)
@js.native
object distSrcOperationsOperationUnderscoreExecutorMod extends js.Object {
  def executeOp(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]] = js.native
}

