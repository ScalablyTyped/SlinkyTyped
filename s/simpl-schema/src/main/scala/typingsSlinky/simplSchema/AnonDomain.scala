package typingsSlinky.simplSchema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDomain extends js.Object {
  var Domain: js.RegExp = js.native
  var Email: js.RegExp = js.native
  var EmailWithTLD: js.RegExp = js.native
  var IP: js.RegExp = js.native
  var IPv4: js.RegExp = js.native
  var IPv6: js.RegExp = js.native
  var Id: js.RegExp = js.native
  var Phone: js.RegExp = js.native
  var Url: js.RegExp = js.native
  var WeakDomain: js.RegExp = js.native
  var ZipCode: js.RegExp = js.native
}

object AnonDomain {
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
  ): AnonDomain = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], EmailWithTLD = EmailWithTLD.asInstanceOf[js.Any], IP = IP.asInstanceOf[js.Any], IPv4 = IPv4.asInstanceOf[js.Any], IPv6 = IPv6.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Phone = Phone.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], WeakDomain = WeakDomain.asInstanceOf[js.Any], ZipCode = ZipCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDomain]
  }
  @scala.inline
  implicit class AnonDomainOps[Self <: AnonDomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailWithTLD(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailWithTLD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIP(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPv4(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPv4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPv6(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPv6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeakDomain(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeakDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZipCode(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

