package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushSubscriptionOptionsInit extends js.Object {
  var applicationServerKey: js.UndefOr[BufferSource | java.lang.String | Null] = js.native
  var userVisibleOnly: js.UndefOr[scala.Boolean] = js.native
}

object PushSubscriptionOptionsInit {
  @scala.inline
  def apply(): PushSubscriptionOptionsInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushSubscriptionOptionsInit]
  }
  @scala.inline
  implicit class PushSubscriptionOptionsInitOps[Self <: PushSubscriptionOptionsInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationServerKeyArrayBufferView(value: js.typedarray.ArrayBufferView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationServerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationServerKeyArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationServerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationServerKey(value: BufferSource | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationServerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationServerKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationServerKey")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationServerKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationServerKey")(null)
        ret
    }
    @scala.inline
    def withUserVisibleOnly(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVisibleOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleOnly")(js.undefined)
        ret
    }
  }
  
}

