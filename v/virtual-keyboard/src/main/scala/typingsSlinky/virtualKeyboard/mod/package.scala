package typingsSlinky.virtualKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomLayout = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type kbEventHandler = js.Function3[
    /* event */ js.UndefOr[org.scalajs.dom.raw.Event | java.lang.String], 
    /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], 
    /* el */ js.UndefOr[org.scalajs.dom.raw.Element], 
    scala.Unit
  ]
}
