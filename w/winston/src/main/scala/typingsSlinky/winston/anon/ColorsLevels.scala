package typingsSlinky.winston.anon

import typingsSlinky.winston.configMod.SyslogConfigSetColors
import typingsSlinky.winston.configMod.SyslogConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorsLevels extends js.Object {
  var colors: SyslogConfigSetColors = js.native
  var levels: SyslogConfigSetLevels = js.native
}

object ColorsLevels {
  @scala.inline
  def apply(colors: SyslogConfigSetColors, levels: SyslogConfigSetLevels): ColorsLevels = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorsLevels]
  }
  @scala.inline
  implicit class ColorsLevelsOps[Self <: ColorsLevels] (val x: Self) extends AnyVal {
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

