package typingsSlinky.yandexMoneySdk.YandexMoneySDK.ExternalPayment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessOptions extends js.Object {
  var csc: js.UndefOr[String] = js.native
  var ext_auth_fail_uri: String = js.native
  // instance_id: string; // the method always overwrites this value
  var ext_auth_success_uri: String = js.native
  var money_source_token: js.UndefOr[String] = js.native
  var request_id: String = js.native
  var request_token: js.UndefOr[Boolean] = js.native
}

object ProcessOptions {
  @scala.inline
  def apply(ext_auth_fail_uri: String, ext_auth_success_uri: String, request_id: String): ProcessOptions = {
    val __obj = js.Dynamic.literal(ext_auth_fail_uri = ext_auth_fail_uri.asInstanceOf[js.Any], ext_auth_success_uri = ext_auth_success_uri.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessOptions]
  }
  @scala.inline
  implicit class ProcessOptionsOps[Self <: ProcessOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExt_auth_fail_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext_auth_fail_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExt_auth_success_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext_auth_success_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csc")(js.undefined)
        ret
    }
    @scala.inline
    def withMoney_source_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("money_source_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoney_source_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("money_source_token")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest_token(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_token")(js.undefined)
        ret
    }
  }
  
}

