package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.ArgsRelationIdMetadataArgsEntityMetadataEntityMetadata
import typingsSlinky.typeorm.commonObjectLiteralMod.ObjectLiteral
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.metadataRelationMetadataMod.RelationMetadata
import typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataRelationIdMetadataMod {
  
  @JSImport("typeorm/metadata/RelationIdMetadata", "RelationIdMetadata")
  @js.native
  class RelationIdMetadata protected () extends StObject {
    def this(options: ArgsRelationIdMetadataArgsEntityMetadataEntityMetadata) = this()
    
    /**
      * Alias of the joined (destination) table.
      */
    var alias: js.UndefOr[String] = js.native
    
    /**
      * Builds some depend relation id properties.
      * This builder method should be used only after entity metadata, its properties map and all relations are build.
      */
    def build(): Unit = js.native
    
    /**
      * Entity metadata where this column metadata is.
      */
    var entityMetadata: EntityMetadata = js.native
    
    /**
      * Target's property name to which this metadata is applied.
      */
    var propertyName: String = js.native
    
    /**
      * Extra condition applied to "ON" section of join.
      */
    var queryBuilderFactory: js.UndefOr[js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]] = js.native
    
    /**
      * Relation from which ids will be extracted.
      */
    var relation: RelationMetadata = js.native
    
    /**
      * Relation name which need to count.
      */
    var relationNameOrFactory: String | (js.Function1[/* object */ js.Any, _]) = js.native
    
    /**
      * Sets relation id value from the given entity.
      *
      * todo: make it to work in embeds as well.
      */
    def setValue(entity: ObjectLiteral): Unit = js.native
    
    /**
      * Target class to which metadata is applied.
      */
    var target: js.Function | String = js.native
  }
}
