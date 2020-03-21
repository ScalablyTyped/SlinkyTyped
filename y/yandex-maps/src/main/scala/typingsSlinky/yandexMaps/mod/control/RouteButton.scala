package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.mod.IChild
import typingsSlinky.yandexMaps.mod.IControlParent
import typingsSlinky.yandexMaps.mod.IEventManager
import typingsSlinky.yandexMaps.mod.IOptionManager
import typingsSlinky.yandexMaps.mod.IRoutePanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.yandexMaps.mod.IEventEmitter because Already inherited
- typingsSlinky.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.RouteButton")
@js.native
class RouteButton () extends IChild[IControlParent] {
  def this(parameters: IRouteButtonParameters) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  var options: IOptionManager = js.native
  var routePanel: IRoutePanel = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

