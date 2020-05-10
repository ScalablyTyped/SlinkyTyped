package typingsSlinky.yandexMaps.mod.behavior

import typingsSlinky.yandexMaps.mod.IBehavior
import typingsSlinky.yandexMaps.mod.IControlParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "behavior.RightMouseButtonMagnifier")
@js.native
class RightMouseButtonMagnifier () extends IBehavior {
  def this(options: IRightMouseButtonMagnifierOptions) = this()
  def setParent(parent: IControlParent): this.type = js.native
}

