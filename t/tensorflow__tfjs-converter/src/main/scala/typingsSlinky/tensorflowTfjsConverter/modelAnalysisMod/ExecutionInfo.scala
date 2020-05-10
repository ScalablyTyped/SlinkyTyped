package typingsSlinky.tensorflowTfjsConverter.modelAnalysisMod

import typingsSlinky.std.Set
import typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.Node
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionInfo extends js.Object {
  var dynamicNode: Node = js.native
  var inputs: NamedTensorMap = js.native
  var missingInputs: js.Array[String] = js.native
  var outputs: js.Array[Node] = js.native
  var syncInputs: js.Array[String] = js.native
  var usedNodes: Set[String] = js.native
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
  @scala.inline
  implicit class ExecutionInfoOps[Self <: ExecutionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: NamedTensorMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMissingInputs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncInputs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsedNodes(value: Set[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedNodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

