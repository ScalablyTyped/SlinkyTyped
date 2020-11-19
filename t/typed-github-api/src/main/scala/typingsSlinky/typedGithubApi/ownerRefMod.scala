package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.interfacesRepositoryMod.Repository
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsSlinky.typedGithubApi.interfacesUserMod.User
import typingsSlinky.typedGithubApi.organizationMod.Organization
import typingsSlinky.typedGithubApi.typedGithubApiStrings.`private`
import typingsSlinky.typedGithubApi.typedGithubApiStrings.all
import typingsSlinky.typedGithubApi.typedGithubApiStrings.created
import typingsSlinky.typedGithubApi.typedGithubApiStrings.forks
import typingsSlinky.typedGithubApi.typedGithubApiStrings.full_name
import typingsSlinky.typedGithubApi.typedGithubApiStrings.member
import typingsSlinky.typedGithubApi.typedGithubApiStrings.owner
import typingsSlinky.typedGithubApi.typedGithubApiStrings.public
import typingsSlinky.typedGithubApi.typedGithubApiStrings.pushed
import typingsSlinky.typedGithubApi.typedGithubApiStrings.sources
import typingsSlinky.typedGithubApi.typedGithubApiStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-github-api/dist/interfaces/owner-ref", JSImport.Namespace)
@js.native
object ownerRefMod extends js.Object {
  
  @js.native
  trait OwnerRef extends js.Object {
    
    def getRepository(name: String): RepositoryRef = js.native
    
    def loadOrganizationAsync(): js.Promise[Organization | Null] = js.native
    
    /**
      * Loads repositories owned by this organisation.
      * @param type      The type of repository to return (default all)
      * @param sort      The field to sort by (default full_name)
      * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
      * @returns         The resulting array of repositories
      */
    def loadOrganizationRepositoriesAsync(
      `type`: js.UndefOr[all | public | `private` | forks | sources | member],
      sort: js.UndefOr[created | updated | pushed | full_name],
      ascending: js.UndefOr[Boolean]
    ): js.Promise[js.Array[Repository]] = js.native
    
    /**
      * Loads repositories accessible to this user.
      * @param type      The type of search (default owner)
      * @param sort      The field to sort by (default full_name)
      * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
      * @returns         The resulting array of repositories
      */
    def loadRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: js.UndefOr[scala.Nothing], sort: js.UndefOr[scala.Nothing], ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: created): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: created, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: pushed): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: pushed, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: updated): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: updated, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: created): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: created, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: pushed): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: pushed, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: updated): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: updated, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: created): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: created, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: pushed): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: pushed, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: updated): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: updated, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_all(`type`: all): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_all(`type`: all, sort: js.UndefOr[scala.Nothing], ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_created(`type`: js.UndefOr[scala.Nothing], sort: created): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_created(`type`: js.UndefOr[scala.Nothing], sort: created, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_fullname(`type`: js.UndefOr[scala.Nothing], sort: full_name): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_fullname(`type`: js.UndefOr[scala.Nothing], sort: full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_member(`type`: member): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_member(`type`: member, sort: js.UndefOr[scala.Nothing], ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_owner(`type`: owner): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_owner(`type`: owner, sort: js.UndefOr[scala.Nothing], ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_pushed(`type`: js.UndefOr[scala.Nothing], sort: pushed): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_pushed(`type`: js.UndefOr[scala.Nothing], sort: pushed, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_updated(`type`: js.UndefOr[scala.Nothing], sort: updated): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_updated(`type`: js.UndefOr[scala.Nothing], sort: updated, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    
    def loadUserAsync(): js.Promise[User | Null] = js.native
    
    var login: String = js.native
  }
}
