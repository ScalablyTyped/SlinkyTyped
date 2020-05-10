package typingsSlinky.three

import typingsSlinky.three.webGLStateMod.WebGLColorBuffer
import typingsSlinky.three.webGLStateMod.WebGLDepthBuffer
import typingsSlinky.three.webGLStateMod.WebGLStencilBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStencil extends js.Object {
  var color: WebGLColorBuffer = js.native
  var depth: WebGLDepthBuffer = js.native
  var stencil: WebGLStencilBuffer = js.native
}

object AnonStencil {
  @scala.inline
  def apply(color: WebGLColorBuffer, depth: WebGLDepthBuffer, stencil: WebGLStencilBuffer): AnonStencil = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStencil]
  }
  @scala.inline
  implicit class AnonStencilOps[Self <: AnonStencil] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: WebGLColorBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: WebGLDepthBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStencil(value: WebGLStencilBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencil")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

