package typingsSlinky.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geo extends js.Object {
  
  def LineString(points: js.Array[Point]): typingsSlinky.wxServerSdk.mod.LineString = js.native
  @JSName("LineString")
  var LineString_Original: LineString = js.native
  
  def Point(longitude: Double, latitude: Double): typingsSlinky.wxServerSdk.mod.Point = js.native
  @JSName("Point")
  var Point_Original: Point = js.native
  
  def Polygon(lineStrings: js.Array[LineString]): typingsSlinky.wxServerSdk.mod.Polygon = js.native
  @JSName("Polygon")
  var Polygon_Original: Polygon = js.native
}
