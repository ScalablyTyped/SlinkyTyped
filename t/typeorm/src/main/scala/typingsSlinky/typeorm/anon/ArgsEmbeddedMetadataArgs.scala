package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.metadataArgsEmbeddedMetadataArgsMod.EmbeddedMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgsEmbeddedMetadataArgs extends StObject {
  
  var args: EmbeddedMetadataArgs = js.native
  
  var entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata = js.native
}
object ArgsEmbeddedMetadataArgs {
  
  @scala.inline
  def apply(
    args: EmbeddedMetadataArgs,
    entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): ArgsEmbeddedMetadataArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsEmbeddedMetadataArgs]
  }
  
  @scala.inline
  implicit class ArgsEmbeddedMetadataArgsMutableBuilder[Self <: ArgsEmbeddedMetadataArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: EmbeddedMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityMetadata(value: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
