package typingsSlinky.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryThemeInterface extends js.Object {
  /**
    * Default theme
    */
  var grayscale: VictoryThemeDefinition = js.native
  var material: VictoryThemeDefinition = js.native
}

object VictoryThemeInterface {
  @scala.inline
  def apply(grayscale: VictoryThemeDefinition, material: VictoryThemeDefinition): VictoryThemeInterface = {
    val __obj = js.Dynamic.literal(grayscale = grayscale.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryThemeInterface]
  }
  @scala.inline
  implicit class VictoryThemeInterfaceOps[Self <: VictoryThemeInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrayscale(value: VictoryThemeDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grayscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaterial(value: VictoryThemeDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

