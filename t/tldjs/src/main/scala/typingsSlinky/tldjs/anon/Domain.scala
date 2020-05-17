package typingsSlinky.tldjs.anon

import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Domain extends js.Object {
  var domain: ReturnType[js.Function1[/* host */ String, String | Null]] = js.native
  var hostname: ReturnType[js.Function1[/* host */ String, String | Null]] = js.native
  var isIp: Boolean = js.native
  var isValid: ReturnType[js.Function1[/* host */ String, Boolean]] = js.native
  var publicSuffix: ReturnType[js.Function1[/* host */ String, String | Null]] = js.native
  var subdomain: ReturnType[js.Function1[/* host */ String, String | Null]] = js.native
  var tldExists: ReturnType[js.Function1[/* host */ String, Boolean]] = js.native
}

object Domain {
  @scala.inline
  def apply(
    domain: ReturnType[js.Function1[/* host */ String, String | Null]],
    hostname: ReturnType[js.Function1[/* host */ String, String | Null]],
    isIp: Boolean,
    isValid: ReturnType[js.Function1[/* host */ String, Boolean]],
    publicSuffix: ReturnType[js.Function1[/* host */ String, String | Null]],
    subdomain: ReturnType[js.Function1[/* host */ String, String | Null]],
    tldExists: ReturnType[js.Function1[/* host */ String, Boolean]]
  ): Domain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], isIp = isIp.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], publicSuffix = publicSuffix.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tldExists = tldExists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostname(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: ReturnType[js.Function1[/* host */ String, Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicSuffix(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubdomain(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTldExists(value: ReturnType[js.Function1[/* host */ String, Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tldExists")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

