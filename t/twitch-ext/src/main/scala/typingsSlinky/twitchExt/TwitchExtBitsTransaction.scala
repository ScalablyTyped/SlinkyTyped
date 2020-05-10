package typingsSlinky.twitchExt

import typingsSlinky.twitchExt.twitchExtStrings.CURRENT_USER
import typingsSlinky.twitchExt.twitchExtStrings.OTHER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwitchExtBitsTransaction extends js.Object {
  /**
  	 * Display name of the user who executed the Bits in Extensions transaction.
  	 */
  var displayName: String = js.native
  var initiator: CURRENT_USER | OTHER = js.native
  /**
  	 * Full product object from getProducts call
  	 */
  var product: TwitchExtBitsProduct = js.native
  /**
  	 * ID of the transaction.
  	 */
  var transactionID: String = js.native
  /**
  	 * JWT containing the following transaction information in the payload.
  	 * The JWT is a large, base64-encoded string. It can be verified using your developer secret.
  	 */
  var transactionReceipt: String = js.native
  /**
  	 * Twitch ID of the user who executed the transaction.
  	 */
  var userId: String = js.native
}

object TwitchExtBitsTransaction {
  @scala.inline
  def apply(
    displayName: String,
    initiator: CURRENT_USER | OTHER,
    product: TwitchExtBitsProduct,
    transactionID: String,
    transactionReceipt: String,
    userId: String
  ): TwitchExtBitsTransaction = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], initiator = initiator.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], transactionReceipt = transactionReceipt.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtBitsTransaction]
  }
  @scala.inline
  implicit class TwitchExtBitsTransactionOps[Self <: TwitchExtBitsTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitiator(value: CURRENT_USER | OTHER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduct(value: TwitchExtBitsProduct): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionReceipt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionReceipt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

