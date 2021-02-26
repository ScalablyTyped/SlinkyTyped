package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The ANGLE_instanced_arrays extension is part of the WebGL API and allows to draw the same object, or groups of similar objects multiple times, if they share the same vertex data, primitive count and type. */
@js.native
trait ANGLEInstancedArrays extends StObject {
  
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
  implicit class ANGLEInstancedArraysMutableBuilder[Self <: ANGLEInstancedArrays] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawArraysInstancedANGLE(value: (GLenum, GLint, GLsizei, GLsizei) => Unit): Self = StObject.set(x, "drawArraysInstancedANGLE", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDrawElementsInstancedANGLE(value: (GLenum, GLsizei, GLenum, GLintptr, GLsizei) => Unit): Self = StObject.set(x, "drawElementsInstancedANGLE", js.Any.fromFunction5(value))
    
    @scala.inline
    def setVERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE(value: GLenum): Self = StObject.set(x, "VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexAttribDivisorANGLE(value: (GLuint, GLuint) => Unit): Self = StObject.set(x, "vertexAttribDivisorANGLE", js.Any.fromFunction2(value))
  }
}
