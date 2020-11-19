package typingsSlinky.shapefile.mod

import typingsSlinky.geojson.mod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shapefile", "openDbf")
@js.native
object openDbf extends js.Object {
  
  def apply(source: Openable): js.Promise[Source[GeoJsonProperties]] = js.native
  def apply(source: Openable, options: Options): js.Promise[Source[GeoJsonProperties]] = js.native
}
