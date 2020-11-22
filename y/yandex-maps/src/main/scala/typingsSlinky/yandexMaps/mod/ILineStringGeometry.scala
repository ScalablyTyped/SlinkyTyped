package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.yandexMaps.mod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze
- typingsSlinky.yandexMaps.mod.ILineStringGeometryAccess because var conflicts: events. Inlined get, getChildGeometry, getClosest, getCoordinates, getLength, insert, remove, set, setCoordinates, splice */ @js.native
trait ILineStringGeometry extends IGeometry {
  
  def freeze(): IFreezable = js.native
  
  def get(index: Double): js.Array[Double] = js.native
  
  def getChildGeometry(index: Double): IPointGeometryAccess = js.native
  
  def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
  
  def getCoordinates(): js.Array[js.Array[Double]] = js.native
  
  def getLength(): Double = js.native
  
  def insert(index: Double, coordinates: js.Array[js.Array[Double]]): ILineStringGeometryAccess = js.native
  
  def isFrozen(): Boolean = js.native
  
  def remove(index: Double): js.Array[Double] = js.native
  
  def set(index: Double, coordinates: js.Array[Double]): ILineStringGeometryAccess = js.native
  
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): ILineStringGeometryAccess = js.native
  
  def splice(index: Double, length: Double): js.Array[js.Array[Double]] = js.native
  
  def unfreeze(): IFreezable = js.native
}
