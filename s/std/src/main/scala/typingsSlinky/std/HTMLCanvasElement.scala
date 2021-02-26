package typingsSlinky.std

import typingsSlinky.std.stdStrings.`2d`
import typingsSlinky.std.stdStrings.bitmaprenderer
import typingsSlinky.std.stdStrings.webgl
import typingsSlinky.std.stdStrings.webgl2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties and methods for manipulating the layout and presentation of <canvas> elements. The HTMLCanvasElement interface also inherits the properties and methods of the HTMLElement interface. */
@js.native
trait HTMLCanvasElement extends HTMLElement {
  
  def getContext(contextId: java.lang.String): RenderingContext | Null = js.native
  def getContext(contextId: java.lang.String, options: js.Any): RenderingContext | Null = js.native
  /**
    * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
    * @param contextId The identifier (ID) of the type of canvas to create. Internet Explorer 9 and Internet Explorer 10 support only a 2-D context using canvas.getContext("2d"); IE11 Preview also supports 3-D or WebGL context using canvas.getContext("experimental-webgl");
    */
  @JSName("getContext")
  def getContext_2d(contextId: `2d`): org.scalajs.dom.raw.CanvasRenderingContext2D | Null = js.native
  @JSName("getContext")
  def getContext_2d(contextId: `2d`, options: CanvasRenderingContext2DSettings): org.scalajs.dom.raw.CanvasRenderingContext2D | Null = js.native
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
    * Gets or sets the height of a canvas element on a document.
    */
  var height: Double = js.native
  
  def toBlob(callback: BlobCallback): Unit = js.native
  def toBlob(callback: BlobCallback, `type`: js.UndefOr[scala.Nothing], quality: js.Any): Unit = js.native
  def toBlob(callback: BlobCallback, `type`: java.lang.String): Unit = js.native
  def toBlob(callback: BlobCallback, `type`: java.lang.String, quality: js.Any): Unit = js.native
  
  /**
    * Returns the content of the current canvas as an image that you can use as a source for another canvas or an HTML element.
    * @param type The standard MIME type for the image format to return. If you do not specify this parameter, the default value is a PNG format image.
    */
  def toDataURL(): java.lang.String = js.native
  def toDataURL(`type`: js.UndefOr[scala.Nothing], quality: js.Any): java.lang.String = js.native
  def toDataURL(`type`: java.lang.String): java.lang.String = js.native
  def toDataURL(`type`: java.lang.String, quality: js.Any): java.lang.String = js.native
  
  def transferControlToOffscreen(): OffscreenCanvas = js.native
  
  /**
    * Gets or sets the width of a canvas element on a document.
    */
  var width: Double = js.native
}
