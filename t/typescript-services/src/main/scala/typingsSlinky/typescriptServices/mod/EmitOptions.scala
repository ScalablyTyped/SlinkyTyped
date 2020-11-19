package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "EmitOptions")
@js.native
class EmitOptions protected ()
  extends typingsSlinky.typescriptServices.TypeScript.EmitOptions {
  def this(
    compiler: typingsSlinky.typescriptServices.TypeScript.TypeScriptCompiler,
    resolvePath: js.Function1[/* path */ String, String]
  ) = this()
}
