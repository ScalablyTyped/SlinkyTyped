package typingsSlinky.webdriverio.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webdriverio.webdriverioStrings.press
  - typingsSlinky.webdriverio.webdriverioStrings.longPress
  - typingsSlinky.webdriverio.webdriverioStrings.tap
  - typingsSlinky.webdriverio.webdriverioStrings.moveTo
  - typingsSlinky.webdriverio.webdriverioStrings.wait
  - typingsSlinky.webdriverio.webdriverioStrings.release
*/
trait ActionTypes extends js.Object

object ActionTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def longPress: typingsSlinky.webdriverio.webdriverioStrings.longPress = this.cast("longPress")
  @scala.inline
  def moveTo: typingsSlinky.webdriverio.webdriverioStrings.moveTo = this.cast("moveTo")
  @scala.inline
  def press: typingsSlinky.webdriverio.webdriverioStrings.press = this.cast("press")
  @scala.inline
  def release: typingsSlinky.webdriverio.webdriverioStrings.release = this.cast("release")
  @scala.inline
  def tap: typingsSlinky.webdriverio.webdriverioStrings.tap = this.cast("tap")
}

