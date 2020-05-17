package typingsSlinky.three.anon

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Diffuse extends js.Object {
  var diffuse: IUniform = js.native
  var map: IUniform = js.native
  var opacity: IUniform = js.native
  var scale: IUniform = js.native
  var size: IUniform = js.native
  var uvTransform: IUniform = js.native
}

object Diffuse {
  @scala.inline
  def apply(
    diffuse: IUniform,
    map: IUniform,
    opacity: IUniform,
    scale: IUniform,
    size: IUniform,
    uvTransform: IUniform
  ): Diffuse = {
    val __obj = js.Dynamic.literal(diffuse = diffuse.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uvTransform = uvTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diffuse]
  }
  @scala.inline
  implicit class DiffuseOps[Self <: Diffuse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withScale(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
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

