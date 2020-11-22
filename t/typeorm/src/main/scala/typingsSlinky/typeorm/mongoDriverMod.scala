package typingsSlinky.typeorm

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.typeorm.anon.Precision
import typingsSlinky.typeorm.connectionMod.Connection
import typingsSlinky.typeorm.connectionOptionsMod.ConnectionOptions
import typingsSlinky.typeorm.driverMod.Driver
import typingsSlinky.typeorm.mongoConnectionOptionsMod.MongoConnectionOptions
import typingsSlinky.typeorm.mongoQueryRunnerMod.MongoQueryRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/mongodb/MongoDriver", JSImport.Namespace)
@js.native
object mongoDriverMod extends js.Object {
  
  @js.native
  class MongoDriver protected () extends Driver {
    def this(connection: Connection) = this()
    
    /**
      * Build connection options from MongoConnectionOptions
      */
    /* protected */ def buildConnectionOptions(options: StringDictionary[js.Any]): js.Any = js.native
    
    /**
      * Builds connection url that is passed to underlying driver to perform connection to the mongodb database.
      */
    /* protected */ def buildConnectionUrl(options: StringDictionary[js.Any]): String = js.native
    
    var connection: Connection = js.native
    
    /**
      * Loads all driver dependencies.
      */
    /* protected */ def loadDependencies(): js.Any = js.native
    
    /**
      * Underlying mongodb library.
      */
    var mongodb: js.Any = js.native
    
    /**
      * Creates a database type from a given column metadata.
      */
    def normalizeType(column: Precision): String = js.native
    
    /**
      * Connection options.
      */
    @JSName("options")
    var options_MongoDriver: MongoConnectionOptions = js.native
    
    /**
      * Mongodb does not require to dynamically create query runner each time,
      * because it does not have a regular connection pool as RDBMS systems have.
      */
    var queryRunner: js.UndefOr[MongoQueryRunner] = js.native
    
    /**
      * Valid mongo connection options
      * NOTE: Keep sync with MongoConnectionOptions
      * Sync with http://mongodb.github.io/node-mongodb-native/3.5/api/MongoClient.html
      */
    var validOptionNames: js.Array[String] = js.native
    
    /**
      * Validate driver options to make sure everything is correct and driver will be able to establish connection.
      */
    /* protected */ def validateOptions(options: ConnectionOptions): Unit = js.native
  }
}
