package typingsSlinky.tv4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiResult extends BaseResult {
  var errors: js.Array[ValidationError] = js.native
}

object MultiResult {
  @scala.inline
  def apply(errors: js.Array[ValidationError], missing: js.Array[String], valid: Boolean): MultiResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiResult]
  }
  @scala.inline
  implicit class MultiResultOps[Self <: MultiResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[ValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

