package typingsSlinky.yandexDashMaps.yandexDashMapsMod.control

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "control.FullscreenControl")
@js.native
class FullscreenControl () extends Button {
  def this(parameters: IFullscreenControlParameters) = this()
  def enterFullscreen(): Unit = js.native
  def exitFullscreen(): Unit = js.native
}

