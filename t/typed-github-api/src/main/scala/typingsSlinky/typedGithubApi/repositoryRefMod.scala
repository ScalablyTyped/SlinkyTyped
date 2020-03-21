package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.distOwnerRefMod.OwnerRefClass
import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/repository-ref", JSImport.Namespace)
@js.native
object repositoryRefMod extends js.Object {
  @js.native
  class RepositoryRefClass protected ()
    extends GitHubRef
       with RepositoryRef {
    def this(owner: OwnerRefClass, name: String) = this()
  }
  
}

