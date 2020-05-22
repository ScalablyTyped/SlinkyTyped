package typingsSlinky.xmlCrypto.anon

import typingsSlinky.xmlCrypto.xmlCryptoStrings.after
import typingsSlinky.xmlCrypto.xmlCryptoStrings.append
import typingsSlinky.xmlCrypto.xmlCryptoStrings.before
import typingsSlinky.xmlCrypto.xmlCryptoStrings.prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: append | prepend | before | after
  var reference: String
}

object Action {
  @scala.inline
  def apply(action: append | prepend | before | after, reference: String): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

