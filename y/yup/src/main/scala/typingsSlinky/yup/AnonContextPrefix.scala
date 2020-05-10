package typingsSlinky.yup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContextPrefix extends js.Object {
  var contextPrefix: String = js.native
}

object AnonContextPrefix {
  @scala.inline
  def apply(contextPrefix: String): AnonContextPrefix = {
    val __obj = js.Dynamic.literal(contextPrefix = contextPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContextPrefix]
  }
  @scala.inline
  implicit class AnonContextPrefixOps[Self <: AnonContextPrefix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextPrefix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

