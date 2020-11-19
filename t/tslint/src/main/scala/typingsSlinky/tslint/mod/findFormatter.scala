package typingsSlinky.tslint.mod

import typingsSlinky.tslint.formatterMod.FormatterConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "findFormatter")
@js.native
object findFormatter extends js.Object {
  
  def apply(name: String): js.UndefOr[FormatterConstructor] = js.native
  def apply(name: String, formattersDirectory: String): js.UndefOr[FormatterConstructor] = js.native
  def apply(name: FormatterConstructor): js.UndefOr[FormatterConstructor] = js.native
  def apply(name: FormatterConstructor, formattersDirectory: String): js.UndefOr[FormatterConstructor] = js.native
}
