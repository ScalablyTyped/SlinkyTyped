package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientLookupValue extends js.Object {
  var LookupId: Double = js.native
  var LookupValue: String = js.native
}

object ClientLookupValue {
  @scala.inline
  def apply(LookupId: Double, LookupValue: String): ClientLookupValue = {
    val __obj = js.Dynamic.literal(LookupId = LookupId.asInstanceOf[js.Any], LookupValue = LookupValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientLookupValue]
  }
  @scala.inline
  implicit class ClientLookupValueOps[Self <: ClientLookupValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLookupId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LookupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLookupValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LookupValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

