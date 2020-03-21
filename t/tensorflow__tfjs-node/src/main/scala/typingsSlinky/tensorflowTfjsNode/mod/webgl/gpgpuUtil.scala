package typingsSlinky.tensorflowTfjsNode.mod.webgl

import org.scalajs.dom.raw.WebGLBuffer
import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLShader
import org.scalajs.dom.raw.WebGLTexture
import typingsSlinky.std.HTMLCanvasElement
import typingsSlinky.std.HTMLImageElement
import typingsSlinky.std.HTMLVideoElement
import typingsSlinky.std.ImageData
import typingsSlinky.std.WebGL2RenderingContext
import typingsSlinky.tensorflowTfjsCore.distTypesMod.PixelData
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsSlinky.tensorflowTfjsCore.texUtilMod.TextureConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "webgl.gpgpu_util")
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
  ): scala.scalajs.js.typedarray.Float32Array = js.native
  def downloadFloat32MatrixFromBuffer(gl: WebGLRenderingContext, buffer: WebGLBuffer, size: Double): scala.scalajs.js.typedarray.Float32Array = js.native
  def downloadMatrixFromPackedOutputTexture(gl: WebGLRenderingContext, debug: Boolean, physicalRows: Double, physicalCols: Double): scala.scalajs.js.typedarray.Float32Array = js.native
  def downloadPackedMatrixFromBuffer(
    gl: WebGLRenderingContext,
    buffer: WebGLBuffer,
    batch: Double,
    rows: Double,
    cols: Double,
    physicalRows: Double,
    physicalCols: Double,
    textureConfig: TextureConfig
  ): scala.scalajs.js.typedarray.Float32Array = js.native
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

