package typingsSlinky.xummApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xummApi.xummApiStrings.Payment
  - typingsSlinky.xummApi.xummApiStrings.OfferCreate
  - typingsSlinky.xummApi.xummApiStrings.OfferCancel
  - typingsSlinky.xummApi.xummApiStrings.EscrowFinish
  - typingsSlinky.xummApi.xummApiStrings.EscrowCreate
  - typingsSlinky.xummApi.xummApiStrings.EscrowCancel
  - typingsSlinky.xummApi.xummApiStrings.DepositPreauth
  - typingsSlinky.xummApi.xummApiStrings.CheckCreate
  - typingsSlinky.xummApi.xummApiStrings.CheckCash
  - typingsSlinky.xummApi.xummApiStrings.CheckCancel
  - typingsSlinky.xummApi.xummApiStrings.AccountSet
  - typingsSlinky.xummApi.xummApiStrings.PaymentChannelCreate
  - typingsSlinky.xummApi.xummApiStrings.PaymentChannelFund
  - typingsSlinky.xummApi.xummApiStrings.SetRegularKey
  - typingsSlinky.xummApi.xummApiStrings.SignerListSet
  - typingsSlinky.xummApi.xummApiStrings.TrustSet
  - typingsSlinky.xummApi.xummApiStrings.EnableAmendment
  - typingsSlinky.xummApi.xummApiStrings.SetFee
*/
trait XrplTransactionType extends js.Object

object XrplTransactionType {
  @scala.inline
  def AccountSet: typingsSlinky.xummApi.xummApiStrings.AccountSet = this.cast("AccountSet")
  @scala.inline
  def CheckCancel: typingsSlinky.xummApi.xummApiStrings.CheckCancel = this.cast("CheckCancel")
  @scala.inline
  def CheckCash: typingsSlinky.xummApi.xummApiStrings.CheckCash = this.cast("CheckCash")
  @scala.inline
  def CheckCreate: typingsSlinky.xummApi.xummApiStrings.CheckCreate = this.cast("CheckCreate")
  @scala.inline
  def DepositPreauth: typingsSlinky.xummApi.xummApiStrings.DepositPreauth = this.cast("DepositPreauth")
  @scala.inline
  def EnableAmendment: typingsSlinky.xummApi.xummApiStrings.EnableAmendment = this.cast("EnableAmendment")
  @scala.inline
  def EscrowCancel: typingsSlinky.xummApi.xummApiStrings.EscrowCancel = this.cast("EscrowCancel")
  @scala.inline
  def EscrowCreate: typingsSlinky.xummApi.xummApiStrings.EscrowCreate = this.cast("EscrowCreate")
  @scala.inline
  def EscrowFinish: typingsSlinky.xummApi.xummApiStrings.EscrowFinish = this.cast("EscrowFinish")
  @scala.inline
  def OfferCancel: typingsSlinky.xummApi.xummApiStrings.OfferCancel = this.cast("OfferCancel")
  @scala.inline
  def OfferCreate: typingsSlinky.xummApi.xummApiStrings.OfferCreate = this.cast("OfferCreate")
  @scala.inline
  def Payment: typingsSlinky.xummApi.xummApiStrings.Payment = this.cast("Payment")
  @scala.inline
  def PaymentChannelCreate: typingsSlinky.xummApi.xummApiStrings.PaymentChannelCreate = this.cast("PaymentChannelCreate")
  @scala.inline
  def PaymentChannelFund: typingsSlinky.xummApi.xummApiStrings.PaymentChannelFund = this.cast("PaymentChannelFund")
  @scala.inline
  def SetFee: typingsSlinky.xummApi.xummApiStrings.SetFee = this.cast("SetFee")
  @scala.inline
  def SetRegularKey: typingsSlinky.xummApi.xummApiStrings.SetRegularKey = this.cast("SetRegularKey")
  @scala.inline
  def SignerListSet: typingsSlinky.xummApi.xummApiStrings.SignerListSet = this.cast("SignerListSet")
  @scala.inline
  def TrustSet: typingsSlinky.xummApi.xummApiStrings.TrustSet = this.cast("TrustSet")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

