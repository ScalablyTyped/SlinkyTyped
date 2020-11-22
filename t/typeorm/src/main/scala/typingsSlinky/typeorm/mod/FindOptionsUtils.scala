package typingsSlinky.typeorm.mod

import typingsSlinky.std.Partial
import typingsSlinky.typeorm.findOptionsFindManyOptionsMod.FindManyOptions
import typingsSlinky.typeorm.findOptionsFindOneOptionsMod.FindOneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "FindOptionsUtils")
@js.native
class FindOptionsUtils ()
  extends typingsSlinky.typeorm.findOptionsFindOptionsUtilsMod.FindOptionsUtils
/* static members */
@JSImport("typeorm", "FindOptionsUtils")
@js.native
object FindOptionsUtils extends js.Object {
  
  /**
    * Applies give find many options to the given query builder.
    */
  def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T]): typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  def applyFindManyOptionsOrConditionsToQueryBuilder[T](
    qb: typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T],
    options: Partial[T]
  ): typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  def applyFindManyOptionsOrConditionsToQueryBuilder[T](
    qb: typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T],
    options: FindManyOptions[T]
  ): typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  
  /**
    * Applies give find options to the given query builder.
    */
  def applyOptionsToQueryBuilder[T](qb: typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T]): typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  def applyOptionsToQueryBuilder[T](
    qb: typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T],
    options: FindManyOptions[T]
  ): typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  def applyOptionsToQueryBuilder[T](
    qb: typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T],
    options: FindOneOptions[T]
  ): typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  
  /**
    * Adds joins for all relations and sub-relations of the given relations provided in the find options.
    */
  /* protected */ def applyRelationsRecursively(
    qb: typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[_],
    allRelations: js.Array[String],
    alias: String,
    metadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata,
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
  
  def joinEagerRelations(
    qb: typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[_],
    alias: String,
    metadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): Unit = js.native
}
