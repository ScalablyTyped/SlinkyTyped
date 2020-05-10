package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushSubscriptionJSON extends js.Object {
  var endpoint: js.UndefOr[java.lang.String] = js.native
  var expirationTime: js.UndefOr[Double | Null] = js.native
  var keys: js.UndefOr[Record[java.lang.String, java.lang.String]] = js.native
}

object PushSubscriptionJSON {
  @scala.inline
  def apply(): PushSubscriptionJSON = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushSubscriptionJSON]
  }
  @scala.inline
  implicit class PushSubscriptionJSONOps[Self <: org.scalajs.dom.experimental.push.PushSubscriptionJSON] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(null)
        ret
    }
    @scala.inline
    def withKeys(value: Record[java.lang.String, java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
  }
  
}

