package typingsSlinky.yandexMaps.mod

import typingsSlinky.yandexMaps.mod.option.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "objectManager")
@js.native
object objectManager extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.yandexMaps.mod.IEventEmitter because Already inherited
  - typingsSlinky.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @js.native
  class ObjectCollection () extends ICollection {
    
    def getById(): js.Object | Null = js.native
    def getById(id: String): js.Object | Null = js.native
    
    var options: IOptionManager | Manager = js.native
  }
}
