package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.MethodSignatureSyntax")
@js.native
class MethodSignatureSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.MethodSignatureSyntax {
  def this(
    propertyName: ISyntaxToken,
    questionToken: ISyntaxToken,
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.MethodSignatureSyntax")
@js.native
object MethodSignatureSyntax extends js.Object {
  def create(
    propertyName: ISyntaxToken,
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax
  ): typingsSlinky.typescriptServices.TypeScript.MethodSignatureSyntax = js.native
  def create1(propertyName: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.MethodSignatureSyntax = js.native
}

