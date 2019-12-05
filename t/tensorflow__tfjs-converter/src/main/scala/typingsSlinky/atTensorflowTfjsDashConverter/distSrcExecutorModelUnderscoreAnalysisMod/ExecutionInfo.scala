package typingsSlinky.atTensorflowTfjsDashConverter.distSrcExecutorModelUnderscoreAnalysisMod

import typingsSlinky.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.Node
import typingsSlinky.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensorMap
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionInfo extends js.Object {
  var dynamicNode: Node
  var inputs: NamedTensorMap
  var missingInputs: js.Array[String]
  var outputs: js.Array[Node]
  var syncInputs: js.Array[String]
  var usedNodes: Set[String]
}

object ExecutionInfo {
  @scala.inline
  def apply(
    dynamicNode: Node,
    inputs: NamedTensorMap,
    missingInputs: js.Array[String],
    outputs: js.Array[Node],
    syncInputs: js.Array[String],
    usedNodes: Set[String]
  ): ExecutionInfo = {
    val __obj = js.Dynamic.literal(dynamicNode = dynamicNode.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], missingInputs = missingInputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], syncInputs = syncInputs.asInstanceOf[js.Any], usedNodes = usedNodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExecutionInfo]
  }
}

