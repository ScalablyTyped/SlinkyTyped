package typingsSlinky.sqlite3Promise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("sqlite3", JSImport.Namespace)
@js.native
object sqlite3AugmentingMod extends js.Object {
  
  @js.native
  trait Database extends js.Object {
    
    def allAsync(sql: String): js.Promise[js.Array[_]] = js.native
    
    def closeAsync(): js.Promise[Unit] = js.native
    
    def eachAsync(sql: String): js.Promise[Double] = js.native
    def eachAsync(
      sql: String,
      cb: js.ThisFunction2[
          /* this */ typingsSlinky.sqlite3.mod.Statement, 
          /* err */ js.Error | Null, 
          /* row */ js.Any, 
          Unit
        ]
    ): js.Promise[Double] = js.native
    def eachAsync(sql: String, params: js.Any): js.Promise[Double] = js.native
    def eachAsync(
      sql: String,
      params: js.Any,
      cb: js.ThisFunction2[
          /* this */ typingsSlinky.sqlite3.mod.Statement, 
          /* err */ js.Error | Null, 
          /* row */ js.Any, 
          Unit
        ]
    ): js.Promise[Double] = js.native
    
    def execAsync(sql: String): js.Promise[typingsSlinky.sqlite3.mod.Statement] = js.native
    
    def getAsync(sql: String): js.Promise[_] = js.native
    
    def runAsync(sql: String): js.Promise[Unit] = js.native
  }
}
