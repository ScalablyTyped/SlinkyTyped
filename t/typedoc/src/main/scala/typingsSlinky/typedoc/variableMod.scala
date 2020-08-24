package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.modelsMod.Reflection
import typingsSlinky.typescript.mod.BindingElement
import typingsSlinky.typescript.mod.ImportEqualsDeclaration
import typingsSlinky.typescript.mod.ObjectLiteralExpression
import typingsSlinky.typescript.mod.PropertyAssignment
import typingsSlinky.typescript.mod.PropertyDeclaration
import typingsSlinky.typescript.mod.PropertySignature
import typingsSlinky.typescript.mod.ShorthandPropertyAssignment
import typingsSlinky.typescript.mod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/variable", JSImport.Namespace)
@js.native
object variableMod extends js.Object {
  @js.native
  class VariableConverter () extends ConverterNodeComponent[VariableDeclaration] {
    def convert(context: Context, node: VarNodeType): js.UndefOr[Reflection] = js.native
    def isSimpleObjectLiteral(objectLiteral: ObjectLiteralExpression): Boolean = js.native
  }
  
  type VarNodeType = PropertySignature | PropertyDeclaration | PropertyAssignment | ShorthandPropertyAssignment | VariableDeclaration | ImportEqualsDeclaration | BindingElement
}

