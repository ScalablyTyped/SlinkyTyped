package typingsSlinky.subscribeUiEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type TouchEventCallback[T /* <: typingsSlinky.subscribeUiEvent.mod.TouchEventType */] = js.Function2[
    /* event */ org.scalajs.dom.raw.TouchEvent, 
    /* payload */ typingsSlinky.subscribeUiEvent.mod.ArgmentedEvent[T], 
    js.Any
  ]
  
  type UIEventCallback[T /* <: typingsSlinky.subscribeUiEvent.mod.UIEventType */] = js.Function2[
    /* event */ org.scalajs.dom.raw.UIEvent, 
    /* payload */ typingsSlinky.subscribeUiEvent.mod.ArgmentedEvent[T], 
    js.Any
  ]
}
