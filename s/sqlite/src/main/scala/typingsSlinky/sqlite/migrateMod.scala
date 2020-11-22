package typingsSlinky.sqlite

import typingsSlinky.sqlite.interfacesMod.IMigrate.MigrationData
import typingsSlinky.sqlite.interfacesMod.IMigrate.MigrationParams
import typingsSlinky.sqlite.sqlite3Mod.Database
import typingsSlinky.sqlite.sqlite3Mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sqlite/build/utils/migrate", JSImport.Namespace)
@js.native
object migrateMod extends js.Object {
  
  def migrate(db: typingsSlinky.sqlite.databaseMod.Database[Database, Statement]): js.Promise[Unit] = js.native
  def migrate(db: typingsSlinky.sqlite.databaseMod.Database[Database, Statement], config: MigrationParams): js.Promise[Unit] = js.native
  
  def readMigrations(): js.Promise[js.Array[MigrationData]] = js.native
  def readMigrations(migrationPath: String): js.Promise[js.Array[MigrationData]] = js.native
}
