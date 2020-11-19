package typingsSlinky.sodiumjs

import typingsSlinky.sodiumjs.cellMod.Cell
import typingsSlinky.sodiumjs.lambdaMod.Lambda2_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs/dist/typings/sodium/CellSink", JSImport.Namespace)
@js.native
object cellSinkMod extends js.Object {
  
  @js.native
  class CellSink[A] protected () extends Cell[A] {
    /**
      * Construct a writable cell with the specified initial value. If multiple values are
      * sent in the same transaction, the specified function is used to combine them.
      *
      * If the function is not supplied, then an exception will be thrown in this case.
      */
    def this(initValue: A) = this()
    def this(initValue: A, f: js.Function2[/* l */ A, /* r */ A, A]) = this()
    def this(initValue: A, f: Lambda2_[A, A, A]) = this()
    
    /**
      * Send a value, modifying the value of the cell. send(A) may not be used inside
      * handlers registered with {@link Stream#listen(Handler)} or {@link Cell#listen(Handler)}.
      * An exception will be thrown, because CellSink is for interfacing I/O to FRP only.
      * You are not meant to use this to define your own primitives.
      * @param a Value to push into the cell.
      */
    def send(a: A): Unit = js.native
  }
}
