package typingsSlinky.typedDashGithubDashApi

import typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesCommitMod.Commit
import typingsSlinky.typedDashGithubDashApi.distCommitDashRefMod.CommitRefClass
import typingsSlinky.typedDashGithubDashApi.distCommitMod.CommitSummaryClass
import typingsSlinky.typedDashGithubDashApi.distCommitMod.GitCommitSummaryClass
import typingsSlinky.typedDashGithubDashApi.distInterfacesCommitMod.CommitRef
import typingsSlinky.typedDashGithubDashApi.distInterfacesCommitMod.CommitSummary
import typingsSlinky.typedDashGithubDashApi.distInterfacesCommitMod.GitActor
import typingsSlinky.typedDashGithubDashApi.distInterfacesCommitMod.GitChanges
import typingsSlinky.typedDashGithubDashApi.distInterfacesCommitMod.GitCommit
import typingsSlinky.typedDashGithubDashApi.distInterfacesCommitMod.GitCommitSummary
import typingsSlinky.typedDashGithubDashApi.distInterfacesCommitMod.GitFile
import typingsSlinky.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import typingsSlinky.typedDashGithubDashApi.distRepositoryDashRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/commit", JSImport.Namespace)
@js.native
object distCommitMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedDashGithubDashApi.distInterfacesCommitMod.CommitRef because Already inherited
  - typings.typedDashGithubDashApi.distInterfacesCommitMod.CommitSummary because Already inherited
  - typings.typedDashGithubDashApi.distInterfacesCommitMod.Commit because var conflicts: author, committer, gitCommit, htmlUri, parents. Inlined changes, files */ @js.native
  class CommitClass protected () extends CommitSummaryClass {
    def this(repository: RepositoryRefClass, data: Commit) = this()
    var changes: GitChanges = js.native
    var files: js.Array[GitFile] = js.native
  }
  
  @js.native
  class CommitSummaryClass protected ()
    extends CommitRefClass
       with CommitSummary {
    def this(
      repository: RepositoryRefClass,
      data: typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesCommitMod.CommitSummary
    ) = this()
    /* CompleteClass */
    override var gitCommit: GitCommitSummary = js.native
    /* CompleteClass */
    override var htmlUri: String = js.native
    /* CompleteClass */
    override var parents: js.Array[CommitRef] = js.native
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    /* CompleteClass */
    override val sha: String = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[typingsSlinky.typedDashGithubDashApi.distInterfacesCommitMod.Commit | Null] = js.native
    /* CompleteClass */
    override def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedDashGithubDashApi.distInterfacesCommitMod.CommitRef because Already inherited
  - typings.typedDashGithubDashApi.distInterfacesCommitMod.GitCommitSummary because Already inherited
  - typings.typedDashGithubDashApi.distInterfacesCommitMod.GitCommit because var conflicts: author, committer, message. Inlined parents */ @js.native
  class GitCommitClass protected () extends GitCommitSummaryClass {
    def this(
      repository: RepositoryRefClass,
      data: typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesCommitMod.GitCommit
    ) = this()
    var parents: js.Array[CommitRef] = js.native
  }
  
  @js.native
  class GitCommitSummaryClass protected ()
    extends CommitRefClass
       with GitCommitSummary {
    def this(
      repository: RepositoryRefClass,
      sha: String,
      data: typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesCommitMod.GitCommitSummary
    ) = this()
    /* CompleteClass */
    override var author: GitActor = js.native
    /* CompleteClass */
    override var committer: GitActor = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    /* CompleteClass */
    override val sha: String = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[typingsSlinky.typedDashGithubDashApi.distInterfacesCommitMod.Commit | Null] = js.native
    /* CompleteClass */
    override def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
  }
  
}

