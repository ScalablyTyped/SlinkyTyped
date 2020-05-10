package typingsSlinky.winston

import typingsSlinky.winston.configMod.CliConfigSetColors
import typingsSlinky.winston.configMod.CliConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColors extends js.Object {
  var colors: CliConfigSetColors = js.native
  var levels: CliConfigSetLevels = js.native
}

object AnonColors {
  @scala.inline
  def apply(colors: CliConfigSetColors, levels: CliConfigSetLevels): AnonColors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColors]
  }
  @scala.inline
  implicit class AnonColorsOps[Self <: AnonColors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: CliConfigSetColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevels(value: CliConfigSetLevels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

