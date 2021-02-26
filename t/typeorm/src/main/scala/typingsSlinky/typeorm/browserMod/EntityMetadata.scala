package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.anon.Args
import typingsSlinky.typeorm.anon.SkipNulls
import typingsSlinky.typeorm.columnMetadataMod.ColumnMetadata
import typingsSlinky.typeorm.objectLiteralMod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "EntityMetadata")
@js.native
class EntityMetadata protected ()
  extends typingsSlinky.typeorm.entityMetadataMod.EntityMetadata {
  def this(options: Args) = this()
}
/* static members */
object EntityMetadata {
  
  /**
    * Creates a property paths for a given entity.
    */
  @JSImport("typeorm/browser", "EntityMetadata.createPropertyPath")
  @js.native
  def createPropertyPath(metadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata, entity: ObjectLiteral): js.Array[String] = js.native
  @JSImport("typeorm/browser", "EntityMetadata.createPropertyPath")
  @js.native
  def createPropertyPath(
    metadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata,
    entity: ObjectLiteral,
    prefix: String
  ): js.Array[String] = js.native
  
  /**
    * Finds difference between two entity id maps.
    * Returns items that exist in the first array and absent in the second array.
    */
  @JSImport("typeorm/browser", "EntityMetadata.difference")
  @js.native
  def difference(firstIdMaps: js.Array[ObjectLiteral], secondIdMaps: js.Array[ObjectLiteral]): js.Array[ObjectLiteral] = js.native
  
  /**
    * Creates value map from the given values and columns.
    * Examples of usages are primary columns map and join columns map.
    */
  @JSImport("typeorm/browser", "EntityMetadata.getValueMap")
  @js.native
  def getValueMap(entity: ObjectLiteral, columns: js.Array[ColumnMetadata]): js.UndefOr[ObjectLiteral] = js.native
  @JSImport("typeorm/browser", "EntityMetadata.getValueMap")
  @js.native
  def getValueMap(entity: ObjectLiteral, columns: js.Array[ColumnMetadata], options: SkipNulls): js.UndefOr[ObjectLiteral] = js.native
}
