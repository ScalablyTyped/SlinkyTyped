package typingsSlinky.stripejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripejs.stripejsStrings.api_connection_error
  - typingsSlinky.stripejs.stripejsStrings.api_error
  - typingsSlinky.stripejs.stripejsStrings.authentication_error
  - typingsSlinky.stripejs.stripejsStrings.card_error
  - typingsSlinky.stripejs.stripejsStrings.idempotency_error
  - typingsSlinky.stripejs.stripejsStrings.invalid_request_error
  - typingsSlinky.stripejs.stripejsStrings.rate_limit_error
*/
trait errorType extends js.Object

object errorType {
  @scala.inline
  def api_connection_error: typingsSlinky.stripejs.stripejsStrings.api_connection_error = this.cast("api_connection_error")
  @scala.inline
  def api_error: typingsSlinky.stripejs.stripejsStrings.api_error = this.cast("api_error")
  @scala.inline
  def authentication_error: typingsSlinky.stripejs.stripejsStrings.authentication_error = this.cast("authentication_error")
  @scala.inline
  def card_error: typingsSlinky.stripejs.stripejsStrings.card_error = this.cast("card_error")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def idempotency_error: typingsSlinky.stripejs.stripejsStrings.idempotency_error = this.cast("idempotency_error")
  @scala.inline
  def invalid_request_error: typingsSlinky.stripejs.stripejsStrings.invalid_request_error = this.cast("invalid_request_error")
  @scala.inline
  def rate_limit_error: typingsSlinky.stripejs.stripejsStrings.rate_limit_error = this.cast("rate_limit_error")
}

