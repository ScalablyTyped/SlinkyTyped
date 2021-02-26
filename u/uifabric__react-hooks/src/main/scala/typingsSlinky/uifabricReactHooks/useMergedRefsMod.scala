package typingsSlinky.uifabricReactHooks

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMergedRefsMod {
  
  @JSImport("@uifabric/react-hooks/lib/useMergedRefs", "useMergedRefs")
  @js.native
  def useMergedRefs[T](refs: js.UndefOr[Ref[T]]*): RefObjectFunction[T] = js.native
  
  type RefObjectFunction[T] = ReactRef[T] with (js.Function1[/* value */ T, Unit])
}
