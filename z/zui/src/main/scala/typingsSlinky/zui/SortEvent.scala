package typingsSlinky.zui

import typingsSlinky.std.Event
import typingsSlinky.zui.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * sortable
  */
@js.native
trait SortEvent extends Event {
  
  var element: JQuery | js.Object = js.native
  
  var list: js.Array[JQuery | js.Object] = js.native
  
  var sorter: Index = js.native
}
