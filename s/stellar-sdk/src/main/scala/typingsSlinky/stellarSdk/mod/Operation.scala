package typingsSlinky.stellarSdk.mod

import typingsSlinky.stellarBase.mod.Operation.AccountMerge_
import typingsSlinky.stellarBase.mod.Operation.AllowTrust_
import typingsSlinky.stellarBase.mod.Operation.BeginSponsoringFutureReserves_
import typingsSlinky.stellarBase.mod.Operation.BumpSequence_
import typingsSlinky.stellarBase.mod.Operation.ChangeTrust_
import typingsSlinky.stellarBase.mod.Operation.ClaimClaimableBalance_
import typingsSlinky.stellarBase.mod.Operation.CreateAccount_
import typingsSlinky.stellarBase.mod.Operation.CreateClaimableBalance_
import typingsSlinky.stellarBase.mod.Operation.CreatePassiveSellOffer_
import typingsSlinky.stellarBase.mod.Operation.EndSponsoringFutureReserves_
import typingsSlinky.stellarBase.mod.Operation.Inflation_
import typingsSlinky.stellarBase.mod.Operation.ManageBuyOffer_
import typingsSlinky.stellarBase.mod.Operation.ManageData_
import typingsSlinky.stellarBase.mod.Operation.ManageSellOffer_
import typingsSlinky.stellarBase.mod.Operation.PathPaymentStrictReceive_
import typingsSlinky.stellarBase.mod.Operation.PathPaymentStrictSend_
import typingsSlinky.stellarBase.mod.Operation.Payment_
import typingsSlinky.stellarBase.mod.Operation.RevokeAccountSponsorship_
import typingsSlinky.stellarBase.mod.Operation.RevokeClaimableBalanceSponsorship_
import typingsSlinky.stellarBase.mod.Operation.RevokeDataSponsorship_
import typingsSlinky.stellarBase.mod.Operation.RevokeOfferSponsorship_
import typingsSlinky.stellarBase.mod.Operation.RevokeSignerSponsorship_
import typingsSlinky.stellarBase.mod.Operation.RevokeTrustlineSponsorship_
import typingsSlinky.stellarBase.mod.Operation.SetOptions_
import typingsSlinky.stellarBase.mod.OperationOptions.AccountMerge
import typingsSlinky.stellarBase.mod.OperationOptions.AllowTrust
import typingsSlinky.stellarBase.mod.OperationOptions.BaseOptions
import typingsSlinky.stellarBase.mod.OperationOptions.BeginSponsoringFutureReserves
import typingsSlinky.stellarBase.mod.OperationOptions.BumpSequence
import typingsSlinky.stellarBase.mod.OperationOptions.ChangeTrust
import typingsSlinky.stellarBase.mod.OperationOptions.ClaimClaimableBalance
import typingsSlinky.stellarBase.mod.OperationOptions.CreateAccount
import typingsSlinky.stellarBase.mod.OperationOptions.CreateClaimableBalance
import typingsSlinky.stellarBase.mod.OperationOptions.CreatePassiveSellOffer
import typingsSlinky.stellarBase.mod.OperationOptions.Inflation
import typingsSlinky.stellarBase.mod.OperationOptions.ManageBuyOffer
import typingsSlinky.stellarBase.mod.OperationOptions.ManageData
import typingsSlinky.stellarBase.mod.OperationOptions.ManageSellOffer
import typingsSlinky.stellarBase.mod.OperationOptions.PathPaymentStrictReceive
import typingsSlinky.stellarBase.mod.OperationOptions.PathPaymentStrictSend
import typingsSlinky.stellarBase.mod.OperationOptions.Payment
import typingsSlinky.stellarBase.mod.OperationOptions.RevokeAccountSponsorship
import typingsSlinky.stellarBase.mod.OperationOptions.RevokeClaimableBalanceSponsorship
import typingsSlinky.stellarBase.mod.OperationOptions.RevokeDataSponsorship
import typingsSlinky.stellarBase.mod.OperationOptions.RevokeOfferSponsorship
import typingsSlinky.stellarBase.mod.OperationOptions.RevokeSignerSponsorship
import typingsSlinky.stellarBase.mod.OperationOptions.RevokeTrustlineSponsorship
import typingsSlinky.stellarBase.mod.OperationOptions.SetOptions
import typingsSlinky.stellarBase.mod.SignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Operation {
  
  @JSImport("stellar-sdk", "Operation.accountMerge")
  @js.native
  def accountMerge(options: AccountMerge): typingsSlinky.stellarBase.xdrMod.default.Operation[AccountMerge_] = js.native
  
  @JSImport("stellar-sdk", "Operation.allowTrust")
  @js.native
  def allowTrust(options: AllowTrust): typingsSlinky.stellarBase.xdrMod.default.Operation[AllowTrust_] = js.native
  
  @JSImport("stellar-sdk", "Operation.beginSponsoringFutureReserves")
  @js.native
  def beginSponsoringFutureReserves(options: BeginSponsoringFutureReserves): typingsSlinky.stellarBase.xdrMod.default.Operation[BeginSponsoringFutureReserves_] = js.native
  
  @JSImport("stellar-sdk", "Operation.bumpSequence")
  @js.native
  def bumpSequence(options: BumpSequence): typingsSlinky.stellarBase.xdrMod.default.Operation[BumpSequence_] = js.native
  
  @JSImport("stellar-sdk", "Operation.changeTrust")
  @js.native
  def changeTrust(options: ChangeTrust): typingsSlinky.stellarBase.xdrMod.default.Operation[ChangeTrust_] = js.native
  
  @JSImport("stellar-sdk", "Operation.claimClaimableBalance")
  @js.native
  def claimClaimableBalance(options: ClaimClaimableBalance): typingsSlinky.stellarBase.xdrMod.default.Operation[ClaimClaimableBalance_] = js.native
  
  @JSImport("stellar-sdk", "Operation.createAccount")
  @js.native
  def createAccount(options: CreateAccount): typingsSlinky.stellarBase.xdrMod.default.Operation[CreateAccount_] = js.native
  
  @JSImport("stellar-sdk", "Operation.createClaimableBalance")
  @js.native
  def createClaimableBalance(options: CreateClaimableBalance): typingsSlinky.stellarBase.xdrMod.default.Operation[CreateClaimableBalance_] = js.native
  
  @JSImport("stellar-sdk", "Operation.createPassiveSellOffer")
  @js.native
  def createPassiveSellOffer(options: CreatePassiveSellOffer): typingsSlinky.stellarBase.xdrMod.default.Operation[CreatePassiveSellOffer_] = js.native
  
  @JSImport("stellar-sdk", "Operation.endSponsoringFutureReserves")
  @js.native
  def endSponsoringFutureReserves(options: BaseOptions): typingsSlinky.stellarBase.xdrMod.default.Operation[EndSponsoringFutureReserves_] = js.native
  
  @JSImport("stellar-sdk", "Operation.fromXDRObject")
  @js.native
  def fromXDRObject[T /* <: typingsSlinky.stellarBase.mod.Operation */](xdrOperation: typingsSlinky.stellarBase.xdrMod.default.Operation[T]): T = js.native
  
  @JSImport("stellar-sdk", "Operation.inflation")
  @js.native
  def inflation(options: Inflation): typingsSlinky.stellarBase.xdrMod.default.Operation[Inflation_] = js.native
  
  @JSImport("stellar-sdk", "Operation.manageBuyOffer")
  @js.native
  def manageBuyOffer(options: ManageBuyOffer): typingsSlinky.stellarBase.xdrMod.default.Operation[ManageBuyOffer_] = js.native
  
  @JSImport("stellar-sdk", "Operation.manageData")
  @js.native
  def manageData(options: ManageData): typingsSlinky.stellarBase.xdrMod.default.Operation[ManageData_] = js.native
  
  @JSImport("stellar-sdk", "Operation.manageSellOffer")
  @js.native
  def manageSellOffer(options: ManageSellOffer): typingsSlinky.stellarBase.xdrMod.default.Operation[ManageSellOffer_] = js.native
  
  @JSImport("stellar-sdk", "Operation.pathPaymentStrictReceive")
  @js.native
  def pathPaymentStrictReceive(options: PathPaymentStrictReceive): typingsSlinky.stellarBase.xdrMod.default.Operation[PathPaymentStrictReceive_] = js.native
  
  @JSImport("stellar-sdk", "Operation.pathPaymentStrictSend")
  @js.native
  def pathPaymentStrictSend(options: PathPaymentStrictSend): typingsSlinky.stellarBase.xdrMod.default.Operation[PathPaymentStrictSend_] = js.native
  
  @JSImport("stellar-sdk", "Operation.payment")
  @js.native
  def payment(options: Payment): typingsSlinky.stellarBase.xdrMod.default.Operation[Payment_] = js.native
  
  @JSImport("stellar-sdk", "Operation.revokeAccountSponsorship")
  @js.native
  def revokeAccountSponsorship(options: RevokeAccountSponsorship): typingsSlinky.stellarBase.xdrMod.default.Operation[RevokeAccountSponsorship_] = js.native
  
  @JSImport("stellar-sdk", "Operation.revokeClaimableBalanceSponsorship")
  @js.native
  def revokeClaimableBalanceSponsorship(options: RevokeClaimableBalanceSponsorship): typingsSlinky.stellarBase.xdrMod.default.Operation[RevokeClaimableBalanceSponsorship_] = js.native
  
  @JSImport("stellar-sdk", "Operation.revokeDataSponsorship")
  @js.native
  def revokeDataSponsorship(options: RevokeDataSponsorship): typingsSlinky.stellarBase.xdrMod.default.Operation[RevokeDataSponsorship_] = js.native
  
  @JSImport("stellar-sdk", "Operation.revokeOfferSponsorship")
  @js.native
  def revokeOfferSponsorship(options: RevokeOfferSponsorship): typingsSlinky.stellarBase.xdrMod.default.Operation[RevokeOfferSponsorship_] = js.native
  
  @JSImport("stellar-sdk", "Operation.revokeSignerSponsorship")
  @js.native
  def revokeSignerSponsorship(options: RevokeSignerSponsorship): typingsSlinky.stellarBase.xdrMod.default.Operation[RevokeSignerSponsorship_] = js.native
  
  @JSImport("stellar-sdk", "Operation.revokeTrustlineSponsorship")
  @js.native
  def revokeTrustlineSponsorship(options: RevokeTrustlineSponsorship): typingsSlinky.stellarBase.xdrMod.default.Operation[RevokeTrustlineSponsorship_] = js.native
  
  @JSImport("stellar-sdk", "Operation.setOptions")
  @js.native
  def setOptions[T /* <: SignerOptions */](options: SetOptions[T]): typingsSlinky.stellarBase.xdrMod.default.Operation[SetOptions_[T]] = js.native
}
