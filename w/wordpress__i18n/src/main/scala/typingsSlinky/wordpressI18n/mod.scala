package typingsSlinky.wordpressI18n

import typingsSlinky.std.Record
import typingsSlinky.wordpressI18n.createI18nMod.I18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/i18n", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val __ : js.Any = js.native
  
  def createI18n(): I18n = js.native
  def createI18n(initialData: js.UndefOr[scala.Nothing], initialDomain: String): I18n = js.native
  def createI18n(initialData: Record[String, _]): I18n = js.native
  def createI18n(initialData: Record[String, _], initialDomain: String): I18n = js.native
  
  val isRTL: js.Any = js.native
  
  @JSName("_n")
  val n: js.Any = js.native
  
  @JSName("_nx")
  val nx: js.Any = js.native
  
  val setLocaleData: js.Any = js.native
  
  def sprintf(format: String, args: js.Any*): String = js.native
  
  @JSName("_x")
  val x: js.Any = js.native
}
