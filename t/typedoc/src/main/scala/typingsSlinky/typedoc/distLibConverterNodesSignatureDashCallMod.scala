package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibConverterComponentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.distLibConverterContextMod.Context
import typingsSlinky.typedoc.distLibModelsMod.Reflection
import typingsSlinky.typescript.typescriptMod.FunctionExpression
import typingsSlinky.typescript.typescriptMod.SignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/signature-call", JSImport.Namespace)
@js.native
object distLibConverterNodesSignatureDashCallMod extends js.Object {
  @js.native
  class SignatureConverter () extends ConverterNodeComponent[FunctionExpression | SignatureDeclaration] {
    def convert(context: Context, node: FunctionExpression): Reflection = js.native
    def convert(context: Context, node: SignatureDeclaration): Reflection = js.native
  }
  
}

