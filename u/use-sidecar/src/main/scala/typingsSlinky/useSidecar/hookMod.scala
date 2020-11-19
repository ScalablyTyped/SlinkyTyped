package typingsSlinky.useSidecar

import slinky.core.ReactComponentClass
import typingsSlinky.useSidecar.typesMod.Importer
import typingsSlinky.useSidecar.typesMod.SideMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-sidecar/dist/es5/hook", JSImport.Namespace)
@js.native
object hookMod extends js.Object {
  
  def useSidecar[T](importer: Importer[T]): js.Tuple2[ReactComponentClass[T] | Null, js.Error | Null] = js.native
  def useSidecar[T](importer: Importer[T], effect: SideMedium[_]): js.Tuple2[ReactComponentClass[T] | Null, js.Error | Null] = js.native
}
