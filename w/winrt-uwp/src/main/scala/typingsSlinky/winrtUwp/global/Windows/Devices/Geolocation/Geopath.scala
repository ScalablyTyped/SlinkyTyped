package typingsSlinky.winrtUwp.global.Windows.Devices.Geolocation

import typingsSlinky.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ordered series of geographic points. */
@JSGlobal("Windows.Devices.Geolocation.Geopath")
@js.native
class Geopath protected ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geopath {
  /**
    * Initializes a new instance of the Geopath class with the specified collection of positions.
    * @param positions The collection of positions to use to create the new Geopath . For more info, see the Positions property.
    */
  def this(positions: IIterable[BasicGeoposition]) = this()
  /**
    * Initializes a new instance of the Geopath class with the specified collection of positions and with the specified altitude reference system.
    * @param positions The collection of positions to use to create the new Geopath . For more info, see the Positions property.
    * @param altitudeReferenceSystem The altitude reference system to use to create the new Geopath . For more info, see the AltitudeReferenceSystem property.
    */
  def this(
    positions: IIterable[BasicGeoposition],
    altitudeReferenceSystem: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem
  ) = this()
  /**
    * Initializes a new instance of the Geopath class with the specified collection of positions and with the specified altitude reference system and spatial reference ID (SRID).
    * @param positions The collection of positions to use to create the new Geopath . For more info, see the Positions property.
    * @param altitudeReferenceSystem The altitude reference system to use to create the new Geopath . For more info, see the AltitudeReferenceSystem property.
    * @param spatialReferenceId The spatial reference ID (SRID) to use to create the new Geopath . For more info, see the SpatialReferenceId property.
    */
  def this(
    positions: IIterable[BasicGeoposition],
    altitudeReferenceSystem: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem,
    spatialReferenceId: Double
  ) = this()
}
