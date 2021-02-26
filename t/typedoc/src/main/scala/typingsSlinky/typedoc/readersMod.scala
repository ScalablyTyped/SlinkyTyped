package typingsSlinky.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readersMod {
  
  @JSImport("typedoc/dist/lib/utils/options/readers", "ArgumentsReader")
  @js.native
  class ArgumentsReader protected ()
    extends typingsSlinky.typedoc.argumentsMod.ArgumentsReader {
    def this(priority: Double) = this()
    def this(priority: Double, args: js.Array[String]) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils/options/readers", "TSConfigReader")
  @js.native
  class TSConfigReader ()
    extends typingsSlinky.typedoc.tsconfigMod.TSConfigReader
  
  @JSImport("typedoc/dist/lib/utils/options/readers", "TypeDocReader")
  @js.native
  class TypeDocReader ()
    extends typingsSlinky.typedoc.typedocMod.TypeDocReader
}
