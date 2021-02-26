package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.distOwnerRefMod.OwnerRefClass
import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryRefMod {
  
  @JSImport("typed-github-api/dist/repository-ref", "RepositoryRefClass")
  @js.native
  class RepositoryRefClass protected ()
    extends GitHubRef
       with RepositoryRef {
    def this(owner: OwnerRefClass, name: String) = this()
  }
}
