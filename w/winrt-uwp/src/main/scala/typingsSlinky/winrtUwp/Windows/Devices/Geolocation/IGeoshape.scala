package typingsSlinky.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface to define a geographic shape. */
@js.native
trait IGeoshape extends StObject {
  
  /** The altitude reference system of the geographic shape. */
  var altitudeReferenceSystem: AltitudeReferenceSystem = js.native
  
  /** The type of geographic shape. */
  var geoshapeType: GeoshapeType = js.native
  
  /** The spatial reference identifier for the geographic shape, corresponding to a spatial reference system based on the specific ellipsoid used for either flat-earth mapping or round-earth mapping. */
  var spatialReferenceId: Double = js.native
}
object IGeoshape {
  
  @scala.inline
  def apply(
    altitudeReferenceSystem: AltitudeReferenceSystem,
    geoshapeType: GeoshapeType,
    spatialReferenceId: Double
  ): IGeoshape = {
    val __obj = js.Dynamic.literal(altitudeReferenceSystem = altitudeReferenceSystem.asInstanceOf[js.Any], geoshapeType = geoshapeType.asInstanceOf[js.Any], spatialReferenceId = spatialReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoshape]
  }
  
  @scala.inline
  implicit class IGeoshapeMutableBuilder[Self <: IGeoshape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitudeReferenceSystem(value: AltitudeReferenceSystem): Self = StObject.set(x, "altitudeReferenceSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoshapeType(value: GeoshapeType): Self = StObject.set(x, "geoshapeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceId(value: Double): Self = StObject.set(x, "spatialReferenceId", value.asInstanceOf[js.Any])
  }
}
