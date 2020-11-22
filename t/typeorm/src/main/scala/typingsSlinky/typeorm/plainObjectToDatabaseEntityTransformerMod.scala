package typingsSlinky.typeorm

import typingsSlinky.typeorm.entityManagerMod.EntityManager
import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.objectLiteralMod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/query-builder/transformer/PlainObjectToDatabaseEntityTransformer", JSImport.Namespace)
@js.native
object plainObjectToDatabaseEntityTransformerMod extends js.Object {
  
  @js.native
  class PlainObjectToDatabaseEntityTransformer protected () extends js.Object {
    def this(manager: EntityManager) = this()
    
    var manager: js.Any = js.native
    
    def transform(plainObject: ObjectLiteral, metadata: EntityMetadata): js.Promise[js.UndefOr[ObjectLiteral]] = js.native
  }
}
