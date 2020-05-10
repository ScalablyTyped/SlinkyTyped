package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.LanguageServiceShim")
@js.native
class LanguageServiceShim protected ()
  extends ShimBase
     with ILanguageServiceShim {
  def this(factory: IShimFactory, host: ILanguageServiceShimHost, languageService: ILanguageService) = this()
  var host: js.Any = js.native
  var logger: js.Any = js.native
  /* private */ def _navigateToItemsToString(items: js.Any): js.Any = js.native
  def forwardJSONCall(actionDescription: String, action: js.Function0[_]): String = js.native
  /* private */ def realizeDiagnosticWithFileName(diagnostic: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.LanguageServiceShim")
@js.native
object LanguageServiceShim extends js.Object {
  /* private */ def realizeDiagnostic(diagnostic: js.Any): js.Any = js.native
  /* private */ def realizeDiagnosticCategory(category: js.Any): js.Any = js.native
}

