package typingsSlinky.simplesmtp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmtpServerOptions extends js.Object {
  /**
  	 * greeting banner that is sent to the client on connection
  	 */
  var SMTPBanner: js.UndefOr[String] = js.native
  /**
  	 * allowed authentication methods, defaults to <code>['PLAIN', 'LOGIN']</code>
  	 */
  var authMethods: js.UndefOr[js.Array[String]] = js.native
  /**
  	 * TLS credentials
  	 */
  var credentials: js.UndefOr[js.Any] = js.native
  /**
  	 * if set to true, print out messages about the connection
  	 */
  var debug: js.UndefOr[Boolean] = js.native
  /**
  	 * if set, do not validate sender domains
  	 */
  var disableDNSValidation: js.UndefOr[Boolean] = js.native
  /**
  	 * if set, support HELO only
  	 */
  var disableEHLO: js.UndefOr[Boolean] = js.native
  /**
  	 * if set to true, client may authenticate itself but don't have to
  	 */
  var enableAuthentication: js.UndefOr[Boolean] = js.native
  /**
  	 * if set, allow client do not use STARTTLS
  	 */
  var ignoreTLS: js.UndefOr[Boolean] = js.native
  /**
  	 * if set, limit the number of simultaneous connections to the server
  	 */
  var maxClients: js.UndefOr[Double] = js.native
  /**
  	 * maximum size of an e-mail in bytes
  	 */
  var maxSize: js.UndefOr[Double] = js.native
  /**
  	 * the hostname of the server, will be used for informational messages
  	 */
  var name: js.UndefOr[String] = js.native
  /**
  	 * if set to true, require that the client must authenticate itself
  	 */
  var requireAuthentication: js.UndefOr[Boolean] = js.native
  /**
  	 * start a server on secure connection
  	 */
  var secureConnection: js.UndefOr[Boolean] = js.native
  /**
  	 * client timeout in milliseconds, defaults to 60 000
  	 */
  var timeout: js.UndefOr[Double] = js.native
}

object SmtpServerOptions {
  @scala.inline
  def apply(): SmtpServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmtpServerOptions]
  }
  @scala.inline
  implicit class SmtpServerOptionsOps[Self <: SmtpServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSMTPBanner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMTPBanner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSMTPBanner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMTPBanner")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDNSValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDNSValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDNSValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDNSValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableEHLO(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEHLO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableEHLO: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEHLO")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAuthentication(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAuthentication")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreTLS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTLS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreTLS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTLS")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxClients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxClients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxClients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxClients")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireAuthentication(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireAuthentication")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureConnection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

