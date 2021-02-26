package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.ReadonlyTextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.LiteralLikeNode because Already inherited
- typingsSlinky.typescript.mod.TemplateLiteralLikeNode because var conflicts: hasExtendedUnicodeEscape, isUnterminated, text. Inlined rawText */ @js.native
trait NoSubstitutionTemplateLiteral
  extends LiteralExpression
     with Declaration
     with LiteralToken
     with StringLiteralLike
     with TemplateLiteral
     with TemplateLiteralToken {
  
  @JSName("kind")
  val kind_NoSubstitutionTemplateLiteral: typingsSlinky.typescript.mod.SyntaxKind.NoSubstitutionTemplateLiteral = js.native
  
  var rawText: js.UndefOr[java.lang.String] = js.native
}
