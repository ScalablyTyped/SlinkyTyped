package typingsSlinky.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLProgram extends js.Object {
  val __WebGLProgram: Unit = js.native
}

object WebGLProgram {
  @scala.inline
  def apply(__WebGLProgram: Unit): WebGLProgram = {
    val __obj = js.Dynamic.literal(__WebGLProgram = __WebGLProgram.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLProgram]
  }
  @scala.inline
  implicit class WebGLProgramOps[Self <: WebGLProgram] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__WebGLProgram(value: Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__WebGLProgram")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

