package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.metadataArgsRelationIdMetadataArgsMod.RelationIdMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgsRelationIdMetadataArgsEntityMetadataEntityMetadata extends StObject {
  
  var args: RelationIdMetadataArgs = js.native
  
  var entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata = js.native
}
object ArgsRelationIdMetadataArgsEntityMetadataEntityMetadata {
  
  @scala.inline
  def apply(
    args: RelationIdMetadataArgs,
    entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): ArgsRelationIdMetadataArgsEntityMetadataEntityMetadata = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsRelationIdMetadataArgsEntityMetadataEntityMetadata]
  }
  
  @scala.inline
  implicit class ArgsRelationIdMetadataArgsEntityMetadataEntityMetadataMutableBuilder[Self <: ArgsRelationIdMetadataArgsEntityMetadataEntityMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: RelationIdMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityMetadata(value: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
