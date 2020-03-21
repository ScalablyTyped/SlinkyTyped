package typingsSlinky.swPrecache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.swPrecache.swPrecacheStrings.get
  - typingsSlinky.swPrecache.swPrecacheStrings.post
  - typingsSlinky.swPrecache.swPrecacheStrings.put
  - typingsSlinky.swPrecache.swPrecacheStrings.delete
  - typingsSlinky.swPrecache.swPrecacheStrings.head
*/
trait Method extends js.Object

object Method {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsSlinky.swPrecache.swPrecacheStrings.delete = this.cast("delete")
  @scala.inline
  def get: typingsSlinky.swPrecache.swPrecacheStrings.get = this.cast("get")
  @scala.inline
  def head: typingsSlinky.swPrecache.swPrecacheStrings.head = this.cast("head")
  @scala.inline
  def post: typingsSlinky.swPrecache.swPrecacheStrings.post = this.cast("post")
  @scala.inline
  def put: typingsSlinky.swPrecache.swPrecacheStrings.put = this.cast("put")
}

