package typingsSlinky.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUriRuntimeClass extends js.Object {
  var absoluteUri: String = js.native
  var displayUri: String = js.native
  var domain: String = js.native
  var extension: String = js.native
  var fragment: String = js.native
  var host: String = js.native
  var password: String = js.native
  var path: String = js.native
  var port: Double = js.native
  var query: String = js.native
  var queryParsed: WwwFormUrlDecoder = js.native
  var rawUri: String = js.native
  var schemeName: String = js.native
  var suspicious: Boolean = js.native
  var userName: String = js.native
  def combineUri(relativeUri: String): Uri = js.native
  def equals(pUri: Uri): Boolean = js.native
}

object IUriRuntimeClass {
  @scala.inline
  def apply(
    absoluteUri: String,
    combineUri: String => Uri,
    displayUri: String,
    domain: String,
    equals: Uri => Boolean,
    extension: String,
    fragment: String,
    host: String,
    password: String,
    path: String,
    port: Double,
    query: String,
    queryParsed: WwwFormUrlDecoder,
    rawUri: String,
    schemeName: String,
    suspicious: Boolean,
    userName: String
  ): IUriRuntimeClass = {
    val __obj = js.Dynamic.literal(absoluteUri = absoluteUri.asInstanceOf[js.Any], combineUri = js.Any.fromFunction1(combineUri), displayUri = displayUri.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), extension = extension.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryParsed = queryParsed.asInstanceOf[js.Any], rawUri = rawUri.asInstanceOf[js.Any], schemeName = schemeName.asInstanceOf[js.Any], suspicious = suspicious.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUriRuntimeClass]
  }
  @scala.inline
  implicit class IUriRuntimeClassOps[Self <: IUriRuntimeClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsoluteUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCombineUri(value: String => Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combineUri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplayUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEquals(value: Uri => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryParsed(value: WwwFormUrlDecoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuspicious(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspicious")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

