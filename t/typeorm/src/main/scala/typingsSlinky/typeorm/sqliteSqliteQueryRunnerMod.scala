package typingsSlinky.typeorm

import typingsSlinky.typeorm.sqliteAbstractAbstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import typingsSlinky.typeorm.sqliteSqliteDriverMod.SqliteDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/sqlite/SqliteQueryRunner", JSImport.Namespace)
@js.native
object sqliteSqliteQueryRunnerMod extends js.Object {
  
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
