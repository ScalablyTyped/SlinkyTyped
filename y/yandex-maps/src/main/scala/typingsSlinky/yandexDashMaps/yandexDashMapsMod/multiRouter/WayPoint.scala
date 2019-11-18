package typingsSlinky.yandexDashMaps.yandexDashMapsMod.multiRouter

import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IEventManager
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IGeoObject
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.Map
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.WayPoint")
@js.native
class WayPoint () extends IGeoObject {
  /* CompleteClass */
  override var events: IEventManager = js.native
  var model: WayPointModel = js.native
  @JSName("properties")
  var properties_WayPoint: Manager = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
}

