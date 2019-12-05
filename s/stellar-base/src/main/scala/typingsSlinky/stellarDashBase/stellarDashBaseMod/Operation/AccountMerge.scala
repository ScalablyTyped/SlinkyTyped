package typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountMerge
  extends BaseOperation[typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.AccountMerge] {
  var destination: String
}

object AccountMerge {
  @scala.inline
  def apply(
    destination: String,
    `type`: typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.AccountMerge,
    source: String = null
  ): AccountMerge = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountMerge]
  }
}

@JSImport("stellar-base", "Operation.accountMerge")
@js.native
object accountMerge extends js.Object {
  def apply(options: typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.AccountMerge): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[AccountMerge] = js.native
}

