package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.UniqueConstraint
import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.metadataArgsJoinColumnMetadataArgsMod.JoinColumnMetadataArgs
import typingsSlinky.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typingsSlinky.typeorm.metadataRelationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataBuilderRelationJoinColumnBuilderMod {
  
  @JSImport("typeorm/metadata-builder/RelationJoinColumnBuilder", "RelationJoinColumnBuilder")
  @js.native
  class RelationJoinColumnBuilder protected () extends StObject {
    def this(connection: Connection) = this()
    
    /**
      * Builds a foreign key of the many-to-one or one-to-one owner relations.
      */
    def build(joinColumns: js.Array[JoinColumnMetadataArgs], relation: RelationMetadata): UniqueConstraint = js.native
    
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
