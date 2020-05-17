package typingsSlinky.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an object that represents a Uniform Resource Identifier (URI) value and parses it into components. The Uri object is used by many other Windows Runtime APIs that are not necessarily confined to web browser scenarios. */
@js.native
trait Uri extends js.Object {
  /** Gets a fully canonical RFC-compliant representation of the current URI. */
  var absoluteCanonicalUri: String = js.native
  /** Gets the entire, non-canonical URI (It is non-canonical because it might actually be an IRI, per the Windows.Foundation.Uri encoding behavior; see Remarks.). */
  var absoluteUri: String = js.native
  /** Gets the decoded unicode characters that make up the current URI. */
  var displayIri: String = js.native
  /** Gets a representation of the Uniform Resource Identifier (URI) that can be used for display purposes. */
  var displayUri: String = js.native
  /** Gets the domain name component, including top-level domain, from a Uniform Resource Identifier (URI). */
  var domain: String = js.native
  /** Gets the file name extension of the resource that is referenced in the Uri . */
  var extension: String = js.native
  /** Gets the text following a fragment marker (#), including the fragment marker itself. */
  var fragment: String = js.native
  /** Gets the fully qualified domain name. */
  var host: String = js.native
  /** Gets the password component of the Uniform Resource Identifier (URI) as stored in this Uri instance. */
  var password: String = js.native
  /** Gets the path and resource name component of the Uniform Resource Identifier (URI) as stored in this Uri instance. */
  var path: String = js.native
  /** Gets the port number component of the Uniform Resource Identifier (URI) as stored in this Uri instance */
  var port: Double = js.native
  /** Gets the query string component of the Uniform Resource Identifier (URI) as stored in this Uri instance. */
  var query: String = js.native
  /** Gets a parsed Uniform Resource Identifier (URI) query string. */
  var queryParsed: WwwFormUrlDecoder = js.native
  /** Gets the entire original Uniform Resource Identifier (URI) string as used to construct this Uri object, before parsing, and without any encoding applied. */
  var rawUri: String = js.native
  /** Gets the protocol scheme name component of the Uniform Resource Identifier (URI) as stored in this Uri instance */
  var schemeName: String = js.native
  /** Gets a value that indicates whether parsing determined that the Uniform Resource Identifier (URI) is not well-formed. */
  var suspicious: Boolean = js.native
  /** Gets the user name component of the Uniform Resource Identifier (URI) as stored in this Uri instance. */
  var userName: String = js.native
  /**
    * Adds the specified Uniform Resource Identifier (URI) to the current Uri .
    * @param relativeUri A relative URI specified as a string. This relative path is evaluated using the host/authority of the Uri instance where this method is called.
    * @return The combined Uri value.
    */
  def combineUri(relativeUri: String): Uri = js.native
  /**
    * Determines whether the specified Uri object is equal to the current Uri object.
    * @param pUri The Uri object to be compared.
    * @return true if the two Uri values are the same; otherwise, false.
    */
  def equals(pUri: Uri): Boolean = js.native
}

object Uri {
  @scala.inline
  def apply(
    absoluteCanonicalUri: String,
    absoluteUri: String,
    combineUri: String => Uri,
    displayIri: String,
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
  ): Uri = {
    val __obj = js.Dynamic.literal(absoluteCanonicalUri = absoluteCanonicalUri.asInstanceOf[js.Any], absoluteUri = absoluteUri.asInstanceOf[js.Any], combineUri = js.Any.fromFunction1(combineUri), displayIri = displayIri.asInstanceOf[js.Any], displayUri = displayUri.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), extension = extension.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryParsed = queryParsed.asInstanceOf[js.Any], rawUri = rawUri.asInstanceOf[js.Any], schemeName = schemeName.asInstanceOf[js.Any], suspicious = suspicious.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uri]
  }
  @scala.inline
  implicit class UriOps[Self <: Uri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsoluteCanonicalUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteCanonicalUri")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withDisplayIri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayIri")(value.asInstanceOf[js.Any])
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

