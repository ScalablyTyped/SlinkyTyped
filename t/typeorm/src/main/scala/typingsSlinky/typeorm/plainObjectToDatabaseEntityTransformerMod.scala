package typingsSlinky.typeorm

import typingsSlinky.typeorm.entityManagerMod.EntityManager
import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.objectLiteralMod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plainObjectToDatabaseEntityTransformerMod {
  
  @JSImport("typeorm/browser/query-builder/transformer/PlainObjectToDatabaseEntityTransformer", "PlainObjectToDatabaseEntityTransformer")
  @js.native
  class PlainObjectToDatabaseEntityTransformer protected () extends StObject {
    def this(manager: EntityManager) = this()
    
    var manager: js.Any = js.native
    
    def transform(plainObject: ObjectLiteral, metadata: EntityMetadata): js.Promise[js.UndefOr[ObjectLiteral]] = js.native
  }
}
