package typingsSlinky.steamLogin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiddlewareOptions extends js.Object {
  var apiKey: String = js.native
  var realm: String = js.native
  var useSession: js.UndefOr[Boolean] = js.native
  var verify: String = js.native
}

object MiddlewareOptions {
  @scala.inline
  def apply(apiKey: String, realm: String, verify: String): MiddlewareOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], verify = verify.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareOptions]
  }
  @scala.inline
  implicit class MiddlewareOptionsOps[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerify(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSession")(js.undefined)
        ret
    }
  }
  
}

