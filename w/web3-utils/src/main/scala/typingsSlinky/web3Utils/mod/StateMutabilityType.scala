package typingsSlinky.web3Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.web3Utils.web3UtilsStrings.pure
  - typingsSlinky.web3Utils.web3UtilsStrings.view
  - typingsSlinky.web3Utils.web3UtilsStrings.nonpayable
  - typingsSlinky.web3Utils.web3UtilsStrings.payable
*/
trait StateMutabilityType extends js.Object

object StateMutabilityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nonpayable: typingsSlinky.web3Utils.web3UtilsStrings.nonpayable = this.cast("nonpayable")
  @scala.inline
  def payable: typingsSlinky.web3Utils.web3UtilsStrings.payable = this.cast("payable")
  @scala.inline
  def pure: typingsSlinky.web3Utils.web3UtilsStrings.pure = this.cast("pure")
  @scala.inline
  def view: typingsSlinky.web3Utils.web3UtilsStrings.view = this.cast("view")
}

