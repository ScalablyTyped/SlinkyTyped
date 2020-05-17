package typingsSlinky.webpackHotClient.anon

import typingsSlinky.node.netMod.Server
import typingsSlinky.webpack.mod.Options.Stats
import typingsSlinky.webpackHotClient.mod.WebpackHotHost
import typingsSlinky.webpackHotClient.webpackHotClientStrings.debug
import typingsSlinky.webpackHotClient.webpackHotClientStrings.error
import typingsSlinky.webpackHotClient.webpackHotClientStrings.info
import typingsSlinky.webpackHotClient.webpackHotClientStrings.silent
import typingsSlinky.webpackHotClient.webpackHotClientStrings.trace
import typingsSlinky.webpackHotClient.webpackHotClientStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<webpack-hot-client.webpack-hot-client.Options> */
@js.native
trait ReadonlyOptions extends js.Object {
  val allEntries: js.UndefOr[Boolean] = js.native
  val autoConfigure: js.UndefOr[Boolean] = js.native
  val hmr: js.UndefOr[Boolean] = js.native
  val host: js.UndefOr[WebpackHotHost | String] = js.native
  val https: js.UndefOr[Boolean] = js.native
  val logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.native
  val logTime: js.UndefOr[Boolean] = js.native
  val port: js.UndefOr[Double] = js.native
  val reload: js.UndefOr[Boolean] = js.native
  val server: js.UndefOr[Server] = js.native
  val stats: js.UndefOr[Stats] = js.native
  val validTargets: js.UndefOr[js.Array[String]] = js.native
}

object ReadonlyOptions {
  @scala.inline
  def apply(): ReadonlyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyOptions]
  }
  @scala.inline
  implicit class ReadonlyOptionsOps[Self <: ReadonlyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllEntries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoConfigure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConfigure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoConfigure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConfigure")(js.undefined)
        ret
    }
    @scala.inline
    def withHmr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHmr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmr")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: WebpackHotHost | String): Self = {
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
    def withHttps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: trace | debug | info | warn | error | silent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLogTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logTime")(js.undefined)
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
    def withReload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: Server): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
    @scala.inline
    def withValidTargets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validTargets")(js.undefined)
        ret
    }
  }
  
}

