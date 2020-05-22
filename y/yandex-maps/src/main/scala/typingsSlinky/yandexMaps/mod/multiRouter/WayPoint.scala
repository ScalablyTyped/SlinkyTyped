package typingsSlinky.yandexMaps.mod.multiRouter

import typingsSlinky.yandexMaps.mod.IEventManager
import typingsSlinky.yandexMaps.mod.IGeoObject
import typingsSlinky.yandexMaps.mod.Map_
import typingsSlinky.yandexMaps.mod.data.Manager
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
  override def getMap(): Map_ = js.native
}

