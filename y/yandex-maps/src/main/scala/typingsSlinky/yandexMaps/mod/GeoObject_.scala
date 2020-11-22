package typingsSlinky.yandexMaps.mod

import typingsSlinky.yandexMaps.mod.event.Manager
import typingsSlinky.yandexMaps.mod.geoObject.Hint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "GeoObject")
@js.native
class GeoObject_[T, TargetGeometry] () extends IGeoObject[T] {
  def this(feature: IGeoObjectFeature) = this()
  def this(feature: js.UndefOr[scala.Nothing], options: IGeoObjectOptions) = this()
  def this(feature: IGeoObjectFeature, options: IGeoObjectOptions) = this()
  
  var balloon: typingsSlinky.yandexMaps.mod.geoObject.Balloon = js.native
  
  var editor: IGeometryEditor = js.native
  
  @JSName("events")
  var events_GeoObject_ : Manager[TargetGeometry] = js.native
  
  var hint: Hint = js.native
  
  @JSName("options")
  var options_GeoObject_ : typingsSlinky.yandexMaps.mod.option.Manager = js.native
  
  @JSName("properties")
  var properties_GeoObject_ : typingsSlinky.yandexMaps.mod.data.Manager = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
  
  @JSName("state")
  var state_GeoObject_ : typingsSlinky.yandexMaps.mod.data.Manager = js.native
}
