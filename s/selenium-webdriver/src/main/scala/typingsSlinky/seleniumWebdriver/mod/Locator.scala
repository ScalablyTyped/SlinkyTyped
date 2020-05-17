package typingsSlinky.seleniumWebdriver.mod

import typingsSlinky.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.seleniumWebdriver.byMod.By
  - js.Function
  - typingsSlinky.seleniumWebdriver.byMod.ByHash
*/
trait Locator extends js.Object

object Locator {
  @scala.inline
  implicit def apply(value: typingsSlinky.seleniumWebdriver.byMod.By): Locator = value.asInstanceOf[Locator]
  @scala.inline
  implicit def apply(value: ByHash): Locator = value.asInstanceOf[Locator]
  @scala.inline
  implicit def apply(value: js.Function): Locator = value.asInstanceOf[Locator]
}

