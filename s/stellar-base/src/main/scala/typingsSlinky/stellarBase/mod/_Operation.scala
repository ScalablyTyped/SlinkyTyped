package typingsSlinky.stellarBase.mod

import typingsSlinky.stellarBase.mod.OperationType.AccountMerge
import typingsSlinky.stellarBase.mod.OperationType.AllowTrust
import typingsSlinky.stellarBase.mod.OperationType.BeginSponsoringFutureReserves
import typingsSlinky.stellarBase.mod.OperationType.BumpSequence
import typingsSlinky.stellarBase.mod.OperationType.ChangeTrust
import typingsSlinky.stellarBase.mod.OperationType.ClaimClaimableBalance
import typingsSlinky.stellarBase.mod.OperationType.CreateAccount
import typingsSlinky.stellarBase.mod.OperationType.CreateClaimableBalance
import typingsSlinky.stellarBase.mod.OperationType.CreatePassiveSellOffer
import typingsSlinky.stellarBase.mod.OperationType.ManageBuyOffer
import typingsSlinky.stellarBase.mod.OperationType.ManageData
import typingsSlinky.stellarBase.mod.OperationType.ManageSellOffer
import typingsSlinky.stellarBase.mod.OperationType.PathPaymentStrictReceive
import typingsSlinky.stellarBase.mod.OperationType.PathPaymentStrictSend
import typingsSlinky.stellarBase.mod.OperationType.Payment
import typingsSlinky.stellarBase.mod.OperationType.RevokeSponsorship
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Operation extends StObject
object _Operation {
  
  @scala.inline
  def AccountMerge_(destination: String, `type`: AccountMerge): typingsSlinky.stellarBase.mod.Operation.AccountMerge_ = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.AccountMerge_]
  }
  
  @scala.inline
  def AllowTrust_(assetCode: String, trustor: String, `type`: AllowTrust): typingsSlinky.stellarBase.mod.Operation.AllowTrust_ = {
    val __obj = js.Dynamic.literal(assetCode = assetCode.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.AllowTrust_]
  }
  
  @scala.inline
  def BeginSponsoringFutureReserves_(sponsoredId: String, `type`: BeginSponsoringFutureReserves): typingsSlinky.stellarBase.mod.Operation.BeginSponsoringFutureReserves_ = {
    val __obj = js.Dynamic.literal(sponsoredId = sponsoredId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.BeginSponsoringFutureReserves_]
  }
  
  @scala.inline
  def BumpSequence_(bumpTo: String, `type`: BumpSequence): typingsSlinky.stellarBase.mod.Operation.BumpSequence_ = {
    val __obj = js.Dynamic.literal(bumpTo = bumpTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.BumpSequence_]
  }
  
  @scala.inline
  def ChangeTrust_(limit: String, line: Asset, `type`: ChangeTrust): typingsSlinky.stellarBase.mod.Operation.ChangeTrust_ = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.ChangeTrust_]
  }
  
  @scala.inline
  def ClaimClaimableBalance_(balanceId: String, `type`: ClaimClaimableBalance): typingsSlinky.stellarBase.mod.Operation.ClaimClaimableBalance_ = {
    val __obj = js.Dynamic.literal(balanceId = balanceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.ClaimClaimableBalance_]
  }
  
  @scala.inline
  def CreateAccount_(destination: String, startingBalance: String, `type`: CreateAccount): typingsSlinky.stellarBase.mod.Operation.CreateAccount_ = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], startingBalance = startingBalance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.CreateAccount_]
  }
  
  @scala.inline
  def CreateClaimableBalance_(amount: String, asset: Asset, claimants: js.Array[Claimant], `type`: CreateClaimableBalance): typingsSlinky.stellarBase.mod.Operation.CreateClaimableBalance_ = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], claimants = claimants.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.CreateClaimableBalance_]
  }
  
  @scala.inline
  def CreatePassiveSellOffer_(amount: String, buying: Asset, price: String, selling: Asset, `type`: CreatePassiveSellOffer): typingsSlinky.stellarBase.mod.Operation.CreatePassiveSellOffer_ = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.CreatePassiveSellOffer_]
  }
  
  @scala.inline
  def ManageBuyOffer_(
    buyAmount: String,
    buying: Asset,
    offerId: String,
    price: String,
    selling: Asset,
    `type`: ManageBuyOffer
  ): typingsSlinky.stellarBase.mod.Operation.ManageBuyOffer_ = {
    val __obj = js.Dynamic.literal(buyAmount = buyAmount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.ManageBuyOffer_]
  }
  
  @scala.inline
  def ManageData_(name: String, `type`: ManageData): typingsSlinky.stellarBase.mod.Operation.ManageData_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.ManageData_]
  }
  
  @scala.inline
  def ManageSellOffer_(
    amount: String,
    buying: Asset,
    offerId: String,
    price: String,
    selling: Asset,
    `type`: ManageSellOffer
  ): typingsSlinky.stellarBase.mod.Operation.ManageSellOffer_ = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.ManageSellOffer_]
  }
  
  @scala.inline
  def PathPaymentStrictReceive_(
    destAmount: String,
    destAsset: Asset,
    destination: String,
    path: js.Array[Asset],
    sendAsset: Asset,
    sendMax: String,
    `type`: PathPaymentStrictReceive
  ): typingsSlinky.stellarBase.mod.Operation.PathPaymentStrictReceive_ = {
    val __obj = js.Dynamic.literal(destAmount = destAmount.asInstanceOf[js.Any], destAsset = destAsset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any], sendMax = sendMax.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.PathPaymentStrictReceive_]
  }
  
  @scala.inline
  def PathPaymentStrictSend_(
    destAsset: Asset,
    destMin: String,
    destination: String,
    path: js.Array[Asset],
    sendAmount: String,
    sendAsset: Asset,
    `type`: PathPaymentStrictSend
  ): typingsSlinky.stellarBase.mod.Operation.PathPaymentStrictSend_ = {
    val __obj = js.Dynamic.literal(destAsset = destAsset.asInstanceOf[js.Any], destMin = destMin.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sendAmount = sendAmount.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.PathPaymentStrictSend_]
  }
  
  @scala.inline
  def Payment_(amount: String, asset: Asset, destination: String, `type`: Payment): typingsSlinky.stellarBase.mod.Operation.Payment_ = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.Payment_]
  }
  
  @scala.inline
  def RevokeAccountSponsorship_(account: String, `type`: RevokeSponsorship): typingsSlinky.stellarBase.mod.Operation.RevokeAccountSponsorship_ = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.RevokeAccountSponsorship_]
  }
  
  @scala.inline
  def RevokeClaimableBalanceSponsorship_(balanceId: String, `type`: RevokeSponsorship): typingsSlinky.stellarBase.mod.Operation.RevokeClaimableBalanceSponsorship_ = {
    val __obj = js.Dynamic.literal(balanceId = balanceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.RevokeClaimableBalanceSponsorship_]
  }
  
  @scala.inline
  def RevokeDataSponsorship_(account: String, name: String, `type`: RevokeSponsorship): typingsSlinky.stellarBase.mod.Operation.RevokeDataSponsorship_ = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.RevokeDataSponsorship_]
  }
  
  @scala.inline
  def RevokeOfferSponsorship_(offerId: String, seller: String, `type`: RevokeSponsorship): typingsSlinky.stellarBase.mod.Operation.RevokeOfferSponsorship_ = {
    val __obj = js.Dynamic.literal(offerId = offerId.asInstanceOf[js.Any], seller = seller.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.RevokeOfferSponsorship_]
  }
  
  @scala.inline
  def RevokeSignerSponsorship_(account: String, signer: SignerKeyOptions, `type`: RevokeSponsorship): typingsSlinky.stellarBase.mod.Operation.RevokeSignerSponsorship_ = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], signer = signer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.RevokeSignerSponsorship_]
  }
  
  @scala.inline
  def RevokeTrustlineSponsorship_(account: String, asset: Asset, `type`: RevokeSponsorship): typingsSlinky.stellarBase.mod.Operation.RevokeTrustlineSponsorship_ = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stellarBase.mod.Operation.RevokeTrustlineSponsorship_]
  }
}
