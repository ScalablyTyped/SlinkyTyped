package typingsSlinky.xmlCrypto

import typingsSlinky.xmlCrypto.xmlCryptoStrings.after
import typingsSlinky.xmlCrypto.xmlCryptoStrings.append
import typingsSlinky.xmlCrypto.xmlCryptoStrings.before
import typingsSlinky.xmlCrypto.xmlCryptoStrings.prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends js.Object {
  var action: append | prepend | before | after
  var reference: String
}

object AnonAction {
  @scala.inline
  def apply(action: append | prepend | before | after, reference: String): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAction]
  }
}

