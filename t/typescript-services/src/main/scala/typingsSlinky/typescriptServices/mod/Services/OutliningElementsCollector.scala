package typingsSlinky.typescriptServices.mod.Services

import typingsSlinky.typescriptServices.TypeScript.SourceUnitSyntax
import typingsSlinky.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.OutliningElementsCollector")
@js.native
class OutliningElementsCollector ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.OutliningElementsCollector
/* static members */
@JSImport("typescript-services", "Services.OutliningElementsCollector")
@js.native
object OutliningElementsCollector extends js.Object {
  
  var MaximumDepth: js.Any = js.native
  
  def collectElements(node: SourceUnitSyntax): js.Array[TextSpan] = js.native
}
