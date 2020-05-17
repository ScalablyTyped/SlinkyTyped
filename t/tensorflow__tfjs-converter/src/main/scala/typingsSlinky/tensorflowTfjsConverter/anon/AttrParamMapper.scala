package typingsSlinky.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttrParamMapper extends js.Object {
  var AttrParamMapper: Required = js.native
  var Category: Enum = js.native
  var InputParamMapper: Properties = js.native
  var OpExecutor: AdditionalPropertiesType = js.native
  var OpMapper: AdditionalProperties = js.native
  var ParamTypes: Enum = js.native
}

object AttrParamMapper {
  @scala.inline
  def apply(
    AttrParamMapper: Required,
    Category: Enum,
    InputParamMapper: Properties,
    OpExecutor: AdditionalPropertiesType,
    OpMapper: AdditionalProperties,
    ParamTypes: Enum
  ): AttrParamMapper = {
    val __obj = js.Dynamic.literal(AttrParamMapper = AttrParamMapper.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], InputParamMapper = InputParamMapper.asInstanceOf[js.Any], OpExecutor = OpExecutor.asInstanceOf[js.Any], OpMapper = OpMapper.asInstanceOf[js.Any], ParamTypes = ParamTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrParamMapper]
  }
  @scala.inline
  implicit class AttrParamMapperOps[Self <: AttrParamMapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrParamMapper(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttrParamMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputParamMapper(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputParamMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpExecutor(value: AdditionalPropertiesType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpExecutor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpMapper(value: AdditionalProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParamTypes(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParamTypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

