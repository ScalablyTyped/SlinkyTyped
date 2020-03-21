package typingsSlinky.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.servicenowLondon.servicenowLondonStrings.insert
  - typingsSlinky.servicenowLondon.servicenowLondonStrings.update
  - typingsSlinky.servicenowLondon.servicenowLondonStrings.delete
*/
trait GlideRecordOperation extends js.Object

object GlideRecordOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsSlinky.servicenowLondon.servicenowLondonStrings.delete = this.cast("delete")
  @scala.inline
  def insert: typingsSlinky.servicenowLondon.servicenowLondonStrings.insert = this.cast("insert")
  @scala.inline
  def update: typingsSlinky.servicenowLondon.servicenowLondonStrings.update = this.cast("update")
}

