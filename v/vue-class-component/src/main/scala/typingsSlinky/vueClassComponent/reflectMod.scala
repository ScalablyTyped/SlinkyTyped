package typingsSlinky.vueClassComponent

import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import typingsSlinky.vueClassComponent.declarationsMod.VueClass
import typingsSlinky.vueClassComponent.vueClassComponentBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-class-component/lib/reflect", JSImport.Namespace)
@js.native
object reflectMod extends js.Object {
  
  def copyReflectionMetadata(to: VueConstructor[Vue], from: VueClass[Vue]): Unit = js.native
  
  def reflectionIsSupported(): `false` | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Reflect.getOwnMetadataKeys */ js.Any) = js.native
}
