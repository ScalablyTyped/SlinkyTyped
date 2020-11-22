package typingsSlinky.typeorm

import typingsSlinky.typeorm.connectionMod.Connection
import typingsSlinky.typeorm.schemaBuilderMod.SchemaBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/schema-builder/MongoSchemaBuilder", JSImport.Namespace)
@js.native
object mongoSchemaBuilderMod extends js.Object {
  
  @js.native
  class MongoSchemaBuilder protected () extends SchemaBuilder {
    def this(connection: Connection) = this()
    
    var connection: Connection = js.native
  }
}
