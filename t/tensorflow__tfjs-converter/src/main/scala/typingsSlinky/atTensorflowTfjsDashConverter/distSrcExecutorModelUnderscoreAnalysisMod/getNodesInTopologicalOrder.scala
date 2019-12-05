package typingsSlinky.atTensorflowTfjsDashConverter.distSrcExecutorModelUnderscoreAnalysisMod

import typingsSlinky.atTensorflowTfjsDashConverter.distSrcDataTypesMod.NamedTensorsMap
import typingsSlinky.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.Graph
import typingsSlinky.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/executor/model_analysis", "getNodesInTopologicalOrder")
@js.native
object getNodesInTopologicalOrder extends js.Object {
  def apply(graph: Graph, weightMap: NamedTensorsMap, executionInfo: ExecutionInfo): js.Array[Node] = js.native
}

