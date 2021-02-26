package typingsSlinky.vue

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  type PluginFunction[T] = js.Function2[/* Vue */ VueConstructor[Vue], /* options */ js.UndefOr[T], Unit]
  
  @js.native
  trait PluginObject[T]
    extends /* key */ StringDictionary[js.Any] {
    
    def install(Vue: VueConstructor[Vue]): Unit = js.native
    def install(Vue: VueConstructor[Vue], options: T): Unit = js.native
    @JSName("install")
    var install_Original: PluginFunction[T] = js.native
  }
}
