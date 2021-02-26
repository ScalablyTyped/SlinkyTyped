package typingsSlinky.winrt.Windows.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object WebUI {
  
  type ActivatedEventHandler = js.Function2[
    /* sender */ js.Any, 
    /* eventArgs */ typingsSlinky.winrt.Windows.ApplicationModel.Activation.IActivatedEventArgs, 
    scala.Unit
  ]
  
  type NavigatedEventHandler = js.Function2[
    /* sender */ js.Any, 
    /* e */ typingsSlinky.winrt.Windows.UI.WebUI.IWebUINavigatedEventArgs, 
    scala.Unit
  ]
  
  type ResumingEventHandler = js.Function1[/* sender */ js.Any, scala.Unit]
  
  type SuspendingEventHandler = js.Function2[
    /* sender */ js.Any, 
    /* e */ typingsSlinky.winrt.Windows.ApplicationModel.ISuspendingEventArgs, 
    scala.Unit
  ]
}
