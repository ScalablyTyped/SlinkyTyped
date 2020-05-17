package typingsSlinky.stellarBase.mod.TransactionBuilder

import typingsSlinky.stellarBase.anon.MinTime
import typingsSlinky.stellarBase.mod.Memo
import typingsSlinky.stellarBase.mod.MemoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionBuilderOptions extends js.Object {
  var fee: Double = js.native
  var memo: js.UndefOr[Memo[MemoType]] = js.native
  var networkPassphrase: js.UndefOr[String] = js.native
  var timebounds: js.UndefOr[MinTime] = js.native
}

object TransactionBuilderOptions {
  @scala.inline
  def apply(fee: Double): TransactionBuilderOptions = {
    val __obj = js.Dynamic.literal(fee = fee.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionBuilderOptions]
  }
  @scala.inline
  implicit class TransactionBuilderOptionsOps[Self <: TransactionBuilderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFee(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemo(value: Memo[MemoType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memo")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkPassphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkPassphrase")(js.undefined)
        ret
    }
    @scala.inline
    def withTimebounds(value: MinTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timebounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimebounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timebounds")(js.undefined)
        ret
    }
  }
  
}

