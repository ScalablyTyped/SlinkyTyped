package typingsSlinky.tensorflowTfjsConverter.operationsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.IAttrValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var attrParams: StringDictionary[ParamValue] = js.native
  var category: Category = js.native
  var children: js.Array[Node] = js.native
  var inputNames: js.Array[String] = js.native
  var inputParams: StringDictionary[InputParamValue] = js.native
  var inputs: js.Array[Node] = js.native
  var name: String = js.native
  var op: String = js.native
  var rawAttrs: js.UndefOr[StringDictionary[IAttrValue]] = js.native
  var signatureKey: js.UndefOr[String] = js.native
}

object Node {
  @scala.inline
  def apply(
    attrParams: StringDictionary[ParamValue],
    category: Category,
    children: js.Array[Node],
    inputNames: js.Array[String],
    inputParams: StringDictionary[InputParamValue],
    inputs: js.Array[Node],
    name: String,
    op: String
  ): Node = {
    val __obj = js.Dynamic.literal(attrParams = attrParams.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], inputNames = inputNames.asInstanceOf[js.Any], inputParams = inputParams.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrParams(value: StringDictionary[ParamValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: Category): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputParams(value: StringDictionary[InputParamValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawAttrs(value: StringDictionary[IAttrValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureKey")(js.undefined)
        ret
    }
  }
  
}

