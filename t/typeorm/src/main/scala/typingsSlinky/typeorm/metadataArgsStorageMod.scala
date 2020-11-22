package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.PropertyName
import typingsSlinky.typeorm.anon.Target
import typingsSlinky.typeorm.checkMetadataArgsMod.CheckMetadataArgs
import typingsSlinky.typeorm.columnMetadataArgsMod.ColumnMetadataArgs
import typingsSlinky.typeorm.discriminatorValueMetadataArgsMod.DiscriminatorValueMetadataArgs
import typingsSlinky.typeorm.embeddedMetadataArgsMod.EmbeddedMetadataArgs
import typingsSlinky.typeorm.entityListenerMetadataArgsMod.EntityListenerMetadataArgs
import typingsSlinky.typeorm.entityRepositoryMetadataArgsMod.EntityRepositoryMetadataArgs
import typingsSlinky.typeorm.entitySubscriberMetadataArgsMod.EntitySubscriberMetadataArgs
import typingsSlinky.typeorm.exclusionMetadataArgsMod.ExclusionMetadataArgs
import typingsSlinky.typeorm.generatedMetadataArgsMod.GeneratedMetadataArgs
import typingsSlinky.typeorm.indexMetadataArgsMod.IndexMetadataArgs
import typingsSlinky.typeorm.inheritanceMetadataArgsMod.InheritanceMetadataArgs
import typingsSlinky.typeorm.joinColumnMetadataArgsMod.JoinColumnMetadataArgs
import typingsSlinky.typeorm.joinTableMetadataArgsMod.JoinTableMetadataArgs
import typingsSlinky.typeorm.namingStrategyMetadataArgsMod.NamingStrategyMetadataArgs
import typingsSlinky.typeorm.relationCountMetadataArgsMod.RelationCountMetadataArgs
import typingsSlinky.typeorm.relationIdMetadataArgsMod.RelationIdMetadataArgs
import typingsSlinky.typeorm.relationMetadataArgsMod.RelationMetadataArgs
import typingsSlinky.typeorm.tableMetadataArgsMod.TableMetadataArgs
import typingsSlinky.typeorm.transactionEntityMetadataArgsMod.TransactionEntityMetadataArgs
import typingsSlinky.typeorm.transactionRepositoryMetadataArgsMod.TransactionRepositoryMetadataArgs
import typingsSlinky.typeorm.treeMetadataArgsMod.TreeMetadataArgs
import typingsSlinky.typeorm.uniqueMetadataArgsMod.UniqueMetadataArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/metadata-args/MetadataArgsStorage", JSImport.Namespace)
@js.native
object metadataArgsStorageMod extends js.Object {
  
  @js.native
  class MetadataArgsStorage () extends js.Object {
    
    val checks: js.Array[CheckMetadataArgs] = js.native
    
    val columns: js.Array[ColumnMetadataArgs] = js.native
    
    val discriminatorValues: js.Array[DiscriminatorValueMetadataArgs] = js.native
    
    val embeddeds: js.Array[EmbeddedMetadataArgs] = js.native
    
    val entityListeners: js.Array[EntityListenerMetadataArgs] = js.native
    
    val entityRepositories: js.Array[EntityRepositoryMetadataArgs] = js.native
    
    val entitySubscribers: js.Array[EntitySubscriberMetadataArgs] = js.native
    
    val exclusions: js.Array[ExclusionMetadataArgs] = js.native
    
    /* protected */ def filterByTarget[T /* <: Target */](array: js.Array[T], target: String): js.Array[T] = js.native
    /* protected */ def filterByTarget[T /* <: Target */](array: js.Array[T], target: js.Array[js.Function | String]): js.Array[T] = js.native
    /**
      * Filters given array by a given target or targets.
      */
    /* protected */ def filterByTarget[T /* <: Target */](array: js.Array[T], target: js.Function): js.Array[T] = js.native
    
    /* protected */ def filterByTargetAndWithoutDuplicateEmbeddedProperties[T /* <: EmbeddedMetadataArgs */](array: js.Array[T], target: String): js.Array[T] = js.native
    /* protected */ def filterByTargetAndWithoutDuplicateEmbeddedProperties[T /* <: EmbeddedMetadataArgs */](array: js.Array[T], target: js.Array[js.Function | String]): js.Array[T] = js.native
    /**
      * Filters given array by a given target or targets and prevents duplicate embedded property names.
      */
    /* protected */ def filterByTargetAndWithoutDuplicateEmbeddedProperties[T /* <: EmbeddedMetadataArgs */](array: js.Array[T], target: js.Function): js.Array[T] = js.native
    
    /* protected */ def filterByTargetAndWithoutDuplicateProperties[T /* <: PropertyName */](array: js.Array[T], target: String): js.Array[T] = js.native
    /* protected */ def filterByTargetAndWithoutDuplicateProperties[T /* <: PropertyName */](array: js.Array[T], target: js.Array[js.Function | String]): js.Array[T] = js.native
    /**
      * Filters given array by a given target or targets and prevents duplicate property names.
      */
    /* protected */ def filterByTargetAndWithoutDuplicateProperties[T /* <: PropertyName */](array: js.Array[T], target: js.Function): js.Array[T] = js.native
    
    def filterChecks(target: String): js.Array[CheckMetadataArgs] = js.native
    def filterChecks(target: js.Array[js.Function | String]): js.Array[CheckMetadataArgs] = js.native
    def filterChecks(target: js.Function): js.Array[CheckMetadataArgs] = js.native
    
    def filterColumns(target: String): js.Array[ColumnMetadataArgs] = js.native
    def filterColumns(target: js.Array[js.Function | String]): js.Array[ColumnMetadataArgs] = js.native
    def filterColumns(target: js.Function): js.Array[ColumnMetadataArgs] = js.native
    
    def filterEmbeddeds(target: String): js.Array[EmbeddedMetadataArgs] = js.native
    def filterEmbeddeds(target: js.Array[js.Function | String]): js.Array[EmbeddedMetadataArgs] = js.native
    def filterEmbeddeds(target: js.Function): js.Array[EmbeddedMetadataArgs] = js.native
    
    def filterExclusions(target: String): js.Array[ExclusionMetadataArgs] = js.native
    def filterExclusions(target: js.Array[js.Function | String]): js.Array[ExclusionMetadataArgs] = js.native
    def filterExclusions(target: js.Function): js.Array[ExclusionMetadataArgs] = js.native
    
    def filterIndices(target: String): js.Array[IndexMetadataArgs] = js.native
    def filterIndices(target: js.Array[js.Function | String]): js.Array[IndexMetadataArgs] = js.native
    def filterIndices(target: js.Function): js.Array[IndexMetadataArgs] = js.native
    
    def filterJoinColumns(target: String, propertyName: String): js.Array[JoinColumnMetadataArgs] = js.native
    def filterJoinColumns(target: js.Function, propertyName: String): js.Array[JoinColumnMetadataArgs] = js.native
    
    def filterListeners(target: String): js.Array[EntityListenerMetadataArgs] = js.native
    def filterListeners(target: js.Array[js.Function | String]): js.Array[EntityListenerMetadataArgs] = js.native
    def filterListeners(target: js.Function): js.Array[EntityListenerMetadataArgs] = js.native
    
    def filterNamingStrategies(target: String): js.Array[NamingStrategyMetadataArgs] = js.native
    def filterNamingStrategies(target: js.Array[js.Function | String]): js.Array[NamingStrategyMetadataArgs] = js.native
    def filterNamingStrategies(target: js.Function): js.Array[NamingStrategyMetadataArgs] = js.native
    
    def filterRelationCounts(target: String): js.Array[RelationCountMetadataArgs] = js.native
    def filterRelationCounts(target: js.Array[js.Function | String]): js.Array[RelationCountMetadataArgs] = js.native
    def filterRelationCounts(target: js.Function): js.Array[RelationCountMetadataArgs] = js.native
    
    def filterRelationIds(target: String): js.Array[RelationIdMetadataArgs] = js.native
    def filterRelationIds(target: js.Array[js.Function | String]): js.Array[RelationIdMetadataArgs] = js.native
    def filterRelationIds(target: js.Function): js.Array[RelationIdMetadataArgs] = js.native
    
    def filterRelations(target: String): js.Array[RelationMetadataArgs] = js.native
    def filterRelations(target: js.Array[js.Function | String]): js.Array[RelationMetadataArgs] = js.native
    def filterRelations(target: js.Function): js.Array[RelationMetadataArgs] = js.native
    
    def filterSingleTableChildren(target: String): js.Array[TableMetadataArgs] = js.native
    def filterSingleTableChildren(target: js.Function): js.Array[TableMetadataArgs] = js.native
    
    def filterSubscribers(target: String): js.Array[EntitySubscriberMetadataArgs] = js.native
    def filterSubscribers(target: js.Array[js.Function | String]): js.Array[EntitySubscriberMetadataArgs] = js.native
    def filterSubscribers(target: js.Function): js.Array[EntitySubscriberMetadataArgs] = js.native
    
    def filterTables(target: String): js.Array[TableMetadataArgs] = js.native
    def filterTables(target: js.Array[js.Function | String]): js.Array[TableMetadataArgs] = js.native
    def filterTables(target: js.Function): js.Array[TableMetadataArgs] = js.native
    
    def filterTransactionEntityManagers(target: String, propertyName: String): js.Array[TransactionEntityMetadataArgs] = js.native
    def filterTransactionEntityManagers(target: js.Function, propertyName: String): js.Array[TransactionEntityMetadataArgs] = js.native
    
    def filterTransactionRepository(target: String, propertyName: String): js.Array[TransactionRepositoryMetadataArgs] = js.native
    def filterTransactionRepository(target: js.Function, propertyName: String): js.Array[TransactionRepositoryMetadataArgs] = js.native
    
    def filterUniques(target: String): js.Array[UniqueMetadataArgs] = js.native
    def filterUniques(target: js.Array[js.Function | String]): js.Array[UniqueMetadataArgs] = js.native
    def filterUniques(target: js.Function): js.Array[UniqueMetadataArgs] = js.native
    
    def findDiscriminatorValue(target: String): js.UndefOr[DiscriminatorValueMetadataArgs] = js.native
    def findDiscriminatorValue(target: js.Function): js.UndefOr[DiscriminatorValueMetadataArgs] = js.native
    
    def findGenerated(target: String, propertyName: String): js.UndefOr[GeneratedMetadataArgs] = js.native
    def findGenerated(target: js.Array[js.Function | String], propertyName: String): js.UndefOr[GeneratedMetadataArgs] = js.native
    def findGenerated(target: js.Function, propertyName: String): js.UndefOr[GeneratedMetadataArgs] = js.native
    
    def findInheritanceType(target: String): js.UndefOr[InheritanceMetadataArgs] = js.native
    def findInheritanceType(target: js.Function): js.UndefOr[InheritanceMetadataArgs] = js.native
    
    def findJoinTable(target: String, propertyName: String): js.UndefOr[JoinTableMetadataArgs] = js.native
    def findJoinTable(target: js.Function, propertyName: String): js.UndefOr[JoinTableMetadataArgs] = js.native
    
    def findTree(target: String): js.UndefOr[TreeMetadataArgs] = js.native
    def findTree(target: js.Array[js.Function | String]): js.UndefOr[TreeMetadataArgs] = js.native
    def findTree(target: js.Function): js.UndefOr[TreeMetadataArgs] = js.native
    
    val generations: js.Array[GeneratedMetadataArgs] = js.native
    
    val indices: js.Array[IndexMetadataArgs] = js.native
    
    val inheritances: js.Array[InheritanceMetadataArgs] = js.native
    
    val joinColumns: js.Array[JoinColumnMetadataArgs] = js.native
    
    val joinTables: js.Array[JoinTableMetadataArgs] = js.native
    
    val namingStrategies: js.Array[NamingStrategyMetadataArgs] = js.native
    
    val relationCounts: js.Array[RelationCountMetadataArgs] = js.native
    
    val relationIds: js.Array[RelationIdMetadataArgs] = js.native
    
    val relations: js.Array[RelationMetadataArgs] = js.native
    
    val tables: js.Array[TableMetadataArgs] = js.native
    
    val transactionEntityManagers: js.Array[TransactionEntityMetadataArgs] = js.native
    
    val transactionRepositories: js.Array[TransactionRepositoryMetadataArgs] = js.native
    
    val trees: js.Array[TreeMetadataArgs] = js.native
    
    val uniques: js.Array[UniqueMetadataArgs] = js.native
  }
}
