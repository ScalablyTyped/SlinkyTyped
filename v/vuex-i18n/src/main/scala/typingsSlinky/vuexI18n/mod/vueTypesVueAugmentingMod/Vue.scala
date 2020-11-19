package typingsSlinky.vuexI18n.mod.vueTypesVueAugmentingMod

import typingsSlinky.vuexI18n.mod.Ii18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vue extends js.Object {
  
  @JSName("$i18n")
  var $i18n: Ii18n = js.native
  
  @JSName("$t")
  def $t(key: String): js.UndefOr[String] = js.native
  @JSName("$t")
  def $t(key: String, defaultValue: String): js.UndefOr[String] = js.native
  @JSName("$t")
  def $t(key: String, defaultValue: String, options: js.UndefOr[scala.Nothing], pluralization: Double): js.UndefOr[String] = js.native
  @JSName("$t")
  def $t(key: String, defaultValue: String, options: js.Any): js.UndefOr[String] = js.native
  @JSName("$t")
  def $t(key: String, defaultValue: String, options: js.Any, pluralization: Double): js.UndefOr[String] = js.native
  @JSName("$t")
  def $t(key: String, options: js.UndefOr[scala.Nothing], pluralization: Double): js.UndefOr[String] = js.native
  @JSName("$t")
  def $t(key: String, options: js.Any): js.UndefOr[String] = js.native
  @JSName("$t")
  def $t(key: String, options: js.Any, pluralization: Double): js.UndefOr[String] = js.native
}
