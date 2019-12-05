package typingsSlinky.atTensorflowTfjsDashConverter.distSrcExecutorModelUnderscoreAnalysisMod

import typingsSlinky.atTensorflowTfjsDashConverter.distSrcDataTypesMod.NamedTensorsMap
import typingsSlinky.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.Node
import typingsSlinky.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/executor/model_analysis", "getExecutionSubgraph")
@js.native
object getExecutionSubgraph extends js.Object {
  def apply(inputs: NamedTensorMap, outputs: js.Array[Node], weightMap: NamedTensorsMap): ExecutionInfo = js.native
}

