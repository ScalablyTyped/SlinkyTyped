package typingsSlinky.three.meshNormalMaterialMod

import typingsSlinky.three.constantsMod.NormalMapTypes
import typingsSlinky.three.materialMod.MaterialParameters
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshNormalMaterialParameters extends MaterialParameters {
  var bumpMap: js.UndefOr[Texture | Null] = js.undefined
  var bumpScale: js.UndefOr[Double] = js.undefined
  var displacementBias: js.UndefOr[Double] = js.undefined
  var displacementMap: js.UndefOr[Texture | Null] = js.undefined
  var displacementScale: js.UndefOr[Double] = js.undefined
  var morphNormals: js.UndefOr[Boolean] = js.undefined
  var morphTargets: js.UndefOr[Boolean] = js.undefined
  var normalMap: js.UndefOr[Texture | Null] = js.undefined
  var normalMapType: js.UndefOr[NormalMapTypes] = js.undefined
  var normalScale: js.UndefOr[Vector2] = js.undefined
  var skinning: js.UndefOr[Boolean] = js.undefined
  var wireframe: js.UndefOr[Boolean] = js.undefined
  var wireframeLinewidth: js.UndefOr[Double] = js.undefined
}

object MeshNormalMaterialParameters {
  @scala.inline
  def apply(): MeshNormalMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshNormalMaterialParameters]
  }
  @scala.inline
  implicit class MeshNormalMaterialParametersOps[Self <: MeshNormalMaterialParameters] (val x: Self) extends AnyVal {
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
    def setWireframeLinewidth(value: Double): Self = this.set("wireframeLinewidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWireframeLinewidth: Self = this.set("wireframeLinewidth", js.undefined)
  }
  
}

