package typingsSlinky.three.meshMatcapMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.constantsMod.NormalMapTypes
import typingsSlinky.three.materialMod.MaterialParameters
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshMatcapMaterialParameters extends MaterialParameters {
  var alphaMap: js.UndefOr[Texture | Null] = js.native
  var bumpMap: js.UndefOr[Texture | Null] = js.native
  var bumpScale: js.UndefOr[Double] = js.native
  var color: js.UndefOr[Color | String | Double] = js.native
  var displacementBias: js.UndefOr[Double] = js.native
  var displacementMap: js.UndefOr[Texture | Null] = js.native
  var displacementScale: js.UndefOr[Double] = js.native
  var map: js.UndefOr[Texture | Null] = js.native
  var matcap: js.UndefOr[Texture | Null] = js.native
  var morphNormals: js.UndefOr[Boolean] = js.native
  var morphTargets: js.UndefOr[Boolean] = js.native
  var normalMap: js.UndefOr[Texture | Null] = js.native
  var normalMapType: js.UndefOr[NormalMapTypes] = js.native
  var normalScale: js.UndefOr[Vector2] = js.native
  var skinning: js.UndefOr[Boolean] = js.native
}

object MeshMatcapMaterialParameters {
  @scala.inline
  def apply(): MeshMatcapMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshMatcapMaterialParameters]
  }
  @scala.inline
  implicit class MeshMatcapMaterialParametersOps[Self <: MeshMatcapMaterialParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaMap(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaMap")(js.undefined)
        ret
    }
    @scala.inline
    def withAlphaMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaMap")(null)
        ret
    }
    @scala.inline
    def withBumpMap(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bumpMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBumpMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bumpMap")(js.undefined)
        ret
    }
    @scala.inline
    def withBumpMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bumpMap")(null)
        ret
    }
    @scala.inline
    def withBumpScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bumpScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBumpScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bumpScale")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: Color | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplacementBias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displacementBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplacementBias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displacementBias")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplacementMap(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displacementMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplacementMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displacementMap")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplacementMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displacementMap")(null)
        ret
    }
    @scala.inline
    def withDisplacementScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displacementScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplacementScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displacementScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(null)
        ret
    }
    @scala.inline
    def withMatcap(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatcap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcap")(js.undefined)
        ret
    }
    @scala.inline
    def withMatcapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcap")(null)
        ret
    }
    @scala.inline
    def withMorphNormals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("morphNormals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMorphNormals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("morphNormals")(js.undefined)
        ret
    }
    @scala.inline
    def withMorphTargets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("morphTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMorphTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("morphTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalMap(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalMap")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalMap")(null)
        ret
    }
    @scala.inline
    def withNormalMapType(value: NormalMapTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalMapType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalMapType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalMapType")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalScale(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalScale")(js.undefined)
        ret
    }
    @scala.inline
    def withSkinning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkinning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinning")(js.undefined)
        ret
    }
  }
  
}

