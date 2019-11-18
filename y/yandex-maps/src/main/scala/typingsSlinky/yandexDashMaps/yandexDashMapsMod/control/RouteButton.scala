package typingsSlinky.yandexDashMaps.yandexDashMapsMod.control

import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IChild
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IControlParent
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IEventManager
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IOptionManager
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IRoutePanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.RouteButton")
@js.native
class RouteButton () extends IChild[IControlParent] {
  def this(parameters: IRouteButtonParameters) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  var options: IOptionManager = js.native
  var routePanel: IRoutePanel = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

