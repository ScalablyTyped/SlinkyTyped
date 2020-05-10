package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForcePush extends js.Object {
  var create: Double = js.native
  var forcePush: Double = js.native
  var push: Double = js.native
  var rebase: Double = js.native
  var unknown: Double = js.native
}

object AnonForcePush {
  @scala.inline
  def apply(create: Double, forcePush: Double, push: Double, rebase: Double, unknown: Double): AnonForcePush = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], forcePush = forcePush.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], rebase = rebase.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForcePush]
  }
  @scala.inline
  implicit class AnonForcePushOps[Self <: AnonForcePush] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForcePush(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRebase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

