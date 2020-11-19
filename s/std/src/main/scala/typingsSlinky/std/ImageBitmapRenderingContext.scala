package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageBitmapRenderingContext
  extends _OffscreenRenderingContext
     with _RenderingContext {
  
  /**
    * Returns the canvas element that the context is bound to.
    */
  val canvas: org.scalajs.dom.raw.HTMLCanvasElement | OffscreenCanvas = js.native
  
  /**
    * Transfers the underlying bitmap data from imageBitmap to context, and the bitmap becomes the contents of the canvas element to which context is bound.
    */
  def transferFromImageBitmap(): Unit = js.native
  def transferFromImageBitmap(bitmap: ImageBitmap): Unit = js.native
}
