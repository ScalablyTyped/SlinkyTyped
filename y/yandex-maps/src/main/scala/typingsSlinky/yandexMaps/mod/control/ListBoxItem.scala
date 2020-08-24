package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.mod.IControlParent
import typingsSlinky.yandexMaps.mod.IOptionManager
import typingsSlinky.yandexMaps.mod.ISelectableControl
import typingsSlinky.yandexMaps.mod.Map_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.yandexMaps.mod.IEventEmitter because Already inherited
- typingsSlinky.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.ListBoxItem")
@js.native
class ListBoxItem () extends ISelectableControl {
  def this(parameters: IListBoxItemParameters) = this()
  var data: typingsSlinky.yandexMaps.mod.data.Manager = js.native
  var options: IOptionManager = js.native
  var state: typingsSlinky.yandexMaps.mod.data.Manager = js.native
  def getMap(): Map_ = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

