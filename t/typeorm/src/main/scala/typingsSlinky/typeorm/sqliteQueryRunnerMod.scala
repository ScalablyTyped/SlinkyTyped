package typingsSlinky.typeorm

import typingsSlinky.typeorm.abstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import typingsSlinky.typeorm.sqliteDriverMod.SqliteDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqliteQueryRunnerMod {
  
  @JSImport("typeorm/browser/driver/sqlite/SqliteQueryRunner", "SqliteQueryRunner")
  @js.native
  class SqliteQueryRunner protected () extends AbstractSqliteQueryRunner {
    def this(driver: SqliteDriver) = this()
    
    /**
      * Database driver used by connection.
      */
    @JSName("driver")
    var driver_SqliteQueryRunner: SqliteDriver = js.native
  }
}
