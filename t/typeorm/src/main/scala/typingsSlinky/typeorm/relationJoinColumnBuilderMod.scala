package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.ForeignKey
import typingsSlinky.typeorm.columnMetadataMod.ColumnMetadata
import typingsSlinky.typeorm.connectionMod.Connection
import typingsSlinky.typeorm.joinColumnMetadataArgsMod.JoinColumnMetadataArgs
import typingsSlinky.typeorm.relationMetadataMod.RelationMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/metadata-builder/RelationJoinColumnBuilder", JSImport.Namespace)
@js.native
object relationJoinColumnBuilderMod extends js.Object {
  
  @js.native
  class RelationJoinColumnBuilder protected () extends js.Object {
    def this(connection: Connection) = this()
    
    /**
      * Builds a foreign key of the many-to-one or one-to-one owner relations.
      */
    def build(joinColumns: js.Array[JoinColumnMetadataArgs], relation: RelationMetadata): ForeignKey = js.native
    
    /**
      * Collects columns from the given join column args.
      */
    var collectColumns: js.Any = js.native
    
    /**
      * Collects referenced columns from the given join column args.
      */
    /* protected */ def collectReferencedColumns(joinColumns: js.Array[JoinColumnMetadataArgs], relation: RelationMetadata): js.Array[ColumnMetadata] = js.native
    
    var connection: js.Any = js.native
  }
}
