package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasFillStrokeStyles extends js.Object {
  
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): org.scalajs.dom.raw.CanvasGradient = js.native
  
  def createPattern(image: CanvasImageSource): org.scalajs.dom.raw.CanvasPattern | Null = js.native
  def createPattern(image: CanvasImageSource, repetition: java.lang.String): org.scalajs.dom.raw.CanvasPattern | Null = js.native
  
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): org.scalajs.dom.raw.CanvasGradient = js.native
  
  var fillStyle: java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern = js.native
  
  var strokeStyle: java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern = js.native
}
