package typingsSlinky.urql

import typingsSlinky.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("urql/dist/types/hooks/useSource", JSImport.Namespace)
@js.native
object useSourceMod extends js.Object {
  
  def useBehaviourSubject[T](value: T): js.Tuple2[sourceT[T], js.Function1[/* value */ T, Unit]] = js.native
  
  def useSource[T](source: sourceT[T], init: T): T = js.native
}
