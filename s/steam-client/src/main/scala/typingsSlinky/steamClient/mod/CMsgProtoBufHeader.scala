package typingsSlinky.steamClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CMsgProtoBufHeader extends js.Object {
  var admin_spoofing_user: js.UndefOr[Boolean] = js.native
  var auth_account_flags: js.UndefOr[Double] = js.native
  var client_sessionid: js.UndefOr[Double] = js.native
  var eresult: js.UndefOr[Double] = js.native
  var error_message: js.UndefOr[String] = js.native
  var forward_to_sysid: js.UndefOr[js.Array[Double]] = js.native
  var ip: js.UndefOr[Double] = js.native
  var is_from_external_source: js.UndefOr[Boolean] = js.native
  var jobid_source: js.UndefOr[String] = js.native
  var jobid_target: js.UndefOr[String] = js.native
  var messageid: js.UndefOr[String] = js.native
  var publisher_group_id: js.UndefOr[Double] = js.native
  var routing_appid: js.UndefOr[Double] = js.native
  var seq_num: js.UndefOr[Double] = js.native
  var steamid: js.UndefOr[String] = js.native
  var sysid: js.UndefOr[Double] = js.native
  var target_job_name: js.UndefOr[String] = js.native
  var token_source: js.UndefOr[Double] = js.native
  var trace_tag: js.UndefOr[String] = js.native
  var transport_error: js.UndefOr[Double] = js.native
  var webapi_key_id: js.UndefOr[Double] = js.native
}

object CMsgProtoBufHeader {
  @scala.inline
  def apply(): CMsgProtoBufHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CMsgProtoBufHeader]
  }
  @scala.inline
  implicit class CMsgProtoBufHeaderOps[Self <: CMsgProtoBufHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdmin_spoofing_user(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin_spoofing_user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdmin_spoofing_user: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin_spoofing_user")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth_account_flags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_account_flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth_account_flags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_account_flags")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_sessionid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_sessionid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_sessionid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_sessionid")(js.undefined)
        ret
    }
    @scala.inline
    def withEresult(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eresult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEresult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eresult")(js.undefined)
        ret
    }
    @scala.inline
    def withError_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_message")(js.undefined)
        ret
    }
    @scala.inline
    def withForward_to_sysid(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_to_sysid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForward_to_sysid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_to_sysid")(js.undefined)
        ret
    }
    @scala.inline
    def withIp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_from_external_source(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_from_external_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_from_external_source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_from_external_source")(js.undefined)
        ret
    }
    @scala.inline
    def withJobid_source(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobid_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobid_source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobid_source")(js.undefined)
        ret
    }
    @scala.inline
    def withJobid_target(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobid_target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobid_target: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobid_target")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageid")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisher_group_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher_group_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisher_group_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher_group_id")(js.undefined)
        ret
    }
    @scala.inline
    def withRouting_appid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing_appid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouting_appid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing_appid")(js.undefined)
        ret
    }
    @scala.inline
    def withSeq_num(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seq_num")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeq_num: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seq_num")(js.undefined)
        ret
    }
    @scala.inline
    def withSteamid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steamid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteamid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steamid")(js.undefined)
        ret
    }
    @scala.inline
    def withSysid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSysid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysid")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_job_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_job_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_job_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_job_name")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_source(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_source")(js.undefined)
        ret
    }
    @scala.inline
    def withTrace_tag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace_tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrace_tag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace_tag")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport_error(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport_error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport_error: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport_error")(js.undefined)
        ret
    }
    @scala.inline
    def withWebapi_key_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webapi_key_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebapi_key_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webapi_key_id")(js.undefined)
        ret
    }
  }
  
}

