package typingsSlinky.three.meshDistanceMaterialMod

import typingsSlinky.three.materialMod.MaterialParameters
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshDistanceMaterialParameters extends MaterialParameters {
  var displacementBias: js.UndefOr[Double] = js.undefined
  var displacementMap: js.UndefOr[Texture | Null] = js.undefined
  var displacementScale: js.UndefOr[Double] = js.undefined
  var farDistance: js.UndefOr[Double] = js.undefined
  var nearDistance: js.UndefOr[Double] = js.undefined
  var referencePosition: js.UndefOr[Vector3] = js.undefined
}

object MeshDistanceMaterialParameters {
  @scala.inline
  def apply(): MeshDistanceMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshDistanceMaterialParameters]
  }
  @scala.inline
  implicit class MeshDistanceMaterialParametersOps[Self <: MeshDistanceMaterialParameters] (val x: Self) extends AnyVal {
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
    def setFarDistance(value: Double): Self = this.set("farDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFarDistance: Self = this.set("farDistance", js.undefined)
    @scala.inline
    def setNearDistance(value: Double): Self = this.set("nearDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNearDistance: Self = this.set("nearDistance", js.undefined)
    @scala.inline
    def setReferencePosition(value: Vector3): Self = this.set("referencePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferencePosition: Self = this.set("referencePosition", js.undefined)
  }
  
}

