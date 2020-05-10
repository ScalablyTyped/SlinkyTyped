package typingsSlinky.stompit.connectFailoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Internal class, which is not exported
@js.native
trait ConnectState extends js.Object {
  var failedConnects: Double = js.native
  var serverProperties: Server = js.native
}

object ConnectState {
  @scala.inline
  def apply(failedConnects: Double, serverProperties: Server): ConnectState = {
    val __obj = js.Dynamic.literal(failedConnects = failedConnects.asInstanceOf[js.Any], serverProperties = serverProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectState]
  }
  @scala.inline
  implicit class ConnectStateOps[Self <: ConnectState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedConnects(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedConnects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerProperties(value: Server): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

