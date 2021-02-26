package typingsSlinky.useSidecar

import typingsSlinky.useSidecar.anon.ReadonlySideCarMedium
import typingsSlinky.useSidecar.typesMod.MiddlewareCallback
import typingsSlinky.useSidecar.typesMod.SideCarMediumOptions
import typingsSlinky.useSidecar.typesMod.SideMedium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediumMod {
  
  @JSImport("use-sidecar/dist/es5/medium", "createMedium")
  @js.native
  def createMedium[T](): SideMedium[T] = js.native
  @JSImport("use-sidecar/dist/es5/medium", "createMedium")
  @js.native
  def createMedium[T](defaults: T): SideMedium[T] = js.native
  @JSImport("use-sidecar/dist/es5/medium", "createMedium")
  @js.native
  def createMedium[T](defaults: T, middleware: MiddlewareCallback[T]): SideMedium[T] = js.native
  @JSImport("use-sidecar/dist/es5/medium", "createMedium")
  @js.native
  def createMedium[T](defaults: js.UndefOr[scala.Nothing], middleware: MiddlewareCallback[T]): SideMedium[T] = js.native
  
  @JSImport("use-sidecar/dist/es5/medium", "createSidecarMedium")
  @js.native
  def createSidecarMedium(): ReadonlySideCarMedium = js.native
  @JSImport("use-sidecar/dist/es5/medium", "createSidecarMedium")
  @js.native
  def createSidecarMedium(options: SideCarMediumOptions): ReadonlySideCarMedium = js.native
}
