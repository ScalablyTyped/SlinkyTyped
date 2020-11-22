package typingsSlinky.yandexMaps.mod

import typingsSlinky.yandexMaps.anon.DomEvent
import typingsSlinky.yandexMaps.yandexMapsStrings.`type`
import typingsSlinky.yandexMaps.yandexMapsStrings.newZoom
import typingsSlinky.yandexMaps.yandexMapsStrings.objectId
import typingsSlinky.yandexMaps.yandexMapsStrings.oldZoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEvent[OriginalEvent, TargetGeometry] extends js.Object {
  
  def allowMapEvent(): Unit = js.native
  
  def callMethod(name: String): Unit = js.native
  
  def get(name: String): js.Object = js.native
  def get[T /* <: js.Object */, K /* <: /* keyof T */ String */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  
  def getSourceEvent(): (IEvent[OriginalEvent, js.Object]) | Null = js.native
  
  @JSName("get")
  def get_newZoom(name: newZoom): js.UndefOr[Double] = js.native
  @JSName("get")
  def get_objectId(name: objectId): js.UndefOr[String] = js.native
  @JSName("get")
  def get_oldZoom(name: oldZoom): js.UndefOr[Double] = js.native
  @JSName("get")
  def get_type(name: `type`): String = js.native
  
  def isDefaultPrevented(): Boolean = js.native
  
  def isImmediatePropagationStopped(): Boolean = js.native
  
  def isMapEventAllowed(): Boolean = js.native
  
  def isPropagationStopped(): Boolean = js.native
  
  var originalEvent: DomEvent[OriginalEvent, TargetGeometry] = js.native
  
  def preventDefault(): Boolean = js.native
  
  def stopImmediatePropagation(): Boolean = js.native
  
  def stopPropagation(): Boolean = js.native
}
