package typingsSlinky.ssh2.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.ssh2.ssh2Strings.force
import typingsSlinky.ssh2.ssh2Strings.md5
import typingsSlinky.ssh2.ssh2Strings.sha1
import typingsSlinky.ssh2Streams.mod.Algorithms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectConfig extends js.Object {
  /** Path to ssh-agent's UNIX socket for ssh-agent-based user authentication (or 'pageant' when using Pagent on Windows). */
  var agent: js.UndefOr[String] = js.native
  /** Set to `true` to use OpenSSH agent forwarding (`auth-agent@openssh.com`) for the life of the connection. */
  var agentForward: js.UndefOr[Boolean] = js.native
  /** Explicit overrides for the default transport layer algorithms used for the connection. */
  var algorithms: js.UndefOr[Algorithms] = js.native
  /** Compression settings: true (prefer), false (never), 'force' (require) */
  var compress: js.UndefOr[Boolean | force] = js.native
  /** A function that receives a single string argument to get detailed (local) debug information. */
  var debug: js.UndefOr[js.Function1[/* information */ String, _]] = js.native
  /** Only connect via resolved IPv4 address for `host`. */
  var forceIPv4: js.UndefOr[Boolean] = js.native
  /** Only connect via resolved IPv6 address for `host`. */
  var forceIPv6: js.UndefOr[Boolean] = js.native
  /** Hostname or IP address of the server. */
  var host: js.UndefOr[String] = js.native
  /** The host's key is hashed using this method and passed to `hostVerifier`. */
  var hostHash: js.UndefOr[md5 | sha1] = js.native
  /** Verifies a hexadecimal hash of the host's key. */
  var hostVerifier: js.UndefOr[js.Function1[/* keyHash */ String, Boolean]] = js.native
  /** How many consecutive, unanswered SSH-level keepalive packets that can be sent to the server before disconnection. */
  var keepaliveCountMax: js.UndefOr[Double] = js.native
  /** How often (in milliseconds) to send SSH-level keepalive packets to the server. Set to 0 to disable. */
  var keepaliveInterval: js.UndefOr[Double] = js.native
  /** Along with `localUsername` and `privateKey`, set this to a non-empty string for hostbased user authentication. */
  var localHostname: js.UndefOr[String] = js.native
  /** Along with `localHostname` and `privateKey`, set this to a non-empty string for hostbased user authentication. */
  var localUsername: js.UndefOr[String] = js.native
  /** For an encrypted private key, this is the passphrase used to decrypt it. */
  var passphrase: js.UndefOr[String] = js.native
  /** Password for password-based user authentication. */
  var password: js.UndefOr[String] = js.native
  /** Port number of the server. */
  var port: js.UndefOr[Double] = js.native
  /** Buffer or string that contains a private key for either key-based or hostbased user authentication (OpenSSH format). */
  var privateKey: js.UndefOr[Buffer | String] = js.native
  /** * How long (in milliseconds) to wait for the SSH handshake to complete. */
  var readyTimeout: js.UndefOr[Double] = js.native
  /** A `ReadableStream` to use for communicating with the server instead of creating and using a new TCP connection (useful for connection hopping). */
  var sock: js.UndefOr[ReadableStream] = js.native
  /** Performs a strict server vendor check before sending vendor-specific requests. */
  var strictVendor: js.UndefOr[Boolean] = js.native
  /** Try keyboard-interactive user authentication if primary user authentication method fails. */
  var tryKeyboard: js.UndefOr[Boolean] = js.native
  /** Username for authentication. */
  var username: js.UndefOr[String] = js.native
}

object ConnectConfig {
  @scala.inline
  def apply(): ConnectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectConfig]
  }
  @scala.inline
  implicit class ConnectConfigOps[Self <: ConnectConfig] (val x: Self) extends AnyVal {
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
    def withAlgorithms(value: Algorithms): Self = {
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
    def withCompress(value: Boolean | force): Self = {
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
    def withDebug(value: /* information */ String => _): Self = {
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
    def withHostHash(value: md5 | sha1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostHash")(js.undefined)
        ret
    }
    @scala.inline
    def withHostVerifier(value: /* keyHash */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostVerifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHostVerifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostVerifier")(js.undefined)
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

