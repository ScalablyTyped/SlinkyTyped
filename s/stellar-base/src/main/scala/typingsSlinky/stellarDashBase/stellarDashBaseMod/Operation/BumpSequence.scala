package typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BumpSequence
  extends BaseOperation[typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.BumpSequence] {
  var bumpTo: String
}

object BumpSequence {
  @scala.inline
  def apply(
    bumpTo: String,
    `type`: typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.BumpSequence,
    source: String = null
  ): BumpSequence = {
    val __obj = js.Dynamic.literal(bumpTo = bumpTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpSequence]
  }
}

@JSImport("stellar-base", "Operation.bumpSequence")
@js.native
object bumpSequence extends js.Object {
  def apply(options: typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.BumpSequence): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[BumpSequence] = js.native
}

