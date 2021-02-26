package typingsSlinky.typeorm

import typingsSlinky.typeorm.entityManagerEntityManagerMod.EntityManager
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typingsSlinky.typeorm.repositoryRepositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryRepositoryFactoryMod {
  
  @JSImport("typeorm/repository/RepositoryFactory", "RepositoryFactory")
  @js.native
  class RepositoryFactory () extends StObject {
    
    /**
      * Creates a repository.
      */
    def create(manager: EntityManager, metadata: EntityMetadata): Repository[_] = js.native
    def create(manager: EntityManager, metadata: EntityMetadata, queryRunner: QueryRunner): Repository[_] = js.native
  }
}
