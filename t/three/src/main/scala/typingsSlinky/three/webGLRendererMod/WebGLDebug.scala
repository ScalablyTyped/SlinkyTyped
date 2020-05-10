package typingsSlinky.three.webGLRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLDebug extends js.Object {
  /**
  	 * Enables error checking and reporting when shader programs are being compiled.
  	 */
  var checkShaderErrors: Boolean = js.native
}

object WebGLDebug {
  @scala.inline
  def apply(checkShaderErrors: Boolean): WebGLDebug = {
    val __obj = js.Dynamic.literal(checkShaderErrors = checkShaderErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLDebug]
  }
  @scala.inline
  implicit class WebGLDebugOps[Self <: WebGLDebug] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckShaderErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkShaderErrors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

