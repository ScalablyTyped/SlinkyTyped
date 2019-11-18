package typingsSlinky.yandexDashMaps.yandexDashMapsMod.control

import typingsSlinky.yandexDashMaps.yandexDashMapsMod.ICollection
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IControlParent
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IEventManager
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IIterator
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IOptionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options
- typings.yandexDashMaps.yandexDashMapsMod.IChild because var conflicts: events. Inlined getParent, setParent, setParent */ @JSImport("yandex-maps", "control.ListBox")
@js.native
class ListBox () extends ICollection {
  def this(parameters: IListBoxParameters) = this()
  var data: typingsSlinky.yandexDashMaps.yandexDashMapsMod.data.Manager = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  var options: IOptionManager = js.native
  var state: typingsSlinky.yandexDashMaps.yandexDashMapsMod.data.Manager = js.native
  /* CompleteClass */
  override def add(`object`: js.Object): this.type = js.native
  /* CompleteClass */
  override def getIterator(): IIterator = js.native
  def getParent(): Null | IControlParent = js.native
  /* CompleteClass */
  override def remove(`object`: js.Object): this.type = js.native
  def setParent(): this.type = js.native
  def setParent(parent: js.Object): this.type = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

