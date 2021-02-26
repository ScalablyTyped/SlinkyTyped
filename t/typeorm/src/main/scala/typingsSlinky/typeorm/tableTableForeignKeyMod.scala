package typingsSlinky.typeorm

import typingsSlinky.typeorm.metadataForeignKeyMetadataMod.ForeignKeyMetadata
import typingsSlinky.typeorm.optionsTableForeignKeyOptionsMod.TableForeignKeyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableForeignKeyMod {
  
  @JSImport("typeorm/schema-builder/table/TableForeignKey", "TableForeignKey")
  @js.native
  class TableForeignKey protected () extends StObject {
    def this(options: TableForeignKeyOptions) = this()
    
    /**
      * Column names which included by this foreign key.
      */
    var columnNames: js.Array[String] = js.native
    
    /**
      * Set this foreign key constraint as "DEFERRABLE" e.g. check constraints at start
      * or at the end of a transaction
      */
    var deferrable: js.UndefOr[String] = js.native
    
    /**
      * Name of the foreign key constraint.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * "ON DELETE" of this foreign key, e.g. what action database should perform when
      * referenced stuff is being deleted.
      */
    var onDelete: js.UndefOr[String] = js.native
    
    /**
      * "ON UPDATE" of this foreign key, e.g. what action database should perform when
      * referenced stuff is being updated.
      */
    var onUpdate: js.UndefOr[String] = js.native
    
    /**
      * Column names which included by this foreign key.
      */
    var referencedColumnNames: js.Array[String] = js.native
    
    /**
      * Table referenced in the foreign key.
      */
    var referencedTableName: String = js.native
  }
  /* static members */
  object TableForeignKey {
    
    /**
      * Creates a new table foreign key from the given foreign key metadata.
      */
    @JSImport("typeorm/schema-builder/table/TableForeignKey", "TableForeignKey.create")
    @js.native
    def create(metadata: ForeignKeyMetadata): TableForeignKey = js.native
  }
}
