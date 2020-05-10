package typingsSlinky.typedRestClient.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICertConfiguration extends js.Object {
  var caFile: js.UndefOr[String] = js.native
  var certFile: js.UndefOr[String] = js.native
  var keyFile: js.UndefOr[String] = js.native
  var passphrase: js.UndefOr[String] = js.native
}

object ICertConfiguration {
  @scala.inline
  def apply(): ICertConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICertConfiguration]
  }
  @scala.inline
  implicit class ICertConfigurationOps[Self <: ICertConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caFile")(js.undefined)
        ret
    }
    @scala.inline
    def withCertFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certFile")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFile")(js.undefined)
        ret
    }
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(js.undefined)
        ret
    }
  }
  
}

