package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.metadataArgsIndexMetadataArgsMod.IndexMetadataArgs
import typingsSlinky.typeorm.metadataColumnMetadataMod.ColumnMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgsColumnsEmbeddedMetadata extends StObject {
  
  var args: js.UndefOr[IndexMetadataArgs] = js.native
  
  var columns: js.UndefOr[js.Array[ColumnMetadata]] = js.native
  
  var embeddedMetadata: js.UndefOr[typingsSlinky.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata] = js.native
  
  var entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata = js.native
}
object ArgsColumnsEmbeddedMetadata {
  
  @scala.inline
  def apply(entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata): ArgsColumnsEmbeddedMetadata = {
    val __obj = js.Dynamic.literal(entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsColumnsEmbeddedMetadata]
  }
  
  @scala.inline
  implicit class ArgsColumnsEmbeddedMetadataMutableBuilder[Self <: ArgsColumnsEmbeddedMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: IndexMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
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
