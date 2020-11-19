package typingsSlinky.tensorflowTfjsConverter.modelAnalysisMod

import typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.Graph
import typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.Node
import typingsSlinky.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-converter/dist/executor/model_analysis", "getNodesInTopologicalOrder")
@js.native
object getNodesInTopologicalOrder extends js.Object {
  
  def apply(graph: Graph, weightMap: NamedTensorsMap, executionInfo: ExecutionInfo): js.Array[Node] = js.native
}
