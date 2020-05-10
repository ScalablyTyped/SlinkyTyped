package typingsSlinky.winston.mod

import typingsSlinky.logform.mod.Format_
import typingsSlinky.winston.configMod.AbstractConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerOptions extends js.Object {
  var defaultMeta: js.UndefOr[js.Any] = js.native
  var exceptionHandlers: js.UndefOr[js.Any] = js.native
  var exitOnError: js.UndefOr[js.Function | Boolean] = js.native
  var format: js.UndefOr[Format_] = js.native
  var level: js.UndefOr[String] = js.native
  var levels: js.UndefOr[AbstractConfigSetLevels] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var transports: js.UndefOr[
    js.Array[typingsSlinky.winstonTransport.mod.^] | typingsSlinky.winstonTransport.mod.^ 
  ] = js.native
}

object LoggerOptions {
  @scala.inline
  def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  @scala.inline
  implicit class LoggerOptionsOps[Self <: LoggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultMeta(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withExceptionHandlers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExceptionHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionHandlers")(js.undefined)
        ret
    }
    @scala.inline
    def withExitOnError(value: js.Function | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Format_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withLevels(value: AbstractConfigSetLevels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withTransports(value: js.Array[typingsSlinky.winstonTransport.mod.^] | typingsSlinky.winstonTransport.mod.^ ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transports")(js.undefined)
        ret
    }
  }
  
}

