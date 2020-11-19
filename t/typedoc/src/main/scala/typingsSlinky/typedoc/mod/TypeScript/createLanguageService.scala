package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.DocumentRegistry
import typingsSlinky.typescript.mod.LanguageService
import typingsSlinky.typescript.mod.LanguageServiceHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createLanguageService")
@js.native
object createLanguageService extends js.Object {
  
  def apply(host: LanguageServiceHost): LanguageService = js.native
  def apply(host: LanguageServiceHost, documentRegistry: js.UndefOr[scala.Nothing], syntaxOnly: Boolean): LanguageService = js.native
  def apply(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService = js.native
  def apply(host: LanguageServiceHost, documentRegistry: DocumentRegistry, syntaxOnly: Boolean): LanguageService = js.native
}
