package typingsSlinky.useSidecar

import slinky.core.ReactComponentClass
import typingsSlinky.useSidecar.typesMod.SideCarHOC
import typingsSlinky.useSidecar.typesMod.SideCarMedium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportsMod {
  
  @JSImport("use-sidecar/dist/es5/exports", "exportSidecar")
  @js.native
  def exportSidecar[T](medium: SideCarMedium, exported: ReactComponentClass[T]): ReactComponentClass[T with SideCarHOC] = js.native
}
