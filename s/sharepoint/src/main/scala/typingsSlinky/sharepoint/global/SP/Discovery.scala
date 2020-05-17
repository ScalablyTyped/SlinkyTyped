package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Discovery")
@js.native
object Discovery extends js.Object {
  @js.native
  class Case protected ()
    extends typingsSlinky.sharepoint.SP.Discovery.Case {
    def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web) = this()
  }
  
  @js.native
  class Export protected ()
    extends typingsSlinky.sharepoint.SP.Discovery.Export {
    def this(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      item: typingsSlinky.sharepoint.SP.ListItem[_]
    ) = this()
  }
  
  @js.native
  object ExportStatus extends js.Object {
    /* 2 */ val complete: typingsSlinky.sharepoint.SP.Discovery.ExportStatus.complete with Double = js.native
    /* 3 */ val failed: typingsSlinky.sharepoint.SP.Discovery.ExportStatus.failed with Double = js.native
    /* 0 */ val notStarted: typingsSlinky.sharepoint.SP.Discovery.ExportStatus.notStarted with Double = js.native
    /* 1 */ val started: typingsSlinky.sharepoint.SP.Discovery.ExportStatus.started with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.Discovery.ExportStatus with Double] = js.native
  }
  
}

