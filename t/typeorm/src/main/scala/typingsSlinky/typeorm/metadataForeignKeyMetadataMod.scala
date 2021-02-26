package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.Deferrable
import typingsSlinky.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.namingStrategyNamingStrategyInterfaceMod.NamingStrategyInterface
import typingsSlinky.typeorm.typesDeferrableTypeMod.DeferrableType
import typingsSlinky.typeorm.typesOnDeleteTypeMod.OnDeleteType
import typingsSlinky.typeorm.typesOnUpdateTypeMod.OnUpdateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataForeignKeyMetadataMod {
  
  @JSImport("typeorm/metadata/ForeignKeyMetadata", "ForeignKeyMetadata")
  @js.native
  class ForeignKeyMetadata protected () extends StObject {
    def this(options: Deferrable) = this()
    
    /**
      * Builds some depend foreign key properties.
      * Must be called after all entity metadatas and their columns are built.
      */
    def build(namingStrategy: NamingStrategyInterface): Unit = js.native
    
    /**
      * Gets array of column names.
      */
    var columnNames: js.Array[String] = js.native
    
    /**
      * Array of columns of this foreign key.
      */
    var columns: js.Array[ColumnMetadata] = js.native
    
    /**
      * When to check the constraints of a foreign key.
      */
    var deferrable: js.UndefOr[DeferrableType] = js.native
    
    /**
      * Entity metadata where this foreign key is.
      */
    var entityMetadata: EntityMetadata = js.native
    
    /**
      * Gets foreign key name.
      */
    var name: String = js.native
    
    /**
      * What to do with a relation on deletion of the row containing a foreign key.
      */
    var onDelete: js.UndefOr[OnDeleteType] = js.native
    
    /**
      * What to do with a relation on update of the row containing a foreign key.
      */
    var onUpdate: js.UndefOr[OnUpdateType] = js.native
    
    /**
      * Gets array of referenced column names.
      */
    var referencedColumnNames: js.Array[String] = js.native
    
    /**
      * Array of referenced columns.
      */
    var referencedColumns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Entity metadata which this foreign key references.
      */
    var referencedEntityMetadata: EntityMetadata = js.native
    
    /**
      * Gets the table name to which this foreign key is referenced.
      */
    var referencedTablePath: String = js.native
  }
}
