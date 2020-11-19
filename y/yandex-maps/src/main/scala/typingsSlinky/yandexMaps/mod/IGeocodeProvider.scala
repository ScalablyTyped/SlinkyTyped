package typingsSlinky.yandexMaps.mod

import typingsSlinky.yandexMaps.anon.Results
import typingsSlinky.yandexMaps.anon.StrictBounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeocodeProvider extends js.Object {
  
  def geocode(request: String): js.Promise[js.Object] = js.native
  def geocode(request: String, options: Results): js.Promise[js.Object] = js.native
  
  def suggest(request: String): js.Promise[js.Object] = js.native
  def suggest(request: String, options: StrictBounds): js.Promise[js.Object] = js.native
}
