package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.GenerationStrategy
import typingsSlinky.typeorm.cockroachConnectionCredentialsOptionsMod.CockroachConnectionCredentialsOptions
import typingsSlinky.typeorm.cockroachConnectionOptionsMod.CockroachConnectionOptions
import typingsSlinky.typeorm.connectionMod.Connection
import typingsSlinky.typeorm.driverMod.Driver
import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.objectLiteralMod.ObjectLiteral
import typingsSlinky.typeorm.queryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cockroachDriverMod {
  
  @JSImport("typeorm/browser/driver/cockroachdb/CockroachDriver", "CockroachDriver")
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
    def normalizeType(column: GenerationStrategy): String = js.native
    
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
