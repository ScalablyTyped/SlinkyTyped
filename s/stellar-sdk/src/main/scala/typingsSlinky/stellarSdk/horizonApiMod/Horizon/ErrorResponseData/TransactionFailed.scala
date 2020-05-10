package typingsSlinky.stellarSdk.horizonApiMod.Horizon.ErrorResponseData

import typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedExtras
import typingsSlinky.stellarSdk.stellarSdkNumbers.`400`
import typingsSlinky.stellarSdk.stellarSdkStrings.`Transaction Failed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionFailed extends Base {
  var extras: TransactionFailedExtras = js.native
  @JSName("status")
  var status_TransactionFailed: `400` = js.native
  @JSName("title")
  var title_TransactionFailed: `Transaction Failed` = js.native
}

object TransactionFailed {
  @scala.inline
  def apply(
    details: String,
    extras: TransactionFailedExtras,
    instance: String,
    status: `400`,
    title: `Transaction Failed`,
    `type`: String
  ): TransactionFailed = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionFailed]
  }
  @scala.inline
  implicit class TransactionFailedOps[Self <: TransactionFailed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtras(value: TransactionFailedExtras): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: `400`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: `Transaction Failed`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

