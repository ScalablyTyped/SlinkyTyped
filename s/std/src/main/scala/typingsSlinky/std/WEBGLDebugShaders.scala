package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WEBGLDebugShaders extends js.Object {
  def getTranslatedShaderSource(shader: org.scalajs.dom.raw.WebGLShader): java.lang.String = js.native
}

object WEBGLDebugShaders {
  @scala.inline
  def apply(getTranslatedShaderSource: org.scalajs.dom.raw.WebGLShader => java.lang.String): WEBGLDebugShaders = {
    val __obj = js.Dynamic.literal(getTranslatedShaderSource = js.Any.fromFunction1(getTranslatedShaderSource))
    __obj.asInstanceOf[WEBGLDebugShaders]
  }
  @scala.inline
  implicit class WEBGLDebugShadersOps[Self <: WEBGLDebugShaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTranslatedShaderSource(value: org.scalajs.dom.raw.WebGLShader => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTranslatedShaderSource")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

