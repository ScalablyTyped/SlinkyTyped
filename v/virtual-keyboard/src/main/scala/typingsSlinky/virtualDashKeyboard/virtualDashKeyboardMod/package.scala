package typingsSlinky.virtualDashKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object virtualDashKeyboardMod {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.Element
  import org.scalajs.dom.raw.Event

  type CustomLayout = StringDictionary[js.Array[String]]
  type kbEventHandler = js.Function3[
    /* event */ js.UndefOr[Event | String], 
    /* keyboard */ js.UndefOr[Element], 
    /* el */ js.UndefOr[Element], 
    Unit
  ]
}
