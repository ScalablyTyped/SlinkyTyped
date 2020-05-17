package typingsSlinky.seleniumWebdriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bridge extends js.Object {
  var bridge: Boolean = js.native
}

object Bridge {
  @scala.inline
  def apply(bridge: Boolean): Bridge = {
    val __obj = js.Dynamic.literal(bridge = bridge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bridge]
  }
  @scala.inline
  implicit class BridgeOps[Self <: Bridge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBridge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

