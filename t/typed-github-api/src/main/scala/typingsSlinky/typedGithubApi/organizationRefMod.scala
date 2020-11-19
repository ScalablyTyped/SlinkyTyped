package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.githubRefMod.OptionsOrRef
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.Repository
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsSlinky.typedGithubApi.organizationMod.Organization
import typingsSlinky.typedGithubApi.typedGithubApiStrings.`private`
import typingsSlinky.typedGithubApi.typedGithubApiStrings.all
import typingsSlinky.typedGithubApi.typedGithubApiStrings.created
import typingsSlinky.typedGithubApi.typedGithubApiStrings.forks
import typingsSlinky.typedGithubApi.typedGithubApiStrings.full_name
import typingsSlinky.typedGithubApi.typedGithubApiStrings.member
import typingsSlinky.typedGithubApi.typedGithubApiStrings.public
import typingsSlinky.typedGithubApi.typedGithubApiStrings.pushed
import typingsSlinky.typedGithubApi.typedGithubApiStrings.sources
import typingsSlinky.typedGithubApi.typedGithubApiStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-github-api/dist/organization-ref", JSImport.Namespace)
@js.native
object organizationRefMod extends js.Object {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrganizationRef * / any */ @js.native
  class OrganizationRefClass protected () extends GitHubRef {
    def this(login: String, options: OptionsOrRef) = this()
    
    def getRepository(name: String): RepositoryRef = js.native
    
    def loadAsync(): js.Promise[Organization | Null] = js.native
    
    def loadRepositoriesAsync(
      _type: js.UndefOr[all | public | `private` | forks | sources | member],
      _sort: js.UndefOr[created | updated | pushed | full_name],
      _ascending: js.UndefOr[Boolean]
    ): js.Promise[js.Array[Repository]] = js.native
    
    var login: String = js.native
  }
}
