package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.modelsMod.Reflection
import typingsSlinky.typescript.mod.FunctionExpression
import typingsSlinky.typescript.mod.SignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/signature-call", JSImport.Namespace)
@js.native
object signatureCallMod extends js.Object {
  @js.native
  class SignatureConverter () extends ConverterNodeComponent[FunctionExpression | SignatureDeclaration] {
    def convert(context: Context, node: FunctionExpression): Reflection = js.native
    def convert(context: Context, node: SignatureDeclaration): Reflection = js.native
  }
  
}

