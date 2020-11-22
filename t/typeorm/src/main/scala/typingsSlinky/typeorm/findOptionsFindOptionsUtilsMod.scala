package typingsSlinky.typeorm

import typingsSlinky.std.Partial
import typingsSlinky.typeorm.findOptionsFindManyOptionsMod.FindManyOptions
import typingsSlinky.typeorm.findOptionsFindOneOptionsMod.FindOneOptions
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/find-options/FindOptionsUtils", JSImport.Namespace)
@js.native
object findOptionsFindOptionsUtilsMod extends js.Object {
  
  @js.native
  class FindOptionsUtils () extends js.Object
  /* static members */
  @js.native
  object FindOptionsUtils extends js.Object {
    
    /**
      * Applies give find many options to the given query builder.
      */
    def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: SelectQueryBuilder[T]): SelectQueryBuilder[T] = js.native
    def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: SelectQueryBuilder[T], options: Partial[T]): SelectQueryBuilder[T] = js.native
    def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: SelectQueryBuilder[T], options: FindManyOptions[T]): SelectQueryBuilder[T] = js.native
    
    /**
      * Applies give find options to the given query builder.
      */
    def applyOptionsToQueryBuilder[T](qb: SelectQueryBuilder[T]): SelectQueryBuilder[T] = js.native
    def applyOptionsToQueryBuilder[T](qb: SelectQueryBuilder[T], options: FindManyOptions[T]): SelectQueryBuilder[T] = js.native
    def applyOptionsToQueryBuilder[T](qb: SelectQueryBuilder[T], options: FindOneOptions[T]): SelectQueryBuilder[T] = js.native
    
    /**
      * Adds joins for all relations and sub-relations of the given relations provided in the find options.
      */
    /* protected */ def applyRelationsRecursively(
      qb: SelectQueryBuilder[_],
      allRelations: js.Array[String],
      alias: String,
      metadata: EntityMetadata,
      prefix: String
    ): Unit = js.native
    
    /**
      * Checks if given object is really instance of FindOptions interface.
      */
    def extractFindManyOptionsAlias(`object`: js.Any): js.UndefOr[String] = js.native
    
    /**
      * Checks if given object is really instance of FindManyOptions interface.
      */
    def isFindManyOptions[Entity](obj: js.Any): /* is typeorm.typeorm/find-options/FindManyOptions.FindManyOptions<Entity> */ Boolean = js.native
    
    /**
      * Checks if given object is really instance of FindOneOptions interface.
      */
    def isFindOneOptions[Entity](obj: js.Any): /* is typeorm.typeorm/find-options/FindOneOptions.FindOneOptions<Entity> */ Boolean = js.native
    
    def joinEagerRelations(qb: SelectQueryBuilder[_], alias: String, metadata: EntityMetadata): Unit = js.native
  }
}
