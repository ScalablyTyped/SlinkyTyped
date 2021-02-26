package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.metadataArgsRelationCountMetadataArgsMod.RelationCountMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgsRelationCountMetadataArgsEntityMetadataEntityMetadata extends StObject {
  
  var args: RelationCountMetadataArgs = js.native
  
  var entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata = js.native
}
object ArgsRelationCountMetadataArgsEntityMetadataEntityMetadata {
  
  @scala.inline
  def apply(
    args: RelationCountMetadataArgs,
    entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): ArgsRelationCountMetadataArgsEntityMetadataEntityMetadata = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsRelationCountMetadataArgsEntityMetadataEntityMetadata]
  }
  
  @scala.inline
  implicit class ArgsRelationCountMetadataArgsEntityMetadataEntityMetadataMutableBuilder[Self <: ArgsRelationCountMetadataArgsEntityMetadataEntityMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: RelationCountMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityMetadata(value: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
