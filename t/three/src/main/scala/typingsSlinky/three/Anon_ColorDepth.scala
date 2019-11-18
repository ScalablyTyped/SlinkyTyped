package typingsSlinky.three

import typingsSlinky.three.srcRenderersWebglWebGLStateMod.WebGLColorBuffer
import typingsSlinky.three.srcRenderersWebglWebGLStateMod.WebGLDepthBuffer
import typingsSlinky.three.srcRenderersWebglWebGLStateMod.WebGLStencilBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorDepth extends js.Object {
  var color: WebGLColorBuffer
  var depth: WebGLDepthBuffer
  var stencil: WebGLStencilBuffer
}

object Anon_ColorDepth {
  @scala.inline
  def apply(color: WebGLColorBuffer, depth: WebGLDepthBuffer, stencil: WebGLStencilBuffer): Anon_ColorDepth = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColorDepth]
  }
}

