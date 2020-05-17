package typingsSlinky.yandexMaps.mod.multiRouter

import typingsSlinky.yandexMaps.anon.Dictindex
import typingsSlinky.yandexMaps.mod.GeoObjectCollection
import typingsSlinky.yandexMaps.mod.IGeoObject
import typingsSlinky.yandexMaps.mod.IMultiRouteModelJson
import typingsSlinky.yandexMaps.mod.multiRouter.driving.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.MultiRoute")
@js.native
class MultiRoute protected () extends IGeoObject {
  def this(model: IMultiRouteModelJson) = this()
  def this(model: MultiRouteModel) = this()
  def this(model: IMultiRouteModelJson, options: Dictindex) = this()
  def this(model: MultiRouteModel, options: Dictindex) = this()
  var editor: EditorAddon = js.native
  var model: MultiRouteModel = js.native
  def getActiveRoute(): Route | typingsSlinky.yandexMaps.mod.multiRouter.masstransit.Route | Null = js.native
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
  def getRoutes(): GeoObjectCollection = js.native
  def getViaPoints(): GeoObjectCollection = js.native
  def getWayPoints(): GeoObjectCollection = js.native
  def setActiveRoute(): Unit = js.native
  def setActiveRoute(route: Route): Unit = js.native
  def setActiveRoute(route: typingsSlinky.yandexMaps.mod.multiRouter.masstransit.Route): Unit = js.native
}

