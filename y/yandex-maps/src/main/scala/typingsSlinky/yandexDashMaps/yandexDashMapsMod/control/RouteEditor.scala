package typingsSlinky.yandexDashMaps.yandexDashMapsMod.control

import typingsSlinky.yandexDashMaps.yandexDashMapsMod.router.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "control.RouteEditor")
@js.native
class RouteEditor () extends Button {
  def this(parameters: IRouteEditorParameters) = this()
  def getRoute(): Route = js.native
}

