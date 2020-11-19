package typingsSlinky.svgJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// poly.js
@js.native
trait poly extends Shape {
  
  def array(): PointArray = js.native
  
  def move(x: Double, y: Double): this.type = js.native
  
  def plot(p: PointArrayAlias): this.type = js.native
  
  def size(width: Double, height: Double): this.type = js.native
}
