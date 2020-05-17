package typingsSlinky.ydnDb.global

import typingsSlinky.ydnDb.anon.Push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ydb")
@js.native
object ydb extends js.Object {
  @js.native
  object db extends js.Object {
    @js.native
    object algo extends js.Object {
      @js.native
      class NestedLoop protected ()
        extends typingsSlinky.ydnDb.ydb.db.algo.Solver {
        def this(out: Push) = this()
        def this(out: Push, limit: Double) = this()
      }
      
      @js.native
      class Solver ()
        extends typingsSlinky.ydnDb.ydb.db.algo.Solver
      
      @js.native
      class SortedMerge protected ()
        extends typingsSlinky.ydnDb.ydb.db.algo.Solver {
        def this(out: Push) = this()
        def this(out: Push, limit: Double) = this()
      }
      
      @js.native
      class ZigzagMerge protected ()
        extends typingsSlinky.ydnDb.ydb.db.algo.Solver {
        def this(out: Push) = this()
        def this(out: Push, limit: Double) = this()
      }
      
    }
    
  }
  
}

