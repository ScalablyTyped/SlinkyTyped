package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.ImportType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportTypeNode extends NodeWithTypeArguments {
  
  var argument: TypeNode = js.native
  
  var isTypeOf: js.UndefOr[Boolean] = js.native
  
  @JSName("kind")
  var kind_ImportTypeNode: ImportType = js.native
  
  var qualifier: js.UndefOr[EntityName] = js.native
}
