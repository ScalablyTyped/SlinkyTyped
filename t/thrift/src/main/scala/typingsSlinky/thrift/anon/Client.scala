package typingsSlinky.thrift.anon

import typingsSlinky.thrift.mod.TClientConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client[TClient] extends TClientConstructor[TClient] {
  var Client: InstantiableTClient[TClient] = js.native
}

object Client {
  @scala.inline
  def apply[TClient](Client: InstantiableTClient[TClient]): Client[TClient] = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client[TClient]]
  }
  @scala.inline
  implicit class ClientOps[Self[tclient] <: Client[tclient], TClient] (val x: Self[TClient]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TClient] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TClient]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TClient] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TClient] with Other]
    @scala.inline
    def withClient(value: InstantiableTClient[TClient]): Self[TClient] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Client")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

