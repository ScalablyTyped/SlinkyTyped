package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flags extends js.Object {
  var auth_immutable: Boolean = js.native
  var auth_required: Boolean = js.native
  var auth_revocable: Boolean = js.native
}

object Flags {
  @scala.inline
  def apply(auth_immutable: Boolean, auth_required: Boolean, auth_revocable: Boolean): Flags = {
    val __obj = js.Dynamic.literal(auth_immutable = auth_immutable.asInstanceOf[js.Any], auth_required = auth_required.asInstanceOf[js.Any], auth_revocable = auth_revocable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
  @scala.inline
  implicit class FlagsOps[Self <: Flags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth_immutable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_immutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuth_required(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuth_revocable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_revocable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

