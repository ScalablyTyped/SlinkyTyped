package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.metadataArgsEntityListenerMetadataArgsMod.EntityListenerMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedMetadataEntityMetadata extends StObject {
  
  var args: EntityListenerMetadataArgs = js.native
  
  var embeddedMetadata: js.UndefOr[typingsSlinky.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata] = js.native
  
  var entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata = js.native
}
object EmbeddedMetadataEntityMetadata {
  
  @scala.inline
  def apply(
    args: EntityListenerMetadataArgs,
    entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): EmbeddedMetadataEntityMetadata = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedMetadataEntityMetadata]
  }
  
  @scala.inline
  implicit class EmbeddedMetadataEntityMetadataMutableBuilder[Self <: EmbeddedMetadataEntityMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: EntityListenerMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedMetadata(value: typingsSlinky.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata): Self = StObject.set(x, "embeddedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedMetadataUndefined: Self = StObject.set(x, "embeddedMetadata", js.undefined)
    
    @scala.inline
    def setEntityMetadata(value: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
