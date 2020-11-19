package typingsSlinky.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "ParameterInformation")
@js.native
object ParameterInformation extends js.Object {
  
  /**
    * Creates a new parameter information literal.
    *
    * @param label A label string.
    * @param documentation A doc string.
    */
  def create(label: String): typingsSlinky.vscodeLanguageserverTypes.mod.ParameterInformation = js.native
  def create(label: String, documentation: String): typingsSlinky.vscodeLanguageserverTypes.mod.ParameterInformation = js.native
  def create(label: js.Tuple2[Double, Double]): typingsSlinky.vscodeLanguageserverTypes.mod.ParameterInformation = js.native
  def create(label: js.Tuple2[Double, Double], documentation: String): typingsSlinky.vscodeLanguageserverTypes.mod.ParameterInformation = js.native
}
