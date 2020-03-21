package typingsSlinky.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.AnonModule
import typingsSlinky.webpack.mod.DefinePlugin.CodeValueObject
import typingsSlinky.webpack.mod.compilation.normalModuleFactory.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "DefinePlugin")
@js.native
class DefinePlugin protected () extends Plugin {
  def this(definitions: StringDictionary[CodeValueObject]) = this()
}

/* static members */
@JSImport("webpack", "DefinePlugin")
@js.native
object DefinePlugin extends js.Object {
  @js.native
  class RuntimeValue protected () extends js.Object {
    def this(fn: js.Function1[/* hasModule */ AnonModule, CodeValuePrimitive]) = this()
    def this(
      fn: js.Function1[/* hasModule */ AnonModule, CodeValuePrimitive],
      fileDependencies: js.Array[String]
    ) = this()
    def exec(parser: Parser): CodeValuePrimitive = js.native
  }
  
  def runtimeValue(fn: js.Function1[/* hasModule */ AnonModule, CodeValuePrimitive]): RuntimeValue = js.native
  def runtimeValue(
    fn: js.Function1[/* hasModule */ AnonModule, CodeValuePrimitive],
    fileDependencies: js.Array[String]
  ): RuntimeValue = js.native
  type CodeValueObject = CodeValuePrimitive | (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias webpack.webpack.DefinePlugin.CodeValueObject */ js.Object
  ])
  type CodeValuePrimitive = js.UndefOr[String | Double | Boolean | js.RegExp | RuntimeValue | Null]
}

