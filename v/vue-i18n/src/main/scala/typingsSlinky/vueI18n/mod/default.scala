package typingsSlinky.vueI18n.mod

import typingsSlinky.vue.pluginMod.PluginFunction
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-i18n", JSImport.Default)
@js.native
class default () extends VueI18n {
  def this(options: typingsSlinky.vueI18n.mod.VueI18n.I18nOptions) = this()
}
/* static members */
@JSImport("vue-i18n", JSImport.Default)
@js.native
object default extends js.Object {
  
  var availabilities: typingsSlinky.vueI18n.mod.VueI18n.IntlAvailability = js.native
  
  def install(Vue: VueConstructor[Vue]): Unit = js.native
  def install(Vue: VueConstructor[Vue], options: scala.Nothing): Unit = js.native
  @JSName("install")
  var install_Original: PluginFunction[scala.Nothing] = js.native
  
  var version: String = js.native
}
