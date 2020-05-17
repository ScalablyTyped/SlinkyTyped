package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stellarSdk.serverApiMod.ServerApi.CreateAccountOperationRecord
  - typingsSlinky.stellarSdk.serverApiMod.ServerApi.PaymentOperationRecord
  - typingsSlinky.stellarSdk.serverApiMod.ServerApi.PathPaymentOperationRecord
  - typingsSlinky.stellarSdk.serverApiMod.ServerApi.ManageOfferOperationRecord
  - typingsSlinky.stellarSdk.serverApiMod.ServerApi.PassiveOfferOperationRecord
  - typingsSlinky.stellarSdk.serverApiMod.ServerApi.SetOptionsOperationRecord
  - typingsSlinky.stellarSdk.serverApiMod.ServerApi.ChangeTrustOperationRecord
  - typingsSlinky.stellarSdk.serverApiMod.ServerApi.AllowTrustOperationRecord
  - typingsSlinky.stellarSdk.serverApiMod.ServerApi.AccountMergeOperationRecord
  - typingsSlinky.stellarSdk.serverApiMod.ServerApi.InflationOperationRecord
  - typingsSlinky.stellarSdk.serverApiMod.ServerApi.ManageDataOperationRecord
  - typingsSlinky.stellarSdk.serverApiMod.ServerApi.BumpSequenceOperationRecord
*/
trait OperationRecord extends js.Object

object OperationRecord {
  @scala.inline
  implicit def apply(value: AccountMergeOperationRecord): OperationRecord = value.asInstanceOf[OperationRecord]
  @scala.inline
  implicit def apply(value: AllowTrustOperationRecord): OperationRecord = value.asInstanceOf[OperationRecord]
  @scala.inline
  implicit def apply(value: BumpSequenceOperationRecord): OperationRecord = value.asInstanceOf[OperationRecord]
  @scala.inline
  implicit def apply(value: ChangeTrustOperationRecord): OperationRecord = value.asInstanceOf[OperationRecord]
  @scala.inline
  implicit def apply(value: CreateAccountOperationRecord): OperationRecord = value.asInstanceOf[OperationRecord]
  @scala.inline
  implicit def apply(value: InflationOperationRecord): OperationRecord = value.asInstanceOf[OperationRecord]
  @scala.inline
  implicit def apply(value: ManageDataOperationRecord): OperationRecord = value.asInstanceOf[OperationRecord]
  @scala.inline
  implicit def apply(value: ManageOfferOperationRecord): OperationRecord = value.asInstanceOf[OperationRecord]
  @scala.inline
  implicit def apply(value: PassiveOfferOperationRecord): OperationRecord = value.asInstanceOf[OperationRecord]
  @scala.inline
  implicit def apply(value: PathPaymentOperationRecord): OperationRecord = value.asInstanceOf[OperationRecord]
  @scala.inline
  implicit def apply(value: PaymentOperationRecord): OperationRecord = value.asInstanceOf[OperationRecord]
  @scala.inline
  implicit def apply(value: SetOptionsOperationRecord): OperationRecord = value.asInstanceOf[OperationRecord]
}

