package typingsSlinky.useDashSidecar

import slinky.core.ReactComponentClass
import typingsSlinky.useDashSidecar.distEs5TypesMod.Importer
import typingsSlinky.useDashSidecar.distEs5TypesMod.SideMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar/dist/es5/hook", JSImport.Namespace)
@js.native
object distEs5HookMod extends js.Object {
  def useSidecar[T](importer: Importer[T]): js.Tuple2[ReactComponentClass[T] | Null, js.Error | Null] = js.native
  def useSidecar[T](importer: Importer[T], effect: SideMedium[_]): js.Tuple2[ReactComponentClass[T] | Null, js.Error | Null] = js.native
}

