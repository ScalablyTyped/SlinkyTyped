package typingsSlinky.useComposedRef

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-composed-ref", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default[T /* <: HTMLElement */](libRef: MutableRefObject[T | Null], userRef: UserRef[T]): js.Function1[/* instance */ T | Null, Unit] = js.native
  
  type UserRef[T] = js.UndefOr[(js.Function1[/* instance */ T | Null, Unit]) | ReactRef[T] | Null]
}
