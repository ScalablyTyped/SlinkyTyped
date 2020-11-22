package typingsSlinky.yandexMaps.mod

import typingsSlinky.yandexMaps.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.yandexMaps.mod.IEventEmitter because Already inherited
- typingsSlinky.yandexMaps.mod.IParentOnMap because Already inherited
- typingsSlinky.yandexMaps.mod.ICustomizable because Already inherited
- typingsSlinky.yandexMaps.mod.IGeoObjectCollection because var conflicts: events, options. Inlined add, add, each, each, get, getBounds, getIterator, getLength, getPixelBounds, indexOf, remove, removeAll, set, splice */ @JSImport("yandex-maps", "GeoObjectCollection")
@js.native
class GeoObjectCollection () extends IGeoObject[IGeometry] {
  def this(feature: Children) = this()
  def this(feature: js.UndefOr[scala.Nothing], options: js.Object) = this()
  def this(feature: Children, options: js.Object) = this()
  
  def add(child: IGeoObject[IGeometry]): this.type = js.native
  def add(child: IGeoObject[IGeometry], index: Double): this.type = js.native
  
  def each(callback: js.Function1[/* object */ IGeoObject[IGeometry], Unit]): Unit = js.native
  def each(callback: js.Function1[/* object */ IGeoObject[IGeometry], Unit], context: js.Object): Unit = js.native
  
  def get(index: Double): IGeoObject[IGeometry] = js.native
  
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  def getIterator(): IIterator = js.native
  
  def getLength(): Double = js.native
  
  def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  def indexOf(`object`: IGeoObject[IGeometry]): Double = js.native
  
  def remove(child: IGeoObject[IGeometry]): this.type = js.native
  
  def removeAll(): this.type = js.native
  
  def set(index: Double, child: IGeoObject[IGeometry]): this.type = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
  
  def splice(index: Double, length: Double): this.type = js.native
  
  def toArray(): js.Array[IGeoObject[IGeometry]] = js.native
}
