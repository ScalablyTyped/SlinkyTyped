package typingsSlinky.waypoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPush extends js.Object {
  var push: AnonAdapter = js.native
}

object AnonPush {
  @scala.inline
  def apply(push: AnonAdapter): AnonPush = {
    val __obj = js.Dynamic.literal(push = push.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPush]
  }
  @scala.inline
  implicit class AnonPushOps[Self <: AnonPush] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPush(value: AnonAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

