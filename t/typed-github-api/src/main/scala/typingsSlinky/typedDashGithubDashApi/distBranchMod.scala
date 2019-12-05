package typingsSlinky.typedDashGithubDashApi

import typingsSlinky.typedDashGithubDashApi.distBranchDashRefMod.BranchRefClass
import typingsSlinky.typedDashGithubDashApi.distInterfacesBranchMod.Branch
import typingsSlinky.typedDashGithubDashApi.distInterfacesCommitMod.CommitSummary
import typingsSlinky.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import typingsSlinky.typedDashGithubDashApi.distRepositoryDashRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/branch", JSImport.Namespace)
@js.native
object distBranchMod extends js.Object {
  @js.native
  class BranchClass protected ()
    extends BranchRefClass
       with Branch {
    def this(
      repository: RepositoryRefClass,
      data: typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesBranchMod.Branch
    ) = this()
    /* CompleteClass */
    override var commit: CommitSummary = js.native
    /* CompleteClass */
    override val name: String = js.native
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[Branch | Null] = js.native
  }
  
}

