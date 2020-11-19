package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewScope extends js.Object
@JSGlobal("SP.ViewScope")
@js.native
object ViewScope extends js.Object {
  
  @js.native
  sealed trait defaultValue extends ViewScope
  
  @js.native
  sealed trait filesOnly extends ViewScope
  
  @js.native
  sealed trait recursive extends ViewScope
  
  @js.native
  sealed trait recursiveAll extends ViewScope
}
