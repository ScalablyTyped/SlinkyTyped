package typingsSlinky.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `getWorkspace` operation. */
object GetWorkspaceConstants {
  
  @js.native
  sealed trait Sort extends StObject
  /** Indicates how the returned workspace data will be sorted. This parameter is valid only if **export**=`true`. Specify `sort=stable` to sort all workspace objects by unique identifier, in ascending alphabetical order. */
  @JSImport("watson-developer-cloud/assistant/v1", "GetWorkspaceConstants.Sort")
  @js.native
  object Sort extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
    
    @js.native
    sealed trait STABLE extends Sort
    /* "stable" */ val STABLE: typingsSlinky.watsonDeveloperCloud.mod.GetWorkspaceConstants.Sort.STABLE with String = js.native
  }
}
