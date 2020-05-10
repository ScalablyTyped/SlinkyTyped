package typingsSlinky.winston.configMod

import typingsSlinky.winston.AnonColors
import typingsSlinky.winston.AnonColorsLevels
import typingsSlinky.winston.AnonLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var allColors: AbstractConfigSetColors = js.native
  var cli: AnonColors = js.native
  var npm: AnonLevels = js.native
  var syslog: AnonColorsLevels = js.native
  def addColors(colors: AbstractConfigSetColors): Unit = js.native
}

object Config {
  @scala.inline
  def apply(
    addColors: AbstractConfigSetColors => Unit,
    allColors: AbstractConfigSetColors,
    cli: AnonColors,
    npm: AnonLevels,
    syslog: AnonColorsLevels
  ): Config = {
    val __obj = js.Dynamic.literal(addColors = js.Any.fromFunction1(addColors), allColors = allColors.asInstanceOf[js.Any], cli = cli.asInstanceOf[js.Any], npm = npm.asInstanceOf[js.Any], syslog = syslog.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddColors(value: AbstractConfigSetColors => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addColors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAllColors(value: AbstractConfigSetColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCli(value: AnonColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cli")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNpm(value: AnonLevels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyslog(value: AnonColorsLevels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syslog")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

