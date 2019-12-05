package typingsSlinky.typedDashGithubDashApi

import typingsSlinky.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
import typingsSlinky.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import typingsSlinky.typedDashGithubDashApi.distInterfacesOrganizationMod.Organization
import typingsSlinky.typedDashGithubDashApi.distInterfacesRepositoryMod.Repository
import typingsSlinky.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.`private`
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.all
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.created
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.forks
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.full_name
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.member
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.public
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.pushed
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.sources
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/organization-ref", JSImport.Namespace)
@js.native
object distOrganizationDashRefMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrganizationRef * / any */ @js.native
  class OrganizationRefClass protected () extends GitHubRef {
    def this(login: String, options: OptionsOrRef) = this()
    var login: String = js.native
    def getRepository(name: String): RepositoryRef = js.native
    def loadAsync(): js.Promise[Organization | Null] = js.native
    def loadRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | public | `private` | forks | sources | member): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(
      _type: all | public | `private` | forks | sources | member,
      _sort: created | updated | pushed | full_name
    ): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(
      _type: all | public | `private` | forks | sources | member,
      _sort: created | updated | pushed | full_name,
      _ascending: Boolean
    ): js.Promise[js.Array[Repository]] = js.native
  }
  
}

