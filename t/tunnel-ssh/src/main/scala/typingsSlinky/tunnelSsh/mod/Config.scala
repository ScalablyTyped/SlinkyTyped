package typingsSlinky.tunnelSsh.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.tunnelSsh.AnonCipher
import typingsSlinky.tunnelSsh.tunnelSshStrings.force
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var agent: js.UndefOr[String] = js.native
  var agentForward: js.UndefOr[Boolean] = js.native
  var algorithms: js.UndefOr[AnonCipher] = js.native
  var authHandler: js.UndefOr[
    js.Function3[
      /* methodsLeft */ Null | js.Array[String], 
      /* partialSuccess */ Null | Boolean, 
      /* cb */ js.Function1[/* nextMethod */ String, Unit], 
      String
    ]
  ] = js.native
  var compress: js.UndefOr[force | Boolean] = js.native
  var debug: js.UndefOr[js.Function1[/* info */ String, Unit]] = js.native
  var dstHost: js.UndefOr[String] = js.native
  var dstPort: js.UndefOr[Double] = js.native
  var forceIPv4: js.UndefOr[Boolean] = js.native
  var forceIPv6: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  var hostHast: js.UndefOr[String] = js.native
  var hostVerifier: js.UndefOr[
    js.Function2[
      /* hashedKey */ String, 
      /* repeated */ js.Function1[/* doContinue */ Boolean, Unit], 
      Boolean
    ]
  ] = js.native
  var keepAlive: js.UndefOr[Boolean] = js.native
  var keepaliveCountMax: js.UndefOr[Double] = js.native
  var keepaliveInterval: js.UndefOr[Double] = js.native
  var localAddress: js.UndefOr[String] = js.native
  var localHost: js.UndefOr[String] = js.native
  var localHostname: js.UndefOr[String] = js.native
  var localPort: js.UndefOr[Double] = js.native
  var localUsername: js.UndefOr[String] = js.native
  var passphrase: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var privateKey: js.UndefOr[Buffer | String] = js.native
  var readyTimeout: js.UndefOr[Double] = js.native
  var sock: js.UndefOr[ReadableStream] = js.native
  var strictVendor: js.UndefOr[Boolean] = js.native
  var tryKeyboard: js.UndefOr[Boolean] = js.native
  var username: js.UndefOr[String] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withAgentForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentForward")(js.undefined)
        ret
    }
    @scala.inline
    def withAlgorithms(value: AnonCipher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithms")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthHandler(
      value: (/* methodsLeft */ Null | js.Array[String], /* partialSuccess */ Null | Boolean, /* cb */ js.Function1[/* nextMethod */ String, Unit]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authHandler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAuthHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withCompress(value: force | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: /* info */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDstHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDstHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstHost")(js.undefined)
        ret
    }
    @scala.inline
    def withDstPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDstPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstPort")(js.undefined)
        ret
    }
    @scala.inline
    def withForceIPv4(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIPv4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceIPv4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIPv4")(js.undefined)
        ret
    }
    @scala.inline
    def withForceIPv6(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIPv6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceIPv6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIPv6")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withHostHast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostHast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostHast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostHast")(js.undefined)
        ret
    }
    @scala.inline
    def withHostVerifier(
      value: (/* hashedKey */ String, /* repeated */ js.Function1[/* doContinue */ Boolean, Unit]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostVerifier")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHostVerifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostVerifier")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAlive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAlive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepaliveCountMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepaliveCountMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepaliveCountMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepaliveCountMax")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepaliveInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepaliveInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepaliveInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepaliveInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localHost")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localHostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localHostname")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPort")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localUsername")(js.undefined)
        ret
    }
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(js.undefined)
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
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKey(value: Buffer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(js.undefined)
        ret
    }
    @scala.inline
    def withReadyTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadyTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSock(value: ReadableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sock")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictVendor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictVendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictVendor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictVendor")(js.undefined)
        ret
    }
    @scala.inline
    def withTryKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTryKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryKeyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

