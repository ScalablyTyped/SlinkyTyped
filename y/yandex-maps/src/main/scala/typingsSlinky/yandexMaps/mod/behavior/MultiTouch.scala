package typingsSlinky.yandexMaps.mod.behavior

import typingsSlinky.yandexMaps.mod.IBehavior
import typingsSlinky.yandexMaps.mod.IControlParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "behavior.MultiTouch")
@js.native
class MultiTouch () extends IBehavior {
  def this(options: IMultiTouchOptions) = this()
  def setParent(parent: IControlParent): this.type = js.native
}

