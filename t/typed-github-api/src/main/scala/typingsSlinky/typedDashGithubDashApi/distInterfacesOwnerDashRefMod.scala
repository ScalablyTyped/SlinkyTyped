package typingsSlinky.typedDashGithubDashApi

import typingsSlinky.typedDashGithubDashApi.distInterfacesOrganizationMod.Organization
import typingsSlinky.typedDashGithubDashApi.distInterfacesRepositoryMod.Repository
import typingsSlinky.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import typingsSlinky.typedDashGithubDashApi.distInterfacesUserMod.User
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.`private`
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.all
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.created
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.forks
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.full_name
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.member
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.owner
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.public
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.pushed
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.sources
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/interfaces/owner-ref", JSImport.Namespace)
@js.native
object distInterfacesOwnerDashRefMod extends js.Object {
  @js.native
  trait OwnerRef extends js.Object {
    var login: String = js.native
    def getRepository(name: String): RepositoryRef = js.native
    def loadOrganizationAsync(): js.Promise[Organization | Null] = js.native
    /**
      * Loads repositories owned by this organisation.
      * @param type      The type of repository to return (default all)
      * @param sort      The field to sort by (default full_name)
      * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
      * @returns         The resulting array of repositories
      */
    def loadOrganizationRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(`type`: all | public | `private` | forks | sources | member): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(
      `type`: all | public | `private` | forks | sources | member,
      sort: created | updated | pushed | full_name
    ): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(
      `type`: all | public | `private` | forks | sources | member,
      sort: created | updated | pushed | full_name,
      ascending: Boolean
    ): js.Promise[js.Array[Repository]] = js.native
    /**
      * Loads repositories accessible to this user.
      * @param type      The type of search (default owner)
      * @param sort      The field to sort by (default full_name)
      * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
      * @returns         The resulting array of repositories
      */
    def loadRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
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
    def loadRepositoriesAsync_member(`type`: member): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_owner(`type`: owner): js.Promise[js.Array[Repository]] = js.native
    def loadUserAsync(): js.Promise[User | Null] = js.native
  }
  
}

