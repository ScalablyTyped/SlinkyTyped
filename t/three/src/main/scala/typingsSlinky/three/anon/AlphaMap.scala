package typingsSlinky.three.anon

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlphaMap extends js.Object {
  var alphaMap: IUniform
  var diffuse: IUniform
  var map: IUniform
  var opacity: IUniform
  var uvTransform: IUniform
}

object AlphaMap {
  @scala.inline
  def apply(alphaMap: IUniform, diffuse: IUniform, map: IUniform, opacity: IUniform, uvTransform: IUniform): AlphaMap = {
    val __obj = js.Dynamic.literal(alphaMap = alphaMap.asInstanceOf[js.Any], diffuse = diffuse.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], uvTransform = uvTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaMap]
  }
  @scala.inline
  implicit class AlphaMapOps[Self <: AlphaMap] (val x: Self) extends AnyVal {
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
    def setAlphaMap(value: IUniform): Self = this.set("alphaMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiffuse(value: IUniform): Self = this.set("diffuse", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: IUniform): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: IUniform): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setUvTransform(value: IUniform): Self = this.set("uvTransform", value.asInstanceOf[js.Any])
  }
  
}

