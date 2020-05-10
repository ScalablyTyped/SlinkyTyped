package typingsSlinky.yargs

import typingsSlinky.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBoolean extends js.Object {
  var boolean: `true` = js.native
}

object AnonBoolean {
  @scala.inline
  def apply(boolean: `true`): AnonBoolean = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoolean]
  }
  @scala.inline
  implicit class AnonBooleanOps[Self <: AnonBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolean(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

