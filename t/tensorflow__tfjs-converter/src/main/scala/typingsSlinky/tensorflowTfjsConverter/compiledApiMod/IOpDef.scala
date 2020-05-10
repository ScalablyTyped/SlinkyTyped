package typingsSlinky.tensorflowTfjsConverter.compiledApiMod

import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.OpDef.IArgDef
import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.OpDef.IAttrDef
import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.OpDef.IOpDeprecation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOpDef extends js.Object {
  /** OpDef allowsUninitializedInput */
  var allowsUninitializedInput: js.UndefOr[Boolean | Null] = js.native
  /** OpDef attr */
  var attr: js.UndefOr[js.Array[IAttrDef] | Null] = js.native
  /** OpDef deprecation */
  var deprecation: js.UndefOr[IOpDeprecation | Null] = js.native
  /** OpDef description */
  var description: js.UndefOr[String | Null] = js.native
  /** OpDef inputArg */
  var inputArg: js.UndefOr[js.Array[IArgDef] | Null] = js.native
  /** OpDef isAggregate */
  var isAggregate: js.UndefOr[Boolean | Null] = js.native
  /** OpDef isCommutative */
  var isCommutative: js.UndefOr[Boolean | Null] = js.native
  /** OpDef isStateful */
  var isStateful: js.UndefOr[Boolean | Null] = js.native
  /** OpDef name */
  var name: js.UndefOr[String | Null] = js.native
  /** OpDef outputArg */
  var outputArg: js.UndefOr[js.Array[IArgDef] | Null] = js.native
  /** OpDef summary */
  var summary: js.UndefOr[String | Null] = js.native
}

object IOpDef {
  @scala.inline
  def apply(): IOpDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpDef]
  }
  @scala.inline
  implicit class IOpDefOps[Self <: IOpDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowsUninitializedInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowsUninitializedInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowsUninitializedInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowsUninitializedInput")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowsUninitializedInputNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowsUninitializedInput")(null)
        ret
    }
    @scala.inline
    def withAttr(value: js.Array[IAttrDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(js.undefined)
        ret
    }
    @scala.inline
    def withAttrNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(null)
        ret
    }
    @scala.inline
    def withDeprecation(value: IOpDeprecation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecation")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecation")(null)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withInputArg(value: js.Array[IArgDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputArg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputArg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputArg")(js.undefined)
        ret
    }
    @scala.inline
    def withInputArgNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputArg")(null)
        ret
    }
    @scala.inline
    def withIsAggregate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAggregate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAggregate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAggregate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAggregateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAggregate")(null)
        ret
    }
    @scala.inline
    def withIsCommutative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCommutative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCommutative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCommutative")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCommutativeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCommutative")(null)
        ret
    }
    @scala.inline
    def withIsStateful(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStateful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStateful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStateful")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStatefulNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStateful")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withOutputArg(value: js.Array[IArgDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputArg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputArg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputArg")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputArgNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputArg")(null)
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(null)
        ret
    }
  }
  
}

