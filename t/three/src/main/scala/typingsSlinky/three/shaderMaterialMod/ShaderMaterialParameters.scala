package typingsSlinky.three.shaderMaterialMod

import typingsSlinky.three.anon.Derivatives
import typingsSlinky.three.materialMod.MaterialParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShaderMaterialParameters extends MaterialParameters {
  var clipping: js.UndefOr[Boolean] = js.native
  var defines: js.UndefOr[js.Any] = js.native
  var extensions: js.UndefOr[Derivatives] = js.native
  var fragmentShader: js.UndefOr[String] = js.native
  var lights: js.UndefOr[Boolean] = js.native
  var linewidth: js.UndefOr[Double] = js.native
  var morphNormals: js.UndefOr[Boolean] = js.native
  var morphTargets: js.UndefOr[Boolean] = js.native
  var skinning: js.UndefOr[Boolean] = js.native
  var uniforms: js.UndefOr[js.Any] = js.native
  var vertexShader: js.UndefOr[String] = js.native
  var wireframe: js.UndefOr[Boolean] = js.native
  var wireframeLinewidth: js.UndefOr[Double] = js.native
}

object ShaderMaterialParameters {
  @scala.inline
  def apply(): ShaderMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShaderMaterialParameters]
  }
  @scala.inline
  implicit class ShaderMaterialParametersOps[Self <: ShaderMaterialParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipping")(js.undefined)
        ret
    }
    @scala.inline
    def withDefines(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defines")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: Derivatives): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentShader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentShader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(js.undefined)
        ret
    }
    @scala.inline
    def withLights(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lights")(js.undefined)
        ret
    }
    @scala.inline
    def withLinewidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linewidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinewidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linewidth")(js.undefined)
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
    def withUniforms(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexShader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexShader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(js.undefined)
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

