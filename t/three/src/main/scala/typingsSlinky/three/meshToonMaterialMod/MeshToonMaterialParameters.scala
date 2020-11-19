package typingsSlinky.three.meshToonMaterialMod

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.constantsMod.NormalMapTypes
import typingsSlinky.three.materialMod.MaterialParameters
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshToonMaterialParameters extends MaterialParameters {
  
  var alphaMap: js.UndefOr[Texture | Null] = js.native
  
  var aoMap: js.UndefOr[Texture | Null] = js.native
  
  var aoMapIntensity: js.UndefOr[Double] = js.native
  
  var bumpMap: js.UndefOr[Texture | Null] = js.native
  
  var bumpScale: js.UndefOr[Double] = js.native
  
  /** geometry color in hexadecimal. Default is 0xffffff. */
  var color: js.UndefOr[Color | String | Double] = js.native
  
  var displacementBias: js.UndefOr[Double] = js.native
  
  var displacementMap: js.UndefOr[Texture | Null] = js.native
  
  var displacementScale: js.UndefOr[Double] = js.native
  
  var emissive: js.UndefOr[Color | String | Double] = js.native
  
  var emissiveIntensity: js.UndefOr[Double] = js.native
  
  var emissiveMap: js.UndefOr[Texture | Null] = js.native
  
  var gradientMap: js.UndefOr[Texture | Null] = js.native
  
  var lightMap: js.UndefOr[Texture | Null] = js.native
  
  var lightMapIntensity: js.UndefOr[Double] = js.native
  
  var map: js.UndefOr[Texture | Null] = js.native
  
  var morphNormals: js.UndefOr[Boolean] = js.native
  
  var morphTargets: js.UndefOr[Boolean] = js.native
  
  var normalMap: js.UndefOr[Texture | Null] = js.native
  
  var normalMapType: js.UndefOr[NormalMapTypes] = js.native
  
  var normalScale: js.UndefOr[Vector2] = js.native
  
  var skinning: js.UndefOr[Boolean] = js.native
  
  var wireframe: js.UndefOr[Boolean] = js.native
  
  var wireframeLinecap: js.UndefOr[String] = js.native
  
  var wireframeLinejoin: js.UndefOr[String] = js.native
  
  var wireframeLinewidth: js.UndefOr[Double] = js.native
}
object MeshToonMaterialParameters {
  
  @scala.inline
  def apply(): MeshToonMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshToonMaterialParameters]
  }
  
  @scala.inline
  implicit class MeshToonMaterialParametersOps[Self <: MeshToonMaterialParameters] (val x: Self) extends AnyVal {
    
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
    def setAlphaMap(value: Texture): Self = this.set("alphaMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaMap: Self = this.set("alphaMap", js.undefined)
    
    @scala.inline
    def setAlphaMapNull: Self = this.set("alphaMap", null)
    
    @scala.inline
    def setAoMap(value: Texture): Self = this.set("aoMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAoMap: Self = this.set("aoMap", js.undefined)
    
    @scala.inline
    def setAoMapNull: Self = this.set("aoMap", null)
    
    @scala.inline
    def setAoMapIntensity(value: Double): Self = this.set("aoMapIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAoMapIntensity: Self = this.set("aoMapIntensity", js.undefined)
    
    @scala.inline
    def setBumpMap(value: Texture): Self = this.set("bumpMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBumpMap: Self = this.set("bumpMap", js.undefined)
    
    @scala.inline
    def setBumpMapNull: Self = this.set("bumpMap", null)
    
    @scala.inline
    def setBumpScale(value: Double): Self = this.set("bumpScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBumpScale: Self = this.set("bumpScale", js.undefined)
    
    @scala.inline
    def setColor(value: Color | String | Double): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDisplacementBias(value: Double): Self = this.set("displacementBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplacementBias: Self = this.set("displacementBias", js.undefined)
    
    @scala.inline
    def setDisplacementMap(value: Texture): Self = this.set("displacementMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplacementMap: Self = this.set("displacementMap", js.undefined)
    
    @scala.inline
    def setDisplacementMapNull: Self = this.set("displacementMap", null)
    
    @scala.inline
    def setDisplacementScale(value: Double): Self = this.set("displacementScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplacementScale: Self = this.set("displacementScale", js.undefined)
    
    @scala.inline
    def setEmissive(value: Color | String | Double): Self = this.set("emissive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmissive: Self = this.set("emissive", js.undefined)
    
    @scala.inline
    def setEmissiveIntensity(value: Double): Self = this.set("emissiveIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmissiveIntensity: Self = this.set("emissiveIntensity", js.undefined)
    
    @scala.inline
    def setEmissiveMap(value: Texture): Self = this.set("emissiveMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmissiveMap: Self = this.set("emissiveMap", js.undefined)
    
    @scala.inline
    def setEmissiveMapNull: Self = this.set("emissiveMap", null)
    
    @scala.inline
    def setGradientMap(value: Texture): Self = this.set("gradientMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientMap: Self = this.set("gradientMap", js.undefined)
    
    @scala.inline
    def setGradientMapNull: Self = this.set("gradientMap", null)
    
    @scala.inline
    def setLightMap(value: Texture): Self = this.set("lightMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightMap: Self = this.set("lightMap", js.undefined)
    
    @scala.inline
    def setLightMapNull: Self = this.set("lightMap", null)
    
    @scala.inline
    def setLightMapIntensity(value: Double): Self = this.set("lightMapIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightMapIntensity: Self = this.set("lightMapIntensity", js.undefined)
    
    @scala.inline
    def setMap(value: Texture): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setMapNull: Self = this.set("map", null)
    
    @scala.inline
    def setMorphNormals(value: Boolean): Self = this.set("morphNormals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMorphNormals: Self = this.set("morphNormals", js.undefined)
    
    @scala.inline
    def setMorphTargets(value: Boolean): Self = this.set("morphTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMorphTargets: Self = this.set("morphTargets", js.undefined)
    
    @scala.inline
    def setNormalMap(value: Texture): Self = this.set("normalMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalMap: Self = this.set("normalMap", js.undefined)
    
    @scala.inline
    def setNormalMapNull: Self = this.set("normalMap", null)
    
    @scala.inline
    def setNormalMapType(value: NormalMapTypes): Self = this.set("normalMapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalMapType: Self = this.set("normalMapType", js.undefined)
    
    @scala.inline
    def setNormalScale(value: Vector2): Self = this.set("normalScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalScale: Self = this.set("normalScale", js.undefined)
    
    @scala.inline
    def setSkinning(value: Boolean): Self = this.set("skinning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkinning: Self = this.set("skinning", js.undefined)
    
    @scala.inline
    def setWireframe(value: Boolean): Self = this.set("wireframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWireframe: Self = this.set("wireframe", js.undefined)
    
    @scala.inline
    def setWireframeLinecap(value: String): Self = this.set("wireframeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWireframeLinecap: Self = this.set("wireframeLinecap", js.undefined)
    
    @scala.inline
    def setWireframeLinejoin(value: String): Self = this.set("wireframeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWireframeLinejoin: Self = this.set("wireframeLinejoin", js.undefined)
    
    @scala.inline
    def setWireframeLinewidth(value: Double): Self = this.set("wireframeLinewidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWireframeLinewidth: Self = this.set("wireframeLinewidth", js.undefined)
  }
}
