package typingsSlinky.typeorm

import typingsSlinky.typeorm.entityManagerMod.EntityManager
import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.queryRunnerMod.QueryRunner
import typingsSlinky.typeorm.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryFactoryMod {
  
  @JSImport("typeorm/browser/repository/RepositoryFactory", "RepositoryFactory")
  @js.native
  class RepositoryFactory () extends StObject {
    
    /**
      * Creates a repository.
      */
    def create(manager: EntityManager, metadata: EntityMetadata): Repository[_] = js.native
    def create(manager: EntityManager, metadata: EntityMetadata, queryRunner: QueryRunner): Repository[_] = js.native
  }
}
