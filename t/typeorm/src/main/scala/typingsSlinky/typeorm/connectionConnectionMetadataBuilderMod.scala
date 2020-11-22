package typingsSlinky.typeorm

import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.entitySchemaEntitySchemaMod.EntitySchema
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.migrationMigrationInterfaceMod.MigrationInterface
import typingsSlinky.typeorm.subscriberEntitySubscriberInterfaceMod.EntitySubscriberInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/connection/ConnectionMetadataBuilder", JSImport.Namespace)
@js.native
object connectionConnectionMetadataBuilderMod extends js.Object {
  
  @js.native
  class ConnectionMetadataBuilder protected () extends js.Object {
    def this(connection: Connection) = this()
    
    /**
      * Builds entity metadatas for the given classes or directories.
      */
    def buildEntityMetadatas(entities: js.Array[js.Function | EntitySchema[_] | String]): js.Array[EntityMetadata] = js.native
    
    /**
      * Builds migration instances for the given classes or directories.
      */
    def buildMigrations(migrations: js.Array[js.Function | String]): js.Array[MigrationInterface] = js.native
    
    /**
      * Builds subscriber instances for the given classes or directories.
      */
    def buildSubscribers(subscribers: js.Array[js.Function | String]): js.Array[EntitySubscriberInterface[_]] = js.native
    
    var connection: Connection = js.native
  }
}
