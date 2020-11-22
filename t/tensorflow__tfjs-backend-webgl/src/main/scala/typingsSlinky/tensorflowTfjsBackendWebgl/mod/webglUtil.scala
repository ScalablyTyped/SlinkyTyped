package typingsSlinky.tensorflowTfjsBackendWebgl.mod

import org.scalajs.dom.raw.WebGLBuffer
import org.scalajs.dom.raw.WebGLFramebuffer
import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLShader
import org.scalajs.dom.raw.WebGLTexture
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglNumbers.`1`
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglNumbers.`2`
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util")
@js.native
object webglUtil extends js.Object {
  
  def assertNotComplex(tensor: js.Array[TensorInfo], opName: String): Unit = js.native
  def assertNotComplex(tensor: TensorInfo, opName: String): Unit = js.native
  
  def bindCanvasToFramebuffer(gl: WebGLRenderingContext): Unit = js.native
  
  def bindColorTextureToFramebuffer(gl: WebGLRenderingContext, texture: WebGLTexture, framebuffer: WebGLFramebuffer): Unit = js.native
  
  def bindTextureToProgramUniformSampler(
    gl: WebGLRenderingContext,
    texture: WebGLTexture,
    uniformSamplerLocation: WebGLUniformLocation,
    textureUnit: Double
  ): Unit = js.native
  
  def bindTextureUnit(gl: WebGLRenderingContext, texture: WebGLTexture, textureUnit: Double): Unit = js.native
  
  def bindVertexBufferToProgramAttribute(
    gl: WebGLRenderingContext,
    program: WebGLProgram,
    attribute: String,
    buffer: WebGLBuffer,
    arrayEntriesPerItem: Double,
    itemStrideInBytes: Double,
    itemOffsetInBytes: Double
  ): Boolean = js.native
  
  def callAndCheck[T](gl: WebGLRenderingContext, func: js.Function0[T]): T = js.native
  
  def canBeRepresented(num: Double): Boolean = js.native
  
  def createFragmentShader(gl: WebGLRenderingContext, fragmentShaderSource: String): WebGLShader = js.native
  
  def createFramebuffer(gl: WebGLRenderingContext): WebGLFramebuffer = js.native
  
  def createProgram(gl: WebGLRenderingContext): WebGLProgram = js.native
  
  def createStaticIndexBuffer(gl: WebGLRenderingContext, data: js.typedarray.Uint16Array): WebGLBuffer = js.native
  
  def createStaticVertexBuffer(gl: WebGLRenderingContext, data: js.typedarray.Float32Array): WebGLBuffer = js.native
  
  def createTexture(gl: WebGLRenderingContext): WebGLTexture = js.native
  
  def createVertexShader(gl: WebGLRenderingContext, vertexShaderSource: String): WebGLShader = js.native
  
  def getBatchDim(shape: js.Array[Double]): Double = js.native
  def getBatchDim(shape: js.Array[Double], dimsToSkip: Double): Double = js.native
  
  def getExtensionOrThrow(gl: WebGLRenderingContext, extensionName: String): js.Object = js.native
  
  def getFramebufferErrorMessage(gl: WebGLRenderingContext, status: Double): String = js.native
  
  def getMaxTexturesInShader(webGLVersion: Double): Double = js.native
  
  def getNumChannels(): Double = js.native
  
  def getProgramUniformLocation(gl: WebGLRenderingContext, program: WebGLProgram, uniformName: String): WebGLUniformLocation = js.native
  
  def getProgramUniformLocationOrThrow(gl: WebGLRenderingContext, program: WebGLProgram, uniformName: String): WebGLUniformLocation = js.native
  
  def getRowsCols(shape: js.Array[Double]): js.Tuple2[Double, Double] = js.native
  
  def getShapeAs3D(shape: js.Array[Double]): js.Tuple3[Double, Double, Double] = js.native
  
  def getTextureShapeFromLogicalShape(logShape: js.Array[Double]): js.Tuple2[Double, Double] = js.native
  def getTextureShapeFromLogicalShape(logShape: js.Array[Double], isPacked: Boolean): js.Tuple2[Double, Double] = js.native
  
  def getWebGLDisjointQueryTimerVersion(webGLVersion: Double): Double = js.native
  
  def getWebGLErrorMessage(gl: WebGLRenderingContext, status: Double): String = js.native
  
  def getWebGLMaxTextureSize(webGLVersion: Double): Double = js.native
  
  def hasExtension(gl: WebGLRenderingContext, extensionName: String): Boolean = js.native
  
  def isCapableOfRenderingToFloatTexture(webGLVersion: Double): Boolean = js.native
  
  def isDownloadFloatTextureEnabled(webGLVersion: Double): Boolean = js.native
  
  def isReshapeFree(shape1: js.Array[Double], shape2: js.Array[Double]): Boolean = js.native
  
  def isWebGLFenceEnabled(webGLVersion: Double): Boolean = js.native
  
  @JSName("isWebGLVersionEnabled")
  def isWebGLVersionEnabled_1(webGLVersion: `1`): Boolean = js.native
  @JSName("isWebGLVersionEnabled")
  def isWebGLVersionEnabled_2(webGLVersion: `2`): Boolean = js.native
  
  def linkProgram(gl: WebGLRenderingContext, program: WebGLProgram): Unit = js.native
  
  def resetMaxTextureSize(): Unit = js.native
  
  def resetMaxTexturesInShader(): Unit = js.native
  
  def unbindColorTextureFromFramebuffer(gl: WebGLRenderingContext, framebuffer: WebGLFramebuffer): Unit = js.native
  
  def unbindTextureUnit(gl: WebGLRenderingContext, textureUnit: Double): Unit = js.native
  
  def validateFramebuffer(gl: WebGLRenderingContext): Unit = js.native
  
  def validateProgram(gl: WebGLRenderingContext, program: WebGLProgram): Unit = js.native
  
  def validateTextureSize(width: Double, height: Double): Unit = js.native
}
