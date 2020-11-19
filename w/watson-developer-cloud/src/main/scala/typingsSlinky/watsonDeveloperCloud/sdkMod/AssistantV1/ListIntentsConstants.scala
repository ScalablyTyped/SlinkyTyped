package typingsSlinky.watsonDeveloperCloud.sdkMod.AssistantV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `listIntents` operation. */
@JSImport("watson-developer-cloud/sdk", "AssistantV1.ListIntentsConstants")
@js.native
object ListIntentsConstants extends js.Object {
  
  /** The attribute by which returned intents will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.watsonDeveloperCloud.mod.ListIntentsConstants.Sort with String] = js.native
    
    /* "intent" */ val INTENT: typingsSlinky.watsonDeveloperCloud.mod.ListIntentsConstants.Sort.INTENT with String = js.native
    
    /* "updated" */ val UPDATED: typingsSlinky.watsonDeveloperCloud.mod.ListIntentsConstants.Sort.UPDATED with String = js.native
  }
}
