package typingsSlinky.yandexDashMaps.yandexDashMapsMod.control

import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IControlParent
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IEventManager
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IOptionManager
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.ISelectableControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.Button")
@js.native
class Button () extends ISelectableControl {
  def this(parameters: String) = this()
  def this(parameters: IButtonParameters) = this()
  var data: typingsSlinky.yandexDashMaps.yandexDashMapsMod.data.Manager = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  var options: IOptionManager = js.native
  var state: typingsSlinky.yandexDashMaps.yandexDashMapsMod.data.Manager = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

