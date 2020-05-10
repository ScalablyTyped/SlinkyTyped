package typingsSlinky.three.webGLRenderTargetMod

import typingsSlinky.three.constantsMod.TextureDataType
import typingsSlinky.three.constantsMod.TextureFilter
import typingsSlinky.three.constantsMod.Wrapping
import typingsSlinky.three.depthTextureMod.DepthTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLRenderTargetOptions extends js.Object {
   // UnsignedByteType;
  var anisotropy: js.UndefOr[Double] = js.native
   // 1;
  var depthBuffer: js.UndefOr[Boolean] = js.native
   // true;
  var depthTexture: js.UndefOr[DepthTexture] = js.native
  var format: js.UndefOr[Double] = js.native
   // true;
  var generateMipmaps: js.UndefOr[Boolean] = js.native
  var magFilter: js.UndefOr[TextureFilter] = js.native
  var minFilter: js.UndefOr[TextureFilter] = js.native
   // true;
  var stencilBuffer: js.UndefOr[Boolean] = js.native
   // RGBAFormat;
  var `type`: js.UndefOr[TextureDataType] = js.native
  var wrapS: js.UndefOr[Wrapping] = js.native
  var wrapT: js.UndefOr[Wrapping] = js.native
}

object WebGLRenderTargetOptions {
  @scala.inline
  def apply(): WebGLRenderTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLRenderTargetOptions]
  }
  @scala.inline
  implicit class WebGLRenderTargetOptionsOps[Self <: WebGLRenderTargetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnisotropy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anisotropy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnisotropy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anisotropy")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthTexture(value: DepthTexture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthTexture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthTexture")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateMipmaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateMipmaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateMipmaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateMipmaps")(js.undefined)
        ret
    }
    @scala.inline
    def withMagFilter(value: TextureFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFilter(value: TextureFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withStencilBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStencilBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencilBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: TextureDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapS(value: Wrapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapS")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapT(value: Wrapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapT")(js.undefined)
        ret
    }
  }
  
}

