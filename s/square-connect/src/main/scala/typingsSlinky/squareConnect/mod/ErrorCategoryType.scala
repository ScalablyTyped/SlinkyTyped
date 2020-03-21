package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.squareConnect.squareConnectStrings.API_ERROR
  - typingsSlinky.squareConnect.squareConnectStrings.AUTHENTICATION_ERROR
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_REQUEST_ERROR
  - typingsSlinky.squareConnect.squareConnectStrings.RATE_LIMIT_ERROR
  - typingsSlinky.squareConnect.squareConnectStrings.PAYMENT_METHOD_ERROR
  - typingsSlinky.squareConnect.squareConnectStrings.REFUND_ERROR
*/
trait ErrorCategoryType extends js.Object

object ErrorCategoryType {
  @scala.inline
  def API_ERROR: typingsSlinky.squareConnect.squareConnectStrings.API_ERROR = this.cast("API_ERROR")
  @scala.inline
  def AUTHENTICATION_ERROR: typingsSlinky.squareConnect.squareConnectStrings.AUTHENTICATION_ERROR = this.cast("AUTHENTICATION_ERROR")
  @scala.inline
  def INVALID_REQUEST_ERROR: typingsSlinky.squareConnect.squareConnectStrings.INVALID_REQUEST_ERROR = this.cast("INVALID_REQUEST_ERROR")
  @scala.inline
  def PAYMENT_METHOD_ERROR: typingsSlinky.squareConnect.squareConnectStrings.PAYMENT_METHOD_ERROR = this.cast("PAYMENT_METHOD_ERROR")
  @scala.inline
  def RATE_LIMIT_ERROR: typingsSlinky.squareConnect.squareConnectStrings.RATE_LIMIT_ERROR = this.cast("RATE_LIMIT_ERROR")
  @scala.inline
  def REFUND_ERROR: typingsSlinky.squareConnect.squareConnectStrings.REFUND_ERROR = this.cast("REFUND_ERROR")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

