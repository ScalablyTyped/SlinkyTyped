package typingsSlinky.yandexMaps.mod.multiRouter

import typingsSlinky.yandexMaps.mod.ICustomizable
import typingsSlinky.yandexMaps.mod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "multiRouter.EditorAddon")
@js.native
class EditorAddon () extends ICustomizable {
  
  def isActive(): Boolean = js.native
  
  def start(state: js.Object): Unit = js.native
  
  var state: Manager = js.native
  
  def stop(): Unit = js.native
}
