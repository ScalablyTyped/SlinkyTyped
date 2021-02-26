package typingsSlinky.typeorm

import typingsSlinky.typeorm.abstractSqliteDriverMod.AbstractSqliteDriver
import typingsSlinky.typeorm.betterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions
import typingsSlinky.typeorm.connectionMod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object betterSqlite3DriverMod {
  
  @JSImport("typeorm/browser/driver/better-sqlite3/BetterSqlite3Driver", "BetterSqlite3Driver")
  @js.native
  class BetterSqlite3Driver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    /**
      * Auto creates database directory if it does not exist.
      */
    /* protected */ def createDatabaseDirectory(fullPath: String): js.Promise[Unit] = js.native
    
    /**
      * Connection options.
      */
    @JSName("options")
    var options_BetterSqlite3Driver: BetterSqlite3ConnectionOptions = js.native
  }
}
