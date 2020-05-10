package typingsSlinky.three.meshPhongMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.constantsMod.Combine
import typingsSlinky.three.constantsMod.NormalMapTypes
import typingsSlinky.three.materialMod.MaterialParameters
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshPhongMaterialParameters extends MaterialParameters {
  var alphaMap: js.UndefOr[Texture | Null] = js.native
  var aoMap: js.UndefOr[Texture | Null] = js.native
  var aoMapIntensity: js.UndefOr[Double] = js.native
  var bumpMap: js.UndefOr[Texture | Null] = js.native
  var bumpScale: js.UndefOr[Double] = js.native
  /** geometry color in hexadecimal. Default is 0xffffff. */
  var color: js.UndefOr[Color | String | Double] = js.native
  var combine: js.UndefOr[Combine] = js.native
  var displacementBias: js.UndefOr[Double] = js.native
  var displacementMap: js.UndefOr[Texture | Null] = js.native
  var displacementScale: js.UndefOr[Double] = js.native
  var emissive: js.UndefOr[Color | String | Double] = js.native
  var emissiveIntensity: js.UndefOr[Double] = js.native
  var emissiveMap: js.UndefOr[Texture | Null] = js.native
  var envMap: js.UndefOr[Texture | Null] = js.native
  var lightMap: js.UndefOr[Texture | Null] = js.native
  var lightMapIntensity: js.UndefOr[Double] = js.native
  var map: js.UndefOr[Texture | Null] = js.native
  var morphNormals: js.UndefOr[Boolean] = js.native
  var morphTargets: js.UndefOr[Boolean] = js.native
  var normalMap: js.UndefOr[Texture | Null] = js.native
  var normalMapType: js.UndefOr[NormalMapTypes] = js.native
  var normalScale: js.UndefOr[Vector2] = js.native
  var reflectivity: js.UndefOr[Double] = js.native
  var refractionRatio: js.UndefOr[Double] = js.native
  var shininess: js.UndefOr[Double] = js.native
  var skinning: js.UndefOr[Boolean] = js.native
  var specular: js.UndefOr[Color | String | Double] = js.native
  var specularMap: js.UndefOr[Texture | Null] = js.native
  var wireframe: js.UndefOr[Boolean] = js.native
  var wireframeLinecap: js.UndefOr[String] = js.native
  var wireframeLinejoin: js.UndefOr[String] = js.native
  var wireframeLinewidth: js.UndefOr[Double] = js.native
}

object MeshPhongMaterialParameters {
  @scala.inline
  def apply(): MeshPhongMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshPhongMaterialParameters]
  }
  @scala.inline
  implicit class MeshPhongMaterialParametersOps[Self <: MeshPhongMaterialParameters] (val x: Self) extends AnyVal {
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
    def withEmissive(value: Color | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmissive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissive")(js.undefined)
        ret
    }
    @scala.inline
    def withEmissiveIntensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissiveIntensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmissiveIntensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissiveIntensity")(js.undefined)
        ret
    }
    @scala.inline
    def withEmissiveMap(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissiveMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmissiveMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissiveMap")(js.undefined)
        ret
    }
    @scala.inline
    def withEmissiveMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissiveMap")(null)
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
    def withLightMap(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightMap")(js.undefined)
        ret
    }
    @scala.inline
    def withLightMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightMap")(null)
        ret
    }
    @scala.inline
    def withLightMapIntensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightMapIntensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightMapIntensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightMapIntensity")(js.undefined)
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
    def withShininess(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shininess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShininess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shininess")(js.undefined)
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
    def withSpecular(value: Color | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specular")(js.undefined)
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

