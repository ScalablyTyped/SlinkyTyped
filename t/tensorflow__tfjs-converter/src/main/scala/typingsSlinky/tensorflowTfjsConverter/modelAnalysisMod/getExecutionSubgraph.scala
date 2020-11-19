package typingsSlinky.tensorflowTfjsConverter.modelAnalysisMod

import typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.Node
import typingsSlinky.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-converter/dist/executor/model_analysis", "getExecutionSubgraph")
@js.native
object getExecutionSubgraph extends js.Object {
  
  def apply(inputs: NamedTensorMap, outputs: js.Array[Node], weightMap: NamedTensorsMap): ExecutionInfo = js.native
}
