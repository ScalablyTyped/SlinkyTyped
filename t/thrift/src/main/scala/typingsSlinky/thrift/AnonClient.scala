package typingsSlinky.thrift

import typingsSlinky.thrift.mod.TClientConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClient[TClient] extends TClientConstructor[TClient] {
  var Client: AnonInstantiableTClient[TClient] = js.native
}

object AnonClient {
  @scala.inline
  def apply[TClient](Client: AnonInstantiableTClient[TClient]): AnonClient[TClient] = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClient[TClient]]
  }
  @scala.inline
  implicit class AnonClientOps[Self[tclient] <: AnonClient[tclient], TClient] (val x: Self[TClient]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TClient] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TClient]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TClient] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TClient] with Other]
    @scala.inline
    def withClient(value: AnonInstantiableTClient[TClient]): Self[TClient] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Client")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

