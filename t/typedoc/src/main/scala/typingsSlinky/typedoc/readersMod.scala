package typingsSlinky.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/utils/options/readers", JSImport.Namespace)
@js.native
object readersMod extends js.Object {
  
  @js.native
  class ArgumentsReader protected ()
    extends typingsSlinky.typedoc.argumentsMod.ArgumentsReader {
    def this(priority: Double) = this()
    def this(priority: Double, args: js.Array[String]) = this()
  }
  
  @js.native
  class TSConfigReader ()
    extends typingsSlinky.typedoc.tsconfigMod.TSConfigReader
  
  @js.native
  class TypeDocReader ()
    extends typingsSlinky.typedoc.typedocMod.TypeDocReader
}
