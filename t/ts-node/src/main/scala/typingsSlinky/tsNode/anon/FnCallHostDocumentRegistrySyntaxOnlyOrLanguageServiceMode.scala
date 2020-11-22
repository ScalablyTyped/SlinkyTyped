package typingsSlinky.tsNode.anon

import typingsSlinky.typescript.mod.DocumentRegistry
import typingsSlinky.typescript.mod.LanguageService
import typingsSlinky.typescript.mod.LanguageServiceHost
import typingsSlinky.typescript.mod.LanguageServiceMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHostDocumentRegistrySyntaxOnlyOrLanguageServiceMode extends js.Object {
  
  def apply(host: LanguageServiceHost): LanguageService = js.native
  def apply(
    host: LanguageServiceHost,
    documentRegistry: js.UndefOr[scala.Nothing],
    syntaxOnlyOrLanguageServiceMode: Boolean
  ): LanguageService = js.native
  def apply(
    host: LanguageServiceHost,
    documentRegistry: js.UndefOr[scala.Nothing],
    syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
  ): LanguageService = js.native
  def apply(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService = js.native
  def apply(
    host: LanguageServiceHost,
    documentRegistry: DocumentRegistry,
    syntaxOnlyOrLanguageServiceMode: Boolean
  ): LanguageService = js.native
  def apply(
    host: LanguageServiceHost,
    documentRegistry: DocumentRegistry,
    syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
  ): LanguageService = js.native
}
