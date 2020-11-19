package typingsSlinky.vexflow.Vex.Flow

import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGRect
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGContext extends IRenderContext {
  
  var attributes: js.Any = js.native
  
  def ieMeasureTextFix(bbox: SVGRect, text: String): Y = js.native
  
  def iePolyfill(): Boolean = js.native
  
  var lineWidth: Double = js.native
  
  def rect(x: Double, y: Double, width: Double, height: Double): SVGContext = js.native
  
  def setFont(family: String, size: Double, weight: String): SVGContext = js.native
  
  def setViewBox(xMin: Double, yMin: Double, width: Double, height: Double): Unit = js.native
  
  var state: js.Any = js.native
  
  var svg: SVGElement = js.native
}
