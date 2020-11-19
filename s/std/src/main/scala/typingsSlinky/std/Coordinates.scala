package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The position and altitude of the device on Earth, as well as the accuracy with which these properties are calculated. */
@js.native
trait Coordinates extends js.Object {
  
  val accuracy: Double = js.native
  
  val altitude: Double | Null = js.native
  
  val altitudeAccuracy: Double | Null = js.native
  
  val heading: Double | Null = js.native
  
  val latitude: Double = js.native
  
  val longitude: Double = js.native
  
  val speed: Double | Null = js.native
}
object Coordinates {
  
  @scala.inline
  def apply(accuracy: Double, latitude: Double, longitude: Double): Coordinates = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
  
  @scala.inline
  implicit class CoordinatesOps[Self <: org.scalajs.dom.raw.Coordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeNull: Self = this.set("altitude", null)
    
    @scala.inline
    def setAltitudeAccuracy(value: Double): Self = this.set("altitudeAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeAccuracyNull: Self = this.set("altitudeAccuracy", null)
    
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingNull: Self = this.set("heading", null)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedNull: Self = this.set("speed", null)
  }
}
