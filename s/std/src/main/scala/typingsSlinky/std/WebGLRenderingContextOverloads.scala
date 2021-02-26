package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLRenderingContextOverloads extends StObject {
  
  def bufferData(target: GLenum, data: Null, usage: GLenum): Unit = js.native
  def bufferData(target: GLenum, data: BufferSource, usage: GLenum): Unit = js.native
  def bufferData(target: GLenum, size: GLsizeiptr, usage: GLenum): Unit = js.native
  
  def bufferSubData(target: GLenum, offset: GLintptr, data: BufferSource): Unit = js.native
  
  def compressedTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    data: js.typedarray.ArrayBufferView
  ): Unit = js.native
  
  def compressedTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    data: js.typedarray.ArrayBufferView
  ): Unit = js.native
  
  def readPixels(x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum, `type`: GLenum): Unit = js.native
  def readPixels(
    x: GLint,
    y: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    pixels: js.typedarray.ArrayBufferView
  ): Unit = js.native
  
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSource
  ): Unit = js.native
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    format: GLenum,
    `type`: GLenum
  ): Unit = js.native
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    format: GLenum,
    `type`: GLenum,
    pixels: js.typedarray.ArrayBufferView
  ): Unit = js.native
  
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSource
  ): Unit = js.native
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum
  ): Unit = js.native
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    pixels: js.typedarray.ArrayBufferView
  ): Unit = js.native
  
  def uniform1fv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: js.Iterable[GLfloat]): Unit = js.native
  def uniform1fv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: Float32List): Unit = js.native
  def uniform1fv(location: Null, v: js.Iterable[GLfloat]): Unit = js.native
  def uniform1fv(location: Null, v: Float32List): Unit = js.native
  
  def uniform1iv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: js.Iterable[GLint]): Unit = js.native
  def uniform1iv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: Int32List): Unit = js.native
  def uniform1iv(location: Null, v: js.Iterable[GLint]): Unit = js.native
  def uniform1iv(location: Null, v: Int32List): Unit = js.native
  
  def uniform2fv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: js.Iterable[GLfloat]): Unit = js.native
  def uniform2fv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: Float32List): Unit = js.native
  def uniform2fv(location: Null, v: js.Iterable[GLfloat]): Unit = js.native
  def uniform2fv(location: Null, v: Float32List): Unit = js.native
  
  def uniform2iv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: js.Iterable[GLint]): Unit = js.native
  def uniform2iv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: Int32List): Unit = js.native
  def uniform2iv(location: Null, v: js.Iterable[GLint]): Unit = js.native
  def uniform2iv(location: Null, v: Int32List): Unit = js.native
  
  def uniform3fv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: js.Iterable[GLfloat]): Unit = js.native
  def uniform3fv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: Float32List): Unit = js.native
  def uniform3fv(location: Null, v: js.Iterable[GLfloat]): Unit = js.native
  def uniform3fv(location: Null, v: Float32List): Unit = js.native
  
  def uniform3iv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: js.Iterable[GLint]): Unit = js.native
  def uniform3iv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: Int32List): Unit = js.native
  def uniform3iv(location: Null, v: js.Iterable[GLint]): Unit = js.native
  def uniform3iv(location: Null, v: Int32List): Unit = js.native
  
  def uniform4fv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: js.Iterable[GLfloat]): Unit = js.native
  def uniform4fv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: Float32List): Unit = js.native
  def uniform4fv(location: Null, v: js.Iterable[GLfloat]): Unit = js.native
  def uniform4fv(location: Null, v: Float32List): Unit = js.native
  
  def uniform4iv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: js.Iterable[GLint]): Unit = js.native
  def uniform4iv(location: org.scalajs.dom.raw.WebGLUniformLocation, v: Int32List): Unit = js.native
  def uniform4iv(location: Null, v: js.Iterable[GLint]): Unit = js.native
  def uniform4iv(location: Null, v: Int32List): Unit = js.native
  
  def uniformMatrix2fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    value: js.Iterable[GLfloat]
  ): Unit = js.native
  def uniformMatrix2fv(location: org.scalajs.dom.raw.WebGLUniformLocation, transpose: GLboolean, value: Float32List): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: GLboolean, value: js.Iterable[GLfloat]): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: GLboolean, value: Float32List): Unit = js.native
  
  def uniformMatrix3fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    value: js.Iterable[GLfloat]
  ): Unit = js.native
  def uniformMatrix3fv(location: org.scalajs.dom.raw.WebGLUniformLocation, transpose: GLboolean, value: Float32List): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: GLboolean, value: js.Iterable[GLfloat]): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: GLboolean, value: Float32List): Unit = js.native
  
  def uniformMatrix4fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    value: js.Iterable[GLfloat]
  ): Unit = js.native
  def uniformMatrix4fv(location: org.scalajs.dom.raw.WebGLUniformLocation, transpose: GLboolean, value: Float32List): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: GLboolean, value: js.Iterable[GLfloat]): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: GLboolean, value: Float32List): Unit = js.native
}
