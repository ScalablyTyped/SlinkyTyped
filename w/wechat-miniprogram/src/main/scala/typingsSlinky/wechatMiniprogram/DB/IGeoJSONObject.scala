package typingsSlinky.wechatMiniprogram.DB

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.LineString
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.MultiLineString
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.MultiPoint
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.MultiPolygon
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.Point
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wechatMiniprogram.DB.IGeoJSONPoint
  - typingsSlinky.wechatMiniprogram.DB.IGeoJSONMultiPoint
  - typingsSlinky.wechatMiniprogram.DB.IGeoJSONLineString
  - typingsSlinky.wechatMiniprogram.DB.IGeoJSONMultiLineString
  - typingsSlinky.wechatMiniprogram.DB.IGeoJSONPolygon
  - typingsSlinky.wechatMiniprogram.DB.IGeoJSONMultiPolygon
*/
trait IGeoJSONObject extends StObject
object IGeoJSONObject {
  
  @scala.inline
  def IGeoJSONLineString(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: LineString): typingsSlinky.wechatMiniprogram.DB.IGeoJSONLineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.wechatMiniprogram.DB.IGeoJSONLineString]
  }
  
  @scala.inline
  def IGeoJSONMultiLineString(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString): typingsSlinky.wechatMiniprogram.DB.IGeoJSONMultiLineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.wechatMiniprogram.DB.IGeoJSONMultiLineString]
  }
  
  @scala.inline
  def IGeoJSONMultiPoint(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint): typingsSlinky.wechatMiniprogram.DB.IGeoJSONMultiPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.wechatMiniprogram.DB.IGeoJSONMultiPoint]
  }
  
  @scala.inline
  def IGeoJSONMultiPolygon(coordinates: js.Array[js.Array[js.Array[js.Tuple2[Double, Double]]]], `type`: MultiPolygon): typingsSlinky.wechatMiniprogram.DB.IGeoJSONMultiPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.wechatMiniprogram.DB.IGeoJSONMultiPolygon]
  }
  
  @scala.inline
  def IGeoJSONPoint(coordinates: js.Tuple2[Double, Double], `type`: Point): typingsSlinky.wechatMiniprogram.DB.IGeoJSONPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.wechatMiniprogram.DB.IGeoJSONPoint]
  }
  
  @scala.inline
  def IGeoJSONPolygon(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: Polygon): typingsSlinky.wechatMiniprogram.DB.IGeoJSONPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.wechatMiniprogram.DB.IGeoJSONPolygon]
  }
}
