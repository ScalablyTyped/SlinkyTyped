package typingsSlinky.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/sources", JSImport.Namespace)
@js.native
object optionsSourcesMod extends js.Object {
  @js.native
  class ComponentSource ()
    extends typingsSlinky.typedoc.sourcesComponentMod.ComponentSource
  
  @js.native
  class TypeScriptSource ()
    extends typingsSlinky.typedoc.typescriptMod.TypeScriptSource
  
  /* static members */
  @js.native
  object TypeScriptSource extends js.Object {
    var IGNORED: js.Array[String] = js.native
  }
  
}

