package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "TypeAnnotationSyntax")
@js.native
class TypeAnnotationSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.TypeAnnotationSyntax {
  def this(colonToken: ISyntaxToken, `type`: ITypeSyntax, parsedInStrictMode: Boolean) = this()
}
/* static members */
@JSImport("typescript-services", "TypeAnnotationSyntax")
@js.native
object TypeAnnotationSyntax extends js.Object {
  
  def create1(`type`: ITypeSyntax): typingsSlinky.typescriptServices.TypeScript.TypeAnnotationSyntax = js.native
}
