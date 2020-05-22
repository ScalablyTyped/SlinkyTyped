package typingsSlinky.winston.anon

import typingsSlinky.winston.configMod.CliConfigSetColors
import typingsSlinky.winston.configMod.CliConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  var colors: CliConfigSetColors
  var levels: CliConfigSetLevels
}

object Colors {
  @scala.inline
  def apply(colors: CliConfigSetColors, levels: CliConfigSetLevels): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
}

