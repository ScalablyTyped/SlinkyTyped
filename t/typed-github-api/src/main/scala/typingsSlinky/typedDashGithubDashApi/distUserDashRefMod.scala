package typingsSlinky.typedDashGithubDashApi

import typingsSlinky.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
import typingsSlinky.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import typingsSlinky.typedDashGithubDashApi.distInterfacesRepositoryMod.Repository
import typingsSlinky.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import typingsSlinky.typedDashGithubDashApi.distInterfacesUserMod.User
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.all
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.created
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.full_name
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.member
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.owner
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.pushed
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/user-ref", JSImport.Namespace)
@js.native
object distUserDashRefMod extends js.Object {
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

