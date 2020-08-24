package typingsSlinky.sqlite

import typingsSlinky.sqlite.interfacesMod.IMigrate.MigrationParams
import typingsSlinky.sqlite.sqlite3Mod.Database
import typingsSlinky.sqlite.sqlite3Mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqlite/build/utils/migrate", JSImport.Namespace)
@js.native
object migrateMod extends js.Object {
  def migrate(db: typingsSlinky.sqlite.databaseMod.Database[Database, Statement]): js.Promise[Unit] = js.native
  def migrate(db: typingsSlinky.sqlite.databaseMod.Database[Database, Statement], config: MigrationParams): js.Promise[Unit] = js.native
}

