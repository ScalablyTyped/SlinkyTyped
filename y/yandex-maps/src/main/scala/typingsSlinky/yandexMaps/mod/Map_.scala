package typingsSlinky.yandexMaps.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.yandexMaps.mod.map.Container
import typingsSlinky.yandexMaps.mod.map.Converter
import typingsSlinky.yandexMaps.mod.map.Copyrights
import typingsSlinky.yandexMaps.mod.map.GeoObjects
import typingsSlinky.yandexMaps.mod.map.Hint
import typingsSlinky.yandexMaps.mod.map.ZoomRange
import typingsSlinky.yandexMaps.mod.map.action.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "Map")
@js.native
class Map_ protected () extends IEventEmitter {
  def this(parentElement: String, state: IMapState) = this()
  def this(parentElement: HTMLElement, state: IMapState) = this()
  def this(parentElement: String, state: IMapState, options: IMapOptions) = this()
  def this(parentElement: HTMLElement, state: IMapState, options: IMapOptions) = this()
  var action: Manager = js.native
  var balloon: typingsSlinky.yandexMaps.mod.map.Balloon = js.native
  var behaviors: typingsSlinky.yandexMaps.mod.map.behavior.Manager = js.native
  var container: Container = js.native
  var controls: typingsSlinky.yandexMaps.mod.control.Manager = js.native
  var converter: Converter = js.native
  var copyrights: Copyrights = js.native
  var cursors: typingsSlinky.yandexMaps.mod.util.cursor.Manager = js.native
  @JSName("events")
  var events_Map_ : typingsSlinky.yandexMaps.mod.event.Manager = js.native
  var geoObjects: GeoObjects = js.native
  var hint: Hint = js.native
  var layers: typingsSlinky.yandexMaps.mod.map.layer.Manager = js.native
  var margin: typingsSlinky.yandexMaps.mod.map.margin.Manager = js.native
  var options: typingsSlinky.yandexMaps.mod.option.Manager = js.native
  var panes: typingsSlinky.yandexMaps.mod.map.pane.Manager = js.native
  var zoomRange: ZoomRange = js.native
  def destroy(): Unit = js.native
  def getBounds(): js.Array[js.Array[Double]] = js.native
  def getBounds(options: IMapMarginOptions): js.Array[js.Array[Double]] = js.native
  def getCenter(): js.Array[Double] = js.native
  def getCenter(options: IMapMarginOptions): js.Array[Double] = js.native
  def getGlobalPixelCenter(): js.Array[Double] = js.native
  def getGlobalPixelCenter(options: IMapMarginOptions): js.Array[Double] = js.native
  def getPanoramaManager(): js.Promise[typingsSlinky.yandexMaps.mod.panorama.Manager] = js.native
  def getType(): String | MapType = js.native
  def getZoom(): Double = js.native
  def panTo(center: js.Array[Double | js.Object]): js.Promise[Unit] = js.native
  def panTo(center: js.Array[Double | js.Object], options: IMapPanOptions): js.Promise[Unit] = js.native
  def setBounds(bounds: js.Array[js.Array[Double]]): js.Promise[Unit] = js.native
  def setBounds(bounds: js.Array[js.Array[Double]], options: IMapBoundsOptions): js.Promise[Unit] = js.native
  def setCenter(center: js.Array[Double]): js.Promise[Unit] = js.native
  def setCenter(center: js.Array[Double], zoom: Double): js.Promise[Unit] = js.native
  def setCenter(center: js.Array[Double], zoom: Double, options: IMapPositionOptions): js.Promise[Unit] = js.native
  def setGlobalPixelCenter(globalPixelCenter: js.Array[Double]): js.Promise[Unit] = js.native
  def setGlobalPixelCenter(globalPixelCenter: js.Array[Double], zoom: Double): js.Promise[Unit] = js.native
  def setGlobalPixelCenter(globalPixelCenter: js.Array[Double], zoom: Double, options: IMapPositionOptions): js.Promise[Unit] = js.native
  def setType(`type`: String): js.Promise[Unit] = js.native
  def setType(`type`: String, options: IMapCheckZoomRangeOptions): js.Promise[Unit] = js.native
  def setType(`type`: MapType): js.Promise[Unit] = js.native
  def setType(`type`: MapType, options: IMapCheckZoomRangeOptions): js.Promise[Unit] = js.native
  def setZoom(zoom: Double): js.Promise[Unit] = js.native
  def setZoom(zoom: Double, options: IMapZoomOptions): js.Promise[Unit] = js.native
}

