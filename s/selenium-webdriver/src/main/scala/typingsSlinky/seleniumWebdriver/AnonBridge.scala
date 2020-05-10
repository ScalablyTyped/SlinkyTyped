package typingsSlinky.seleniumWebdriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBridge extends js.Object {
  var bridge: Boolean = js.native
}

object AnonBridge {
  @scala.inline
  def apply(bridge: Boolean): AnonBridge = {
    val __obj = js.Dynamic.literal(bridge = bridge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBridge]
  }
  @scala.inline
  implicit class AnonBridgeOps[Self <: AnonBridge] (val x: Self) extends AnyVal {
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

