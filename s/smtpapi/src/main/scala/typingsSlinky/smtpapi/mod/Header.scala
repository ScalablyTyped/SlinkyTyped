package typingsSlinky.smtpapi.mod

import typingsSlinky.smtpapi.smtpapiStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header extends js.Object {
  var asm_group_id: Double = js.native
  var category: js.Array[String] = js.native
  var filters: js.Object = js.native
  var ip_pool: String = js.native
  var section: js.Object = js.native
  var send_at: _empty | Double = js.native
  var send_each_at: js.Array[Double] = js.native
  var sub: js.Object = js.native
  var to: js.Array[String] = js.native
  var unique_args: js.Object = js.native
}

object Header {
  @scala.inline
  def apply(
    asm_group_id: Double,
    category: js.Array[String],
    filters: js.Object,
    ip_pool: String,
    section: js.Object,
    send_at: _empty | Double,
    send_each_at: js.Array[Double],
    sub: js.Object,
    to: js.Array[String],
    unique_args: js.Object
  ): Header = {
    val __obj = js.Dynamic.literal(asm_group_id = asm_group_id.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], ip_pool = ip_pool.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], send_at = send_at.asInstanceOf[js.Any], send_each_at = send_each_at.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], unique_args = unique_args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  @scala.inline
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsm_group_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asm_group_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp_pool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSection(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSend_at(value: _empty | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSend_each_at(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_each_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSub(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnique_args(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique_args")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

