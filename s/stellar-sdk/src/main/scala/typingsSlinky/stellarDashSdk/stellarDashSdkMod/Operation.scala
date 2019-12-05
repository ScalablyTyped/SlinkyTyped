package typingsSlinky.stellarDashSdk.stellarDashSdkMod

import typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.AccountMerge
import typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.AllowTrust
import typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.BumpSequence
import typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.ChangeTrust
import typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.CreateAccount
import typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.CreatePassiveSellOffer
import typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.Inflation
import typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.ManageBuyOffer
import typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.ManageData
import typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.ManageSellOffer
import typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.PathPaymentStrictReceive
import typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.PathPaymentStrictSend
import typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.Payment
import typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.SetOptions
import typingsSlinky.stellarDashBase.stellarDashBaseMod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Operation")
@js.native
object Operation extends js.Object {
  def accountMerge(options: AccountMerge): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.AccountMerge] = js.native
  def allowTrust(options: AllowTrust): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.AllowTrust] = js.native
  def bumpSequence(options: BumpSequence): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.BumpSequence] = js.native
  def changeTrust(options: ChangeTrust): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.ChangeTrust] = js.native
  def createAccount(options: CreateAccount): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.CreateAccount] = js.native
  def createPassiveSellOffer(options: CreatePassiveSellOffer): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[
    typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.CreatePassiveSellOffer
  ] = js.native
  def fromXDRObject[T /* <: typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation */](xdrOperation: typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[T]): T = js.native
  def inflation(options: Inflation): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.Inflation] = js.native
  def manageBuyOffer(options: ManageBuyOffer): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.ManageBuyOffer] = js.native
  def manageData(options: ManageData): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.ManageData] = js.native
  def manageSellOffer(options: ManageSellOffer): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.ManageSellOffer] = js.native
  def pathPayment(options: PathPaymentStrictReceive): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[
    typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.PathPaymentStrictReceive
  ] = js.native
  def pathPaymentStrictReceive(options: PathPaymentStrictReceive): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[
    typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.PathPaymentStrictReceive
  ] = js.native
  def pathPaymentStrictSend(options: PathPaymentStrictSend): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.PathPaymentStrictSend] = js.native
  def payment(options: Payment): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.Payment] = js.native
  def setOptions[T /* <: SignerOptions */](options: SetOptions[T]): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.SetOptions[T]] = js.native
}

