package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.githubRefMod.OptionsOrRef
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.Repository
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsSlinky.typedGithubApi.interfacesUserMod.User
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

@JSImport("typed-github-api/dist/user-ref", JSImport.Namespace)
@js.native
object userRefMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserRef * / any */ @js.native
  class UserRefClass protected () extends GitHubRef {
    def this(login: String, options: OptionsOrRef) = this()
    var login: String = js.native
    def getRepository(name: String): RepositoryRef = js.native
    def loadAsync(): js.Promise[User | Null] = js.native
    def loadRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | owner | member): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | owner | member, _sort: created | updated | pushed | full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | owner | member, _sort: created | updated | pushed | full_name, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  }
  
}

