package typingsSlinky.stellarSdk

import typingsSlinky.stellarSdk.horizonApiMod.Horizon.ResponseLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in 'account' | 'ledger' | 'operations' | 'effects' | 'succeeds' | 'precedes' | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink} */
@js.native
trait keyinaccountledgeroperati extends js.Object {
  var account: ResponseLink = js.native
  var effects: ResponseLink = js.native
  var ledger: ResponseLink = js.native
  var operations: ResponseLink = js.native
  var precedes: ResponseLink = js.native
  var self: ResponseLink = js.native
  var succeeds: ResponseLink = js.native
}

object keyinaccountledgeroperati {
  @scala.inline
  def apply(
    account: ResponseLink,
    effects: ResponseLink,
    ledger: ResponseLink,
    operations: ResponseLink,
    precedes: ResponseLink,
    self: ResponseLink,
    succeeds: ResponseLink
  ): keyinaccountledgeroperati = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], ledger = ledger.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], precedes = precedes.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], succeeds = succeeds.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinaccountledgeroperati]
  }
  @scala.inline
  implicit class keyinaccountledgeroperatiOps[Self <: keyinaccountledgeroperati] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: ResponseLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffects(value: ResponseLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLedger(value: ResponseLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ledger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperations(value: ResponseLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrecedes(value: ResponseLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precedes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: ResponseLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeds(value: ResponseLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

