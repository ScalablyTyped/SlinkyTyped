package typingsSlinky.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.servicenow.servicenowStrings.get
  - typingsSlinky.servicenow.servicenowStrings.post
  - typingsSlinky.servicenow.servicenowStrings.delete
  - typingsSlinky.servicenow.servicenowStrings.patch
  - typingsSlinky.servicenow.servicenowStrings.put
  - typingsSlinky.servicenow.servicenowStrings.head
  - typingsSlinky.servicenow.servicenowStrings.options
*/
trait RestHTTPMethods extends js.Object

object RestHTTPMethods {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsSlinky.servicenow.servicenowStrings.delete = this.cast("delete")
  @scala.inline
  def get: typingsSlinky.servicenow.servicenowStrings.get = this.cast("get")
  @scala.inline
  def head: typingsSlinky.servicenow.servicenowStrings.head = this.cast("head")
  @scala.inline
  def options: typingsSlinky.servicenow.servicenowStrings.options = this.cast("options")
  @scala.inline
  def patch: typingsSlinky.servicenow.servicenowStrings.patch = this.cast("patch")
  @scala.inline
  def post: typingsSlinky.servicenow.servicenowStrings.post = this.cast("post")
  @scala.inline
  def put: typingsSlinky.servicenow.servicenowStrings.put = this.cast("put")
}

