package typingsSlinky.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLShader extends js.Object {
  val __WebGLShader: Unit = js.native
}

object WebGLShader {
  @scala.inline
  def apply(__WebGLShader: Unit): WebGLShader = {
    val __obj = js.Dynamic.literal(__WebGLShader = __WebGLShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLShader]
  }
  @scala.inline
  implicit class WebGLShaderOps[Self <: WebGLShader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__WebGLShader(value: Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__WebGLShader")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

