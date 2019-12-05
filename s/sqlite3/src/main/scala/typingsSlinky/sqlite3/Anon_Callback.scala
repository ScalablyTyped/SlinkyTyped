package typingsSlinky.sqlite3

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  def Database(filename: String): typingsSlinky.sqlite3.sqlite3Mod.Database = js.native
  def Database(
    filename: String,
    callback: js.ThisFunction1[/* this */ typingsSlinky.sqlite3.sqlite3Mod.Database, /* err */ Error | Null, Unit]
  ): typingsSlinky.sqlite3.sqlite3Mod.Database = js.native
  def Database(filename: String, mode: Double): typingsSlinky.sqlite3.sqlite3Mod.Database = js.native
  def Database(
    filename: String,
    mode: Double,
    callback: js.ThisFunction1[
      /* this */ typingsSlinky.sqlite3.sqlite3Mod.Database, 
      /* err */ js.Error | Null, 
      Unit
    ]
  ): typingsSlinky.sqlite3.sqlite3Mod.Database = js.native
}

