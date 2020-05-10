package typingsSlinky.ts3NodejsLibrary.propertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientDBEdit extends js.Object {
  var client_description: String = js.native
}

object ClientDBEdit {
  @scala.inline
  def apply(client_description: String): ClientDBEdit = {
    val __obj = js.Dynamic.literal(client_description = client_description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDBEdit]
  }
  @scala.inline
  implicit class ClientDBEditOps[Self <: ClientDBEdit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_description")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

