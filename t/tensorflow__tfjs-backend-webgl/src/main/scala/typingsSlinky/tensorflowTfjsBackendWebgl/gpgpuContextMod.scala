package typingsSlinky.tensorflowTfjsBackendWebgl

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import org.scalajs.dom.raw.WebGLBuffer
import org.scalajs.dom.raw.WebGLFramebuffer
import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLTexture
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.std.WebGLQuery
import typingsSlinky.std.WebGLSync
import typingsSlinky.tensorflowTfjsBackendWebgl.texUtilMod.TextureConfig
import typingsSlinky.tensorflowTfjsBackendWebgl.webglTypesMod.WebGL1DisjointQueryTimerExtension
import typingsSlinky.tensorflowTfjsBackendWebgl.webglTypesMod.WebGL2DisjointQueryTimerExtension
import typingsSlinky.tensorflowTfjsCore.distTypesMod.PixelData
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gpgpuContextMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_context", "GPGPUContext")
  @js.native
  class GPGPUContext () extends StObject {
    def this(gl: WebGLRenderingContext) = this()
    
    var addItemToPoll: js.Any = js.native
    
    def beginQuery(): WebGLQuery = js.native
    
    var bindTextureToFrameBuffer: js.Any = js.native
    
    def blockUntilAllProgramsCompleted(): Unit = js.native
    
    def createAndWaitForFence(): js.Promise[Unit] = js.native
    
    def createBufferFromTexture(texture: WebGLTexture, rows: Double, columns: Double): WebGLBuffer = js.native
    
    var createFence: js.Any = js.native
    
    def createFloat16MatrixTexture(rows: Double, columns: Double): WebGLTexture = js.native
    
    def createFloat16PackedMatrixTexture(rows: Double, columns: Double): WebGLTexture = js.native
    
    def createFloat32MatrixTexture(rows: Double, columns: Double): WebGLTexture = js.native
    
    def createPackedMatrixTexture(rows: Double, columns: Double): WebGLTexture = js.native
    
    def createProgram(fragmentShaderSource: String): WebGLProgram = js.native
    
    def createUnsignedBytesMatrixTexture(rows: Double, columns: Double): WebGLTexture = js.native
    
    val debug: js.Any = js.native
    
    def debugValidate(): Unit = js.native
    
    def deleteMatrixTexture(texture: WebGLTexture): Unit = js.native
    
    def deleteProgram(program: WebGLProgram): Unit = js.native
    
    var disjoint: js.Any = js.native
    
    var disjointQueryTimerExtension: WebGL2DisjointQueryTimerExtension | WebGL1DisjointQueryTimerExtension = js.native
    
    def dispose(): Unit = js.native
    
    var disposed: js.Any = js.native
    
    def downloadByteEncodedFloatMatrixFromOutputTexture(texture: WebGLTexture, rows: Double, columns: Double): js.typedarray.Float32Array = js.native
    
    def downloadFloat32MatrixFromBuffer(buffer: WebGLBuffer, size: Double): js.typedarray.Float32Array = js.native
    
    var downloadMatrixDriver: js.Any = js.native
    
    def downloadMatrixFromPackedTexture(texture: WebGLTexture, physicalRows: Double, physicalCols: Double): js.typedarray.Float32Array = js.native
    
    def downloadPackedMatrixFromBuffer(
      buffer: WebGLBuffer,
      batch: Double,
      rows: Double,
      columns: Double,
      physicalRows: Double,
      physicalCols: Double
    ): js.typedarray.Float32Array = js.native
    
    def endQuery(): Unit = js.native
    
    def executeProgram(): Unit = js.native
    
    var framebuffer: WebGLFramebuffer = js.native
    
    def getAttributeLocation(program: WebGLProgram, attribute: String): Double = js.native
    
    var getQueryTime: js.Any = js.native
    
    var getQueryTimerExtension: js.Any = js.native
    
    var getQueryTimerExtensionWebGL1: js.Any = js.native
    
    var getQueryTimerExtensionWebGL2: js.Any = js.native
    
    def getUniformLocation(program: WebGLProgram, uniformName: String): WebGLUniformLocation = js.native
    def getUniformLocation(program: WebGLProgram, uniformName: String, shouldThrow: Boolean): WebGLUniformLocation = js.native
    
    def getUniformLocationNoThrow(program: WebGLProgram, uniformName: String): WebGLUniformLocation = js.native
    
    var gl: WebGLRenderingContext = js.native
    
    var indexBuffer: WebGLBuffer = js.native
    
    var isQueryAvailable: js.Any = js.native
    
    var itemsToPoll: js.Any = js.native
    
    var outputTexture: WebGLTexture | Null = js.native
    
    def pollFence(fenceContext: FenceContext): js.Promise[Unit] = js.native
    
    def pollItems(): Unit = js.native
    
    var program: WebGLProgram | Null = js.native
    
    def setInputMatrixTexture(inputMatrixTexture: WebGLTexture, uniformLocation: WebGLUniformLocation, textureUnit: Double): Unit = js.native
    
    def setOutputMatrixTexture(outputMatrixTexture: WebGLTexture, rows: Double, columns: Double): Unit = js.native
    
    var setOutputMatrixTextureDriver: js.Any = js.native
    
    def setOutputMatrixWriteRegion(startRow: Double, numRows: Double, startColumn: Double, numColumns: Double): Unit = js.native
    
    var setOutputMatrixWriteRegionDriver: js.Any = js.native
    
    def setOutputPackedMatrixTexture(outputPackedMatrixTexture: WebGLTexture, rows: Double, columns: Double): Unit = js.native
    
    def setOutputPackedMatrixWriteRegion(startRow: Double, numRows: Double, startColumn: Double, numColumns: Double): Unit = js.native
    
    def setProgram(): Unit = js.native
    def setProgram(program: WebGLProgram): Unit = js.native
    
    var textureConfig: TextureConfig = js.native
    
    var throwIfDisposed: js.Any = js.native
    
    var throwIfNoProgram: js.Any = js.native
    
    var unbindTextureToFrameBuffer: js.Any = js.native
    
    def uploadDenseMatrixToTexture(texture: WebGLTexture, width: Double, height: Double, data: TypedArray): Unit = js.native
    
    def uploadPixelDataToTexture(texture: WebGLTexture, pixels: HTMLCanvasElement): Unit = js.native
    def uploadPixelDataToTexture(texture: WebGLTexture, pixels: HTMLImageElement): Unit = js.native
    def uploadPixelDataToTexture(texture: WebGLTexture, pixels: ImageData): Unit = js.native
    def uploadPixelDataToTexture(texture: WebGLTexture, pixels: PixelData): Unit = js.native
    
    var vertexAttrsAreBound: js.Any = js.native
    
    var vertexBuffer: WebGLBuffer = js.native
    
    def waitForQueryAndGetTime(query: WebGLQuery): js.Promise[Double] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_context", "linearSearchLastTrue")
  @js.native
  def linearSearchLastTrue(arr: js.Array[js.Function0[Boolean]]): Double = js.native
  
  @js.native
  trait FenceContext extends StObject {
    
    def isFencePassed(): Boolean = js.native
    
    var query: WebGLQuery | WebGLSync = js.native
  }
  object FenceContext {
    
    @scala.inline
    def apply(isFencePassed: () => Boolean, query: WebGLQuery | WebGLSync): FenceContext = {
      val __obj = js.Dynamic.literal(isFencePassed = js.Any.fromFunction0(isFencePassed), query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[FenceContext]
    }
    
    @scala.inline
    implicit class FenceContextMutableBuilder[Self <: FenceContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsFencePassed(value: () => Boolean): Self = StObject.set(x, "isFencePassed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setQuery(value: WebGLQuery | WebGLSync): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
