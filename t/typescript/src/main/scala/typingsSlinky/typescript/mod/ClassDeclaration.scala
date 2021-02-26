package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.ReadonlyTextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because Already inherited
- typingsSlinky.typescript.mod.NamedDeclaration because Already inherited
- typingsSlinky.typescript.mod.DeclarationStatement because var conflicts: _declarationBrand. Inlined  */ @js.native
trait ClassDeclaration
  extends ClassLikeDeclarationBase
     with ClassLikeDeclaration
     with Statement {
  
  @JSName("kind")
  val kind_ClassDeclaration: typingsSlinky.typescript.mod.SyntaxKind.ClassDeclaration = js.native
}
