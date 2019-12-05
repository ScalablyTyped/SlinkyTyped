package typingsSlinky.xmldsigjs

import typingsSlinky.xmldsigjs.typesPkijsMod.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RecipientCertificate extends js.Object {
  var recipientCertificate: Certificate
  var recipientPrivateKey: scala.scalajs.js.typedarray.ArrayBuffer
}

object Anon_RecipientCertificate {
  @scala.inline
  def apply(recipientCertificate: Certificate, recipientPrivateKey: scala.scalajs.js.typedarray.ArrayBuffer): Anon_RecipientCertificate = {
    val __obj = js.Dynamic.literal(recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientPrivateKey = recipientPrivateKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RecipientCertificate]
  }
}

