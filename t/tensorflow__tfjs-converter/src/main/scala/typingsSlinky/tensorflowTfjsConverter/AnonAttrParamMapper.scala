package typingsSlinky.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttrParamMapper extends js.Object {
  var AttrParamMapper: AnonRequired = js.native
  var Category: AnonEnum = js.native
  var InputParamMapper: AnonProperties = js.native
  var OpExecutor: AnonAdditionalPropertiesType = js.native
  var OpMapper: AnonAdditionalProperties = js.native
  var ParamTypes: AnonEnum = js.native
}

object AnonAttrParamMapper {
  @scala.inline
  def apply(
    AttrParamMapper: AnonRequired,
    Category: AnonEnum,
    InputParamMapper: AnonProperties,
    OpExecutor: AnonAdditionalPropertiesType,
    OpMapper: AnonAdditionalProperties,
    ParamTypes: AnonEnum
  ): AnonAttrParamMapper = {
    val __obj = js.Dynamic.literal(AttrParamMapper = AttrParamMapper.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], InputParamMapper = InputParamMapper.asInstanceOf[js.Any], OpExecutor = OpExecutor.asInstanceOf[js.Any], OpMapper = OpMapper.asInstanceOf[js.Any], ParamTypes = ParamTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttrParamMapper]
  }
  @scala.inline
  implicit class AnonAttrParamMapperOps[Self <: AnonAttrParamMapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrParamMapper(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttrParamMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputParamMapper(value: AnonProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputParamMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpExecutor(value: AnonAdditionalPropertiesType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpExecutor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpMapper(value: AnonAdditionalProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParamTypes(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParamTypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

