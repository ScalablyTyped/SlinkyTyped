package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.githubRefMod.OptionsOrRef
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.Repository
import typingsSlinky.typedGithubApi.ownerRefMod.OwnerRef
import typingsSlinky.typedGithubApi.typedGithubApiStrings.all
import typingsSlinky.typedGithubApi.typedGithubApiStrings.created
import typingsSlinky.typedGithubApi.typedGithubApiStrings.full_name
import typingsSlinky.typedGithubApi.typedGithubApiStrings.member
import typingsSlinky.typedGithubApi.typedGithubApiStrings.owner
import typingsSlinky.typedGithubApi.typedGithubApiStrings.pushed
import typingsSlinky.typedGithubApi.typedGithubApiStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/owner-ref", JSImport.Namespace)
@js.native
object distOwnerRefMod extends js.Object {
  @js.native
  class OwnerRefClass protected ()
    extends GitHubRef
       with OwnerRef {
    def this(login: String, options: OptionsOrRef) = this()
    def loadRepositoriesAsync(_type: all | owner | member): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | owner | member, _sort: created | updated | pushed | full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | owner | member, _sort: created | updated | pushed | full_name, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  }
  
}

