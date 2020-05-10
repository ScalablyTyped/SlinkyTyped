package typingsSlinky.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttrs extends js.Object {
  var attrs: AnonItems = js.native
  var category: AnonRef = js.native
  var customExecutor: AnonRef = js.native
  var inputs: AnonItems = js.native
  var tfOpName: AnonType = js.native
}

object AnonAttrs {
  @scala.inline
  def apply(
    attrs: AnonItems,
    category: AnonRef,
    customExecutor: AnonRef,
    inputs: AnonItems,
    tfOpName: AnonType
  ): AnonAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], customExecutor = customExecutor.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], tfOpName = tfOpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttrs]
  }
  @scala.inline
  implicit class AnonAttrsOps[Self <: AnonAttrs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: AnonItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: AnonRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomExecutor(value: AnonRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customExecutor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: AnonItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfOpName(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfOpName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

