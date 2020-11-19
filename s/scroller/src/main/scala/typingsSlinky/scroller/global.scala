package typingsSlinky.scroller

import typingsSlinky.scroller.Scroller.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class EasyScroller protected ()
    extends typingsSlinky.scroller.EasyScroller {
    def this(content: js.Any, options: Options) = this()
  }
  
  @js.native
  class Scroller protected ()
    extends typingsSlinky.scroller.Scroller {
    def this(callback: js.Function3[/* left */ Double, /* top */ Double, /* zoom */ Double, Unit]) = this()
    def this(
      callback: js.Function3[/* left */ Double, /* top */ Double, /* zoom */ Double, Unit],
      options: Options
    ) = this()
  }
}
