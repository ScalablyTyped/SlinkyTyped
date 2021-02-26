package typingsSlinky.sqlite3Promise

import typingsSlinky.sqlite3.mod.sqlite3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqlite3-promise", "Database")
  @js.native
  class Database protected ()
    extends typingsSlinky.sqlite3.mod.Database {
    def this(filename: String) = this()
    def this(filename: String, callback: js.Function1[/* err */ js.Error | Null, Unit]) = this()
    def this(filename: String, mode: Double) = this()
    def this(
      filename: String,
      mode: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.Error | Null, Unit]
    ) = this()
    def this(filename: String, mode: Double, callback: js.Function1[/* err */ js.Error | Null, Unit]) = this()
  }
  
  @JSImport("sqlite3-promise", "OPEN_CREATE")
  @js.native
  val OPEN_CREATE: Double = js.native
  
  @JSImport("sqlite3-promise", "OPEN_PRIVATECACHE")
  @js.native
  val OPEN_PRIVATECACHE: Double = js.native
  
  @JSImport("sqlite3-promise", "OPEN_READONLY")
  @js.native
  val OPEN_READONLY: Double = js.native
  
  @JSImport("sqlite3-promise", "OPEN_READWRITE")
  @js.native
  val OPEN_READWRITE: Double = js.native
  
  @JSImport("sqlite3-promise", "OPEN_SHAREDCACHE")
  @js.native
  val OPEN_SHAREDCACHE: Double = js.native
  
  @JSImport("sqlite3-promise", "OPEN_URI")
  @js.native
  val OPEN_URI: Double = js.native
  
  @JSImport("sqlite3-promise", "Statement")
  @js.native
  class Statement ()
    extends typingsSlinky.sqlite3.mod.Statement
  
  object cached {
    
    @JSImport("sqlite3-promise", "cached.Database")
    @js.native
    def Database(filename: String): typingsSlinky.sqlite3.mod.Database = js.native
    @JSImport("sqlite3-promise", "cached.Database")
    @js.native
    def Database(
      filename: String,
      callback: js.ThisFunction1[/* this */ typingsSlinky.sqlite3.mod.Database, /* err */ js.Error | Null, Unit]
    ): typingsSlinky.sqlite3.mod.Database = js.native
    @JSImport("sqlite3-promise", "cached.Database")
    @js.native
    def Database(
      filename: String,
      mode: js.UndefOr[scala.Nothing],
      callback: js.ThisFunction1[/* this */ typingsSlinky.sqlite3.mod.Database, /* err */ js.Error | Null, Unit]
    ): typingsSlinky.sqlite3.mod.Database = js.native
    @JSImport("sqlite3-promise", "cached.Database")
    @js.native
    def Database(filename: String, mode: Double): typingsSlinky.sqlite3.mod.Database = js.native
    @JSImport("sqlite3-promise", "cached.Database")
    @js.native
    def Database(
      filename: String,
      mode: Double,
      callback: js.ThisFunction1[/* this */ typingsSlinky.sqlite3.mod.Database, /* err */ js.Error | Null, Unit]
    ): typingsSlinky.sqlite3.mod.Database = js.native
  }
  
  @JSImport("sqlite3-promise", "verbose")
  @js.native
  def verbose(): sqlite3 = js.native
  
  /* augmented module */
  object sqlite3AugmentingMod {
    
    @js.native
    trait Database extends StObject {
      
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
}
