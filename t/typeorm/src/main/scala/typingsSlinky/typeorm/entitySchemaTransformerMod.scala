package typingsSlinky.typeorm

import typingsSlinky.typeorm.entitySchemaMod.EntitySchema
import typingsSlinky.typeorm.metadataArgsStorageMod.MetadataArgsStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitySchemaTransformerMod {
  
  @JSImport("typeorm/browser/entity-schema/EntitySchemaTransformer", "EntitySchemaTransformer")
  @js.native
  class EntitySchemaTransformer () extends StObject {
    
    /**
      * Transforms entity schema into new metadata args storage object.
      */
    def transform(schemas: js.Array[EntitySchema[_]]): MetadataArgsStorage = js.native
  }
}
