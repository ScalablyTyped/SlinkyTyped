package typingsSlinky.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Discovery {
  
  @JSGlobal("SP.Discovery.Case")
  @js.native
  class Case protected ()
    extends typingsSlinky.sharepoint.SP.Discovery.Case {
    def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web) = this()
  }
  
  @JSGlobal("SP.Discovery.Export")
  @js.native
  class Export protected ()
    extends typingsSlinky.sharepoint.SP.Discovery.Export {
    def this(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      item: typingsSlinky.sharepoint.SP.ListItem[_]
    ) = this()
  }
  
  @JSGlobal("SP.Discovery.ExportStatus")
  @js.native
  object ExportStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.Discovery.ExportStatus with Double] = js.native
    
    /* 2 */ val complete: typingsSlinky.sharepoint.SP.Discovery.ExportStatus.complete with Double = js.native
    
    /* 3 */ val failed: typingsSlinky.sharepoint.SP.Discovery.ExportStatus.failed with Double = js.native
    
    /* 0 */ val notStarted: typingsSlinky.sharepoint.SP.Discovery.ExportStatus.notStarted with Double = js.native
    
    /* 1 */ val started: typingsSlinky.sharepoint.SP.Discovery.ExportStatus.started with Double = js.native
  }
}
