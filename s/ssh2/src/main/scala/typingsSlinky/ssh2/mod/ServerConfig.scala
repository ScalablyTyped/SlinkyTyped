package typingsSlinky.ssh2.mod

import typingsSlinky.node.Buffer
import typingsSlinky.ssh2Streams.mod.Algorithms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerConfig extends js.Object {
  /** Explicit overrides for the default transport layer algorithms used for the connection. */
  var algorithms: js.UndefOr[Algorithms] = js.native
  /** A message that is sent to clients once, right before authentication begins. */
  var banner: js.UndefOr[String] = js.native
  /** A function that receives a single string argument to get detailed (local) debug information. */
  var debug: js.UndefOr[js.Function1[/* information */ String, _]] = js.native
  /** A message that is sent to clients immediately upon connection, before handshaking begins. */
  var greeting: js.UndefOr[String] = js.native
  /** This is the highWaterMark to use for the parser stream (default: `32 * 1024`). */
  var highWaterMark: js.UndefOr[Double] = js.native
  /** An array of host private keys. */
  var hostKeys: js.Array[Buffer | String | EncryptedPrivateKey] = js.native
  /** A custom server software name/version identifier. */
  var ident: js.UndefOr[String] = js.native
  /** This is the maximum packet size that will be accepted. It should be 35000 bytes or larger to be compatible with other SSH2 implementations. */
  var maxPacketSize: js.UndefOr[Double] = js.native
}

object ServerConfig {
  @scala.inline
  def apply(hostKeys: js.Array[Buffer | String | EncryptedPrivateKey]): ServerConfig = {
    val __obj = js.Dynamic.literal(hostKeys = hostKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig]
  }
  @scala.inline
  implicit class ServerConfigOps[Self <: ServerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostKeys(value: js.Array[Buffer | String | EncryptedPrivateKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostKeys")(value.asInstanceOf[js.Any])
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
    def withGreeting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greeting")(js.undefined)
        ret
    }
    @scala.inline
    def withHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighWaterMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(js.undefined)
        ret
    }
    @scala.inline
    def withIdent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ident")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ident")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPacketSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPacketSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPacketSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPacketSize")(js.undefined)
        ret
    }
  }
  
}

