package typingsSlinky.useSidecar

import typingsSlinky.useSidecar.anon.ReadonlySideCarMedium
import typingsSlinky.useSidecar.typesMod.MiddlewareCallback
import typingsSlinky.useSidecar.typesMod.SideCarMediumOptions
import typingsSlinky.useSidecar.typesMod.SideMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-sidecar/dist/es5/medium", JSImport.Namespace)
@js.native
object mediumMod extends js.Object {
  
  def createMedium[T](): SideMedium[T] = js.native
  def createMedium[T](defaults: T): SideMedium[T] = js.native
  def createMedium[T](defaults: T, middleware: MiddlewareCallback[T]): SideMedium[T] = js.native
  def createMedium[T](defaults: js.UndefOr[scala.Nothing], middleware: MiddlewareCallback[T]): SideMedium[T] = js.native
  
  def createSidecarMedium(): ReadonlySideCarMedium = js.native
  def createSidecarMedium(options: SideCarMediumOptions): ReadonlySideCarMedium = js.native
}
