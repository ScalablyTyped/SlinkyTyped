package typingsSlinky.winston.anon

import typingsSlinky.winston.configMod.NpmConfigSetColors
import typingsSlinky.winston.configMod.NpmConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Levels extends js.Object {
  var colors: NpmConfigSetColors = js.native
  var levels: NpmConfigSetLevels = js.native
}

object Levels {
  @scala.inline
  def apply(colors: NpmConfigSetColors, levels: NpmConfigSetLevels): Levels = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Levels]
  }
  @scala.inline
  implicit class LevelsOps[Self <: Levels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: NpmConfigSetColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevels(value: NpmConfigSetLevels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

