package typingsSlinky.winrtUwp.global.Windows.Devices.Geolocation

import typingsSlinky.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a geographic point. */
@JSGlobal("Windows.Devices.Geolocation.Geopoint")
@js.native
class Geopoint protected ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geopoint {
  /**
    * Create a geographic point object for the given position.
    * @param position Create a geographic point object for the given position.
    */
  def this(position: BasicGeoposition) = this()
  /**
    * Create a geographic point object for the given position and altitude reference system.
    * @param position Create a geographic point object for the given position.
    * @param altitudeReferenceSystem The altitude reference system of the new point.
    */
  def this(
    position: BasicGeoposition,
    altitudeReferenceSystem: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem
  ) = this()
  /**
    * Create a geographic point object for the given position, altitude reference system, and spatial reference Id.
    * @param position Create a geographic point object for the given position.
    * @param altitudeReferenceSystem The altitude reference system of the new point.
    * @param spatialReferenceId The spatial reference Id of the new point.
    */
  def this(
    position: BasicGeoposition,
    altitudeReferenceSystem: typingsSlinky.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem,
    spatialReferenceId: Double
  ) = this()
}
