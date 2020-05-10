package typingsSlinky.xummApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccount extends js.Object {
  var account: String | Null = js.native
  var dispatched_result: String | Null = js.native
  var dispatched_to: String | Null = js.native
  var hex: String | Null = js.native
  var multisign_account: String | Null = js.native
  var resolved_at: String | Null = js.native
  var txid: String | Null = js.native
}

object AnonAccount {
  @scala.inline
  def apply(): AnonAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAccount]
  }
  @scala.inline
  implicit class AnonAccountOps[Self <: AnonAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(null)
        ret
    }
    @scala.inline
    def withDispatched_result(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatched_result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispatched_resultNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatched_result")(null)
        ret
    }
    @scala.inline
    def withDispatched_to(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatched_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispatched_toNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatched_to")(null)
        ret
    }
    @scala.inline
    def withHex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHexNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(null)
        ret
    }
    @scala.inline
    def withMultisign_account(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multisign_account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultisign_accountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multisign_account")(null)
        ret
    }
    @scala.inline
    def withResolved_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolved_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved_at")(null)
        ret
    }
    @scala.inline
    def withTxid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTxidNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txid")(null)
        ret
    }
  }
  
}

