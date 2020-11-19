package typingsSlinky.winrt.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Threading {
  
  type TimerDestroyedHandler = js.Function1[
    /* timer */ typingsSlinky.winrt.Windows.System.Threading.ThreadPoolTimer, 
    scala.Unit
  ]
  
  type TimerElapsedHandler = js.Function1[
    /* timer */ typingsSlinky.winrt.Windows.System.Threading.ThreadPoolTimer, 
    scala.Unit
  ]
  
  type WorkItemHandler = js.Function1[/* operation */ typingsSlinky.winrt.Windows.Foundation.IAsyncAction, scala.Unit]
}
