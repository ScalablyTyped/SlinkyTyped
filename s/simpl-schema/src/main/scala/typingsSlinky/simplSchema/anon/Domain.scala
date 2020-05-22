package typingsSlinky.simplSchema.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var Domain: js.RegExp
  var Email: js.RegExp
  var EmailWithTLD: js.RegExp
  var IP: js.RegExp
  var IPv4: js.RegExp
  var IPv6: js.RegExp
  var Id: js.RegExp
  var Phone: js.RegExp
  var Url: js.RegExp
  var WeakDomain: js.RegExp
  var ZipCode: js.RegExp
}

object Domain {
  @scala.inline
  def apply(
    Domain: js.RegExp,
    Email: js.RegExp,
    EmailWithTLD: js.RegExp,
    IP: js.RegExp,
    IPv4: js.RegExp,
    IPv6: js.RegExp,
    Id: js.RegExp,
    Phone: js.RegExp,
    Url: js.RegExp,
    WeakDomain: js.RegExp,
    ZipCode: js.RegExp
  ): Domain = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], EmailWithTLD = EmailWithTLD.asInstanceOf[js.Any], IP = IP.asInstanceOf[js.Any], IPv4 = IPv4.asInstanceOf[js.Any], IPv6 = IPv6.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Phone = Phone.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], WeakDomain = WeakDomain.asInstanceOf[js.Any], ZipCode = ZipCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
}

