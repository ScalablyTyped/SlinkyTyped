package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "parseCommandLine")
@js.native
object parseCommandLine extends js.Object {
  
  def apply(commandLine: js.Array[java.lang.String]): ParsedCommandLine = js.native
  def apply(
    commandLine: js.Array[java.lang.String],
    readFile: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]
  ): ParsedCommandLine = js.native
}
