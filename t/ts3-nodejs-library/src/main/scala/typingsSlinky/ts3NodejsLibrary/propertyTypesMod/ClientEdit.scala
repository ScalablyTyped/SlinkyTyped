package typingsSlinky.ts3NodejsLibrary.propertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientEdit extends js.Object {
  var client_description: js.UndefOr[String] = js.native
  var client_is_talker: js.UndefOr[Double] = js.native
}

object ClientEdit {
  @scala.inline
  def apply(): ClientEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientEdit]
  }
  @scala.inline
  implicit class ClientEditOps[Self <: ClientEdit] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutClient_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_description")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_is_talker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_is_talker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_is_talker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_is_talker")(js.undefined)
        ret
    }
  }
  
}

