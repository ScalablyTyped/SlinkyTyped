package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.OperationResultTr")
@js.native
class OperationResultTr ()
  extends typingsSlinky.stellarBase.xdrMod.default.OperationResultTr

/* static members */
@JSImport("stellar-base", "xdr.OperationResultTr")
@js.native
object OperationResultTr extends js.Object {
  def accountMerge(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountMergeResult): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def allowTrust(value: typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def bumpSequence(value: typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceResult): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def changeTrust(value: typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustResult): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def createAccount(value: typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResult): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def createPassiveSellOffer(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageSellOfferResult): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def inflation(value: typingsSlinky.stellarBase.xdrMod.xdr.InflationResult): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr): Boolean = js.native
  def manageBuyOffer(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageBuyOfferResult): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def manageDatum(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageDataResult): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def manageSellOffer(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageSellOfferResult): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def pathPaymentStrictReceive(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def pathPaymentStrictSend(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def payment(value: typingsSlinky.stellarBase.xdrMod.xdr.PaymentResult): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def setOption(value: typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsResult): typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr, io: Buffer): Unit = js.native
}

