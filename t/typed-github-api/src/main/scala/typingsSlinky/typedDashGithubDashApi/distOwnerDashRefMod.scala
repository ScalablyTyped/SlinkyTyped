package typingsSlinky.typedDashGithubDashApi

import typingsSlinky.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
import typingsSlinky.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import typingsSlinky.typedDashGithubDashApi.distInterfacesOwnerDashRefMod.OwnerRef
import typingsSlinky.typedDashGithubDashApi.distInterfacesRepositoryMod.Repository
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

@JSImport("typed-github-api/dist/owner-ref", JSImport.Namespace)
@js.native
object distOwnerDashRefMod extends js.Object {
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

