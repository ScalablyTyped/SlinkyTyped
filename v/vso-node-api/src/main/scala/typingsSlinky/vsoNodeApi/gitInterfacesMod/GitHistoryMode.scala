package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitHistoryMode extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitHistoryMode")
@js.native
object GitHistoryMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitHistoryMode with Double] = js.native
  
  /**
    * The history mode used by `git log --first-parent`
    */
  @js.native
  sealed trait FirstParent extends GitHistoryMode
  /* 1 */ @js.native
  object FirstParent extends TopLevel[FirstParent with Double]
  
  /**
    * The history mode used by `git log --full-history`
    */
  @js.native
  sealed trait FullHistory extends GitHistoryMode
  /* 2 */ @js.native
  object FullHistory extends TopLevel[FullHistory with Double]
  
  /**
    * The history mode used by `git log --full-history --simplify-merges`
    */
  @js.native
  sealed trait FullHistorySimplifyMerges extends GitHistoryMode
  /* 3 */ @js.native
  object FullHistorySimplifyMerges extends TopLevel[FullHistorySimplifyMerges with Double]
  
  /**
    * The history mode used by `git log`. This is the default.
    */
  @js.native
  sealed trait SimplifiedHistory extends GitHistoryMode
  /* 0 */ @js.native
  object SimplifiedHistory extends TopLevel[SimplifiedHistory with Double]
}
