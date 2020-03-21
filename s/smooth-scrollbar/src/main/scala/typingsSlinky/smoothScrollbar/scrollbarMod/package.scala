package typingsSlinky.smoothScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scrollbarMod {
  type AddTransformableMomentumCallback = js.ThisFunction1[
    /* this */ typingsSlinky.smoothScrollbar.scrollbarMod.Scrollbar, 
    /* willScroll */ scala.Boolean, 
    scala.Unit
  ]
  type ScrollListener = js.ThisFunction1[
    /* this */ typingsSlinky.smoothScrollbar.scrollbarMod.Scrollbar, 
    /* status */ typingsSlinky.smoothScrollbar.scrollbarMod.ScrollStatus, 
    scala.Unit
  ]
}
