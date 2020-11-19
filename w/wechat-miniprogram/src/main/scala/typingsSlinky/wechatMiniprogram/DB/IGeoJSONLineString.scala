package typingsSlinky.wechatMiniprogram.DB

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.LineString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoJSONLineString extends IGeoJSONObject {
  
  var coordinates: js.Array[js.Tuple2[Double, Double]] = js.native
  
  var `type`: LineString = js.native
}
object IGeoJSONLineString {
  
  @scala.inline
  def apply(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: LineString): IGeoJSONLineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONLineString]
  }
  
  @scala.inline
  implicit class IGeoJSONLineStringOps[Self <: IGeoJSONLineString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoordinatesVarargs(value: (js.Tuple2[Double, Double])*): Self = this.set("coordinates", js.Array(value :_*))
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Tuple2[Double, Double]]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LineString): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
