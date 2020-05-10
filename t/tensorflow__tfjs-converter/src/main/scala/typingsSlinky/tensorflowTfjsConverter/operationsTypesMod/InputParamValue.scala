package typingsSlinky.tensorflowTfjsConverter.operationsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputParamValue extends ParamValue {
  var inputIndexEnd: js.UndefOr[Double] = js.native
  var inputIndexStart: js.UndefOr[Double] = js.native
}

object InputParamValue {
  @scala.inline
  def apply(`type`: ParamType): InputParamValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParamValue]
  }
  @scala.inline
  implicit class InputParamValueOps[Self <: InputParamValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputIndexEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIndexEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputIndexEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIndexEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withInputIndexStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIndexStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputIndexStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIndexStart")(js.undefined)
        ret
    }
  }
  
}

