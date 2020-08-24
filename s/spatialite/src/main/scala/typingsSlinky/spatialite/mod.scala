package typingsSlinky.spatialite

import typingsSlinky.sqlite3.mod.sqlite3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spatialite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Database ()
    extends typingsSlinky.sqlite3.mod.Database {
    def spatialite(cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  }
  
  @js.native
  class Statement ()
    extends typingsSlinky.sqlite3.mod.Statement
  
  val OPEN_CREATE: Double = js.native
  val OPEN_READONLY: Double = js.native
  val OPEN_READWRITE: Double = js.native
  def verbose(): sqlite3 = js.native
  @js.native
  object cached extends js.Object {
    def Database(filename: String): typingsSlinky.sqlite3.mod.Database = js.native
    def Database(
      filename: String,
      callback: js.ThisFunction1[/* this */ typingsSlinky.sqlite3.mod.Database, /* err */ js.Error | Null, Unit]
    ): typingsSlinky.sqlite3.mod.Database = js.native
    def Database(
      filename: String,
      mode: js.UndefOr[scala.Nothing],
      callback: js.ThisFunction1[/* this */ typingsSlinky.sqlite3.mod.Database, /* err */ js.Error | Null, Unit]
    ): typingsSlinky.sqlite3.mod.Database = js.native
    def Database(filename: String, mode: Double): typingsSlinky.sqlite3.mod.Database = js.native
    def Database(
      filename: String,
      mode: Double,
      callback: js.ThisFunction1[/* this */ typingsSlinky.sqlite3.mod.Database, /* err */ js.Error | Null, Unit]
    ): typingsSlinky.sqlite3.mod.Database = js.native
  }
  
}

