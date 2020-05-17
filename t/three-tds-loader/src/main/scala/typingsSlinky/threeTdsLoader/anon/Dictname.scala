package typingsSlinky.threeTdsLoader.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.three.shaderLibMod.Shader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictname extends /* name */ StringDictionary[Shader] {
  var background: Shader = js.native
  var basic: Shader = js.native
  var cube: Shader = js.native
  var dashed: Shader = js.native
  var depth: Shader = js.native
  var distanceRGBA: Shader = js.native
  var equirect: Shader = js.native
  var lambert: Shader = js.native
  var matcap: Shader = js.native
  var normal: Shader = js.native
  var phong: Shader = js.native
  var physical: Shader = js.native
  var points: Shader = js.native
  var shadow: Shader = js.native
  var sprite: Shader = js.native
  var standard: Shader = js.native
}

object Dictname {
  @scala.inline
  def apply(
    background: Shader,
    basic: Shader,
    cube: Shader,
    dashed: Shader,
    depth: Shader,
    distanceRGBA: Shader,
    equirect: Shader,
    lambert: Shader,
    matcap: Shader,
    normal: Shader,
    phong: Shader,
    physical: Shader,
    points: Shader,
    shadow: Shader,
    sprite: Shader,
    standard: Shader
  ): Dictname = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], basic = basic.asInstanceOf[js.Any], cube = cube.asInstanceOf[js.Any], dashed = dashed.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], distanceRGBA = distanceRGBA.asInstanceOf[js.Any], equirect = equirect.asInstanceOf[js.Any], lambert = lambert.asInstanceOf[js.Any], matcap = matcap.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], phong = phong.asInstanceOf[js.Any], physical = physical.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], sprite = sprite.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictname]
  }
  @scala.inline
  implicit class DictnameOps[Self <: Dictname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasic(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCube(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cube")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashed(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceRGBA(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceRGBA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEquirect(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLambert(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatcap(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhong(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhysical(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadow(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSprite(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandard(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

