package typingsSlinky.typesafeDashActions

import typingsSlinky.typesafeDashActions.distTypeDashHelpersMod.ActionBuilderConstructor
import typingsSlinky.typesafeDashActions.distTypeDashHelpersMod.ActionBuilderMap
import typingsSlinky.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/create-standard-action", JSImport.Namespace)
@js.native
object distCreateDashStandardDashActionMod extends js.Object {
  @js.native
  trait ActionBuilder[T /* <: TypeConstant */] extends js.Object {
    def apply[P, M](): ActionBuilderConstructor[T, P, M] = js.native
    def map[R, P, M](fn: js.Function2[/* payload */ P, /* meta */ M, R]): ActionBuilderMap[T, R, P, M] = js.native
  }
  
  def createStandardAction[T /* <: TypeConstant */](`type`: T): ActionBuilder[T] = js.native
}

