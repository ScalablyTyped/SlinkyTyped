package typingsSlinky.yandexMaps.mod.behavior

import typingsSlinky.yandexMaps.mod.IBehavior
import typingsSlinky.yandexMaps.mod.IControlParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "behavior.Ruler")
@js.native
class Ruler () extends IBehavior {
  def this(options: IRulerOptions) = this()
  
  def close(): Boolean = js.native
  
  def getState(): String = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
  
  def setState(): Unit = js.native
  def setState(state: String): Unit = js.native
}
