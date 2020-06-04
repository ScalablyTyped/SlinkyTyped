package typingsSlinky.three.meshToonMaterialMod

import typingsSlinky.three.meshPhongMaterialMod.MeshPhongMaterialParameters
import typingsSlinky.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshToonMaterialParameters extends MeshPhongMaterialParameters {
  var gradientMap: js.UndefOr[Texture | Null] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGradientMap(value: Texture): Self = this.set("gradientMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientMap: Self = this.set("gradientMap", js.undefined)
    @scala.inline
    def setGradientMapNull: Self = this.set("gradientMap", null)
  }
  
}

