package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.metadataArgsUniqueMetadataArgsMod.UniqueMetadataArgs
import typingsSlinky.typeorm.metadataColumnMetadataMod.ColumnMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnsEmbeddedMetadataEntityMetadata extends StObject {
  
  var args: js.UndefOr[UniqueMetadataArgs] = js.native
  
  var columns: js.UndefOr[js.Array[ColumnMetadata]] = js.native
  
  var embeddedMetadata: js.UndefOr[typingsSlinky.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata] = js.native
  
  var entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata = js.native
}
object ColumnsEmbeddedMetadataEntityMetadata {
  
  @scala.inline
  def apply(entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata): ColumnsEmbeddedMetadataEntityMetadata = {
    val __obj = js.Dynamic.literal(entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsEmbeddedMetadataEntityMetadata]
  }
  
  @scala.inline
  implicit class ColumnsEmbeddedMetadataEntityMetadataMutableBuilder[Self <: ColumnsEmbeddedMetadataEntityMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: UniqueMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[ColumnMetadata]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: ColumnMetadata*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setEmbeddedMetadata(value: typingsSlinky.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata): Self = StObject.set(x, "embeddedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedMetadataUndefined: Self = StObject.set(x, "embeddedMetadata", js.undefined)
    
    @scala.inline
    def setEntityMetadata(value: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
