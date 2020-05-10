package typingsSlinky.three.meshDepthMaterialMod

import typingsSlinky.three.constantsMod.DepthPackingStrategies
import typingsSlinky.three.materialMod.MaterialParameters
import typingsSlinky.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshDepthMaterialParameters extends MaterialParameters {
  var depthPacking: js.UndefOr[DepthPackingStrategies] = js.native
  var displacementBias: js.UndefOr[Double] = js.native
  var displacementMap: js.UndefOr[Texture | Null] = js.native
  var displacementScale: js.UndefOr[Double] = js.native
  var wireframe: js.UndefOr[Boolean] = js.native
  var wireframeLinewidth: js.UndefOr[Double] = js.native
}

object MeshDepthMaterialParameters {
  @scala.inline
  def apply(): MeshDepthMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshDepthMaterialParameters]
  }
  @scala.inline
  implicit class MeshDepthMaterialParametersOps[Self <: MeshDepthMaterialParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepthPacking(value: DepthPackingStrategies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthPacking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthPacking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthPacking")(js.undefined)
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

