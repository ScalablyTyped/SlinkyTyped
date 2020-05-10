package typingsSlinky.twit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends ConfigKeys {
  var app_only_auth: js.UndefOr[Boolean] = js.native
  var strictSSL: js.UndefOr[Boolean] = js.native
  var timeout_ms: js.UndefOr[Double] = js.native
  var trusted_cert_fingerprints: js.UndefOr[js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(consumer_key: String, consumer_secret: String): Options = {
    val __obj = js.Dynamic.literal(consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp_only_auth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_only_auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp_only_auth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_only_auth")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictSSL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictSSL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictSSL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictSSL")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withTrusted_cert_fingerprints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusted_cert_fingerprints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrusted_cert_fingerprints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusted_cert_fingerprints")(js.undefined)
        ret
    }
  }
  
}

