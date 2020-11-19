package typingsSlinky.useSidecar

import slinky.core.ReactComponentClass
import typingsSlinky.useSidecar.typesMod.SideCarHOC
import typingsSlinky.useSidecar.typesMod.SideCarMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-sidecar/dist/es5/exports", JSImport.Namespace)
@js.native
object exportsMod extends js.Object {
  
  def exportSidecar[T](medium: SideCarMedium, exported: ReactComponentClass[T]): ReactComponentClass[T with SideCarHOC] = js.native
}
