package typingsSlinky.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiLineString extends js.Object {
  var coordinates: js.Array[js.Array[PointCoordinates]] = js.native
  var `type`: typingsSlinky.wxServerSdk.wxServerSdkStrings.MultiLineString = js.native
  def apply(polygons: js.Array[LineString]): MultiLineString = js.native
}

