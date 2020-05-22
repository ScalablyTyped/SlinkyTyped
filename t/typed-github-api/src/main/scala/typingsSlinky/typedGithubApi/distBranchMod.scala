package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.branchRefMod.BranchRefClass
import typingsSlinky.typedGithubApi.interfacesBranchMod.Branch
import typingsSlinky.typedGithubApi.interfacesCommitMod.CommitSummary
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsSlinky.typedGithubApi.repositoryRefMod.RepositoryRefClass
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
    def this(repository: RepositoryRefClass, data: typingsSlinky.typedGithubApi.branchMod.Branch) = this()
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

