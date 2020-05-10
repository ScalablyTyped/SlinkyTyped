package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The WEBGL_depth_texture extension is part of the WebGL API and defines 2D depth and depth-stencil textures. */
@js.native
trait WEBGLDepthTexture extends js.Object {
  val UNSIGNED_INT_24_8_WEBGL: GLenum = js.native
}

object WEBGLDepthTexture {
  @scala.inline
  def apply(UNSIGNED_INT_24_8_WEBGL: GLenum): WEBGLDepthTexture = {
    val __obj = js.Dynamic.literal(UNSIGNED_INT_24_8_WEBGL = UNSIGNED_INT_24_8_WEBGL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLDepthTexture]
  }
  @scala.inline
  implicit class WEBGLDepthTextureOps[Self <: WEBGLDepthTexture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUNSIGNED_INT_24_8_WEBGL(value: GLenum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNSIGNED_INT_24_8_WEBGL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

