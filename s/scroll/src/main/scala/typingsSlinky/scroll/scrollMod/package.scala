package typingsSlinky.scroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scrollMod {
  import org.scalajs.dom.raw.HTMLElement

  type Cancel = js.Function0[Unit]
  type Scroll = js.Function4[
    /* el */ HTMLElement, 
    /* to */ Double, 
    /* opts */ js.UndefOr[ScrollOptions | ScrollCallback], 
    /* cb */ js.UndefOr[ScrollCallback], 
    Cancel
  ]
  type ScrollCallback = js.Function2[/* error */ ScrollError, /* value */ Double, Unit]
  type ScrollError = js.Error | Null
}
