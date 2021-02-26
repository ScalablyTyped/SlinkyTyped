package typingsSlinky.typescriptServices.mod.Services

import typingsSlinky.typescriptServices.TypeScript.Services.ILanguageService
import typingsSlinky.typescriptServices.TypeScript.Services.ILanguageServiceShimHost
import typingsSlinky.typescriptServices.TypeScript.Services.IShimFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.LanguageServiceShim")
@js.native
class LanguageServiceShim protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.LanguageServiceShim {
  def this(factory: IShimFactory, host: ILanguageServiceShimHost, languageService: ILanguageService) = this()
}
object LanguageServiceShim {
  
  /* static member */
  @JSImport("typescript-services", "Services.LanguageServiceShim.realizeDiagnostic")
  @js.native
  def realizeDiagnostic(diagnostic: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.LanguageServiceShim.realizeDiagnosticCategory")
  @js.native
  def realizeDiagnosticCategory(category: js.Any): js.Any = js.native
}
