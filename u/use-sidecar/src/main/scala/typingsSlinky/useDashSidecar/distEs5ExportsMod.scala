package typingsSlinky.useDashSidecar

import slinky.core.ReactComponentClass
import typingsSlinky.useDashSidecar.distEs5TypesMod.SideCarHOC
import typingsSlinky.useDashSidecar.distEs5TypesMod.SideCarMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar/dist/es5/exports", JSImport.Namespace)
@js.native
object distEs5ExportsMod extends js.Object {
  def exportSidecar[T](medium: SideCarMedium, exported: ReactComponentClass[T]): ReactComponentClass[T with SideCarHOC] = js.native
}

