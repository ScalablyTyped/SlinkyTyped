package typingsSlinky.std

import typingsSlinky.std.anon.LookupNamespaceURI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * prefix * / java.lang.String | scala.Null, java.lang.String | scala.Null]
  - typingsSlinky.std.anon.LookupNamespaceURI
*/
trait XPathNSResolver extends js.Object

object XPathNSResolver {
  @scala.inline
  implicit def apply(value: js.Function1[/* prefix */ java.lang.String | Null, java.lang.String | Null]): XPathNSResolver = value.asInstanceOf[XPathNSResolver]
  @scala.inline
  implicit def apply(value: LookupNamespaceURI): XPathNSResolver = value.asInstanceOf[XPathNSResolver]
}

