package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.yandexMaps.mod.IEventEmitter because Already inherited
- typingsSlinky.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @js.native
trait IGeoObject
  extends IChild[IControlParent]
     with IParentOnMap {
  
  var geometry: IGeometry | Null = js.native
  
  def getOverlay(): js.Promise[IOverlay | Null] = js.native
  
  def getOverlaySync(): IOverlay | Null = js.native
  
  var options: IOptionManager = js.native
  
  var properties: IDataManager = js.native
  
  var state: IDataManager = js.native
}
