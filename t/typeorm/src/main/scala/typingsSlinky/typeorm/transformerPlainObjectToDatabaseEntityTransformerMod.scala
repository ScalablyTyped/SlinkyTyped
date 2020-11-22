package typingsSlinky.typeorm

import typingsSlinky.typeorm.commonObjectLiteralMod.ObjectLiteral
import typingsSlinky.typeorm.entityManagerEntityManagerMod.EntityManager
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/query-builder/transformer/PlainObjectToDatabaseEntityTransformer", JSImport.Namespace)
@js.native
object transformerPlainObjectToDatabaseEntityTransformerMod extends js.Object {
  
  @js.native
  class PlainObjectToDatabaseEntityTransformer protected () extends js.Object {
    def this(manager: EntityManager) = this()
    
    var manager: js.Any = js.native
    
    def transform(plainObject: ObjectLiteral, metadata: EntityMetadata): js.Promise[js.UndefOr[ObjectLiteral]] = js.native
  }
}
