package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.branchRefMod.BranchRefClass
import typingsSlinky.typedGithubApi.interfacesBranchMod.Branch
import typingsSlinky.typedGithubApi.repositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBranchMod {
  
  @JSImport("typed-github-api/dist/branch", "BranchClass")
  @js.native
  class BranchClass protected ()
    extends BranchRefClass
       with Branch {
    def this(repository: RepositoryRefClass, data: typingsSlinky.typedGithubApi.branchMod.Branch) = this()
  }
}
