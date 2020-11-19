package typingsSlinky.std

import typingsSlinky.std.stdStrings.`2d`
import typingsSlinky.std.stdStrings.bitmaprenderer
import typingsSlinky.std.stdStrings.webgl
import typingsSlinky.std.stdStrings.webgl2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffscreenCanvas
  extends EventTarget
     with _CanvasImageSource
     with _TexImageSource
     with _Transferable {
  
  /**
    * Returns a promise that will fulfill with a new Blob object representing a file containing the image in the OffscreenCanvas object.
    * 
    * The argument, if provided, is a dictionary that controls the encoding options of the image file to be created. The type field specifies the file format and has a default value of "image/png"; that type is also used if the requested type isn't supported. If the image format supports variable quality (such as "image/jpeg"), then the quality field is a number in the range 0.0 to 1.0 inclusive indicating the desired quality level for the resulting image.
    */
  def convertToBlob(): js.Promise[org.scalajs.dom.raw.Blob] = js.native
  def convertToBlob(options: ImageEncodeOptions): js.Promise[org.scalajs.dom.raw.Blob] = js.native
  
  def getContext(contextId: OffscreenRenderingContextId): OffscreenRenderingContext | Null = js.native
  def getContext(contextId: OffscreenRenderingContextId, options: js.Any): OffscreenRenderingContext | Null = js.native
  /**
    * Returns an object that exposes an API for drawing on the OffscreenCanvas object. contextId specifies the desired API: "2d", "bitmaprenderer", "webgl", or "webgl2". options is handled by that API.
    * 
    * This specification defines the "2d" context below, which is similar but distinct from the "2d" context that is created from a canvas element. The WebGL specifications define the "webgl" and "webgl2" contexts. [WEBGL]
    * 
    * Returns null if the canvas has already been initialized with another context type (e.g., trying to get a "2d" context after getting a "webgl" context).
    */
  @JSName("getContext")
  def getContext_2d(contextId: `2d`): OffscreenCanvasRenderingContext2D | Null = js.native
  @JSName("getContext")
  def getContext_2d(contextId: `2d`, options: CanvasRenderingContext2DSettings): OffscreenCanvasRenderingContext2D | Null = js.native
  @JSName("getContext")
  def getContext_bitmaprenderer(contextId: bitmaprenderer): ImageBitmapRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_bitmaprenderer(contextId: bitmaprenderer, options: ImageBitmapRenderingContextSettings): ImageBitmapRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: webgl): org.scalajs.dom.raw.WebGLRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: webgl, options: org.scalajs.dom.raw.WebGLContextAttributes): org.scalajs.dom.raw.WebGLRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl2(contextId: webgl2): WebGL2RenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl2(contextId: webgl2, options: org.scalajs.dom.raw.WebGLContextAttributes): WebGL2RenderingContext | Null = js.native
  
  /**
    * These attributes return the dimensions of the OffscreenCanvas object's bitmap.
    * 
    * They can be set, to replace the bitmap with a new, transparent black bitmap of the specified dimensions (effectively resizing it).
    */
  var height: Double = js.native
  
  /**
    * Returns a newly created ImageBitmap object with the image in the OffscreenCanvas object. The image in the OffscreenCanvas object is replaced with a new blank image.
    */
  def transferToImageBitmap(): ImageBitmap = js.native
  
  /**
    * These attributes return the dimensions of the OffscreenCanvas object's bitmap.
    * 
    * They can be set, to replace the bitmap with a new, transparent black bitmap of the specified dimensions (effectively resizing it).
    */
  var width: Double = js.native
}
