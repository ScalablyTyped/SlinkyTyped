package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.ImportType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportTypeNode extends NodeWithTypeArguments {
  
  val argument: TypeNode = js.native
  
  val isTypeOf: Boolean = js.native
  
  @JSName("kind")
  val kind_ImportTypeNode: ImportType = js.native
  
  val qualifier: js.UndefOr[EntityName] = js.native
}
