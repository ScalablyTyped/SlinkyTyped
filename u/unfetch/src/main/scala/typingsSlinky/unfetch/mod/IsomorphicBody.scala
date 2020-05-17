package typingsSlinky.unfetch.mod

import typingsSlinky.nodeFetch.mod.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Body
  - typingsSlinky.nodeFetch.mod.Body
*/
trait IsomorphicBody extends js.Object

object IsomorphicBody {
  @scala.inline
  implicit def apply(value: Body): IsomorphicBody = value.asInstanceOf[IsomorphicBody]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.experimental.Body): IsomorphicBody = value.asInstanceOf[IsomorphicBody]
}

