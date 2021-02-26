package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGL2RenderingContextOverloads extends StObject {
  
  def bufferData(target: GLenum, size: GLsizeiptr, usage: GLenum): Unit = js.native
  def bufferData(target: GLenum, srcData: js.typedarray.ArrayBufferView, usage: GLenum, srcOffset: GLuint): Unit = js.native
  def bufferData(
    target: GLenum,
    srcData: js.typedarray.ArrayBufferView,
    usage: GLenum,
    srcOffset: GLuint,
    length: GLuint
  ): Unit = js.native
  def bufferData(target: GLenum, srcData: Null, usage: GLenum): Unit = js.native
  def bufferData(target: GLenum, srcData: BufferSource, usage: GLenum): Unit = js.native
  
  def bufferSubData(target: GLenum, dstByteOffset: GLintptr, srcData: js.typedarray.ArrayBufferView, srcOffset: GLuint): Unit = js.native
  def bufferSubData(
    target: GLenum,
    dstByteOffset: GLintptr,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: GLuint,
    length: GLuint
  ): Unit = js.native
  def bufferSubData(target: GLenum, dstByteOffset: GLintptr, srcData: BufferSource): Unit = js.native
  
  def compressedTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    imageSize: GLsizei,
    offset: GLintptr
  ): Unit = js.native
  def compressedTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    srcData: js.typedarray.ArrayBufferView
  ): Unit = js.native
  def compressedTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLengthOverride: GLuint
  ): Unit = js.native
  def compressedTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: GLuint
  ): Unit = js.native
  def compressedTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: GLuint,
    srcLengthOverride: GLuint
  ): Unit = js.native
  
  def compressedTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    imageSize: GLsizei,
    offset: GLintptr
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    srcData: js.typedarray.ArrayBufferView
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLengthOverride: GLuint
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: GLuint
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: GLuint,
    srcLengthOverride: GLuint
  ): Unit = js.native
  
  def readPixels(x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum, `type`: GLenum): Unit = js.native
  def readPixels(
    x: GLint,
    y: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    dstData: js.typedarray.ArrayBufferView
  ): Unit = js.native
  def readPixels(
    x: GLint,
    y: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    dstData: js.typedarray.ArrayBufferView,
    dstOffset: GLuint
  ): Unit = js.native
  def readPixels(
    x: GLint,
    y: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    offset: GLintptr
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
    pboOffset: GLintptr
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
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
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
    `type`: GLenum,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: GLuint
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
    pboOffset: GLintptr
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
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
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
    `type`: GLenum,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: GLuint
  ): Unit = js.native
  
  def uniform1fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLfloat]): Unit = js.native
  def uniform1fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLfloat],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform1fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform1fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform1fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Float32List): Unit = js.native
  def uniform1fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Float32List,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform1fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform1fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Float32List,
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform1fv(location: Null, data: js.Iterable[GLfloat]): Unit = js.native
  def uniform1fv(
    location: Null,
    data: js.Iterable[GLfloat],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform1fv(location: Null, data: js.Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform1fv(location: Null, data: js.Iterable[GLfloat], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform1fv(location: Null, data: Float32List): Unit = js.native
  def uniform1fv(location: Null, data: Float32List, srcOffset: js.UndefOr[scala.Nothing], srcLength: GLuint): Unit = js.native
  def uniform1fv(location: Null, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform1fv(location: Null, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  
  def uniform1iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLint]): Unit = js.native
  def uniform1iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLint],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform1iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform1iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLint],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform1iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Int32List): Unit = js.native
  def uniform1iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Int32List,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform1iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform1iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Int32List,
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform1iv(location: Null, data: js.Iterable[GLint]): Unit = js.native
  def uniform1iv(location: Null, data: js.Iterable[GLint], srcOffset: js.UndefOr[scala.Nothing], srcLength: GLuint): Unit = js.native
  def uniform1iv(location: Null, data: js.Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform1iv(location: Null, data: js.Iterable[GLint], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform1iv(location: Null, data: Int32List): Unit = js.native
  def uniform1iv(location: Null, data: Int32List, srcOffset: js.UndefOr[scala.Nothing], srcLength: GLuint): Unit = js.native
  def uniform1iv(location: Null, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform1iv(location: Null, data: Int32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  
  def uniform2fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLfloat]): Unit = js.native
  def uniform2fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLfloat],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform2fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform2fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform2fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Float32List): Unit = js.native
  def uniform2fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Float32List,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform2fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform2fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Float32List,
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform2fv(location: Null, data: js.Iterable[GLfloat]): Unit = js.native
  def uniform2fv(
    location: Null,
    data: js.Iterable[GLfloat],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform2fv(location: Null, data: js.Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform2fv(location: Null, data: js.Iterable[GLfloat], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform2fv(location: Null, data: Float32List): Unit = js.native
  def uniform2fv(location: Null, data: Float32List, srcOffset: js.UndefOr[scala.Nothing], srcLength: GLuint): Unit = js.native
  def uniform2fv(location: Null, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform2fv(location: Null, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  
  def uniform2iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLint]): Unit = js.native
  def uniform2iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLint],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform2iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform2iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLint],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform2iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Int32List): Unit = js.native
  def uniform2iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Int32List,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform2iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform2iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Int32List,
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform2iv(location: Null, data: js.Iterable[GLint]): Unit = js.native
  def uniform2iv(location: Null, data: js.Iterable[GLint], srcOffset: js.UndefOr[scala.Nothing], srcLength: GLuint): Unit = js.native
  def uniform2iv(location: Null, data: js.Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform2iv(location: Null, data: js.Iterable[GLint], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform2iv(location: Null, data: Int32List): Unit = js.native
  def uniform2iv(location: Null, data: Int32List, srcOffset: js.UndefOr[scala.Nothing], srcLength: GLuint): Unit = js.native
  def uniform2iv(location: Null, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform2iv(location: Null, data: Int32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  
  def uniform3fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLfloat]): Unit = js.native
  def uniform3fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLfloat],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform3fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform3fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform3fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Float32List): Unit = js.native
  def uniform3fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Float32List,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform3fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform3fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Float32List,
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform3fv(location: Null, data: js.Iterable[GLfloat]): Unit = js.native
  def uniform3fv(
    location: Null,
    data: js.Iterable[GLfloat],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform3fv(location: Null, data: js.Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform3fv(location: Null, data: js.Iterable[GLfloat], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform3fv(location: Null, data: Float32List): Unit = js.native
  def uniform3fv(location: Null, data: Float32List, srcOffset: js.UndefOr[scala.Nothing], srcLength: GLuint): Unit = js.native
  def uniform3fv(location: Null, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform3fv(location: Null, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  
  def uniform3iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLint]): Unit = js.native
  def uniform3iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLint],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform3iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform3iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLint],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform3iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Int32List): Unit = js.native
  def uniform3iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Int32List,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform3iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform3iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Int32List,
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform3iv(location: Null, data: js.Iterable[GLint]): Unit = js.native
  def uniform3iv(location: Null, data: js.Iterable[GLint], srcOffset: js.UndefOr[scala.Nothing], srcLength: GLuint): Unit = js.native
  def uniform3iv(location: Null, data: js.Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform3iv(location: Null, data: js.Iterable[GLint], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform3iv(location: Null, data: Int32List): Unit = js.native
  def uniform3iv(location: Null, data: Int32List, srcOffset: js.UndefOr[scala.Nothing], srcLength: GLuint): Unit = js.native
  def uniform3iv(location: Null, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform3iv(location: Null, data: Int32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  
  def uniform4fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLfloat]): Unit = js.native
  def uniform4fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLfloat],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform4fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform4fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform4fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Float32List): Unit = js.native
  def uniform4fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Float32List,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform4fv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform4fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Float32List,
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform4fv(location: Null, data: js.Iterable[GLfloat]): Unit = js.native
  def uniform4fv(
    location: Null,
    data: js.Iterable[GLfloat],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform4fv(location: Null, data: js.Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniform4fv(location: Null, data: js.Iterable[GLfloat], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform4fv(location: Null, data: Float32List): Unit = js.native
  def uniform4fv(location: Null, data: Float32List, srcOffset: js.UndefOr[scala.Nothing], srcLength: GLuint): Unit = js.native
  def uniform4fv(location: Null, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniform4fv(location: Null, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  
  def uniform4iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLint]): Unit = js.native
  def uniform4iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLint],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform4iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: js.Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform4iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: js.Iterable[GLint],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform4iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Int32List): Unit = js.native
  def uniform4iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Int32List,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniform4iv(location: org.scalajs.dom.raw.WebGLUniformLocation, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform4iv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    data: Int32List,
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniform4iv(location: Null, data: js.Iterable[GLint]): Unit = js.native
  def uniform4iv(location: Null, data: js.Iterable[GLint], srcOffset: js.UndefOr[scala.Nothing], srcLength: GLuint): Unit = js.native
  def uniform4iv(location: Null, data: js.Iterable[GLint], srcOffset: GLuint): Unit = js.native
  def uniform4iv(location: Null, data: js.Iterable[GLint], srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  def uniform4iv(location: Null, data: Int32List): Unit = js.native
  def uniform4iv(location: Null, data: Int32List, srcOffset: js.UndefOr[scala.Nothing], srcLength: GLuint): Unit = js.native
  def uniform4iv(location: Null, data: Int32List, srcOffset: GLuint): Unit = js.native
  def uniform4iv(location: Null, data: Int32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  
  def uniformMatrix2fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: js.Iterable[GLfloat]
  ): Unit = js.native
  def uniformMatrix2fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: js.Iterable[GLfloat],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix2fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: js.Iterable[GLfloat],
    srcOffset: GLuint
  ): Unit = js.native
  def uniformMatrix2fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: js.Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix2fv(location: org.scalajs.dom.raw.WebGLUniformLocation, transpose: GLboolean, data: Float32List): Unit = js.native
  def uniformMatrix2fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix2fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List,
    srcOffset: GLuint
  ): Unit = js.native
  def uniformMatrix2fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List,
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: GLboolean, data: js.Iterable[GLfloat]): Unit = js.native
  def uniformMatrix2fv(
    location: Null,
    transpose: GLboolean,
    data: js.Iterable[GLfloat],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: GLboolean, data: js.Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniformMatrix2fv(
    location: Null,
    transpose: GLboolean,
    data: js.Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: GLboolean, data: Float32List): Unit = js.native
  def uniformMatrix2fv(
    location: Null,
    transpose: GLboolean,
    data: Float32List,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: GLboolean, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: GLboolean, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  
  def uniformMatrix3fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: js.Iterable[GLfloat]
  ): Unit = js.native
  def uniformMatrix3fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: js.Iterable[GLfloat],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix3fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: js.Iterable[GLfloat],
    srcOffset: GLuint
  ): Unit = js.native
  def uniformMatrix3fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: js.Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix3fv(location: org.scalajs.dom.raw.WebGLUniformLocation, transpose: GLboolean, data: Float32List): Unit = js.native
  def uniformMatrix3fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix3fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List,
    srcOffset: GLuint
  ): Unit = js.native
  def uniformMatrix3fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List,
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: GLboolean, data: js.Iterable[GLfloat]): Unit = js.native
  def uniformMatrix3fv(
    location: Null,
    transpose: GLboolean,
    data: js.Iterable[GLfloat],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: GLboolean, data: js.Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniformMatrix3fv(
    location: Null,
    transpose: GLboolean,
    data: js.Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: GLboolean, data: Float32List): Unit = js.native
  def uniformMatrix3fv(
    location: Null,
    transpose: GLboolean,
    data: Float32List,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: GLboolean, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: GLboolean, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
  
  def uniformMatrix4fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: js.Iterable[GLfloat]
  ): Unit = js.native
  def uniformMatrix4fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: js.Iterable[GLfloat],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix4fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: js.Iterable[GLfloat],
    srcOffset: GLuint
  ): Unit = js.native
  def uniformMatrix4fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: js.Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix4fv(location: org.scalajs.dom.raw.WebGLUniformLocation, transpose: GLboolean, data: Float32List): Unit = js.native
  def uniformMatrix4fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix4fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List,
    srcOffset: GLuint
  ): Unit = js.native
  def uniformMatrix4fv(
    location: org.scalajs.dom.raw.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List,
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: GLboolean, data: js.Iterable[GLfloat]): Unit = js.native
  def uniformMatrix4fv(
    location: Null,
    transpose: GLboolean,
    data: js.Iterable[GLfloat],
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: GLboolean, data: js.Iterable[GLfloat], srcOffset: GLuint): Unit = js.native
  def uniformMatrix4fv(
    location: Null,
    transpose: GLboolean,
    data: js.Iterable[GLfloat],
    srcOffset: GLuint,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: GLboolean, data: Float32List): Unit = js.native
  def uniformMatrix4fv(
    location: Null,
    transpose: GLboolean,
    data: Float32List,
    srcOffset: js.UndefOr[scala.Nothing],
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: GLboolean, data: Float32List, srcOffset: GLuint): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: GLboolean, data: Float32List, srcOffset: GLuint, srcLength: GLuint): Unit = js.native
}
