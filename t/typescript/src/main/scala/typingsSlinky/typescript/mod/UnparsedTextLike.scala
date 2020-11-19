package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.UnparsedInternalText
import typingsSlinky.typescript.mod.SyntaxKind.UnparsedText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnparsedTextLike
  extends UnparsedSection
     with UnparsedSourceText {
  
  @JSName("kind")
  var kind_UnparsedTextLike: UnparsedText | UnparsedInternalText = js.native
}
