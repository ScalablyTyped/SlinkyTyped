package typingsSlinky.tensorflowTfjsBackendWebgl.webglMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.ImageData
import org.scalajs.dom.raw.WebGLBuffer
import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLShader
import org.scalajs.dom.raw.WebGLTexture
import typingsSlinky.std.WebGL2RenderingContext
import typingsSlinky.tensorflowTfjsBackendWebgl.texUtilMod.TextureConfig
import typingsSlinky.tensorflowTfjsCore.distTypesMod.PixelData
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/webgl", "gpgpu_util")
@js.native
object gpgpuUtil extends js.Object {
  
  def bindVertexProgramAttributeStreams(gl: WebGLRenderingContext, debug: Boolean, program: WebGLProgram, vertexBuffer: WebGLBuffer): Boolean = js.native
  
  def createBufferFromOutputTexture(
    gl2: WebGL2RenderingContext,
    debug: Boolean,
    rows: Double,
    columns: Double,
    textureConfig: TextureConfig
  ): WebGLBuffer = js.native
  
  def createFloat16MatrixTexture(
    gl: WebGLRenderingContext,
    debug: Boolean,
    rows: Double,
    columns: Double,
    textureConfig: TextureConfig
  ): WebGLTexture = js.native
  
  def createFloat16PackedMatrixTexture(
    gl: WebGLRenderingContext,
    debug: Boolean,
    rows: Double,
    columns: Double,
    textureConfig: TextureConfig
  ): WebGLTexture = js.native
  
  def createFloat32MatrixTexture(
    gl: WebGLRenderingContext,
    debug: Boolean,
    rows: Double,
    columns: Double,
    textureConfig: TextureConfig
  ): WebGLTexture = js.native
  
  def createIndexBuffer(gl: WebGLRenderingContext, debug: Boolean): WebGLBuffer = js.native
  
  def createPackedMatrixTexture(
    gl: WebGLRenderingContext,
    debug: Boolean,
    rows: Double,
    columns: Double,
    textureConfig: TextureConfig
  ): WebGLTexture = js.native
  
  def createUnsignedBytesMatrixTexture(
    gl: WebGLRenderingContext,
    debug: Boolean,
    rows: Double,
    columns: Double,
    textureConfig: TextureConfig
  ): WebGLTexture = js.native
  
  def createVertexBuffer(gl: WebGLRenderingContext, debug: Boolean): WebGLBuffer = js.native
  
  def createVertexShader(gl: WebGLRenderingContext, debug: Boolean): WebGLShader = js.native
  
  def downloadByteEncodedFloatMatrixFromOutputTexture(
    gl: WebGLRenderingContext,
    debug: Boolean,
    rows: Double,
    columns: Double,
    textureConfig: TextureConfig
  ): js.typedarray.Float32Array = js.native
  
  def downloadFloat32MatrixFromBuffer(gl: WebGLRenderingContext, buffer: WebGLBuffer, size: Double): js.typedarray.Float32Array = js.native
  
  def downloadMatrixFromPackedOutputTexture(gl: WebGLRenderingContext, debug: Boolean, physicalRows: Double, physicalCols: Double): js.typedarray.Float32Array = js.native
  
  def downloadPackedMatrixFromBuffer(
    gl: WebGLRenderingContext,
    buffer: WebGLBuffer,
    batch: Double,
    rows: Double,
    cols: Double,
    physicalRows: Double,
    physicalCols: Double,
    textureConfig: TextureConfig
  ): js.typedarray.Float32Array = js.native
  
  def uploadDenseMatrixToTexture(
    gl: WebGLRenderingContext,
    debug: Boolean,
    texture: WebGLTexture,
    width: Double,
    height: Double,
    data: TypedArray,
    textureConfig: TextureConfig
  ): Unit = js.native
  
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, debug: Boolean, texture: WebGLTexture, pixels: HTMLCanvasElement): Unit = js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, debug: Boolean, texture: WebGLTexture, pixels: HTMLImageElement): Unit = js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, debug: Boolean, texture: WebGLTexture, pixels: HTMLVideoElement): Unit = js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, debug: Boolean, texture: WebGLTexture, pixels: ImageData): Unit = js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, debug: Boolean, texture: WebGLTexture, pixels: PixelData): Unit = js.native
}
