package typingsSlinky.storybookApi.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumerProps[S, C] extends js.Object {
  
  def children(d: C | S): ReactElement | Null = js.native
  
  var filter: js.UndefOr[js.Function1[/* combo */ C, S]] = js.native
  
  var pure: js.UndefOr[Boolean] = js.native
}
