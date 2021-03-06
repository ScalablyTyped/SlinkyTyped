package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.Precision
import typingsSlinky.typeorm.columnMetadataMod.ColumnMetadata
import typingsSlinky.typeorm.connectionMod.Connection
import typingsSlinky.typeorm.driverMod.Driver
import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.mssqlParameterMod.MssqlParameter
import typingsSlinky.typeorm.objectLiteralMod.ObjectLiteral
import typingsSlinky.typeorm.sqlServerConnectionCredentialsOptionsMod.SqlServerConnectionCredentialsOptions
import typingsSlinky.typeorm.sqlServerConnectionOptionsMod.SqlServerConnectionOptions
import typingsSlinky.typeorm.tableColumnMod.TableColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlServerDriverMod {
  
  @JSImport("typeorm/browser/driver/sqlserver/SqlServerDriver", "SqlServerDriver")
  @js.native
  class SqlServerDriver protected () extends Driver {
    def this(connection: Connection) = this()
    
    def buildTableVariableDeclaration(identifier: String, columns: js.Array[ColumnMetadata]): String = js.native
    
    /**
      * Closes connection pool.
      */
    /* protected */ def closePool(pool: js.Any): js.Promise[Unit] = js.native
    
    /**
      * Connection used by driver.
      */
    var connection: Connection = js.native
    
    /**
      * Creates generated map of values generated or returned by database after INSERT query.
      */
    def createGeneratedMap(metadata: EntityMetadata, insertResult: ObjectLiteral): js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Creates a new connection pool for a given database credentials.
      */
    /* protected */ def createPool(options: SqlServerConnectionOptions, credentials: SqlServerConnectionCredentialsOptions): js.Promise[_] = js.native
    
    def getColumnLength(column: TableColumn): String = js.native
    
    /**
      * If driver dependency is not given explicitly, then try to load it via "require".
      */
    /* protected */ def loadDependencies(): Unit = js.native
    
    var lowerDefaultValueIfNessesary: js.Any = js.native
    
    /**
      * Pool for master database.
      */
    var master: js.Any = js.native
    
    /**
      * Max length allowed by MSSQL Server for aliases (identifiers).
      * @see https://docs.microsoft.com/en-us/sql/sql-server/maximum-capacity-specifications-for-sql-server
      */
    @JSName("maxAliasLength")
    var maxAliasLength_SqlServerDriver: Double = js.native
    
    /**
      * SQL Server library.
      */
    var mssql: js.Any = js.native
    
    /**
      * Creates a database type from a given column metadata.
      */
    def normalizeType(column: Precision): String = js.native
    
    /**
      * Connection options.
      */
    @JSName("options")
    var options_SqlServerDriver: SqlServerConnectionOptions = js.native
    
    /**
      * Sql server's parameters needs to be wrapped into special object with type information about this value.
      * This method wraps all values of the given object into MssqlParameter based on their column definitions in the given table.
      */
    def parametrizeMap(tablePath: String, map: ObjectLiteral): ObjectLiteral = js.native
    
    /**
      * Sql server's parameters needs to be wrapped into special object with type information about this value.
      * This method wraps given value into MssqlParameter based on its column definition.
      */
    def parametrizeValue(column: ColumnMetadata, value: js.Any): MssqlParameter = js.native
    
    /**
      * Pool for slave databases.
      * Used in replication.
      */
    var slaves: js.Array[_] = js.native
  }
}
