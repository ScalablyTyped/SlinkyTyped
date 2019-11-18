package typingsSlinky.yandexDashMaps.yandexDashMapsMod.multiRouter

import typingsSlinky.yandexDashMaps.yandexDashMapsMod.GeoObjectCollection
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IEventEmitter
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IEventManager
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IGeoObject
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.Map
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.data.Manager
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.geometry.base.LineString
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.multiRouter.driving.PathModel
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.multiRouter.driving.RouteModel
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.multiRouter.driving.SegmentModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.driving")
@js.native
object driving extends js.Object {
  @js.native
  class Path () extends IGeoObject {
    /* CompleteClass */
    override var events: IEventManager = js.native
    var model: PathModel = js.native
    @JSName("properties")
    var properties_Path: Manager = js.native
    /* CompleteClass */
    override def getMap(): Map = js.native
    def getSegments(): GeoObjectCollection = js.native
  }
  
  @js.native
  class PathModel () extends IEventEmitter {
    /* CompleteClass */
    override var events: IEventManager = js.native
    var properties: Manager = js.native
    var route: RouteModel = js.native
    def destroy(): Unit = js.native
    def getSegments(): js.Array[SegmentModel] = js.native
    def getType(): String = js.native
    def update(pathJson: js.Object): Unit = js.native
  }
  
  @js.native
  class Route () extends IGeoObject {
    /* CompleteClass */
    override var events: IEventManager = js.native
    /* CompleteClass */
    override def getMap(): Map = js.native
    def getPaths(): GeoObjectCollection = js.native
  }
  
  @js.native
  class RouteModel () extends IEventEmitter {
    /* CompleteClass */
    override var events: IEventManager = js.native
    var multiRoute: MultiRouteModel = js.native
    var properties: Manager = js.native
    def destroy(): Unit = js.native
    def getPaths(): js.Array[PathModel] = js.native
    def getType(): String = js.native
    def update(routeJson: js.Object): Unit = js.native
  }
  
  @js.native
  class Segment () extends IGeoObject {
    /* CompleteClass */
    override var events: IEventManager = js.native
    @JSName("properties")
    var properties_Segment: Manager = js.native
    /* CompleteClass */
    override def getMap(): Map = js.native
  }
  
  @js.native
  class SegmentModel () extends IEventEmitter {
    /* CompleteClass */
    override var events: IEventManager = js.native
    var geometry: LineString = js.native
    var path: PathModel = js.native
    def destroy(): Unit = js.native
    def getType(): String = js.native
    def getViaPoints(): js.Array[ViaPointModel] = js.native
    def update(segmentJson: js.Object): Unit = js.native
  }
  
}

