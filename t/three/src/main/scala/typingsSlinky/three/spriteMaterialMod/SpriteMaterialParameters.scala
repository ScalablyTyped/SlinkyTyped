package typingsSlinky.three.spriteMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.materialMod.MaterialParameters
import typingsSlinky.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteMaterialParameters extends MaterialParameters {
  var color: js.UndefOr[Color | String | Double] = js.undefined
  var map: js.UndefOr[Texture | Null] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var sizeAttenuation: js.UndefOr[Boolean] = js.undefined
}

object SpriteMaterialParameters {
  @scala.inline
  def apply(): SpriteMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpriteMaterialParameters]
  }
  @scala.inline
  implicit class SpriteMaterialParametersOps[Self <: SpriteMaterialParameters] (val x: Self) extends AnyVal {
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
    def setColor(value: Color | String | Double): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setMap(value: Texture): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMapNull: Self = this.set("map", null)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setSizeAttenuation(value: Boolean): Self = this.set("sizeAttenuation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeAttenuation: Self = this.set("sizeAttenuation", js.undefined)
  }
  
}

