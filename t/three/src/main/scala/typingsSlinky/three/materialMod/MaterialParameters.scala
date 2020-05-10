package typingsSlinky.three.materialMod

import typingsSlinky.three.constantsMod.Blending
import typingsSlinky.three.constantsMod.BlendingDstFactor
import typingsSlinky.three.constantsMod.BlendingEquation
import typingsSlinky.three.constantsMod.BlendingSrcFactor
import typingsSlinky.three.constantsMod.Colors
import typingsSlinky.three.constantsMod.DepthModes
import typingsSlinky.three.constantsMod.Side
import typingsSlinky.three.constantsMod.StencilFunc
import typingsSlinky.three.constantsMod.StencilOp
import typingsSlinky.three.planeMod.Plane
import typingsSlinky.three.threeStrings.highp
import typingsSlinky.three.threeStrings.lowp
import typingsSlinky.three.threeStrings.mediump
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaterialParameters extends js.Object {
  var alphaTest: js.UndefOr[Double] = js.native
  var blendDst: js.UndefOr[BlendingDstFactor] = js.native
  var blendDstAlpha: js.UndefOr[Double] = js.native
  var blendEquation: js.UndefOr[BlendingEquation] = js.native
  var blendEquationAlpha: js.UndefOr[Double] = js.native
  var blendSrc: js.UndefOr[BlendingSrcFactor | BlendingDstFactor] = js.native
  var blendSrcAlpha: js.UndefOr[Double] = js.native
  var blending: js.UndefOr[Blending] = js.native
  var clipIntersection: js.UndefOr[Boolean] = js.native
  var clipShadows: js.UndefOr[Boolean] = js.native
  var clippingPlanes: js.UndefOr[js.Array[Plane]] = js.native
  var colorWrite: js.UndefOr[Boolean] = js.native
  var depthFunc: js.UndefOr[DepthModes] = js.native
  var depthTest: js.UndefOr[Boolean] = js.native
  var depthWrite: js.UndefOr[Boolean] = js.native
  var dithering: js.UndefOr[Boolean] = js.native
  var flatShading: js.UndefOr[Boolean] = js.native
  var fog: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var overdraw: js.UndefOr[Double] = js.native
  var polygonOffset: js.UndefOr[Boolean] = js.native
  var polygonOffsetFactor: js.UndefOr[Double] = js.native
  var polygonOffsetUnits: js.UndefOr[Double] = js.native
  var precision: js.UndefOr[highp | mediump | lowp | Null] = js.native
  var premultipliedAlpha: js.UndefOr[Boolean] = js.native
  var shadowSide: js.UndefOr[Side] = js.native
  var side: js.UndefOr[Side] = js.native
  var stencilFail: js.UndefOr[StencilOp] = js.native
  var stencilFunc: js.UndefOr[StencilFunc] = js.native
  var stencilMask: js.UndefOr[Double] = js.native
  var stencilRef: js.UndefOr[Double] = js.native
  var stencilWrite: js.UndefOr[Boolean] = js.native
  var stencilZFail: js.UndefOr[StencilOp] = js.native
  var stencilZPass: js.UndefOr[StencilOp] = js.native
  var toneMapped: js.UndefOr[Boolean] = js.native
  var transparent: js.UndefOr[Boolean] = js.native
  var vertexColors: js.UndefOr[Colors] = js.native
  var vertexTangents: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object MaterialParameters {
  @scala.inline
  def apply(): MaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterialParameters]
  }
  @scala.inline
  implicit class MaterialParametersOps[Self <: MaterialParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaTest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaTest")(js.undefined)
        ret
    }
    @scala.inline
    def withBlendDst(value: BlendingDstFactor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendDst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendDst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendDst")(js.undefined)
        ret
    }
    @scala.inline
    def withBlendDstAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendDstAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendDstAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendDstAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withBlendEquation(value: BlendingEquation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendEquation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendEquation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendEquation")(js.undefined)
        ret
    }
    @scala.inline
    def withBlendEquationAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendEquationAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendEquationAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendEquationAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withBlendSrc(value: BlendingSrcFactor | BlendingDstFactor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withBlendSrcAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendSrcAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendSrcAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendSrcAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withBlending(value: Blending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blending")(js.undefined)
        ret
    }
    @scala.inline
    def withClipIntersection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipIntersection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipIntersection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipIntersection")(js.undefined)
        ret
    }
    @scala.inline
    def withClipShadows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipShadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipShadows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipShadows")(js.undefined)
        ret
    }
    @scala.inline
    def withClippingPlanes(value: js.Array[Plane]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippingPlanes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClippingPlanes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippingPlanes")(js.undefined)
        ret
    }
    @scala.inline
    def withColorWrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorWrite")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthFunc(value: DepthModes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthTest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthTest")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthWrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthWrite")(js.undefined)
        ret
    }
    @scala.inline
    def withDithering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dithering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDithering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dithering")(js.undefined)
        ret
    }
    @scala.inline
    def withFlatShading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatShading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatShading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatShading")(js.undefined)
        ret
    }
    @scala.inline
    def withFog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fog")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOverdraw(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overdraw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverdraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overdraw")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonOffset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonOffsetFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOffsetFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonOffsetFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOffsetFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonOffsetUnits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOffsetUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonOffsetUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOffsetUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: highp | mediump | lowp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecisionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(null)
        ret
    }
    @scala.inline
    def withPremultipliedAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premultipliedAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremultipliedAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premultipliedAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowSide(value: Side): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowSide")(js.undefined)
        ret
    }
    @scala.inline
    def withSide(value: Side): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
        ret
    }
    @scala.inline
    def withStencilFail(value: StencilOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilFail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStencilFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilFail")(js.undefined)
        ret
    }
    @scala.inline
    def withStencilFunc(value: StencilFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStencilFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withStencilMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStencilMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilMask")(js.undefined)
        ret
    }
    @scala.inline
    def withStencilRef(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStencilRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilRef")(js.undefined)
        ret
    }
    @scala.inline
    def withStencilWrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStencilWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilWrite")(js.undefined)
        ret
    }
    @scala.inline
    def withStencilZFail(value: StencilOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilZFail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStencilZFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilZFail")(js.undefined)
        ret
    }
    @scala.inline
    def withStencilZPass(value: StencilOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilZPass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStencilZPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilZPass")(js.undefined)
        ret
    }
    @scala.inline
    def withToneMapped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toneMapped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToneMapped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toneMapped")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexColors(value: Colors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexColors")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexTangents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexTangents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexTangents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexTangents")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

