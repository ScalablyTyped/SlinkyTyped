package typingsSlinky.yandexMaps.mod.behavior

import typingsSlinky.yandexMaps.mod.IBehavior
import typingsSlinky.yandexMaps.mod.IControlParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "behavior.Drag")
@js.native
class Drag () extends IBehavior {
  def this(options: IDragOptions) = this()
  
  def setParent(parent: IControlParent): this.type = js.native
}
