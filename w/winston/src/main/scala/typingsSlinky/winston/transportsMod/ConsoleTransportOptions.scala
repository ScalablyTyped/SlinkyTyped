package typingsSlinky.winston.transportsMod

import typingsSlinky.winstonTransport.mod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleTransportOptions extends TransportStreamOptions {
  var consoleWarnLevels: js.UndefOr[js.Array[String]] = js.native
  var debugStdout: js.UndefOr[Boolean] = js.native
  var eol: js.UndefOr[String] = js.native
  var stderrLevels: js.UndefOr[js.Array[String]] = js.native
}

object ConsoleTransportOptions {
  @scala.inline
  def apply(): ConsoleTransportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsoleTransportOptions]
  }
  @scala.inline
  implicit class ConsoleTransportOptionsOps[Self <: ConsoleTransportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsoleWarnLevels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleWarnLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsoleWarnLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleWarnLevels")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugStdout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugStdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugStdout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugStdout")(js.undefined)
        ret
    }
    @scala.inline
    def withEol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(js.undefined)
        ret
    }
    @scala.inline
    def withStderrLevels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderrLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStderrLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderrLevels")(js.undefined)
        ret
    }
  }
  
}

