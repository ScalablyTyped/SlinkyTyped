package typingsSlinky.swaggerExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneralParameterObject
  extends ParameterObject
     with ItemsObject {
  var allowEmptyValue: js.UndefOr[Boolean] = js.native
}

object GeneralParameterObject {
  @scala.inline
  def apply(exclusiveMaximum: Boolean, in: String, name: String, `type`: String): GeneralParameterObject = {
    val __obj = js.Dynamic.literal(exclusiveMaximum = exclusiveMaximum.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralParameterObject]
  }
  @scala.inline
  implicit class GeneralParameterObjectOps[Self <: GeneralParameterObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEmptyValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmptyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmptyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmptyValue")(js.undefined)
        ret
    }
  }
  
}

