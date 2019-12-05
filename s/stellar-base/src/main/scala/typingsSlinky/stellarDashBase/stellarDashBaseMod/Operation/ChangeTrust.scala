package typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation

import typingsSlinky.stellarDashBase.stellarDashBaseMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeTrust
  extends BaseOperation[typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.ChangeTrust] {
  var limit: String
  var line: Asset
}

object ChangeTrust {
  @scala.inline
  def apply(
    limit: String,
    line: Asset,
    `type`: typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.ChangeTrust,
    source: String = null
  ): ChangeTrust = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTrust]
  }
}

@JSImport("stellar-base", "Operation.changeTrust")
@js.native
object changeTrust extends js.Object {
  def apply(options: typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.ChangeTrust): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[ChangeTrust] = js.native
}

