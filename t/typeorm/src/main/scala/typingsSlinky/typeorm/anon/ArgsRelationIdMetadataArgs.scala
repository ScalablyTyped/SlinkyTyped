package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.relationIdMetadataArgsMod.RelationIdMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgsRelationIdMetadataArgs extends StObject {
  
  var args: RelationIdMetadataArgs = js.native
  
  var entityMetadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata = js.native
}
object ArgsRelationIdMetadataArgs {
  
  @scala.inline
  def apply(
    args: RelationIdMetadataArgs,
    entityMetadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
  ): ArgsRelationIdMetadataArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsRelationIdMetadataArgs]
  }
  
  @scala.inline
  implicit class ArgsRelationIdMetadataArgsMutableBuilder[Self <: ArgsRelationIdMetadataArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: RelationIdMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityMetadata(value: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
