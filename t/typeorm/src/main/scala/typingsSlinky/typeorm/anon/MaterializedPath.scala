package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.metadataArgsColumnMetadataArgsMod.ColumnMetadataArgs
import typingsSlinky.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typingsSlinky.typeorm.typeormStrings.ancestor
import typingsSlinky.typeorm.typeormStrings.descendant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaterializedPath extends js.Object {
  
  var args: ColumnMetadataArgs = js.native
  
  var closureType: js.UndefOr[ancestor | descendant] = js.native
  
  var connection: typingsSlinky.typeorm.connectionConnectionMod.Connection = js.native
  
  var embeddedMetadata: js.UndefOr[typingsSlinky.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata] = js.native
  
  var entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata = js.native
  
  var materializedPath: js.UndefOr[Boolean] = js.native
  
  var nestedSetLeft: js.UndefOr[Boolean] = js.native
  
  var nestedSetRight: js.UndefOr[Boolean] = js.native
  
  var referencedColumn: js.UndefOr[ColumnMetadata] = js.native
}
object MaterializedPath {
  
  @scala.inline
  def apply(
    args: ColumnMetadataArgs,
    connection: typingsSlinky.typeorm.connectionConnectionMod.Connection,
    entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): MaterializedPath = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterializedPath]
  }
  
  @scala.inline
  implicit class MaterializedPathOps[Self <: MaterializedPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgs(value: ColumnMetadataArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: typingsSlinky.typeorm.connectionConnectionMod.Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityMetadata(value: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = this.set("entityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosureType(value: ancestor | descendant): Self = this.set("closureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosureType: Self = this.set("closureType", js.undefined)
    
    @scala.inline
    def setEmbeddedMetadata(value: typingsSlinky.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata): Self = this.set("embeddedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedMetadata: Self = this.set("embeddedMetadata", js.undefined)
    
    @scala.inline
    def setMaterializedPath(value: Boolean): Self = this.set("materializedPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterializedPath: Self = this.set("materializedPath", js.undefined)
    
    @scala.inline
    def setNestedSetLeft(value: Boolean): Self = this.set("nestedSetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestedSetLeft: Self = this.set("nestedSetLeft", js.undefined)
    
    @scala.inline
    def setNestedSetRight(value: Boolean): Self = this.set("nestedSetRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestedSetRight: Self = this.set("nestedSetRight", js.undefined)
    
    @scala.inline
    def setReferencedColumn(value: ColumnMetadata): Self = this.set("referencedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferencedColumn: Self = this.set("referencedColumn", js.undefined)
  }
}
