package typingsSlinky.wxDashServerDashSdk.wxDashServerDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geo extends js.Object {
  @JSName("LineString")
  var LineString_Original: LineString = js.native
  @JSName("Point")
  var Point_Original: Point = js.native
  @JSName("Polygon")
  var Polygon_Original: Polygon = js.native
  def LineString(points: js.Array[Point]): typingsSlinky.wxDashServerDashSdk.wxDashServerDashSdkMod.LineString = js.native
  def Point(longitude: Double, latitude: Double): typingsSlinky.wxDashServerDashSdk.wxDashServerDashSdkMod.Point = js.native
  def Polygon(lineStrings: js.Array[LineString]): typingsSlinky.wxDashServerDashSdk.wxDashServerDashSdkMod.Polygon = js.native
}

