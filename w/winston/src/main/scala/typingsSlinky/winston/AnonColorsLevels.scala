package typingsSlinky.winston

import typingsSlinky.winston.configMod.SyslogConfigSetColors
import typingsSlinky.winston.configMod.SyslogConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColorsLevels extends js.Object {
  var colors: SyslogConfigSetColors = js.native
  var levels: SyslogConfigSetLevels = js.native
}

object AnonColorsLevels {
  @scala.inline
  def apply(colors: SyslogConfigSetColors, levels: SyslogConfigSetLevels): AnonColorsLevels = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorsLevels]
  }
  @scala.inline
  implicit class AnonColorsLevelsOps[Self <: AnonColorsLevels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: SyslogConfigSetColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevels(value: SyslogConfigSetLevels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

