package typingsSlinky.smtpServer.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.tlsMod.TlsOptions
import typingsSlinky.nodemailer.sharedMod.Logger
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMTPServerOptions extends TlsOptions {
  /**
    * optional boolean, if set to true allows authentication even if connection is not secured first
    */
  var allowInsecureAuth: js.UndefOr[Boolean] = js.native
  /**
    * optional array of allowed authentication methods, defaults to ['PLAIN', 'LOGIN'].
    * Only the methods listed in this array are allowed,
    * so if you set it to ['XOAUTH2'] then PLAIN and LOGIN are not available.
    * Use ['PLAIN', 'LOGIN', 'XOAUTH2'] to allow all three.
    * Authentication is only allowed in secure mode
    * (either the server is started with secure: true option or STARTTLS command is used)
    */
  var authMethods: js.UndefOr[js.Array[String]] = js.native
  /**
    * allow authentication, but do not require it
    */
  var authOptional: js.UndefOr[Boolean] = js.native
  /**
    * optional greeting message.
    * This message is appended to the default ESMTP response.
    */
  var banner: js.UndefOr[String] = js.native
  /**
    * How many millisceonds to wait before disconnecting pending
    * connections once `server.close()` has been called (defaults to 30 seconds)
    */
  var closeTimeout: js.UndefOr[ms] = js.native
  /**
    * optional boolean, if set to true then does not try to reverse resolve client hostname
    */
  var disableReverseLookup: js.UndefOr[Boolean] = js.native
  /**
    * optional array of disabled commands (see all supported commands here).
    * For example if you want to disable authentication,
    * use ['AUTH'] as this value.
    * If you want to allow authentication in clear text, set it to ['STARTTLS'].
    */
  var disabledCommands: js.UndefOr[js.Array[String]] = js.native
  /**
    * optional boolean, if set to true then does not show 8BITMIME in features list
    */
  var hide8BITMIME: js.UndefOr[Boolean] = js.native
  /**
    * optional boolean, if set to true then does not show PIPELINING in feature list
    */
  var hidePIPELINING: js.UndefOr[Boolean] = js.native
  /**
    * optional boolean, if set to true then does not show SMTPUTF8 in features list
    */
  var hideSMTPUTF8: js.UndefOr[Boolean] = js.native
   // TODO: ('AUTH' | 'STARTTLS' | 'XCLIENT' | 'XFORWARD')[];
  /**
    * optional boolean, if set to true then allow using STARTTLS
    * but do not advertise or require it. It only makes sense
    * when creating integration test servers for testing the scenario
    * where you want to try STARTTLS even when it is not advertised
    */
  var hideSTARTTLS: js.UndefOr[Boolean] = js.native
  /**
    * boolean, if set to true use LMTP protocol instead of SMTP
    */
  var lmtp: js.UndefOr[Boolean] = js.native
  /**
    * optional bunyan compatible logger instance.
    * If set to true then logs to console.
    * If value is not set or is false then nothing is logged
    */
  var logger: js.UndefOr[Logger | Boolean] = js.native
  /**
    * sets the maximum number of concurrently connected clients, defaults to Infinity
    */
  var maxClients: js.UndefOr[Double] = js.native
  /**
    * optional hostname of the server,
    * used for identifying to the client (defaults to os.hostname())
    */
  var name: js.UndefOr[String] = js.native
  /**
    * optional boolean, if set to true then upgrade sockets to TLS immediately after connection is established. Works with secure: true
    */
  var needsUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * The callback to handle authentications ([see details](https://github.com/andris9/smtp-server#handling-authentication))
    */
  var onAuth: js.UndefOr[
    js.Function3[
      /* auth */ SMTPServerAuthentication, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function2[
        /* err */ js.UndefOr[js.Error | Null], 
        /* response */ js.UndefOr[SMTPServerAuthenticationResponse], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  /**
    * the callback that informs about closed client connection
    */
  var onClose: js.UndefOr[
    js.Function2[
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  /**
    * The callback to handle the client connection. ([see details](https://github.com/andris9/smtp-server#validating-client-connection))
    */
  var onConnect: js.UndefOr[
    js.Function2[
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  /**
    * the callback to handle incoming messages ([see details](https://github.com/andris9/smtp-server#processing-incoming-message))
    */
  var onData: js.UndefOr[
    js.Function3[
      /* stream */ SMTPServerDataStream, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  /**
    * the callback to validate MAIL FROM commands ([see details](https://github.com/andris9/smtp-server#validating-sender-addresses))
    */
  var onMailFrom: js.UndefOr[
    js.Function3[
      /* address */ SMTPServerAddress, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  /**
    * The callback to validate RCPT TO commands ([see details](https://github.com/andris9/smtp-server#validating-recipient-addresses))
    */
  var onRcptTo: js.UndefOr[
    js.Function3[
      /* address */ SMTPServerAddress, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  /**
    * if true, the connection will use TLS. The default is false.
    * If the server doesn't start in TLS mode,
    * it is still possible to upgrade clear text socket to
    * TLS socket with the STARTTLS command (unless you disable support for it).
    * If secure is true, additional tls options for tls.
    * createServer can be added directly onto this options object.
    */
  var secure: js.UndefOr[Boolean] = js.native
  /** indicate an TLS server where TLS is handled upstream */
  var secured: js.UndefOr[Boolean] = js.native
  /**
    * optional maximum allowed message size in bytes
    * ([see details](https://github.com/andris9/smtp-server#using-size-extension))
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * optional Map or an object of TLS options for SNI where servername is the key. Overrided by SNICallback.
    */
  var sniOptions: js.UndefOr[StringDictionary[TlsOptions] | (Map[String, TlsOptions])] = js.native
  /**
    * How many milliseconds of inactivity to allow before disconnecting the client (defaults to 1 minute)
    */
  var socketTimeout: js.UndefOr[ms] = js.native
  /**
    * boolean, if set to true expects to be behind a proxy that emits a
    * [PROXY](http://www.haproxy.org/download/1.5/doc/proxy-protocol.txt) header (version 1 only)
    */
  var useProxy: js.UndefOr[Boolean] = js.native
  /**
    * boolean, if set to true, enables usage of
    * [XCLIENT](http://www.postfix.org/XCLIENT_README.html) extension to override connection properties.
    * See session.xClient (Map object) for the details provided by the client
    */
  var useXClient: js.UndefOr[Boolean] = js.native
  /**
    * boolean, if set to true, enables usage of [XFORWARD](http://www.postfix.org/XFORWARD_README.html) extension.
    * See session.xForward (Map object) for the details provided by the client
    */
  var useXForward: js.UndefOr[Boolean] = js.native
}

object SMTPServerOptions {
  @scala.inline
  def apply(): SMTPServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMTPServerOptions]
  }
  @scala.inline
  implicit class SMTPServerOptionsOps[Self <: SMTPServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowInsecureAuth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsecureAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInsecureAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsecureAuth")(js.undefined)
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
    def withAuthOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authOptional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authOptional")(js.undefined)
        ret
    }
    @scala.inline
    def withBanner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBanner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseTimeout(value: ms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableReverseLookup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableReverseLookup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableReverseLookup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableReverseLookup")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledCommands(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledCommands")(js.undefined)
        ret
    }
    @scala.inline
    def withHide8BITMIME(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide8BITMIME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide8BITMIME: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide8BITMIME")(js.undefined)
        ret
    }
    @scala.inline
    def withHidePIPELINING(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePIPELINING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidePIPELINING: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePIPELINING")(js.undefined)
        ret
    }
    @scala.inline
    def withHideSMTPUTF8(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSMTPUTF8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSMTPUTF8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSMTPUTF8")(js.undefined)
        ret
    }
    @scala.inline
    def withHideSTARTTLS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSTARTTLS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSTARTTLS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSTARTTLS")(js.undefined)
        ret
    }
    @scala.inline
    def withLmtp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lmtp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLmtp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lmtp")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: Logger | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
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
    def withNeedsUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedsUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAuth(
      value: (/* auth */ SMTPServerAuthentication, /* session */ SMTPServerSession, /* callback */ js.Function2[
          /* err */ js.UndefOr[js.Error | Null], 
          /* response */ js.UndefOr[SMTPServerAuthenticationResponse], 
          Unit
        ]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuth")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(
      value: (/* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConnect(
      value: (/* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnData(
      value: (/* stream */ SMTPServerDataStream, /* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onData")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMailFrom(
      value: (/* address */ SMTPServerAddress, /* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMailFrom")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnMailFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMailFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRcptTo(
      value: (/* address */ SMTPServerAddress, /* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRcptTo")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnRcptTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRcptTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
    @scala.inline
    def withSecured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secured")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSniOptions(value: StringDictionary[TlsOptions] | (Map[String, TlsOptions])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sniOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSniOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sniOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketTimeout(value: ms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUseProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withUseXClient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useXClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseXClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useXClient")(js.undefined)
        ret
    }
    @scala.inline
    def withUseXForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useXForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseXForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useXForward")(js.undefined)
        ret
    }
  }
  
}

