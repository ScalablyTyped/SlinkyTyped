package typingsSlinky.winston.anon

import typingsSlinky.winston.configMod.SyslogConfigSetColors
import typingsSlinky.winston.configMod.SyslogConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorsLevels extends js.Object {
  var colors: SyslogConfigSetColors
  var levels: SyslogConfigSetLevels
}

object ColorsLevels {
  @scala.inline
  def apply(colors: SyslogConfigSetColors, levels: SyslogConfigSetLevels): ColorsLevels = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorsLevels]
  }
}

