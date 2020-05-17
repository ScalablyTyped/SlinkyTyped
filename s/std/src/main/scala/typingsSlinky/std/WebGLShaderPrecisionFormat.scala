package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Part of the WebGL API and represents the information returned by calling the WebGLRenderingContext.getShaderPrecisionFormat() method. */
@js.native
trait WebGLShaderPrecisionFormat extends js.Object {
  val precision: GLint = js.native
  val rangeMax: GLint = js.native
  val rangeMin: GLint = js.native
}

object WebGLShaderPrecisionFormat {
  @scala.inline
  def apply(precision: GLint, rangeMax: GLint, rangeMin: GLint): WebGLShaderPrecisionFormat = {
    val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any], rangeMax = rangeMax.asInstanceOf[js.Any], rangeMin = rangeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLShaderPrecisionFormat]
  }
  @scala.inline
  implicit class WebGLShaderPrecisionFormatOps[Self <: org.scalajs.dom.raw.WebGLShaderPrecisionFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrecision(value: GLint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeMax(value: GLint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeMin(value: GLint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

