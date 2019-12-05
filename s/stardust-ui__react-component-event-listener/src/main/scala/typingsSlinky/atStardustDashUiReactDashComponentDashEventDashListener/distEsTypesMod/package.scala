package typingsSlinky.atStardustDashUiReactDashComponentDashEventDashListener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsTypesMod {
  import org.scalajs.dom.raw.Node
  import org.scalajs.dom.raw.Window
  import slinky.core.facade.ReactRef

  type EventHandler[T /* <: EventTypes */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any, 
    Unit
  ]
  type TargetRef = ReactRef[Node | Window]
}
