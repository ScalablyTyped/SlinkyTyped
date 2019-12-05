package typingsSlinky.wonderDashFrp

import typingsSlinky.wonderDashFrp.distCommonjsEnumFilterStateMod.FilterState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/enum/FilterState", JSImport.Namespace)
@js.native
object distCommonjsEnumFilterStateMod extends js.Object {
  @js.native
  sealed trait FilterState extends js.Object
  
  @js.native
  object FilterState extends js.Object {
    @js.native
    sealed trait ENTER extends FilterState
    
    @js.native
    sealed trait LEAVE extends FilterState
    
    @js.native
    sealed trait TRIGGER extends FilterState
    
    /* 1 */ val ENTER: typingsSlinky.wonderDashFrp.distCommonjsEnumFilterStateMod.FilterState.ENTER with Double = js.native
    /* 2 */ val LEAVE: typingsSlinky.wonderDashFrp.distCommonjsEnumFilterStateMod.FilterState.LEAVE with Double = js.native
    /* 0 */ val TRIGGER: typingsSlinky.wonderDashFrp.distCommonjsEnumFilterStateMod.FilterState.TRIGGER with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FilterState with Double] = js.native
  }
  
}

