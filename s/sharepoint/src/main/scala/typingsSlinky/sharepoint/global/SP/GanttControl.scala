package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.GanttControl")
@js.native
class GanttControl ()
  extends typingsSlinky.sharepoint.SP.GanttControl
/* static members */
@JSGlobal("SP.GanttControl")
@js.native
object GanttControl extends js.Object {
  
  var FnGanttCreationCallback: js.Array[js.Function1[/* control */ this.type, Unit]] = js.native
  
  var Instances: js.Array[typingsSlinky.sharepoint.SP.GanttControl] = js.native
  
  def WaitForGanttCreation(callack: js.Function1[/* control */ this.type, Unit]): Unit = js.native
}
