package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.OperationBody")
@js.native
class OperationBody ()
  extends typingsSlinky.stellarBase.mod.xdr.OperationBody
/* static members */
@JSImport("stellar-sdk", "xdr.OperationBody")
@js.native
object OperationBody extends js.Object {
  
  def accountMerge(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def allowTrust(value: typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def beginSponsoringFutureReserves(value: typingsSlinky.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def bumpSequence(value: typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def changeTrust(value: typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def claimClaimableBalance(value: typingsSlinky.stellarBase.xdrMod.xdr.ClaimClaimableBalanceOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def createAccount(value: typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def createClaimableBalance(value: typingsSlinky.stellarBase.xdrMod.xdr.CreateClaimableBalanceOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def createPassiveSellOffer(value: typingsSlinky.stellarBase.xdrMod.xdr.CreatePassiveSellOfferOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def endSponsoringFutureReserves(): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def inflation(): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationBody): Boolean = js.native
  
  def manageBuyOffer(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageBuyOfferOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def manageData(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageDataOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def manageSellOffer(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageSellOfferOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def pathPaymentStrictReceive(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def pathPaymentStrictSend(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def payment(value: typingsSlinky.stellarBase.xdrMod.xdr.PaymentOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def revokeSponsorship(value: typingsSlinky.stellarBase.xdrMod.xdr.RevokeSponsorshipOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def setOptions(value: typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationBody): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationBody, io: Buffer): Unit = js.native
}
