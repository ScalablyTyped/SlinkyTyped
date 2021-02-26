package typingsSlinky.wechatMiniprogram.DB

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wechatMiniprogram.DB.GeoPoint
  - typingsSlinky.wechatMiniprogram.DB.GeoMultiPoint
  - typingsSlinky.wechatMiniprogram.DB.GeoLineString
  - typingsSlinky.wechatMiniprogram.DB.GeoMultiLineString
  - typingsSlinky.wechatMiniprogram.DB.GeoPolygon
  - typingsSlinky.wechatMiniprogram.DB.GeoMultiPolygon
*/
trait GeoInstance extends StObject
object GeoInstance {
  
  @scala.inline
  def GeoLineString(points: js.Array[GeoPoint], toJSON: () => IGeoJSONLineString): typingsSlinky.wechatMiniprogram.DB.GeoLineString = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[typingsSlinky.wechatMiniprogram.DB.GeoLineString]
  }
  
  @scala.inline
  def GeoMultiLineString(lines: js.Array[GeoLineString], toJSON: () => IGeoJSONMultiLineString): typingsSlinky.wechatMiniprogram.DB.GeoMultiLineString = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[typingsSlinky.wechatMiniprogram.DB.GeoMultiLineString]
  }
  
  @scala.inline
  def GeoMultiPoint(points: js.Array[GeoPoint], toJSON: () => IGeoJSONMultiPoint): typingsSlinky.wechatMiniprogram.DB.GeoMultiPoint = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[typingsSlinky.wechatMiniprogram.DB.GeoMultiPoint]
  }
  
  @scala.inline
  def GeoMultiPolygon(polygons: js.Array[GeoPolygon], toJSON: () => IGeoJSONMultiPolygon): typingsSlinky.wechatMiniprogram.DB.GeoMultiPolygon = {
    val __obj = js.Dynamic.literal(polygons = polygons.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[typingsSlinky.wechatMiniprogram.DB.GeoMultiPolygon]
  }
  
  @scala.inline
  def GeoPoint(latitude: Double, longitude: Double, toJSON: () => Record[String, _]): typingsSlinky.wechatMiniprogram.DB.GeoPoint = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[typingsSlinky.wechatMiniprogram.DB.GeoPoint]
  }
  
  @scala.inline
  def GeoPolygon(lines: js.Array[GeoLineString], toJSON: () => IGeoJSONPolygon): typingsSlinky.wechatMiniprogram.DB.GeoPolygon = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[typingsSlinky.wechatMiniprogram.DB.GeoPolygon]
  }
}
