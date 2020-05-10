package typingsSlinky.tabris.mod

import typingsSlinky.tabris.tabrisStrings.cancel
import typingsSlinky.tabris.tabrisStrings.neutral
import typingsSlinky.tabris.tabrisStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertDialogCloseEvent[Target] extends EventObject[Target] {
  val button: ok | cancel | neutral | Null = js.native
  val texts: js.Array[String] = js.native
}

