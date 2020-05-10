package typingsSlinky.solutionCenterCommunicator.ScCommunicator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends js.Object {
  /**
    * Domain where to set a cookie in case it's needed for that environment
    */
  var DOMAIN: String = js.native
  /**
    * URL where to reach the GoodData service API
    */
  var GOODDATA_SERVICE: js.UndefOr[String] = js.native
  /**
    * URL where to reach the merchant management service API
    */
  var MERCHANT_SERVICE: js.UndefOr[String] = js.native
  /**
    * URL where to reach the module service API
    */
  var MODULE_SERVICE: js.UndefOr[String] = js.native
  /**
    * Name of the environment
    */
  var NAME: String = js.native
  /**
    * In case that the domain is localhost, a port can be also specified
    */
  var PORT: js.UndefOr[String] = js.native
  /**
    * URL where to reach the token management service API
    */
  var TOKEN_SERVICE: js.UndefOr[String] = js.native
  /**
    * URL where to reach the frontend of the environment
    */
  var URL: String = js.native
  /**
    * URL where to reach the user management service API
    */
  var USER_SERVICE: js.UndefOr[String] = js.native
  /**
    * URL where to reach the new user service API
    */
  var USER_SERVICE_NEW: js.UndefOr[String] = js.native
}

object Environment {
  @scala.inline
  def apply(DOMAIN: String, NAME: String, URL: String): Environment = {
    val __obj = js.Dynamic.literal(DOMAIN = DOMAIN.asInstanceOf[js.Any], NAME = NAME.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDOMAIN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOMAIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNAME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGOODDATA_SERVICE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GOODDATA_SERVICE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGOODDATA_SERVICE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GOODDATA_SERVICE")(js.undefined)
        ret
    }
    @scala.inline
    def withMERCHANT_SERVICE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MERCHANT_SERVICE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMERCHANT_SERVICE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MERCHANT_SERVICE")(js.undefined)
        ret
    }
    @scala.inline
    def withMODULE_SERVICE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODULE_SERVICE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMODULE_SERVICE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODULE_SERVICE")(js.undefined)
        ret
    }
    @scala.inline
    def withPORT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PORT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPORT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PORT")(js.undefined)
        ret
    }
    @scala.inline
    def withTOKEN_SERVICE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOKEN_SERVICE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTOKEN_SERVICE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOKEN_SERVICE")(js.undefined)
        ret
    }
    @scala.inline
    def withUSER_SERVICE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USER_SERVICE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUSER_SERVICE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USER_SERVICE")(js.undefined)
        ret
    }
    @scala.inline
    def withUSER_SERVICE_NEW(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USER_SERVICE_NEW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUSER_SERVICE_NEW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USER_SERVICE_NEW")(js.undefined)
        ret
    }
  }
  
}

