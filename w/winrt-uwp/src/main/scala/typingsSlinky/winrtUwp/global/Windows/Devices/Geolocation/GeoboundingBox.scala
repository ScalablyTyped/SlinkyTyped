package typingsSlinky.winrtUwp.global.Windows.Devices.Geolocation

import typingsSlinky.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a rectangle that defines a geographic area. */
@JSGlobal("Windows.Devices.Geolocation.GeoboundingBox")
@js.native
class GeoboundingBox protected ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Geolocation.GeoboundingBox {
  /**
    * Initializes a new instance of the GeoboundingBox class that has the specified corners.
    * @param northwestCorner The northwest corner to use for the new GeoboundingBox . For more info, see the NorthwestCorner property.
    * @param southeastCorner The southeast corner to use for the new GeoboundingBox . For more info, see the SoutheastCorner property.
    */
  def this(northwestCorner: BasicGeoposition, southeastCorner: BasicGeoposition) = this()
  /**
    * Initializes a new instance of the GeoboundingBox class that has the specified corners and uses the specified altitude reference system.
    * @param northwestCorner The northwest corner to use for the new GeoboundingBox . For more info, see the NorthwestCorner property.
    * @param southeastCorner The southeast corner to use for the new GeoboundingBox . For more info, see the SoutheastCorner property.
    * @param altitudeReferenceSystem The altitude reference system to use for the new GeoboundingBox . For more info, see the AltitudeReferenceSystem property.
    */
  def this(
    northwestCorner: BasicGeoposition,
    southeastCorner: BasicGeoposition,
    altitudeReferenceSystem: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem
  ) = this()
  /**
    * Initializes a new instance of the GeoboundingBox class that has the specified corners and uses the specified altitude reference system and spatial reference ID (SRID).
    * @param northwestCorner The northwest corner to use for the new GeoboundingBox . For more info, see the NorthwestCorner property.
    * @param southeastCorner The southeast corner to use for the new GeoboundingBox . For more info, see the SoutheastCorner property.
    * @param altitudeReferenceSystem The altitude reference system to use for the new GeoboundingBox . For more info, see the AltitudeReferenceSystem property.
    * @param spatialReferenceId The spatial reference ID (SRID) to use for the new GeoboundingBox . For more info, see the SpatialReferenceId property.
    */
  def this(
    northwestCorner: BasicGeoposition,
    southeastCorner: BasicGeoposition,
    altitudeReferenceSystem: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem,
    spatialReferenceId: Double
  ) = this()
}
/* static members */
@JSGlobal("Windows.Devices.Geolocation.GeoboundingBox")
@js.native
object GeoboundingBox extends js.Object {
  
  /**
    * Calculates a GeoboundingBox that contains the specified set of geographic positions.
    * @param positions A collection of geographic positions to include inside the GeoboundingBox .
    * @return The calculated rectangle that contains the specified set of geographic positions.
    */
  def tryCompute(positions: IIterable[BasicGeoposition]): typingsSlinky.winrtUwp.Windows.Devices.Geolocation.GeoboundingBox = js.native
  /**
    * Calculates a GeoboundingBox that contains the specified set of geographic positions and uses the specified altitude reference system.
    * @param positions A collection of geographic positions to include inside the GeoboundingBox .
    * @param altitudeRefSystem The altitude reference system to use for the GeoboundingBox . For more info, see the AltitudeReferenceSystem property.
    * @return The calculated rectangle that contains the specified set of geographic positions.
    */
  def tryCompute(
    positions: IIterable[BasicGeoposition],
    altitudeRefSystem: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem
  ): typingsSlinky.winrtUwp.Windows.Devices.Geolocation.GeoboundingBox = js.native
  /**
    * Calculates a GeoboundingBox that contains the specified set of geographic positions and uses the specified altitude reference system and spatial reference ID (SRID).
    * @param positions A collection of geographic positions to include inside the GeoboundingBox .
    * @param altitudeRefSystem The altitude reference system to use for the GeoboundingBox . For more info, see the AltitudeReferenceSystem property.
    * @param spatialReferenceId The spatial reference ID (SRID) to use for the GeoboundingBox . For more info, see the SpatialReferenceId property.
    * @return The calculated rectangle that contains the specified set of geographic positions.
    */
  def tryCompute(
    positions: IIterable[BasicGeoposition],
    altitudeRefSystem: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem,
    spatialReferenceId: Double
  ): typingsSlinky.winrtUwp.Windows.Devices.Geolocation.GeoboundingBox = js.native
}
