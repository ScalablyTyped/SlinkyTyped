package typingsSlinky.vuePropertyDecorator.mod

import typingsSlinky.vueClassComponent.declarationsMod.VueClass
import typingsSlinky.vueClassComponent.utilMod.MixedVueClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-property-decorator", "Mixins")
@js.native
object Mixins extends js.Object {
  
  def apply[A](CtorA: VueClass[A]): VueClass[A] = js.native
  def apply[T /* <: js.Array[VueClass[typingsSlinky.vue.vueMod.Vue]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param Ctors because its type T is not an array type */ Ctors: T
  ): MixedVueClass[T] = js.native
  def apply[T](Ctors: VueClass[typingsSlinky.vue.vueMod.Vue]*): VueClass[T] = js.native
  def apply[A, B](CtorA: VueClass[A], CtorB: VueClass[B]): VueClass[A with B] = js.native
  def apply[A, B, C](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C]): VueClass[A with B with C] = js.native
  def apply[A, B, C, D](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C], CtorD: VueClass[D]): VueClass[A with B with C with D] = js.native
  def apply[A, B, C, D, E](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C], CtorD: VueClass[D], CtorE: VueClass[E]): VueClass[A with B with C with D with E] = js.native
}
