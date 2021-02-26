package typingsSlinky.sqlite

import typingsSlinky.sqlite.interfacesMod.IMigrate.MigrationData
import typingsSlinky.sqlite.interfacesMod.IMigrate.MigrationParams
import typingsSlinky.sqlite.sqlite3Mod.Database
import typingsSlinky.sqlite.sqlite3Mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object migrateMod {
  
  @JSImport("sqlite/build/utils/migrate", "migrate")
  @js.native
  def migrate(db: typingsSlinky.sqlite.databaseMod.Database[Database, Statement]): js.Promise[Unit] = js.native
  @JSImport("sqlite/build/utils/migrate", "migrate")
  @js.native
  def migrate(db: typingsSlinky.sqlite.databaseMod.Database[Database, Statement], config: MigrationParams): js.Promise[Unit] = js.native
  
  @JSImport("sqlite/build/utils/migrate", "readMigrations")
  @js.native
  def readMigrations(): js.Promise[js.Array[MigrationData]] = js.native
  @JSImport("sqlite/build/utils/migrate", "readMigrations")
  @js.native
  def readMigrations(migrationPath: String): js.Promise[js.Array[MigrationData]] = js.native
}
