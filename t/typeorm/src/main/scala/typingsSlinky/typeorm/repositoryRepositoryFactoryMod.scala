package typingsSlinky.typeorm

import typingsSlinky.typeorm.entityManagerEntityManagerMod.EntityManager
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typingsSlinky.typeorm.repositoryRepositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/repository/RepositoryFactory", JSImport.Namespace)
@js.native
object repositoryRepositoryFactoryMod extends js.Object {
  
  @js.native
  class RepositoryFactory () extends js.Object {
    
    /**
      * Creates a repository.
      */
    def create(manager: EntityManager, metadata: EntityMetadata): Repository[_] = js.native
    def create(manager: EntityManager, metadata: EntityMetadata, queryRunner: QueryRunner): Repository[_] = js.native
  }
}
