package typingsSlinky.webgme.GmePanel

import typingsSlinky.webgme.GmeConfig.GmeConfig
import typingsSlinky.webgme.GmeConfig.LogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  def createLogger(name: String, options: LogOptions): Logger = js.native
  def createWithGmeConfig(name: String, gmeConfig: GmeConfig): Logger = js.native
}

object Logger {
  @scala.inline
  def apply(createLogger: (String, LogOptions) => Logger, createWithGmeConfig: (String, GmeConfig) => Logger): Logger = {
    val __obj = js.Dynamic.literal(createLogger = js.Any.fromFunction2(createLogger), createWithGmeConfig = js.Any.fromFunction2(createWithGmeConfig))
    __obj.asInstanceOf[Logger]
  }
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateLogger(value: (String, LogOptions) => Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLogger")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateWithGmeConfig(value: (String, GmeConfig) => Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWithGmeConfig")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

