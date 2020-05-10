package typingsSlinky.tensorflowTfjsConverter.operationsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.ISignatureDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph extends js.Object {
  var inputs: js.Array[Node] = js.native
  var nodes: StringDictionary[Node] = js.native
  var outputs: js.Array[Node] = js.native
  var placeholders: js.Array[Node] = js.native
  var signature: js.UndefOr[ISignatureDef] = js.native
  var weights: js.Array[Node] = js.native
}

object Graph {
  @scala.inline
  def apply(
    inputs: js.Array[Node],
    nodes: StringDictionary[Node],
    outputs: js.Array[Node],
    placeholders: js.Array[Node],
    weights: js.Array[Node]
  ): Graph = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], placeholders = placeholders.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
  @scala.inline
  implicit class GraphOps[Self <: Graph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputs(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: StringDictionary[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholders(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeights(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: ISignatureDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
  }
  
}

