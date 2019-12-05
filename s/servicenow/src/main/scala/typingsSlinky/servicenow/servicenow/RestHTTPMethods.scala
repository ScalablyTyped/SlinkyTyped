package typingsSlinky.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.servicenow.servicenowStrings.get
  - typings.servicenow.servicenowStrings.post
  - typings.servicenow.servicenowStrings.delete
  - typings.servicenow.servicenowStrings.patch
  - typings.servicenow.servicenowStrings.put
  - typings.servicenow.servicenowStrings.head
  - typings.servicenow.servicenowStrings.options
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

