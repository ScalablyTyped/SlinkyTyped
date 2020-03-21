package typingsSlinky.useSidecar

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.useSidecar.typesMod.Importer
import typingsSlinky.useSidecar.typesMod.SideCarHOC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar/dist/es5/hoc", JSImport.Namespace)
@js.native
object hocMod extends js.Object {
  def sidecar[T](importer: Importer[T]): ReactComponentClass[T with SideCarHOC] = js.native
  def sidecar[T](importer: Importer[T], errorComponent: TagMod[Any]): ReactComponentClass[T with SideCarHOC] = js.native
}

