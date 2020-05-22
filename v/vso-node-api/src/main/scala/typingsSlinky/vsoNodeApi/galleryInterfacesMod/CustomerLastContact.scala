package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerLastContact extends js.Object {
  /**
    * account for which customer was last contacted
    */
  var account: String
  /**
    * Date on which the custoemr was last contacted
    */
  var lastContactDate: js.Date
}

object CustomerLastContact {
  @scala.inline
  def apply(account: String, lastContactDate: js.Date): CustomerLastContact = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], lastContactDate = lastContactDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerLastContact]
  }
}

