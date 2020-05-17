package typingsSlinky.unfetch.mod

import typingsSlinky.nodeFetch.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Request
  - typingsSlinky.nodeFetch.mod.Request
*/
trait IsomorphicRequest extends js.Object

object IsomorphicRequest {
  @scala.inline
  implicit def apply(value: Request): IsomorphicRequest = value.asInstanceOf[IsomorphicRequest]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.experimental.Request): IsomorphicRequest = value.asInstanceOf[IsomorphicRequest]
}

