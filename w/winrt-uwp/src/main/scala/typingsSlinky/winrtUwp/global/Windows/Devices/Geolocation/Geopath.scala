package typingsSlinky.winrtUwp.global.Windows.Devices.Geolocation

import typingsSlinky.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /** Gets the altitude reference system used by the Geopath . */
  /* CompleteClass */
  override var altitudeReferenceSystem: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem = js.native
  /** Gets the type of geographic shape represented by the Geopath . */
  /* CompleteClass */
  override var geoshapeType: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.GeoshapeType = js.native
  /** Gets the collection of geographic points that define the Geopath . */
  /* CompleteClass */
  override var positions: IVectorView[BasicGeoposition] = js.native
  /** Gets the spatial reference ID (SRID) used by the Geopath . */
  /* CompleteClass */
  override var spatialReferenceId: Double = js.native
}

