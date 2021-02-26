package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.IsArrayLengthPrecision
import typingsSlinky.typeorm.commonObjectLiteralMod.ObjectLiteral
import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.driverDriverMod.Driver
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.oracleOracleConnectionCredentialsOptionsMod.OracleConnectionCredentialsOptions
import typingsSlinky.typeorm.oracleOracleConnectionOptionsMod.OracleConnectionOptions
import typingsSlinky.typeorm.tableTableColumnMod.TableColumn
import typingsSlinky.typeorm.typesColumnTypesMod.ColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oracleOracleDriverMod {
  
  @JSImport("typeorm/driver/oracle/OracleDriver", "OracleDriver")
  @js.native
  class OracleDriver protected () extends Driver {
    def this(connection: Connection) = this()
    
    /**
      * Closes connection pool.
      */
    /* protected */ def closePool(pool: js.Any): js.Promise[Unit] = js.native
    
    /**
      * Converts column type in to native oracle type.
      */
    def columnTypeToNativeParameter(`type`: ColumnType): js.Any = js.native
    
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
    /* protected */ def createPool(options: OracleConnectionOptions, credentials: OracleConnectionCredentialsOptions): js.Promise[_] = js.native
    
    def getColumnLength(column: TableColumn): String = js.native
    
    /**
      * Loads all driver dependencies.
      */
    /* protected */ def loadDependencies(): Unit = js.native
    
    /**
      * Pool for master database.
      */
    var master: js.Any = js.native
    
    /**
      * Max length allowed by Oracle for aliases.
      * @see https://docs.oracle.com/database/121/SQLRF/sql_elements008.htm#SQLRF51129
      * > The following list of rules applies to both quoted and nonquoted identifiers unless otherwise indicated
      * > Names must be from 1 to 30 bytes long with these exceptions:
      * > [...]
      *
      * Since Oracle 12.2 (with a compatible driver/client), the limit has been set to 128.
      * @see https://docs.oracle.com/en/database/oracle/oracle-database/12.2/sqlrf/Database-Object-Names-and-Qualifiers.html
      *
      * > If COMPATIBLE is set to a value of 12.2 or higher, then names must be from 1 to 128 bytes long with these exceptions
      */
    @JSName("maxAliasLength")
    var maxAliasLength_OracleDriver: Double = js.native
    
    /**
      * Creates a database type from a given column metadata.
      */
    def normalizeType(column: IsArrayLengthPrecision): String = js.native
    
    /**
      * Connection options.
      */
    @JSName("options")
    var options_OracleDriver: OracleConnectionOptions = js.native
    
    /**
      * Underlying oracle library.
      */
    var oracle: js.Any = js.native
    
    /**
      * Pool for slave databases.
      * Used in replication.
      */
    var slaves: js.Array[_] = js.native
  }
}
