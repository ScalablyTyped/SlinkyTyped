package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.mod.IControlParent
import typingsSlinky.yandexMaps.mod.IOptionManager
import typingsSlinky.yandexMaps.mod.ISelectableControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.yandexMaps.mod.IEventEmitter because Already inherited
- typingsSlinky.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.Button")
@js.native
class Button () extends ISelectableControl {
  def this(parameters: String) = this()
  def this(parameters: IButtonParameters) = this()
  
  var data: typingsSlinky.yandexMaps.mod.data.Manager = js.native
  
  var options: IOptionManager = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
  
  var state: typingsSlinky.yandexMaps.mod.data.Manager = js.native
}
