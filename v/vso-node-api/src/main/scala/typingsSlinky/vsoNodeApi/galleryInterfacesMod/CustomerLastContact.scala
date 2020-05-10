package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerLastContact extends js.Object {
  /**
    * account for which customer was last contacted
    */
  var account: String = js.native
  /**
    * Date on which the custoemr was last contacted
    */
  var lastContactDate: js.Date = js.native
}

object CustomerLastContact {
  @scala.inline
  def apply(account: String, lastContactDate: js.Date): CustomerLastContact = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], lastContactDate = lastContactDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerLastContact]
  }
  @scala.inline
  implicit class CustomerLastContactOps[Self <: CustomerLastContact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastContactDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastContactDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

