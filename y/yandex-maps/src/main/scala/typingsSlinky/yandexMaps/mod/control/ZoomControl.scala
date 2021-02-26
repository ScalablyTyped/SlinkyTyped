package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.mod.IChild
import typingsSlinky.yandexMaps.mod.IControlParent
import typingsSlinky.yandexMaps.mod.IOptionManager
import typingsSlinky.yandexMaps.mod.Map_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.yandexMaps.mod.IEventEmitter because Already inherited
- typingsSlinky.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.ZoomControl")
@js.native
class ZoomControl () extends IChild[IControlParent] {
  def this(parameters: IZoomControlParameters) = this()
  
  def clear(): Unit = js.native
  
  def getMap(): Map_ = js.native
  
  def getRequestString(): String = js.native
  
  def getResponseMetaData(): js.Object = js.native
  
  def getResult(index: Double): js.Promise[js.Object] = js.native
  
  def getResultsArray(): js.Array[js.Object] = js.native
  
  def getResultsCount(): Double = js.native
  
  def getSelectedIndex(): Double = js.native
  
  def hideResult(): Unit = js.native
  
  var options: IOptionManager = js.native
  
  def search(request: String): js.Promise[Unit] = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
  
  def showResult(index: Double): this.type = js.native
  
  var state: typingsSlinky.yandexMaps.mod.data.Manager = js.native
}
