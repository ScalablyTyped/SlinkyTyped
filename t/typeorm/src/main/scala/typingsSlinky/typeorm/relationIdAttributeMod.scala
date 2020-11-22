package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.PartialRelationIdAttribut
import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.queryExpressionMapMod.QueryExpressionMap
import typingsSlinky.typeorm.relationMetadataMod.RelationMetadata
import typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/query-builder/relation-id/RelationIdAttribute", JSImport.Namespace)
@js.native
object relationIdAttributeMod extends js.Object {
  
  @js.native
  class RelationIdAttribute protected () extends js.Object {
    def this(queryExpressionMap: QueryExpressionMap) = this()
    def this(queryExpressionMap: QueryExpressionMap, relationIdAttribute: PartialRelationIdAttribut) = this()
    
    /**
      * Alias of the joined (destination) table.
      */
    var alias: js.UndefOr[String] = js.native
    
    /**
      * Indicates if relation id should NOT be loaded as id map.
      */
    var disableMixedMap: Boolean = js.native
    
    val joinInverseSideMetadata: EntityMetadata = js.native
    
    /**
      * Generates alias of junction table, whose ids we get.
      */
    val junctionAlias: String = js.native
    
    /**
      * Metadata of the joined entity.
      * If extra condition without entity was joined, then it will return undefined.
      */
    val junctionMetadata: EntityMetadata = js.native
    
    /**
      * Property + alias of the object where to joined data should be mapped.
      */
    var mapToProperty: String = js.native
    
    val mapToPropertyParentAlias: String = js.native
    
    val mapToPropertyPropertyPath: String = js.native
    
    /**
      * Alias of the parent of this join.
      * For example, if we join ("post.category", "categoryAlias") then "post" is a parent alias.
      * This value is extracted from entityOrProperty value.
      * This is available when join was made using "post.category" syntax.
      */
    val parentAlias: String = js.native
    
    /**
      * Extra condition applied to "ON" section of join.
      */
    var queryBuilderFactory: js.UndefOr[js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]] = js.native
    
    var queryExpressionMap: js.Any = js.native
    
    /**
      * Relation of the parent.
      * This is used to understand what is joined.
      * This is available when join was made using "post.category" syntax.
      */
    val relation: RelationMetadata = js.native
    
    /**
      * Name of relation.
      */
    var relationName: String = js.native
    
    /**
      * Relation property name of the parent.
      * This is used to understand what is joined.
      * For example, if we join ("post.category", "categoryAlias") then "category" is a relation property.
      * This value is extracted from entityOrProperty value.
      * This is available when join was made using "post.category" syntax.
      */
    val relationPropertyPath: String = js.native
  }
}
