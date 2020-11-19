package typingsSlinky.viewportMercatorProject.anon

import typingsSlinky.viewportMercatorProject.mod.DistanceScalesInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined viewport-mercator-project.viewport-mercator-project.BaseDistanceScalesInput & {  zoom :number} */
@js.native
trait BaseDistanceScalesInputzo extends DistanceScalesInput {
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  var zoom: Double = js.native
}
object BaseDistanceScalesInputzo {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double, zoom: Double): BaseDistanceScalesInputzo = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDistanceScalesInputzo]
  }
  
  @scala.inline
  implicit class BaseDistanceScalesInputzoOps[Self <: BaseDistanceScalesInputzo] (val x: Self) extends AnyVal {
    
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
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
}
