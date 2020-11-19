package typingsSlinky.watsonDeveloperCloud.sdkMod.CompareComplyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `deleteFeedback` operation. */
@JSImport("watson-developer-cloud/sdk", "CompareComplyV1.DeleteFeedbackConstants")
@js.native
object DeleteFeedbackConstants extends js.Object {
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.DeleteFeedbackConstants.Model with String
      ] = js.native
    
    /* "contracts" */ val CONTRACTS: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.DeleteFeedbackConstants.Model.CONTRACTS with String = js.native
    
    /* "tables" */ val TABLES: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.DeleteFeedbackConstants.Model.TABLES with String = js.native
  }
}
