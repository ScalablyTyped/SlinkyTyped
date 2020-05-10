package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ANGLE_instanced_arrays extension is part of the WebGL API and allows to draw the same object, or groups of similar objects multiple times, if they share the same vertex data, primitive count and type. */
@js.native
trait ANGLEInstancedArrays extends js.Object {
  val VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum = js.native
  def drawArraysInstancedANGLE(mode: GLenum, first: GLint, count: GLsizei, primcount: GLsizei): Unit = js.native
  def drawElementsInstancedANGLE(mode: GLenum, count: GLsizei, `type`: GLenum, offset: GLintptr, primcount: GLsizei): Unit = js.native
  def vertexAttribDivisorANGLE(index: GLuint, divisor: GLuint): Unit = js.native
}

object ANGLEInstancedArrays {
  @scala.inline
  def apply(
    VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum,
    drawArraysInstancedANGLE: (GLenum, GLint, GLsizei, GLsizei) => Unit,
    drawElementsInstancedANGLE: (GLenum, GLsizei, GLenum, GLintptr, GLsizei) => Unit,
    vertexAttribDivisorANGLE: (GLuint, GLuint) => Unit
  ): ANGLEInstancedArrays = {
    val __obj = js.Dynamic.literal(VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE = VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE.asInstanceOf[js.Any], drawArraysInstancedANGLE = js.Any.fromFunction4(drawArraysInstancedANGLE), drawElementsInstancedANGLE = js.Any.fromFunction5(drawElementsInstancedANGLE), vertexAttribDivisorANGLE = js.Any.fromFunction2(vertexAttribDivisorANGLE))
    __obj.asInstanceOf[ANGLEInstancedArrays]
  }
  @scala.inline
  implicit class ANGLEInstancedArraysOps[Self <: ANGLEInstancedArrays] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE(value: GLenum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawArraysInstancedANGLE(value: (GLenum, GLint, GLsizei, GLsizei) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawArraysInstancedANGLE")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDrawElementsInstancedANGLE(value: (GLenum, GLsizei, GLenum, GLintptr, GLsizei) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawElementsInstancedANGLE")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withVertexAttribDivisorANGLE(value: (GLuint, GLuint) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexAttribDivisorANGLE")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

