package typingsSlinky.unfetch.mod

import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Response
  - typingsSlinky.nodeFetch.mod.Response
*/
trait IsomorphicResponse extends js.Object

object IsomorphicResponse {
  @scala.inline
  implicit def apply(value: Response): IsomorphicResponse = value.asInstanceOf[IsomorphicResponse]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodeFetch.mod.Response): IsomorphicResponse = value.asInstanceOf[IsomorphicResponse]
}

