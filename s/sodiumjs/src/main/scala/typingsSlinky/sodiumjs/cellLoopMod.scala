package typingsSlinky.sodiumjs

import typingsSlinky.sodiumjs.cellMod.Cell
import typingsSlinky.sodiumjs.lazyCellMod.LazyCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs/dist/typings/sodium/CellLoop", JSImport.Namespace)
@js.native
object cellLoopMod extends js.Object {
  
  @js.native
  class CellLoop[A] () extends LazyCell[A] {
    
    /**
      * Resolve the loop to specify what the CellLoop was a forward reference to. It
      * must be invoked inside the same transaction as the place where the CellLoop is used.
      * This requires you to create an explicit transaction with {@link Transaction#run(Lambda0)}
      * or {@link Transaction#runVoid(Runnable)}.
      */
    def loop(a_out: Cell[A]): Unit = js.native
  }
}
