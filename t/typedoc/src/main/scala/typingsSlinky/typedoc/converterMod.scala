package typingsSlinky.typedoc

import typingsSlinky.typedoc.applicationMod.Application
import typingsSlinky.typescript.mod.EnumMember
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.Program
import typingsSlinky.typescript.mod.TypeChecker
import typingsSlinky.typescript.mod.VariableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object converterMod {
  
  @JSImport("typedoc/dist/lib/converter", "Context")
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
  
  @JSImport("typedoc/dist/lib/converter", "Converter")
  @js.native
  class Converter protected ()
    extends typingsSlinky.typedoc.converterConverterMod.Converter {
    def this(owner: js.Symbol) = this()
    def this(owner: Application) = this()
  }
  /* static members */
  object Converter {
    
    @JSImport("typedoc/dist/lib/converter", "Converter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_BEGIN")
    @js.native
    def EVENT_BEGIN: String = js.native
    @scala.inline
    def EVENT_BEGIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_BEGIN")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_CREATE_DECLARATION")
    @js.native
    def EVENT_CREATE_DECLARATION: String = js.native
    @scala.inline
    def EVENT_CREATE_DECLARATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CREATE_DECLARATION")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_CREATE_PARAMETER")
    @js.native
    def EVENT_CREATE_PARAMETER: String = js.native
    @scala.inline
    def EVENT_CREATE_PARAMETER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CREATE_PARAMETER")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_CREATE_SIGNATURE")
    @js.native
    def EVENT_CREATE_SIGNATURE: String = js.native
    @scala.inline
    def EVENT_CREATE_SIGNATURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CREATE_SIGNATURE")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_CREATE_TYPE_PARAMETER")
    @js.native
    def EVENT_CREATE_TYPE_PARAMETER: String = js.native
    @scala.inline
    def EVENT_CREATE_TYPE_PARAMETER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CREATE_TYPE_PARAMETER")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_END")
    @js.native
    def EVENT_END: String = js.native
    @scala.inline
    def EVENT_END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_END")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_FILE_BEGIN")
    @js.native
    def EVENT_FILE_BEGIN: String = js.native
    @scala.inline
    def EVENT_FILE_BEGIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_FILE_BEGIN")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_FUNCTION_IMPLEMENTATION")
    @js.native
    def EVENT_FUNCTION_IMPLEMENTATION: String = js.native
    @scala.inline
    def EVENT_FUNCTION_IMPLEMENTATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_FUNCTION_IMPLEMENTATION")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_RESOLVE")
    @js.native
    def EVENT_RESOLVE: String = js.native
    @scala.inline
    def EVENT_RESOLVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_RESOLVE")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_RESOLVE_BEGIN")
    @js.native
    def EVENT_RESOLVE_BEGIN: String = js.native
    @scala.inline
    def EVENT_RESOLVE_BEGIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_RESOLVE_BEGIN")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_RESOLVE_END")
    @js.native
    def EVENT_RESOLVE_END: String = js.native
    @scala.inline
    def EVENT_RESOLVE_END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_RESOLVE_END")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/converter", "convertDefaultValue")
  @js.native
  def convertDefaultValue(node: EnumMember): js.UndefOr[String] = js.native
  @JSImport("typedoc/dist/lib/converter", "convertDefaultValue")
  @js.native
  def convertDefaultValue(node: ParameterDeclaration): js.UndefOr[String] = js.native
  @JSImport("typedoc/dist/lib/converter", "convertDefaultValue")
  @js.native
  def convertDefaultValue(node: VariableDeclaration): js.UndefOr[String] = js.native
  
  @JSImport("typedoc/dist/lib/converter", "convertExpression")
  @js.native
  def convertExpression(expression: Expression): String = js.native
}
