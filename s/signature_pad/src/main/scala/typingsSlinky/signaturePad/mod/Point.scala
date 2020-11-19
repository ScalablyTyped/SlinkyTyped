package typingsSlinky.signaturePad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("signature_pad", "Point")
@js.native
class Point protected () extends js.Object {
  def this(x: Double, y: Double, time: Double) = this()
  
  var color: js.UndefOr[String] = js.native
  
  def distanceTo(start: Point): Double = js.native
  
  var time: Double = js.native
  
  def velocityFrom(start: Point): Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
