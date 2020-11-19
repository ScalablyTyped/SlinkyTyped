package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.branchRefMod.BranchRefClass
import typingsSlinky.typedGithubApi.interfacesBranchMod.Branch
import typingsSlinky.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-github-api/dist/branch", JSImport.Namespace)
@js.native
object distBranchMod extends js.Object {
  
  @js.native
  class BranchClass protected ()
    extends BranchRefClass
       with Branch {
    def this(repository: RepositoryRefClass, data: typingsSlinky.typedGithubApi.branchMod.Branch) = this()
  }
}
