package typingsSlinky.three.meshBasicMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.constantsMod.Combine
import typingsSlinky.three.materialMod.MaterialParameters
import typingsSlinky.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshBasicMaterialParameters extends MaterialParameters {
  var alphaMap: js.UndefOr[Texture | Null] = js.native
  var aoMap: js.UndefOr[Texture | Null] = js.native
  var aoMapIntensity: js.UndefOr[Double] = js.native
  var color: js.UndefOr[Color | String | Double] = js.native
  var combine: js.UndefOr[Combine] = js.native
  var envMap: js.UndefOr[Texture | Null] = js.native
  var map: js.UndefOr[Texture | Null] = js.native
  var morphTargets: js.UndefOr[Boolean] = js.native
  var reflectivity: js.UndefOr[Double] = js.native
  var refractionRatio: js.UndefOr[Double] = js.native
  var skinning: js.UndefOr[Boolean] = js.native
  var specularMap: js.UndefOr[Texture | Null] = js.native
  var wireframe: js.UndefOr[Boolean] = js.native
  var wireframeLinecap: js.UndefOr[String] = js.native
  var wireframeLinejoin: js.UndefOr[String] = js.native
  var wireframeLinewidth: js.UndefOr[Double] = js.native
}

object MeshBasicMaterialParameters {
  @scala.inline
  def apply(): MeshBasicMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshBasicMaterialParameters]
  }
  @scala.inline
  implicit class MeshBasicMaterialParametersOps[Self <: MeshBasicMaterialParameters] (val x: Self) extends AnyVal {
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
    def withAoMap(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aoMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAoMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aoMap")(js.undefined)
        ret
    }
    @scala.inline
    def withAoMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aoMap")(null)
        ret
    }
    @scala.inline
    def withAoMapIntensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aoMapIntensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAoMapIntensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aoMapIntensity")(js.undefined)
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
    def withCombine(value: Combine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCombine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combine")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvMap(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envMap")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envMap")(null)
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
    def withRefractionRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refractionRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefractionRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refractionRatio")(js.undefined)
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
    @scala.inline
    def withSpecularMap(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specularMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecularMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specularMap")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecularMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specularMap")(null)
        ret
    }
    @scala.inline
    def withWireframe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wireframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWireframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wireframe")(js.undefined)
        ret
    }
    @scala.inline
    def withWireframeLinecap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wireframeLinecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWireframeLinecap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wireframeLinecap")(js.undefined)
        ret
    }
    @scala.inline
    def withWireframeLinejoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wireframeLinejoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWireframeLinejoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wireframeLinejoin")(js.undefined)
        ret
    }
    @scala.inline
    def withWireframeLinewidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wireframeLinewidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWireframeLinewidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wireframeLinewidth")(js.undefined)
        ret
    }
  }
  
}

