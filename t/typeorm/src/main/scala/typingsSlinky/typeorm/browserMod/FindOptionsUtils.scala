package typingsSlinky.typeorm.browserMod

import typingsSlinky.std.Partial
import typingsSlinky.typeorm.findManyOptionsMod.FindManyOptions
import typingsSlinky.typeorm.findOneOptionsMod.FindOneOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "FindOptionsUtils")
@js.native
class FindOptionsUtils ()
  extends typingsSlinky.typeorm.findOptionsUtilsMod.FindOptionsUtils
/* static members */
object FindOptionsUtils {
  
  /**
    * Applies give find many options to the given query builder.
    */
  @JSImport("typeorm/browser", "FindOptionsUtils.applyFindManyOptionsOrConditionsToQueryBuilder")
  @js.native
  def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[T]): typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  @JSImport("typeorm/browser", "FindOptionsUtils.applyFindManyOptionsOrConditionsToQueryBuilder")
  @js.native
  def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[T], options: Partial[T]): typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  @JSImport("typeorm/browser", "FindOptionsUtils.applyFindManyOptionsOrConditionsToQueryBuilder")
  @js.native
  def applyFindManyOptionsOrConditionsToQueryBuilder[T](qb: typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[T], options: FindManyOptions[T]): typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  
  /**
    * Applies give find options to the given query builder.
    */
  @JSImport("typeorm/browser", "FindOptionsUtils.applyOptionsToQueryBuilder")
  @js.native
  def applyOptionsToQueryBuilder[T](qb: typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[T]): typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  @JSImport("typeorm/browser", "FindOptionsUtils.applyOptionsToQueryBuilder")
  @js.native
  def applyOptionsToQueryBuilder[T](qb: typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[T], options: FindManyOptions[T]): typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  @JSImport("typeorm/browser", "FindOptionsUtils.applyOptionsToQueryBuilder")
  @js.native
  def applyOptionsToQueryBuilder[T](qb: typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[T], options: FindOneOptions[T]): typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  
  /**
    * Adds joins for all relations and sub-relations of the given relations provided in the find options.
    */
  @JSImport("typeorm/browser", "FindOptionsUtils.applyRelationsRecursively")
  @js.native
  def applyRelationsRecursively(
    qb: typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[_],
    allRelations: js.Array[String],
    alias: String,
    metadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata,
    prefix: String
  ): Unit = js.native
  
  /**
    * Checks if given object is really instance of FindOptions interface.
    */
  @JSImport("typeorm/browser", "FindOptionsUtils.extractFindManyOptionsAlias")
  @js.native
  def extractFindManyOptionsAlias(`object`: js.Any): js.UndefOr[String] = js.native
  
  /**
    * Checks if given object is really instance of FindManyOptions interface.
    */
  @JSImport("typeorm/browser", "FindOptionsUtils.isFindManyOptions")
  @js.native
  def isFindManyOptions[Entity](obj: js.Any): /* is typeorm.typeorm/browser/find-options/FindManyOptions.FindManyOptions<Entity> */ Boolean = js.native
  
  /**
    * Checks if given object is really instance of FindOneOptions interface.
    */
  @JSImport("typeorm/browser", "FindOptionsUtils.isFindOneOptions")
  @js.native
  def isFindOneOptions[Entity](obj: js.Any): /* is typeorm.typeorm/browser/find-options/FindOneOptions.FindOneOptions<Entity> */ Boolean = js.native
  
  @JSImport("typeorm/browser", "FindOptionsUtils.joinEagerRelations")
  @js.native
  def joinEagerRelations(
    qb: typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[_],
    alias: String,
    metadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
  ): Unit = js.native
}
