package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasText extends js.Object {
  
  def fillText(text: java.lang.String, x: Double, y: Double): Unit = js.native
  def fillText(text: java.lang.String, x: Double, y: Double, maxWidth: Double): Unit = js.native
  
  def measureText(text: java.lang.String): org.scalajs.dom.raw.TextMetrics = js.native
  
  def strokeText(text: java.lang.String, x: Double, y: Double): Unit = js.native
  def strokeText(text: java.lang.String, x: Double, y: Double, maxWidth: Double): Unit = js.native
}
