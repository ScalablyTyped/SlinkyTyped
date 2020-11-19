package typingsSlinky.stardustUiReactComponentEventListener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type EventHandler[T /* <: typingsSlinky.stardustUiReactComponentEventListener.typesMod.EventTypes */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any, 
    scala.Unit
  ]
  
  type TargetRef = slinky.core.facade.ReactRef[org.scalajs.dom.raw.Node | org.scalajs.dom.raw.Window]
}
