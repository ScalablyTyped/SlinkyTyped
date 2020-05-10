package typingsSlinky.seleniumWebdriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAsyncBoolean extends js.Object {
  var async: Boolean = js.native
}

object AnonAsyncBoolean {
  @scala.inline
  def apply(async: Boolean): AnonAsyncBoolean = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsyncBoolean]
  }
  @scala.inline
  implicit class AnonAsyncBooleanOps[Self <: AnonAsyncBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

