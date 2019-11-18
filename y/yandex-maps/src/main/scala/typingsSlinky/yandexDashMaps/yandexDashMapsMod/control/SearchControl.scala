package typingsSlinky.yandexDashMaps.yandexDashMapsMod.control

import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IChild
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IControlParent
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IEventManager
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IOptionManager
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.SearchControl")
@js.native
class SearchControl () extends IChild[IControlParent] {
  def this(parameters: ISearchControlParameters) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  var options: IOptionManager = js.native
  var state: typingsSlinky.yandexDashMaps.yandexDashMapsMod.data.Manager = js.native
  def clear(): Unit = js.native
  def getMap(): Map = js.native
  def getRequestString(): String = js.native
  def getResponseMetaData(): js.Object = js.native
  def getResult(index: Double): js.Promise[js.Object] = js.native
  def getResultsArray(): js.Array[js.Object] = js.native
  def getResultsCount(): Double = js.native
  def getSelectedIndex(): Double = js.native
  def hideResult(): Unit = js.native
  def search(request: String): js.Promise[Unit] = js.native
  def setParent(parent: IControlParent): this.type = js.native
  def showResult(index: Double): this.type = js.native
}

