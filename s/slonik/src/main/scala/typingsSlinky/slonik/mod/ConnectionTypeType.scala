package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.slonik.slonikStrings.EXPLICIT
  - typingsSlinky.slonik.slonikStrings.IMPLICIT_QUERY
  - typingsSlinky.slonik.slonikStrings.IMPLICIT_TRANSACTION
*/
trait ConnectionTypeType extends js.Object

object ConnectionTypeType {
  @scala.inline
  def EXPLICIT: typingsSlinky.slonik.slonikStrings.EXPLICIT = this.cast("EXPLICIT")
  @scala.inline
  def IMPLICIT_QUERY: typingsSlinky.slonik.slonikStrings.IMPLICIT_QUERY = this.cast("IMPLICIT_QUERY")
  @scala.inline
  def IMPLICIT_TRANSACTION: typingsSlinky.slonik.slonikStrings.IMPLICIT_TRANSACTION = this.cast("IMPLICIT_TRANSACTION")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

