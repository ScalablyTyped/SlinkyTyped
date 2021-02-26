package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.metadataArgsRelationMetadataArgsMod.RelationMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgsEmbeddedMetadataEntityMetadata extends StObject {
  
  var args: RelationMetadataArgs = js.native
  
  var embeddedMetadata: js.UndefOr[typingsSlinky.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata] = js.native
  
  var entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata = js.native
}
object ArgsEmbeddedMetadataEntityMetadata {
  
  @scala.inline
  def apply(
    args: RelationMetadataArgs,
    entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): ArgsEmbeddedMetadataEntityMetadata = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsEmbeddedMetadataEntityMetadata]
  }
  
  @scala.inline
  implicit class ArgsEmbeddedMetadataEntityMetadataMutableBuilder[Self <: ArgsEmbeddedMetadataEntityMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: RelationMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedMetadata(value: typingsSlinky.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata): Self = StObject.set(x, "embeddedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedMetadataUndefined: Self = StObject.set(x, "embeddedMetadata", js.undefined)
    
    @scala.inline
    def setEntityMetadata(value: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
