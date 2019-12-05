package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibConverterComponentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.distLibConverterContextMod.Context
import typingsSlinky.typedoc.distLibModelsMod.Reflection
import typingsSlinky.typescript.typescriptMod.FunctionDeclaration
import typingsSlinky.typescript.typescriptMod.MethodDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/function", JSImport.Namespace)
@js.native
object distLibConverterNodesFunctionMod extends js.Object {
  @js.native
  class FunctionConverter () extends ConverterNodeComponent[FunctionDeclaration | MethodDeclaration] {
    def convert(context: Context, node: FunctionDeclaration): js.UndefOr[Reflection] = js.native
    def convert(context: Context, node: MethodDeclaration): js.UndefOr[Reflection] = js.native
  }
  
}

