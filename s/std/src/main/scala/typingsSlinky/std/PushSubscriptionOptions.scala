package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushSubscriptionOptions extends js.Object {
  val applicationServerKey: js.typedarray.ArrayBuffer | Null = js.native
  val userVisibleOnly: scala.Boolean = js.native
}

object PushSubscriptionOptions {
  @scala.inline
  def apply(userVisibleOnly: scala.Boolean): PushSubscriptionOptions = {
    val __obj = js.Dynamic.literal(userVisibleOnly = userVisibleOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushSubscriptionOptions]
  }
  @scala.inline
  implicit class PushSubscriptionOptionsOps[Self <: org.scalajs.dom.experimental.push.PushSubscriptionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserVisibleOnly(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationServerKey(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationServerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationServerKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationServerKey")(null)
        ret
    }
  }
  
}

