package typingsSlinky.typescriptServices.global.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.Services.ILanguageService
import typingsSlinky.typescriptServices.TypeScript.Services.ILanguageServiceShimHost
import typingsSlinky.typescriptServices.TypeScript.Services.IShimFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.LanguageServiceShim")
@js.native
class LanguageServiceShim protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.LanguageServiceShim {
  def this(factory: IShimFactory, host: ILanguageServiceShimHost, languageService: ILanguageService) = this()
}
/* static members */
@JSGlobal("TypeScript.Services.LanguageServiceShim")
@js.native
object LanguageServiceShim extends js.Object {
  
  /* private */ def realizeDiagnostic(diagnostic: js.Any): js.Any = js.native
  
  /* private */ def realizeDiagnosticCategory(category: js.Any): js.Any = js.native
}
