package typingsSlinky.yandexMaps.mod.multiRouter

import typingsSlinky.yandexMaps.mod.GeoObjectCollection
import typingsSlinky.yandexMaps.mod.IEventEmitter
import typingsSlinky.yandexMaps.mod.IGeoObject
import typingsSlinky.yandexMaps.mod.IGeometry
import typingsSlinky.yandexMaps.mod.data.Manager
import typingsSlinky.yandexMaps.mod.geometry.base.LineString
import typingsSlinky.yandexMaps.mod.geometry.base.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "multiRouter.masstransit")
@js.native
object masstransit extends js.Object {
  
  @js.native
  class Path () extends IGeoObject[IGeometry] {
    
    def getSegmentMarkers(): GeoObjectCollection = js.native
    
    def getSegments(): GeoObjectCollection = js.native
    
    var model: PathModel = js.native
    
    @JSName("properties")
    var properties_Path: Manager = js.native
  }
  
  @js.native
  class PathModel () extends IEventEmitter {
    
    def destroy(): Unit = js.native
    
    def getSegments(): js.Array[TransferSegmentModel | TransportSegmentModel | WalkSegmentModel] = js.native
    
    def getType(): String = js.native
    
    var properties: Manager = js.native
    
    var route: RouteModel = js.native
    
    def update(pathJson: js.Object): Unit = js.native
  }
  
  @js.native
  class Route () extends IGeoObject[IGeometry] {
    
    def getPaths(): GeoObjectCollection = js.native
    
    var model: RouteModel = js.native
    
    @JSName("properties")
    var properties_Route: Manager = js.native
  }
  
  @js.native
  class RouteModel () extends IEventEmitter {
    
    def destroy(): Unit = js.native
    
    def getPaths(): js.Array[PathModel] = js.native
    
    def getType(): String = js.native
    
    var multiRoute: MultiRouteModel = js.native
    
    var properties: Manager = js.native
    
    def update(routeJson: js.Object): Unit = js.native
  }
  
  @js.native
  class StopModel () extends IEventEmitter {
    
    var geometry: Point = js.native
    
    var properties: Manager = js.native
    
    var segment: TransportSegmentModel = js.native
    
    def update(stopJson: js.Object): Unit = js.native
  }
  
  @js.native
  class TransferSegment () extends IGeoObject[IGeometry] {
    
    var model: TransferSegmentModel = js.native
    
    @JSName("properties")
    var properties_TransferSegment: Manager = js.native
  }
  
  @js.native
  class TransferSegmentModel () extends IEventEmitter {
    
    def destroy(segmentJson: js.Object): Unit = js.native
    
    var geometry: LineString = js.native
    
    def getType(): String = js.native
    
    var path: PathModel = js.native
    
    var properties: Manager = js.native
  }
  
  @js.native
  class TransportSegment () extends IGeoObject[IGeometry] {
    
    var model: TransportSegmentModel = js.native
    
    @JSName("properties")
    var properties_TransportSegment: Manager = js.native
  }
  
  @js.native
  class TransportSegmentModel () extends IEventEmitter {
    
    def destroy(): Unit = js.native
    
    var geometry: LineString = js.native
    
    def getStops(): js.Array[StopModel] = js.native
    
    def getType(): String = js.native
    
    var path: PathModel = js.native
    
    var properties: Manager = js.native
    
    def update(segmentJson: js.Object): Unit = js.native
  }
  
  @js.native
  class WalkSegment () extends IGeoObject[IGeometry] {
    
    var model: WalkSegmentModel = js.native
    
    @JSName("properties")
    var properties_WalkSegment: Manager = js.native
  }
  
  @js.native
  class WalkSegmentModel () extends IEventEmitter {
    
    def destroy(): Unit = js.native
    
    var geometry: LineString = js.native
    
    def getType(): String = js.native
    
    var path: PathModel = js.native
    
    var properties: Manager = js.native
  }
}
