package typingsSlinky.std.global

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fires when the user presses a key.
  * @param ev The keyboard event
  */
@JSGlobal("onkeydown")
@js.native
object onkeydown
  extends TopLevel[
      (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.KeyboardEvent, js.Any]) | Null
    ]

