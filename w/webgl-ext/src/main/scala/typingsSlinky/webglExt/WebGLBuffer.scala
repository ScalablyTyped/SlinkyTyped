package typingsSlinky.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLBuffer extends js.Object {
  val __WebGLBuffer: Unit = js.native
}

object WebGLBuffer {
  @scala.inline
  def apply(__WebGLBuffer: Unit): WebGLBuffer = {
    val __obj = js.Dynamic.literal(__WebGLBuffer = __WebGLBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLBuffer]
  }
  @scala.inline
  implicit class WebGLBufferOps[Self <: WebGLBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__WebGLBuffer(value: Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__WebGLBuffer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

