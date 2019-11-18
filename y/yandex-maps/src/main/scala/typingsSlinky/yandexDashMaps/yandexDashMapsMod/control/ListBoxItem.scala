package typingsSlinky.yandexDashMaps.yandexDashMapsMod.control

import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IControlParent
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IEventManager
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IOptionManager
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.ISelectableControl
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.ListBoxItem")
@js.native
class ListBoxItem () extends ISelectableControl {
  def this(parameters: IListBoxItemParameters) = this()
  var data: typingsSlinky.yandexDashMaps.yandexDashMapsMod.data.Manager = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  var options: IOptionManager = js.native
  var state: typingsSlinky.yandexDashMaps.yandexDashMapsMod.data.Manager = js.native
  def getMap(): Map = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

