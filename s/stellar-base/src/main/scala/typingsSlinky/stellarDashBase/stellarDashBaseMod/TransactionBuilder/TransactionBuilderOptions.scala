package typingsSlinky.stellarDashBase.stellarDashBaseMod.TransactionBuilder

import typingsSlinky.stellarDashBase.Anon_MaxTimeMinTime
import typingsSlinky.stellarDashBase.stellarDashBaseMod.Memo
import typingsSlinky.stellarDashBase.stellarDashBaseMod.MemoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionBuilderOptions extends js.Object {
  var fee: Double
  var memo: js.UndefOr[Memo[MemoType]] = js.undefined
  var networkPassphrase: js.UndefOr[String] = js.undefined
  var timebounds: js.UndefOr[Anon_MaxTimeMinTime] = js.undefined
}

object TransactionBuilderOptions {
  @scala.inline
  def apply(
    fee: Double,
    memo: Memo[MemoType] = null,
    networkPassphrase: String = null,
    timebounds: Anon_MaxTimeMinTime = null
  ): TransactionBuilderOptions = {
    val __obj = js.Dynamic.literal(fee = fee.asInstanceOf[js.Any])
    if (memo != null) __obj.updateDynamic("memo")(memo.asInstanceOf[js.Any])
    if (networkPassphrase != null) __obj.updateDynamic("networkPassphrase")(networkPassphrase.asInstanceOf[js.Any])
    if (timebounds != null) __obj.updateDynamic("timebounds")(timebounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionBuilderOptions]
  }
}

