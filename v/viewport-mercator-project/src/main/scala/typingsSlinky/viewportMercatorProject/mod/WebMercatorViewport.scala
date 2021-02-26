package typingsSlinky.viewportMercatorProject.mod

import typingsSlinky.viewportMercatorProject.anon.LngLat
import typingsSlinky.viewportMercatorProject.anon.Offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("viewport-mercator-project", "WebMercatorViewport")
@js.native
class WebMercatorViewport () extends Viewport {
  def this(opts: WebMercatorViewportOptions) = this()
  
  var altitude: Double = js.native
  
  var bearing: Double = js.native
  
  var center: CoordinatesZ = js.native
  
  def fitBounds(bounds: Bounds): WebMercatorViewport = js.native
  def fitBounds(bounds: Bounds, opts: Offset): WebMercatorViewport = js.native
  
  def getMapCenterByLngLatPosition(opts: LngLat): Coordinates = js.native
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  var pitch: Double = js.native
  
  def projectFlat(lngLat: Coordinates): Coordinates = js.native
  def projectFlat(lngLat: Coordinates, scale: Double): Coordinates = js.native
  
  def unprojectFlat(xy: Coordinates): Coordinates = js.native
  def unprojectFlat(xy: Coordinates, scale: Double): Coordinates = js.native
  
  var zoom: Double = js.native
}
