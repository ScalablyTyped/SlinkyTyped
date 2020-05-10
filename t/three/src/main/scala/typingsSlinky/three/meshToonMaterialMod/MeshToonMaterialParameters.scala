package typingsSlinky.three.meshToonMaterialMod

import typingsSlinky.three.meshPhongMaterialMod.MeshPhongMaterialParameters
import typingsSlinky.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshToonMaterialParameters extends MeshPhongMaterialParameters {
  var gradientMap: js.UndefOr[Texture | Null] = js.native
}

object MeshToonMaterialParameters {
  @scala.inline
  def apply(): MeshToonMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshToonMaterialParameters]
  }
  @scala.inline
  implicit class MeshToonMaterialParametersOps[Self <: MeshToonMaterialParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGradientMap(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMap")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMap")(null)
        ret
    }
  }
  
}

