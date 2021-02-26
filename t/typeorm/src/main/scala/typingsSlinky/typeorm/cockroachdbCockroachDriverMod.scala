package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.IsGenerated
import typingsSlinky.typeorm.cockroachdbCockroachConnectionCredentialsOptionsMod.CockroachConnectionCredentialsOptions
import typingsSlinky.typeorm.cockroachdbCockroachConnectionOptionsMod.CockroachConnectionOptions
import typingsSlinky.typeorm.commonObjectLiteralMod.ObjectLiteral
import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.driverDriverMod.Driver
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cockroachdbCockroachDriverMod {
  
  @JSImport("typeorm/driver/cockroachdb/CockroachDriver", "CockroachDriver")
  @js.native
  class CockroachDriver protected () extends Driver {
    def this(connection: Connection) = this()
    
    /**
      * Closes connection pool.
      */
    /* protected */ def closePool(pool: js.Any): js.Promise[Unit] = js.native
    
    /**
      * We store all created query runners because we need to release them.
      */
    var connectedQueryRunners: js.Array[QueryRunner] = js.native
    
    /**
      * Connection used by driver.
      */
    var connection: Connection = js.native
    
    /**
      * Creates generated map of values generated or returned by database after INSERT query.
      *
      * todo: slow. optimize Object.keys(), OrmUtils.mergeDeep and column.createValueMap parts
      */
    def createGeneratedMap(metadata: EntityMetadata, insertResult: ObjectLiteral): js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Creates a new connection pool for a given database credentials.
      */
    /* protected */ def createPool(options: CockroachConnectionOptions, credentials: CockroachConnectionCredentialsOptions): js.Promise[_] = js.native
    
    /**
      * If driver dependency is not given explicitly, then try to load it via "require".
      */
    /* protected */ def loadDependencies(): Unit = js.native
    
    /**
      * Loads postgres query stream package.
      */
    def loadStreamDependency(): js.Any = js.native
    
    var lowerDefaultValueIfNecessary: js.Any = js.native
    
    /**
      * Pool for master database.
      */
    var master: js.Any = js.native
    
    /**
      * Creates a database type from a given column metadata.
      */
    def normalizeType(column: IsGenerated): String = js.native
    
    /**
      * Connection options.
      */
    @JSName("options")
    var options_CockroachDriver: CockroachConnectionOptions = js.native
    
    /**
      * Cockroach underlying library.
      */
    var postgres: js.Any = js.native
    
    /**
      * Pool for slave databases.
      * Used in replication.
      */
    var slaves: js.Array[_] = js.native
  }
}
