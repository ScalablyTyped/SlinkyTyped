package typingsSlinky.yandexDashMaps.yandexDashMapsMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICopyrightsProvider extends IEventEmitter {
  def getCopyrights(coords: js.Array[Double], zoom: Double): js.Promise[js.Array[String | HTMLElement]] = js.native
  def remove(): Unit = js.native
  def setCopyrights(copyrights: String): Unit = js.native
  def setCopyrights(copyrights: js.Array[String | typingsSlinky.std.HTMLElement]): Unit = js.native
  def setCopyrights(copyrights: typingsSlinky.std.HTMLElement): Unit = js.native
}

