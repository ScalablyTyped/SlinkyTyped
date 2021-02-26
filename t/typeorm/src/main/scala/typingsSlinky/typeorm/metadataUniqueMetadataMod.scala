package typingsSlinky.typeorm

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.typeorm.anon.ColumnsEmbeddedMetadataEntityMetadata
import typingsSlinky.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typingsSlinky.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.namingStrategyNamingStrategyInterfaceMod.NamingStrategyInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataUniqueMetadataMod {
  
  @JSImport("typeorm/metadata/UniqueMetadata", "UniqueMetadata")
  @js.native
  class UniqueMetadata protected () extends StObject {
    def this(options: ColumnsEmbeddedMetadataEntityMetadata) = this()
    
    /**
      * Builds some depend unique constraint properties.
      * Must be called after all entity metadata's properties map, columns and relations are built.
      */
    def build(namingStrategy: NamingStrategyInterface): this.type = js.native
    
    /**
      * Map of column names with order set.
      * Used only by MongoDB driver.
      */
    var columnNamesWithOrderingMap: StringDictionary[Double] = js.native
    
    /**
      * Unique columns.
      */
    var columns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Embedded metadata if this unique was applied on embedded.
      */
    var embeddedMetadata: js.UndefOr[EmbeddedMetadata] = js.native
    
    /**
      * Entity metadata of the class to which this unique constraint is applied.
      */
    var entityMetadata: EntityMetadata = js.native
    
    /**
      * User specified column names.
      */
    var givenColumnNames: js.UndefOr[
        (js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[Double]]) | js.Array[String]
      ] = js.native
    
    /**
      * User specified unique constraint name.
      */
    var givenName: js.UndefOr[String] = js.native
    
    /**
      * Final unique constraint name.
      * If unique constraint name was given by a user then it stores normalized (by naming strategy) givenName.
      * If unique constraint name was not given then its generated.
      */
    var name: String = js.native
    
    /**
      * Target class to which metadata is applied.
      */
    var target: js.UndefOr[js.Function | String] = js.native
  }
}
