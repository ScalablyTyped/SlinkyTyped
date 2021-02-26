package typingsSlinky.typeorm

import typingsSlinky.typeorm.connectionMod.Connection
import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.entitySchemaMod.EntitySchema
import typingsSlinky.typeorm.entitySubscriberInterfaceMod.EntitySubscriberInterface
import typingsSlinky.typeorm.migrationInterfaceMod.MigrationInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionMetadataBuilderMod {
  
  @JSImport("typeorm/browser/connection/ConnectionMetadataBuilder", "ConnectionMetadataBuilder")
  @js.native
  class ConnectionMetadataBuilder protected () extends StObject {
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
