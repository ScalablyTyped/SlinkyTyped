package typingsSlinky.yandexDashMaps.yandexDashMapsMod.multiRouter

import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IEventEmitter
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IEventManager
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.data.Manager
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.geometry.base.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.WayPointModel")
@js.native
class WayPointModel () extends IEventEmitter {
  /* CompleteClass */
  override var events: IEventManager = js.native
  var geometry: Point = js.native
  var multiRoute: MultiRouteModel = js.native
  var properties: Manager = js.native
  def destroy(): Unit = js.native
  def getReferencePoint(): js.Object = js.native
  def getReferencePointIndex(): Double = js.native
  def setReferencePoint(referencePoint: js.Object): Unit = js.native
  def update(wayPointJson: js.Object): Unit = js.native
}

