package typingsSlinky.tensorflowTfjsConverter.operationsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttrParamMapper extends ParamMapper {
  var tfDeprecatedName: js.UndefOr[String] = js.native
  var tfName: js.UndefOr[String] = js.native
}

object AttrParamMapper {
  @scala.inline
  def apply(name: String, `type`: ParamType): AttrParamMapper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrParamMapper]
  }
  @scala.inline
  implicit class AttrParamMapperOps[Self <: AttrParamMapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTfDeprecatedName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfDeprecatedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTfDeprecatedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfDeprecatedName")(js.undefined)
        ret
    }
    @scala.inline
    def withTfName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTfName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfName")(js.undefined)
        ret
    }
  }
  
}

