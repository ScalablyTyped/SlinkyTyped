package typingsSlinky.vue

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vue.typesPluginMod.PluginFunction
import typingsSlinky.vue.typesVueMod.Vue
import typingsSlinky.vue.typesVueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/plugin", JSImport.Namespace)
@js.native
object typesPluginMod extends js.Object {
  @js.native
  trait PluginObject[T]
    extends /* key */ StringDictionary[js.Any] {
    @JSName("install")
    var install_Original: PluginFunction[T] = js.native
    def install(Vue: VueConstructor[Vue]): Unit = js.native
    def install(Vue: VueConstructor[Vue], options: T): Unit = js.native
  }
  
  type PluginFunction[T] = js.Function2[/* Vue */ VueConstructor[Vue], /* options */ js.UndefOr[T], Unit]
}

