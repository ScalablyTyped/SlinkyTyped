package typingsSlinky.typeorm

import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.objectLiteralMod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plainObjectToNewEntityTransformerMod {
  
  @JSImport("typeorm/browser/query-builder/transformer/PlainObjectToNewEntityTransformer", "PlainObjectToNewEntityTransformer")
  @js.native
  class PlainObjectToNewEntityTransformer () extends StObject {
    
    /**
      * Since db returns a duplicated rows of the data where accuracies of the same object can be duplicated
      * we need to group our result and we must have some unique id (primary key in our case)
      */
    var groupAndTransform: js.Any = js.native
    
    def transform[T](newEntity: T, `object`: ObjectLiteral, metadata: EntityMetadata): T = js.native
    def transform[T](
      newEntity: T,
      `object`: ObjectLiteral,
      metadata: EntityMetadata,
      getLazyRelationsPromiseValue: Boolean
    ): T = js.native
  }
}
