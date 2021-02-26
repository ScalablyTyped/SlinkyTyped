package typingsSlinky.spatialite

import typingsSlinky.sqlite3.mod.sqlite3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spatialite", "Database")
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
    
    def spatialite(cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  }
  
  @JSImport("spatialite", "OPEN_CREATE")
  @js.native
  val OPEN_CREATE: Double = js.native
  
  @JSImport("spatialite", "OPEN_READONLY")
  @js.native
  val OPEN_READONLY: Double = js.native
  
  @JSImport("spatialite", "OPEN_READWRITE")
  @js.native
  val OPEN_READWRITE: Double = js.native
  
  @JSImport("spatialite", "Statement")
  @js.native
  class Statement ()
    extends typingsSlinky.sqlite3.mod.Statement
  
  object cached {
    
    @JSImport("spatialite", "cached.Database")
    @js.native
    def Database(filename: String): typingsSlinky.sqlite3.mod.Database = js.native
    @JSImport("spatialite", "cached.Database")
    @js.native
    def Database(
      filename: String,
      callback: js.ThisFunction1[/* this */ typingsSlinky.sqlite3.mod.Database, /* err */ js.Error | Null, Unit]
    ): typingsSlinky.sqlite3.mod.Database = js.native
    @JSImport("spatialite", "cached.Database")
    @js.native
    def Database(
      filename: String,
      mode: js.UndefOr[scala.Nothing],
      callback: js.ThisFunction1[/* this */ typingsSlinky.sqlite3.mod.Database, /* err */ js.Error | Null, Unit]
    ): typingsSlinky.sqlite3.mod.Database = js.native
    @JSImport("spatialite", "cached.Database")
    @js.native
    def Database(filename: String, mode: Double): typingsSlinky.sqlite3.mod.Database = js.native
    @JSImport("spatialite", "cached.Database")
    @js.native
    def Database(
      filename: String,
      mode: Double,
      callback: js.ThisFunction1[/* this */ typingsSlinky.sqlite3.mod.Database, /* err */ js.Error | Null, Unit]
    ): typingsSlinky.sqlite3.mod.Database = js.native
  }
  
  @JSImport("spatialite", "verbose")
  @js.native
  def verbose(): sqlite3 = js.native
}
