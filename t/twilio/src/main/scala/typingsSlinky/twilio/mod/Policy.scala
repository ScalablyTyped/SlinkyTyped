package typingsSlinky.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Policy extends js.Object {
   // Map<string, FilterRequirement>, where FilterRequirement ::= Map<string, boolean>
  var allow: Boolean = js.native
  var method: String = js.native
   // Map<string, FilterRequirement>, where FilterRequirement ::= Map<string, boolean>
  var post_filter: js.UndefOr[js.Any] = js.native
  var query_filter: js.UndefOr[js.Any] = js.native
  var url: String = js.native
}

object Policy {
  @scala.inline
  def apply(allow: Boolean, method: String, url: String): Policy = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
  @scala.inline
  implicit class PolicyOps[Self <: Policy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPost_filter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPost_filter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_filter")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery_filter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery_filter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_filter")(js.undefined)
        ret
    }
  }
  
}

