package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.mod.ICollection
import typingsSlinky.yandexMaps.mod.IControlParent
import typingsSlinky.yandexMaps.mod.IOptionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.yandexMaps.mod.IEventEmitter because Already inherited
- typingsSlinky.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options
- typingsSlinky.yandexMaps.mod.IChild because var conflicts: events. Inlined getParent, setParent, setParent */ @JSImport("yandex-maps", "control.ListBox")
@js.native
class ListBox () extends ICollection {
  def this(parameters: IListBoxParameters) = this()
  
  var data: typingsSlinky.yandexMaps.mod.data.Manager = js.native
  
  def getParent(): Null | IControlParent = js.native
  
  var options: IOptionManager = js.native
  
  def setParent(): this.type = js.native
  def setParent(parent: js.Object): this.type = js.native
  def setParent(parent: IControlParent): this.type = js.native
  
  var state: typingsSlinky.yandexMaps.mod.data.Manager = js.native
}
