package typingsSlinky.typedoc

import typingsSlinky.typescript.typescriptMod.EnumMember
import typingsSlinky.typescript.typescriptMod.Expression
import typingsSlinky.typescript.typescriptMod.ParameterDeclaration
import typingsSlinky.typescript.typescriptMod.Program
import typingsSlinky.typescript.typescriptMod.TypeChecker
import typingsSlinky.typescript.typescriptMod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter", JSImport.Namespace)
@js.native
object distLibConverterMod extends js.Object {
  @js.native
  class Context protected ()
    extends typingsSlinky.typedoc.distLibConverterContextMod.Context {
    def this(
      converter: typingsSlinky.typedoc.distLibConverterConverterMod.Converter,
      fileNames: js.Array[String],
      checker: TypeChecker,
      program: Program
    ) = this()
  }
  
  @js.native
  class Converter ()
    extends typingsSlinky.typedoc.distLibConverterConverterMod.Converter
  
  def convertDefaultValue(node: EnumMember): js.UndefOr[String] = js.native
  def convertDefaultValue(node: ParameterDeclaration): js.UndefOr[String] = js.native
  def convertDefaultValue(node: VariableDeclaration): js.UndefOr[String] = js.native
  def convertExpression(expression: Expression): String = js.native
  /* static members */
  @js.native
  object Converter extends js.Object {
    var EVENT_BEGIN: String = js.native
    var EVENT_CREATE_DECLARATION: String = js.native
    var EVENT_CREATE_PARAMETER: String = js.native
    var EVENT_CREATE_SIGNATURE: String = js.native
    var EVENT_CREATE_TYPE_PARAMETER: String = js.native
    var EVENT_END: String = js.native
    var EVENT_FILE_BEGIN: String = js.native
    var EVENT_FUNCTION_IMPLEMENTATION: String = js.native
    var EVENT_RESOLVE: String = js.native
    var EVENT_RESOLVE_BEGIN: String = js.native
    var EVENT_RESOLVE_END: String = js.native
  }
  
}

