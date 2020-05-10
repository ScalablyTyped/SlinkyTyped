package typingsSlinky.three.meshPhysicalMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.meshStandardMaterialMod.MeshStandardMaterialParameters
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshPhysicalMaterialParameters extends MeshStandardMaterialParameters {
  var clearcoat: js.UndefOr[Double] = js.native
  var clearcoatNormalMap: js.UndefOr[Texture | Null] = js.native
  var clearcoatNormalScale: js.UndefOr[Vector2] = js.native
  var clearcoatRoughness: js.UndefOr[Double] = js.native
  var reflectivity: js.UndefOr[Double] = js.native
  var sheen: js.UndefOr[Color] = js.native
}

object MeshPhysicalMaterialParameters {
  @scala.inline
  def apply(): MeshPhysicalMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshPhysicalMaterialParameters]
  }
  @scala.inline
  implicit class MeshPhysicalMaterialParametersOps[Self <: MeshPhysicalMaterialParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearcoat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearcoat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearcoat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearcoat")(js.undefined)
        ret
    }
    @scala.inline
    def withClearcoatNormalMap(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearcoatNormalMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearcoatNormalMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearcoatNormalMap")(js.undefined)
        ret
    }
    @scala.inline
    def withClearcoatNormalMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearcoatNormalMap")(null)
        ret
    }
    @scala.inline
    def withClearcoatNormalScale(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearcoatNormalScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearcoatNormalScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearcoatNormalScale")(js.undefined)
        ret
    }
    @scala.inline
    def withClearcoatRoughness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearcoatRoughness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearcoatRoughness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearcoatRoughness")(js.undefined)
        ret
    }
    @scala.inline
    def withReflectivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflectivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReflectivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflectivity")(js.undefined)
        ret
    }
    @scala.inline
    def withSheen(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheen")(js.undefined)
        ret
    }
  }
  
}

