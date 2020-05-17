package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeFields extends js.Object {
  var includeFields: scala.Double = js.native
  var none: scala.Double = js.native
}

object IncludeFields {
  @scala.inline
  def apply(includeFields: scala.Double, none: scala.Double): IncludeFields = {
    val __obj = js.Dynamic.literal(includeFields = includeFields.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeFields]
  }
  @scala.inline
  implicit class IncludeFieldsOps[Self <: IncludeFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeFields(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

