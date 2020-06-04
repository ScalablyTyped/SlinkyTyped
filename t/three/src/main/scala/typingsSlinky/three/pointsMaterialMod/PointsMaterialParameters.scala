package typingsSlinky.three.pointsMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.materialMod.MaterialParameters
import typingsSlinky.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointsMaterialParameters extends MaterialParameters {
  var color: js.UndefOr[Color | String | Double] = js.undefined
  var map: js.UndefOr[Texture] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var sizeAttenuation: js.UndefOr[Boolean] = js.undefined
}

object PointsMaterialParameters {
  @scala.inline
  def apply(): PointsMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointsMaterialParameters]
  }
  @scala.inline
  implicit class PointsMaterialParametersOps[Self <: PointsMaterialParameters] (val x: Self) extends AnyVal {
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSizeAttenuation(value: Boolean): Self = this.set("sizeAttenuation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeAttenuation: Self = this.set("sizeAttenuation", js.undefined)
  }
  
}

