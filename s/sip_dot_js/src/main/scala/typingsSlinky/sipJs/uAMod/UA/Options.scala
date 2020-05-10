package typingsSlinky.sipJs.uAMod.UA

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.sipJs.AnonBuiltinEnabled
import typingsSlinky.sipJs.coreMod.DigestAuthentication
import typingsSlinky.sipJs.coreMod.URI
import typingsSlinky.sipJs.libConstantsMod.C.supported
import typingsSlinky.sipJs.libSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typingsSlinky.sipJs.libSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactoryOptions
import typingsSlinky.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandler
import typingsSlinky.sipJs.libSessionMod.InviteClientContext
import typingsSlinky.sipJs.libSessionMod.InviteServerContext
import typingsSlinky.sipJs.libTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowLegacyNotifications: js.UndefOr[Boolean] = js.native
  var allowOutOfDialogRefers: js.UndefOr[Boolean] = js.native
  var authenticationFactory: js.UndefOr[js.Function1[/* ua */ typingsSlinky.sipJs.uAMod.UA, DigestAuthentication | _]] = js.native
  var authorizationUser: js.UndefOr[String] = js.native
  var autostart: js.UndefOr[Boolean] = js.native
  var autostop: js.UndefOr[Boolean] = js.native
  var displayName: js.UndefOr[String] = js.native
  var dtmfType: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DtmfType */ js.Any
  ] = js.native
  var experimentalFeatures: js.UndefOr[Boolean] = js.native
  var extraSupported: js.UndefOr[js.Array[String]] = js.native
  var forceRport: js.UndefOr[Boolean] = js.native
  var hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.native
  var hackIpInContact: js.UndefOr[Boolean] = js.native
  var hackViaTcp: js.UndefOr[Boolean] = js.native
  var hackWssInTransport: js.UndefOr[Boolean] = js.native
  var hostportParams: js.UndefOr[js.Any] = js.native
  var log: js.UndefOr[AnonBuiltinEnabled] = js.native
  var noAnswerTimeout: js.UndefOr[Double] = js.native
  var password: js.UndefOr[String] = js.native
  var register: js.UndefOr[Boolean] = js.native
  var registerOptions: js.UndefOr[RegisterOptions] = js.native
  var rel100: js.UndefOr[supported] = js.native
  var replaces: js.UndefOr[supported] = js.native
  var sessionDescriptionHandlerFactory: js.UndefOr[SessionDescriptionHandlerFactory] = js.native
  var sessionDescriptionHandlerFactoryOptions: js.UndefOr[SessionDescriptionHandlerFactoryOptions] = js.native
  var sipjsId: js.UndefOr[String] = js.native
  var transportConstructor: js.UndefOr[Instantiable2[/* logger */ js.Any, /* options */ js.Any, Transport]] = js.native
  var transportOptions: js.UndefOr[js.Any] = js.native
  var uri: js.UndefOr[String | URI] = js.native
  var usePreloadedRoute: js.UndefOr[Boolean] = js.native
  var userAgentString: js.UndefOr[String] = js.native
  var viaHost: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowLegacyNotifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLegacyNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowLegacyNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLegacyNotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowOutOfDialogRefers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOutOfDialogRefers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOutOfDialogRefers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOutOfDialogRefers")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthenticationFactory(value: /* ua */ typingsSlinky.sipJs.uAMod.UA => DigestAuthentication | _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationFactory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAuthenticationFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizationUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationUser")(js.undefined)
        ret
    }
    @scala.inline
    def withAutostart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutostart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostart")(js.undefined)
        ret
    }
    @scala.inline
    def withAutostop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutostop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostop")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withDtmfType(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DtmfType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtmfType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtmfType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtmfType")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimentalFeatures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentalFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraSupported(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraSupported")(js.undefined)
        ret
    }
    @scala.inline
    def withForceRport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceRport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRport")(js.undefined)
        ret
    }
    @scala.inline
    def withHackAllowUnregisteredOptionTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackAllowUnregisteredOptionTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHackAllowUnregisteredOptionTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackAllowUnregisteredOptionTags")(js.undefined)
        ret
    }
    @scala.inline
    def withHackIpInContact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackIpInContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHackIpInContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackIpInContact")(js.undefined)
        ret
    }
    @scala.inline
    def withHackViaTcp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackViaTcp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHackViaTcp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackViaTcp")(js.undefined)
        ret
    }
    @scala.inline
    def withHackWssInTransport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackWssInTransport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHackWssInTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackWssInTransport")(js.undefined)
        ret
    }
    @scala.inline
    def withHostportParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostportParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostportParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostportParams")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: AnonBuiltinEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withNoAnswerTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAnswerTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoAnswerTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAnswerTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withRegister(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterOptions(value: RegisterOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisterOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRel100(value: supported): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rel100")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRel100: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rel100")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaces(value: supported): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaces")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionDescriptionHandlerFactory(
      value: (/* session */ InviteClientContext | InviteServerContext, /* options */ js.UndefOr[SessionDescriptionHandlerFactoryOptions]) => SessionDescriptionHandler
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDescriptionHandlerFactory")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSessionDescriptionHandlerFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDescriptionHandlerFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionDescriptionHandlerFactoryOptions(value: SessionDescriptionHandlerFactoryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDescriptionHandlerFactoryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionDescriptionHandlerFactoryOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDescriptionHandlerFactoryOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSipjsId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipjsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSipjsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipjsId")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportConstructor(value: Instantiable2[/* logger */ js.Any, /* options */ js.Any, Transport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportConstructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportConstructor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportConstructor")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String | URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePreloadedRoute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePreloadedRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePreloadedRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePreloadedRoute")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgentString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgentString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgentString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgentString")(js.undefined)
        ret
    }
    @scala.inline
    def withViaHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viaHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViaHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viaHost")(js.undefined)
        ret
    }
  }
  
}

