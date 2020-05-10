package typingsSlinky.three.meshDistanceMaterialMod

import typingsSlinky.three.materialMod.MaterialParameters
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshDistanceMaterialParameters extends MaterialParameters {
  var displacementBias: js.UndefOr[Double] = js.native
  var displacementMap: js.UndefOr[Texture | Null] = js.native
  var displacementScale: js.UndefOr[Double] = js.native
  var farDistance: js.UndefOr[Double] = js.native
  var nearDistance: js.UndefOr[Double] = js.native
  var referencePosition: js.UndefOr[Vector3] = js.native
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
    def withFarDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("farDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFarDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("farDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withNearDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNearDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withReferencePosition(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferencePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencePosition")(js.undefined)
        ret
    }
  }
  
}

