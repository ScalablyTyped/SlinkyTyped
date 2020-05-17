package typingsSlinky.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Properties extends js.Object {
  var additionalProperties: Boolean = js.native
  var properties: DefaultValue = js.native
  var required: js.Array[String] = js.native
  var `type`: String = js.native
}

object Properties {
  @scala.inline
  def apply(
    additionalProperties: Boolean,
    properties: DefaultValue,
    required: js.Array[String],
    `type`: String
  ): Properties = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  @scala.inline
  implicit class PropertiesOps[Self <: Properties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: DefaultValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

