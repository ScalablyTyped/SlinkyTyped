package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.commitMod.Commit
import typingsSlinky.typedGithubApi.commitMod.GitCommit
import typingsSlinky.typedGithubApi.commitRefMod.CommitRefClass
import typingsSlinky.typedGithubApi.interfacesCommitMod.CommitRef
import typingsSlinky.typedGithubApi.interfacesCommitMod.CommitSummary
import typingsSlinky.typedGithubApi.interfacesCommitMod.GitChanges
import typingsSlinky.typedGithubApi.interfacesCommitMod.GitCommitSummary
import typingsSlinky.typedGithubApi.interfacesCommitMod.GitFile
import typingsSlinky.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-github-api/dist/commit", JSImport.Namespace)
@js.native
object distCommitMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.typedGithubApi.interfacesCommitMod.CommitRef because Already inherited
  - typingsSlinky.typedGithubApi.interfacesCommitMod.CommitSummary because Already inherited
  - typingsSlinky.typedGithubApi.interfacesCommitMod.Commit because var conflicts: author, committer, gitCommit, htmlUri, parents. Inlined changes, files */ @js.native
  class CommitClass protected () extends CommitSummaryClass {
    def this(repository: RepositoryRefClass, data: Commit) = this()
    
    var changes: GitChanges = js.native
    
    var files: js.Array[GitFile] = js.native
  }
  
  @js.native
  class CommitSummaryClass protected ()
    extends CommitRefClass
       with CommitSummary {
    def this(repository: RepositoryRefClass, data: typingsSlinky.typedGithubApi.commitMod.CommitSummary) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.typedGithubApi.interfacesCommitMod.CommitRef because Already inherited
  - typingsSlinky.typedGithubApi.interfacesCommitMod.GitCommitSummary because Already inherited
  - typingsSlinky.typedGithubApi.interfacesCommitMod.GitCommit because var conflicts: author, committer, message. Inlined parents */ @js.native
  class GitCommitClass protected () extends GitCommitSummaryClass {
    def this(repository: RepositoryRefClass, data: GitCommit) = this()
    
    var parents: js.Array[CommitRef] = js.native
  }
  
  @js.native
  class GitCommitSummaryClass protected ()
    extends CommitRefClass
       with GitCommitSummary {
    def this(
      repository: RepositoryRefClass,
      sha: String,
      data: typingsSlinky.typedGithubApi.commitMod.GitCommitSummary
    ) = this()
  }
}
