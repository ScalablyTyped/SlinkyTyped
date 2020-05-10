package typingsSlinky.tabris.mod

import typingsSlinky.tabris.tabrisStrings.debug
import typingsSlinky.tabris.tabrisStrings.error
import typingsSlinky.tabris.tabrisStrings.info
import typingsSlinky.tabris.tabrisStrings.log
import typingsSlinky.tabris.tabrisStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabrisLogEvent[Target] extends EventObject[Target] {
  val level: debug | info | log | warn | error = js.native
  val message: String = js.native
}

