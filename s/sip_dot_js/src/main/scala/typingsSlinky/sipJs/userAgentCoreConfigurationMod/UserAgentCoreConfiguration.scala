package typingsSlinky.sipJs.userAgentCoreConfigurationMod

import typingsSlinky.sipJs.coreTransportMod.Transport
import typingsSlinky.sipJs.logMod.LoggerFactory
import typingsSlinky.sipJs.messagesMod.DigestAuthentication
import typingsSlinky.sipJs.messagesMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentCoreConfiguration extends js.Object {
  /**
    * Address-of-Record (AOR).
    * @remarks
    * https://tools.ietf.org/html/rfc3261#section-6
    */
  var aor: URI = js.native
  /**
    * Contact.
    * @remarks
    * https://tools.ietf.org/html/rfc3261#section-8.1.1.8
    */
  var contact: Contact = js.native
  /**
    * From header display name.
    */
  var displayName: String = js.native
  /**
    * Force Via header field transport to TCP.
    */
  var hackViaTcp: Boolean = js.native
  /**
    * Logger factory.
    */
  var loggerFactory: LoggerFactory = js.native
  /**
    * Preloaded route set.
    */
  var routeSet: js.Array[String] = js.native
  /**
    * Unique instance id.
    */
  var sipjsId: String = js.native
  /**
    * Option tags of supported SIP extenstions.
    */
  var supportedOptionTags: js.Array[String] = js.native
  /**
    * Option tags of supported SIP extenstions.
    * Used in resposnes.
    * @remarks
    * FIXME: Make this go away.
    */
  var supportedOptionTagsResponse: js.Array[String] = js.native
  /**
    * User-Agent header field value.
    * @remarks
    * https://tools.ietf.org/html/rfc3261#section-20.41
    */
  var userAgentHeaderFieldValue: js.UndefOr[String] = js.native
  /**
    * Force use of "rport" Via header field parameter.
    * @remarks
    * https://www.ietf.org/rfc/rfc3581.txt
    */
  var viaForceRport: Boolean = js.native
  /**
    * Via header field host name or network address.
    * @remarks
    * The Via header field indicates the path taken by the request so far
    * and indicates the path that should be followed in routing responses.
    */
  var viaHost: String = js.native
  /**
    * DEPRECATED
    * Authentication factory function.
    */
  def authenticationFactory(): js.UndefOr[DigestAuthentication] = js.native
  /**
    * DEPRECATED: This is a hack to get around `Transport`
    * requiring the `UA` to start for construction.
    */
  def transportAccessor(): js.UndefOr[Transport] = js.native
}

object UserAgentCoreConfiguration {
  @scala.inline
  def apply(
    aor: URI,
    authenticationFactory: () => js.UndefOr[DigestAuthentication],
    contact: Contact,
    displayName: String,
    hackViaTcp: Boolean,
    loggerFactory: LoggerFactory,
    routeSet: js.Array[String],
    sipjsId: String,
    supportedOptionTags: js.Array[String],
    supportedOptionTagsResponse: js.Array[String],
    transportAccessor: () => js.UndefOr[Transport],
    viaForceRport: Boolean,
    viaHost: String
  ): UserAgentCoreConfiguration = {
    val __obj = js.Dynamic.literal(aor = aor.asInstanceOf[js.Any], authenticationFactory = js.Any.fromFunction0(authenticationFactory), contact = contact.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], hackViaTcp = hackViaTcp.asInstanceOf[js.Any], loggerFactory = loggerFactory.asInstanceOf[js.Any], routeSet = routeSet.asInstanceOf[js.Any], sipjsId = sipjsId.asInstanceOf[js.Any], supportedOptionTags = supportedOptionTags.asInstanceOf[js.Any], supportedOptionTagsResponse = supportedOptionTagsResponse.asInstanceOf[js.Any], transportAccessor = js.Any.fromFunction0(transportAccessor), viaForceRport = viaForceRport.asInstanceOf[js.Any], viaHost = viaHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentCoreConfiguration]
  }
  @scala.inline
  implicit class UserAgentCoreConfigurationOps[Self <: UserAgentCoreConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAor(value: URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationFactory(value: () => js.UndefOr[DigestAuthentication]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationFactory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContact(value: Contact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHackViaTcp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackViaTcp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoggerFactory(value: LoggerFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggerFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouteSet(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSipjsId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipjsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedOptionTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOptionTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedOptionTagsResponse(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOptionTagsResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportAccessor(value: () => js.UndefOr[Transport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportAccessor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withViaForceRport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viaForceRport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViaHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viaHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAgentHeaderFieldValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgentHeaderFieldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgentHeaderFieldValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgentHeaderFieldValue")(js.undefined)
        ret
    }
  }
  
}

