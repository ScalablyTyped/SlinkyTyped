package typingsSlinky.typeorm

import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.schemaBuilderSchemaBuilderMod.SchemaBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/schema-builder/MongoSchemaBuilder", JSImport.Namespace)
@js.native
object schemaBuilderMongoSchemaBuilderMod extends js.Object {
  
  @js.native
  class MongoSchemaBuilder protected () extends SchemaBuilder {
    def this(connection: Connection) = this()
    
    var connection: Connection = js.native
  }
}
