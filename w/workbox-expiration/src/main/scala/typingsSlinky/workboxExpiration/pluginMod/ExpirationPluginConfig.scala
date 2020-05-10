package typingsSlinky.workboxExpiration.pluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpirationPluginConfig extends js.Object {
  var maxAgeSeconds: js.UndefOr[Double] = js.native
  var maxEntries: js.UndefOr[Double] = js.native
  var purgeOnQuotaError: js.UndefOr[Boolean] = js.native
}

object ExpirationPluginConfig {
  @scala.inline
  def apply(): ExpirationPluginConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpirationPluginConfig]
  }
  @scala.inline
  implicit class ExpirationPluginConfigOps[Self <: ExpirationPluginConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAgeSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAgeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withPurgeOnQuotaError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purgeOnQuotaError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurgeOnQuotaError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purgeOnQuotaError")(js.undefined)
        ret
    }
  }
  
}

