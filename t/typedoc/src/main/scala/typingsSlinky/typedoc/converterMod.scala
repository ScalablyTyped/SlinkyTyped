package typingsSlinky.typedoc

import typingsSlinky.typescript.mod.EnumMember
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.Program
import typingsSlinky.typescript.mod.TypeChecker
import typingsSlinky.typescript.mod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter", JSImport.Namespace)
@js.native
object converterMod extends js.Object {
  @js.native
  class Context protected ()
    extends typingsSlinky.typedoc.contextMod.Context {
    def this(
      converter: typingsSlinky.typedoc.converterConverterMod.Converter,
      fileNames: js.Array[String],
      checker: TypeChecker,
      program: Program
    ) = this()
  }
  
  @js.native
  class Converter ()
    extends typingsSlinky.typedoc.converterConverterMod.Converter
  
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

