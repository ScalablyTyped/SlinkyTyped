package typingsSlinky.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "combineLanguagesFeatures")
@js.native
object combineLanguagesFeatures extends js.Object {
  
  def apply[O, T](one: LanguagesFeature[O], two: LanguagesFeature[T]): LanguagesFeature[O with T] = js.native
}
