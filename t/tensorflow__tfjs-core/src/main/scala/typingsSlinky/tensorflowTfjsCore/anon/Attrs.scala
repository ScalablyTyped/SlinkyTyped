package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.NamedAttrMap
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.NamedTensorInfoMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attrs extends js.Object {
  var attrs: js.UndefOr[NamedAttrMap] = js.native
  var inputs: NamedTensorInfoMap = js.native
}

object Attrs {
  @scala.inline
  def apply(inputs: NamedTensorInfoMap): Attrs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
  @scala.inline
  implicit class AttrsOps[Self <: Attrs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputs(value: NamedTensorInfoMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrs(value: NamedAttrMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(js.undefined)
        ret
    }
  }
  
}

