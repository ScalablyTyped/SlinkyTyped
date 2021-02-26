package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.metadataArgsCheckMetadataArgsMod.CheckMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgsEntityMetadataEntityMetadata extends StObject {
  
  var args: js.UndefOr[CheckMetadataArgs] = js.native
  
  var entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata = js.native
}
object ArgsEntityMetadataEntityMetadata {
  
  @scala.inline
  def apply(entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata): ArgsEntityMetadataEntityMetadata = {
    val __obj = js.Dynamic.literal(entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsEntityMetadataEntityMetadata]
  }
  
  @scala.inline
  implicit class ArgsEntityMetadataEntityMetadataMutableBuilder[Self <: ArgsEntityMetadataEntityMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: CheckMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setEntityMetadata(value: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
