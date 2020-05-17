package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForcePush extends js.Object {
  var create: scala.Double = js.native
  var forcePush: scala.Double = js.native
  var push: scala.Double = js.native
  var rebase: scala.Double = js.native
  var unknown: scala.Double = js.native
}

object ForcePush {
  @scala.inline
  def apply(
    create: scala.Double,
    forcePush: scala.Double,
    push: scala.Double,
    rebase: scala.Double,
    unknown: scala.Double
  ): ForcePush = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], forcePush = forcePush.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], rebase = rebase.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForcePush]
  }
  @scala.inline
  implicit class ForcePushOps[Self <: ForcePush] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForcePush(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRebase(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

