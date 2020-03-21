package typingsSlinky.stellarSdk.mod

import typingsSlinky.stellarBase.mod.Operation.AccountMerge_
import typingsSlinky.stellarBase.mod.Operation.AllowTrust_
import typingsSlinky.stellarBase.mod.Operation.BumpSequence_
import typingsSlinky.stellarBase.mod.Operation.ChangeTrust_
import typingsSlinky.stellarBase.mod.Operation.CreateAccount_
import typingsSlinky.stellarBase.mod.Operation.CreatePassiveSellOffer_
import typingsSlinky.stellarBase.mod.Operation.Inflation_
import typingsSlinky.stellarBase.mod.Operation.ManageBuyOffer_
import typingsSlinky.stellarBase.mod.Operation.ManageData_
import typingsSlinky.stellarBase.mod.Operation.ManageSellOffer_
import typingsSlinky.stellarBase.mod.Operation.PathPaymentStrictReceive_
import typingsSlinky.stellarBase.mod.Operation.PathPaymentStrictSend_
import typingsSlinky.stellarBase.mod.Operation.Payment_
import typingsSlinky.stellarBase.mod.Operation.SetOptions_
import typingsSlinky.stellarBase.mod.OperationOptions.AccountMerge
import typingsSlinky.stellarBase.mod.OperationOptions.AllowTrust
import typingsSlinky.stellarBase.mod.OperationOptions.BumpSequence
import typingsSlinky.stellarBase.mod.OperationOptions.ChangeTrust
import typingsSlinky.stellarBase.mod.OperationOptions.CreateAccount
import typingsSlinky.stellarBase.mod.OperationOptions.CreatePassiveSellOffer
import typingsSlinky.stellarBase.mod.OperationOptions.Inflation
import typingsSlinky.stellarBase.mod.OperationOptions.ManageBuyOffer
import typingsSlinky.stellarBase.mod.OperationOptions.ManageData
import typingsSlinky.stellarBase.mod.OperationOptions.ManageSellOffer
import typingsSlinky.stellarBase.mod.OperationOptions.PathPaymentStrictReceive
import typingsSlinky.stellarBase.mod.OperationOptions.PathPaymentStrictSend
import typingsSlinky.stellarBase.mod.OperationOptions.Payment
import typingsSlinky.stellarBase.mod.OperationOptions.SetOptions
import typingsSlinky.stellarBase.mod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Operation")
@js.native
object Operation extends js.Object {
  def accountMerge(options: AccountMerge): typingsSlinky.stellarBase.mod.xdr.Operation[AccountMerge_] = js.native
  def allowTrust(options: AllowTrust): typingsSlinky.stellarBase.mod.xdr.Operation[AllowTrust_] = js.native
  def bumpSequence(options: BumpSequence): typingsSlinky.stellarBase.mod.xdr.Operation[BumpSequence_] = js.native
  def changeTrust(options: ChangeTrust): typingsSlinky.stellarBase.mod.xdr.Operation[ChangeTrust_] = js.native
  def createAccount(options: CreateAccount): typingsSlinky.stellarBase.mod.xdr.Operation[CreateAccount_] = js.native
  def createPassiveSellOffer(options: CreatePassiveSellOffer): typingsSlinky.stellarBase.mod.xdr.Operation[CreatePassiveSellOffer_] = js.native
  def fromXDRObject[T /* <: typingsSlinky.stellarBase.mod.Operation */](xdrOperation: typingsSlinky.stellarBase.mod.xdr.Operation[T]): T = js.native
  def inflation(options: Inflation): typingsSlinky.stellarBase.mod.xdr.Operation[Inflation_] = js.native
  def manageBuyOffer(options: ManageBuyOffer): typingsSlinky.stellarBase.mod.xdr.Operation[ManageBuyOffer_] = js.native
  def manageData(options: ManageData): typingsSlinky.stellarBase.mod.xdr.Operation[ManageData_] = js.native
  def manageSellOffer(options: ManageSellOffer): typingsSlinky.stellarBase.mod.xdr.Operation[ManageSellOffer_] = js.native
  def pathPayment(options: PathPaymentStrictReceive): typingsSlinky.stellarBase.mod.xdr.Operation[PathPaymentStrictReceive_] = js.native
  def pathPaymentStrictReceive(options: PathPaymentStrictReceive): typingsSlinky.stellarBase.mod.xdr.Operation[PathPaymentStrictReceive_] = js.native
  def pathPaymentStrictSend(options: PathPaymentStrictSend): typingsSlinky.stellarBase.mod.xdr.Operation[PathPaymentStrictSend_] = js.native
  def payment(options: Payment): typingsSlinky.stellarBase.mod.xdr.Operation[Payment_] = js.native
  def setOptions[T /* <: SignerOptions */](options: SetOptions[T]): typingsSlinky.stellarBase.mod.xdr.Operation[SetOptions_[T]] = js.native
}

