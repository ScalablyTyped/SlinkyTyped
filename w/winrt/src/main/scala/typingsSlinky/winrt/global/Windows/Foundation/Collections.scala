package typingsSlinky.winrt.global.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Foundation.Collections")
@js.native
object Collections extends js.Object {
  @js.native
  class PropertySet ()
    extends typingsSlinky.winrt.Windows.Foundation.Collections.PropertySet
  
  @js.native
  class ValueSet ()
    extends typingsSlinky.winrt.Windows.Foundation.Collections.ValueSet
  
  @js.native
  object CollectionChange extends js.Object {
    /* 3 */ val itemChanged: typingsSlinky.winrt.Windows.Foundation.Collections.CollectionChange.itemChanged with Double = js.native
    /* 1 */ val itemInserted: typingsSlinky.winrt.Windows.Foundation.Collections.CollectionChange.itemInserted with Double = js.native
    /* 2 */ val itemRemoved: typingsSlinky.winrt.Windows.Foundation.Collections.CollectionChange.itemRemoved with Double = js.native
    /* 0 */ val reset: typingsSlinky.winrt.Windows.Foundation.Collections.CollectionChange.reset with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Foundation.Collections.CollectionChange with Double] = js.native
  }
  
}

