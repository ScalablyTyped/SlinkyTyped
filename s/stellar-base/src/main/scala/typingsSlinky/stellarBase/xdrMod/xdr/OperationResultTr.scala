package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationResultTr extends StObject {
  
  def accountMergeResult(): AccountMergeResult = js.native
  def accountMergeResult(value: AccountMergeResult): AccountMergeResult = js.native
  
  def allowTrustResult(): AllowTrustResult = js.native
  def allowTrustResult(value: AllowTrustResult): AllowTrustResult = js.native
  
  def beginSponsoringFutureReservesResult(): BeginSponsoringFutureReservesResult = js.native
  def beginSponsoringFutureReservesResult(value: BeginSponsoringFutureReservesResult): BeginSponsoringFutureReservesResult = js.native
  
  def bumpSeqResult(): BumpSequenceResult = js.native
  def bumpSeqResult(value: BumpSequenceResult): BumpSequenceResult = js.native
  
  def changeTrustResult(): ChangeTrustResult = js.native
  def changeTrustResult(value: ChangeTrustResult): ChangeTrustResult = js.native
  
  def claimClaimableBalanceResult(): ClaimClaimableBalanceResult = js.native
  def claimClaimableBalanceResult(value: ClaimClaimableBalanceResult): ClaimClaimableBalanceResult = js.native
  
  def createAccountResult(): CreateAccountResult = js.native
  def createAccountResult(value: CreateAccountResult): CreateAccountResult = js.native
  
  def createClaimableBalanceResult(): CreateClaimableBalanceResult = js.native
  def createClaimableBalanceResult(value: CreateClaimableBalanceResult): CreateClaimableBalanceResult = js.native
  
  def createPassiveSellOfferResult(): ManageSellOfferResult = js.native
  def createPassiveSellOfferResult(value: ManageSellOfferResult): ManageSellOfferResult = js.native
  
  def endSponsoringFutureReservesResult(): EndSponsoringFutureReservesResult = js.native
  def endSponsoringFutureReservesResult(value: EndSponsoringFutureReservesResult): EndSponsoringFutureReservesResult = js.native
  
  def inflationResult(): InflationResult = js.native
  def inflationResult(value: InflationResult): InflationResult = js.native
  
  def manageBuyOfferResult(): ManageBuyOfferResult = js.native
  def manageBuyOfferResult(value: ManageBuyOfferResult): ManageBuyOfferResult = js.native
  
  def manageDataResult(): ManageDataResult = js.native
  def manageDataResult(value: ManageDataResult): ManageDataResult = js.native
  
  def manageSellOfferResult(): ManageSellOfferResult = js.native
  def manageSellOfferResult(value: ManageSellOfferResult): ManageSellOfferResult = js.native
  
  def pathPaymentStrictReceiveResult(): PathPaymentStrictReceiveResult = js.native
  def pathPaymentStrictReceiveResult(value: PathPaymentStrictReceiveResult): PathPaymentStrictReceiveResult = js.native
  
  def pathPaymentStrictSendResult(): PathPaymentStrictSendResult = js.native
  def pathPaymentStrictSendResult(value: PathPaymentStrictSendResult): PathPaymentStrictSendResult = js.native
  
  def paymentResult(): PaymentResult = js.native
  def paymentResult(value: PaymentResult): PaymentResult = js.native
  
  def revokeSponsorshipResult(): RevokeSponsorshipResult = js.native
  def revokeSponsorshipResult(value: RevokeSponsorshipResult): RevokeSponsorshipResult = js.native
  
  def setOptionsResult(): SetOptionsResult = js.native
  def setOptionsResult(value: SetOptionsResult): SetOptionsResult = js.native
  
  def switch(): OperationType = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def value(): CreateAccountResult | PaymentResult | PathPaymentStrictReceiveResult | ManageSellOfferResult | SetOptionsResult | ChangeTrustResult | AllowTrustResult | AccountMergeResult | InflationResult | ManageDataResult | BumpSequenceResult | ManageBuyOfferResult | PathPaymentStrictSendResult | CreateClaimableBalanceResult | ClaimClaimableBalanceResult | BeginSponsoringFutureReservesResult | EndSponsoringFutureReservesResult | RevokeSponsorshipResult = js.native
}
