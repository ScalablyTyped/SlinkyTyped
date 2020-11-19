package typingsSlinky.winrtUwp.Windows.Devices.Geolocation

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ordered series of geographic points. */
@js.native
trait Geopath extends js.Object {
  
  /** Gets the altitude reference system used by the Geopath . */
  var altitudeReferenceSystem: AltitudeReferenceSystem = js.native
  
  /** Gets the type of geographic shape represented by the Geopath . */
  var geoshapeType: GeoshapeType = js.native
  
  /** Gets the collection of geographic points that define the Geopath . */
  var positions: IVectorView[BasicGeoposition] = js.native
  
  /** Gets the spatial reference ID (SRID) used by the Geopath . */
  var spatialReferenceId: Double = js.native
}
object Geopath {
  
  @scala.inline
  def apply(
    altitudeReferenceSystem: AltitudeReferenceSystem,
    geoshapeType: GeoshapeType,
    positions: IVectorView[BasicGeoposition],
    spatialReferenceId: Double
  ): Geopath = {
    val __obj = js.Dynamic.literal(altitudeReferenceSystem = altitudeReferenceSystem.asInstanceOf[js.Any], geoshapeType = geoshapeType.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], spatialReferenceId = spatialReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geopath]
  }
  
  @scala.inline
  implicit class GeopathOps[Self <: Geopath] (val x: Self) extends AnyVal {
    
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
    def setAltitudeReferenceSystem(value: AltitudeReferenceSystem): Self = this.set("altitudeReferenceSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoshapeType(value: GeoshapeType): Self = this.set("geoshapeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositions(value: IVectorView[BasicGeoposition]): Self = this.set("positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceId(value: Double): Self = this.set("spatialReferenceId", value.asInstanceOf[js.Any])
  }
}
