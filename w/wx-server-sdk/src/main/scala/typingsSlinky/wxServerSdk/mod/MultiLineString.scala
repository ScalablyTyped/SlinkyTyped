package typingsSlinky.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiLineString extends StObject {
  
  def apply(polygons: js.Array[LineString]): MultiLineString = js.native
  
  var coordinates: js.Array[js.Array[PointCoordinates]] = js.native
  
  var `type`: typingsSlinky.wxServerSdk.wxServerSdkStrings.MultiLineString = js.native
}
