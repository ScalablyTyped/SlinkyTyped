package typingsSlinky.wechatMiniprogram.DB

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.LineString
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.MultiLineString
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.MultiPoint
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.MultiPolygon
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.Point
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wechatMiniprogram.DB.IGeoJSONPoint
  - typingsSlinky.wechatMiniprogram.DB.IGeoJSONMultiPoint
  - typingsSlinky.wechatMiniprogram.DB.IGeoJSONLineString
  - typingsSlinky.wechatMiniprogram.DB.IGeoJSONMultiLineString
  - typingsSlinky.wechatMiniprogram.DB.IGeoJSONPolygon
  - typingsSlinky.wechatMiniprogram.DB.IGeoJSONMultiPolygon
*/
trait IGeoJSONObject extends js.Object

object IGeoJSONObject {
  @scala.inline
  def IGeoJSONPolygon(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: Polygon): IGeoJSONObject = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONObject]
  }
  @scala.inline
  def IGeoJSONPoint(coordinates: js.Tuple2[Double, Double], `type`: Point): IGeoJSONObject = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONObject]
  }
  @scala.inline
  def IGeoJSONLineString(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: LineString): IGeoJSONObject = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONObject]
  }
  @scala.inline
  def IGeoJSONMultiLineString(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString): IGeoJSONObject = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONObject]
  }
  @scala.inline
  def IGeoJSONMultiPoint(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint): IGeoJSONObject = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONObject]
  }
  @scala.inline
  def IGeoJSONMultiPolygon(coordinates: js.Array[js.Array[js.Array[js.Tuple2[Double, Double]]]], `type`: MultiPolygon): IGeoJSONObject = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONObject]
  }
}

