package typingsSlinky.ts3NodejsLibrary.eventsMod

import typingsSlinky.ts3NodejsLibrary.responseTypesMod.ClientList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientDisconnect extends js.Object {
  var client: ClientList = js.native
  var event: js.Any = js.native
}

object ClientDisconnect {
  @scala.inline
  def apply(client: ClientList, event: js.Any): ClientDisconnect = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDisconnect]
  }
  @scala.inline
  implicit class ClientDisconnectOps[Self <: ClientDisconnect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: ClientList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

