package typingsSlinky.three

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlphaMap extends js.Object {
  var alphaMap: IUniform = js.native
  var diffuse: IUniform = js.native
  var map: IUniform = js.native
  var opacity: IUniform = js.native
  var uvTransform: IUniform = js.native
}

object AnonAlphaMap {
  @scala.inline
  def apply(alphaMap: IUniform, diffuse: IUniform, map: IUniform, opacity: IUniform, uvTransform: IUniform): AnonAlphaMap = {
    val __obj = js.Dynamic.literal(alphaMap = alphaMap.asInstanceOf[js.Any], diffuse = diffuse.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], uvTransform = uvTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlphaMap]
  }
  @scala.inline
  implicit class AnonAlphaMapOps[Self <: AnonAlphaMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiffuse(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffuse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpacity(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUvTransform(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvTransform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

