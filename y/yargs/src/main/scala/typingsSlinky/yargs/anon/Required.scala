package typingsSlinky.yargs.anon

import typingsSlinky.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Required extends js.Object {
  var required: java.lang.String | `true` = js.native
}

object Required {
  @scala.inline
  def apply(required: java.lang.String | `true`): Required = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
  @scala.inline
  implicit class RequiredOps[Self <: Required] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequired(value: java.lang.String | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

