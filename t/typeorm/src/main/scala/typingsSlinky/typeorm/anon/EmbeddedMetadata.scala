package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.entityListenerMetadataArgsMod.EntityListenerMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedMetadata extends StObject {
  
  var args: EntityListenerMetadataArgs = js.native
  
  var embeddedMetadata: js.UndefOr[typingsSlinky.typeorm.embeddedMetadataMod.EmbeddedMetadata] = js.native
  
  var entityMetadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata = js.native
}
object EmbeddedMetadata {
  
  @scala.inline
  def apply(
    args: EntityListenerMetadataArgs,
    entityMetadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
  ): EmbeddedMetadata = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedMetadata]
  }
  
  @scala.inline
  implicit class EmbeddedMetadataMutableBuilder[Self <: EmbeddedMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: EntityListenerMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedMetadata(value: typingsSlinky.typeorm.embeddedMetadataMod.EmbeddedMetadata): Self = StObject.set(x, "embeddedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedMetadataUndefined: Self = StObject.set(x, "embeddedMetadata", js.undefined)
    
    @scala.inline
    def setEntityMetadata(value: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
