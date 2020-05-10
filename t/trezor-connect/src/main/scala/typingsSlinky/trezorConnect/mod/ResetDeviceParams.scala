package typingsSlinky.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetDeviceParams extends CommonParams {
  var label: js.UndefOr[String] = js.native
  var noBackup: js.UndefOr[Boolean] = js.native
  var passphraseProtection: js.UndefOr[Boolean] = js.native
  var pinProtection: js.UndefOr[Boolean] = js.native
  var skipBackup: js.UndefOr[Boolean] = js.native
  var strength: js.UndefOr[Double] = js.native
  var u2fCounter: js.UndefOr[Double] = js.native
}

object ResetDeviceParams {
  @scala.inline
  def apply(): ResetDeviceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetDeviceParams]
  }
  @scala.inline
  implicit class ResetDeviceParamsOps[Self <: ResetDeviceParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withNoBackup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBackup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoBackup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBackup")(js.undefined)
        ret
    }
    @scala.inline
    def withPassphraseProtection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphraseProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassphraseProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphraseProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withPinProtection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipBackup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBackup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipBackup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBackup")(js.undefined)
        ret
    }
    @scala.inline
    def withStrength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strength")(js.undefined)
        ret
    }
    @scala.inline
    def withU2fCounter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("u2fCounter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutU2fCounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("u2fCounter")(js.undefined)
        ret
    }
  }
  
}

