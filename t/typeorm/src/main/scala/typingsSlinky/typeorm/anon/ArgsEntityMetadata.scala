package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.embeddedMetadataArgsMod.EmbeddedMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgsEntityMetadata extends StObject {
  
  var args: EmbeddedMetadataArgs = js.native
  
  var entityMetadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata = js.native
}
object ArgsEntityMetadata {
  
  @scala.inline
  def apply(args: EmbeddedMetadataArgs, entityMetadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata): ArgsEntityMetadata = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsEntityMetadata]
  }
  
  @scala.inline
  implicit class ArgsEntityMetadataMutableBuilder[Self <: ArgsEntityMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: EmbeddedMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityMetadata(value: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
