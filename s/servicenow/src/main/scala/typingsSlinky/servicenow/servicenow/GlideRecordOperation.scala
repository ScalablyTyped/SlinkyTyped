package typingsSlinky.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.servicenow.servicenowStrings.insert
  - typingsSlinky.servicenow.servicenowStrings.update
  - typingsSlinky.servicenow.servicenowStrings.delete
*/
trait GlideRecordOperation extends js.Object

object GlideRecordOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsSlinky.servicenow.servicenowStrings.delete = this.cast("delete")
  @scala.inline
  def insert: typingsSlinky.servicenow.servicenowStrings.insert = this.cast("insert")
  @scala.inline
  def update: typingsSlinky.servicenow.servicenowStrings.update = this.cast("update")
}

