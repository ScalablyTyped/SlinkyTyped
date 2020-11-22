package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.PrecisionScale
import typingsSlinky.typeorm.auroraDataApiAuroraDataApiConnectionCredentialsOptionsMod.AuroraDataApiConnectionCredentialsOptions
import typingsSlinky.typeorm.auroraDataApiAuroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions
import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.driverDriverMod.Driver
import typingsSlinky.typeorm.tableTableColumnMod.TableColumn
import typingsSlinky.typeorm.typesColumnTypesMod.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/aurora-data-api/AuroraDataApiDriver", JSImport.Namespace)
@js.native
object auroraDataApiAuroraDataApiDriverMod extends js.Object {
  
  @js.native
  class AuroraDataApiDriver protected () extends Driver {
    def this(connection: Connection) = this()
    
    /**
      * Aurora Data API underlying library.
      */
    var DataApiDriver: js.Any = js.native
    
    var client: js.Any = js.native
    
    /**
      * Checks if "DEFAULT" values in the column metadata and in the database are equal.
      */
    /* protected */ def compareDefaultValues(columnMetadataValue: String, databaseValue: String): Boolean = js.native
    
    var connection: Connection = js.native
    
    /**
      * Creates a new connection pool for a given database credentials.
      */
    /* protected */ def createConnectionOptions(options: AuroraDataApiConnectionOptions, credentials: AuroraDataApiConnectionCredentialsOptions): js.Promise[_] = js.native
    
    /**
      * Creates a new connection pool for a given database credentials.
      */
    /* protected */ def createPool(connectionOptions: js.Any): js.Promise[_] = js.native
    
    def getColumnLength(column: TableColumn): String = js.native
    
    /**
      * Loads all driver dependencies.
      */
    /* protected */ def loadDependencies(): Unit = js.native
    
    /**
      * Max length allowed by MySQL for aliases.
      * @see https://dev.mysql.com/doc/refman/5.5/en/identifiers.html
      */
    @JSName("maxAliasLength")
    var maxAliasLength_AuroraDataApiDriver: Double = js.native
    
    /**
      * Creates a database type from a given column metadata.
      */
    def normalizeType(column: PrecisionScale): String = js.native
    
    /**
      * Connection options.
      */
    @JSName("options")
    var options_AuroraDataApiDriver: AuroraDataApiConnectionOptions = js.native
    
    /**
      * Connection pool.
      * Used in non-replication mode.
      */
    var pool: js.Any = js.native
    
    /**
      * Pool cluster used in replication mode.
      */
    var poolCluster: js.Any = js.native
    
    /**
      * Attaches all required base handlers to a database connection, such as the unhandled error handler.
      */
    var prepareDbConnection: js.Any = js.native
    
    /**
      * Gets list of column data types that supports UNSIGNED and ZEROFILL attributes.
      */
    var unsignedAndZerofillTypes: js.Array[ColumnType] = js.native
    
    /**
      * Gets list of column data types that support length by a driver.
      */
    var withWidthColumnTypes: js.Array[ColumnType] = js.native
  }
}
