package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.metadataArgsExclusionMetadataArgsMod.ExclusionMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `8` extends StObject {
  
  var args: js.UndefOr[ExclusionMetadataArgs] = js.native
  
  var entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata = js.native
}
object `8` {
  
  @scala.inline
  def apply(entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata): `8` = {
    val __obj = js.Dynamic.literal(entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit class `8MutableBuilder`[Self <: `8`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: ExclusionMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setEntityMetadata(value: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
