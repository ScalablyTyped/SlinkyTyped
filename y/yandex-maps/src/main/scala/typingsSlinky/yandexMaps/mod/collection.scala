package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "collection")
@js.native
object collection extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.yandexMaps.mod.IEventEmitter because Already inherited
  - typingsSlinky.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @js.native
  class Item ()
    extends IChild[IControlParent]
       with IParentOnMap {
    def this(options: js.Object) = this()
    
    def onAddToMap(map: Map_): Unit = js.native
    
    def onRemoveFromMap(oldMap: Map_): Unit = js.native
    
    var options: IOptionManager = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
}
