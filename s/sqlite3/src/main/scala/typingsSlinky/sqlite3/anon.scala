package typingsSlinky.sqlite3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Database extends js.Object {
    
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
