package typingsSlinky.useSidecar

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.useSidecar.typesMod.Importer
import typingsSlinky.useSidecar.typesMod.SideCarHOC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hocMod {
  
  @JSImport("use-sidecar/dist/es5/hoc", "sidecar")
  @js.native
  def sidecar[T](importer: Importer[T]): ReactComponentClass[T with SideCarHOC] = js.native
  @JSImport("use-sidecar/dist/es5/hoc", "sidecar")
  @js.native
  def sidecar[T](importer: Importer[T], errorComponent: ReactElement): ReactComponentClass[T with SideCarHOC] = js.native
}
