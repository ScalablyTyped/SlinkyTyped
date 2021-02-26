package typingsSlinky.useSidecar

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.useSidecar.anon.PartialIConfig
import typingsSlinky.useSidecar.anon.ReadonlySideCarMedium
import typingsSlinky.useSidecar.renderPropMod.CombinedProps
import typingsSlinky.useSidecar.renderPropMod.Options
import typingsSlinky.useSidecar.renderPropMod.RenderPropComponent
import typingsSlinky.useSidecar.typesMod.Importer
import typingsSlinky.useSidecar.typesMod.MiddlewareCallback
import typingsSlinky.useSidecar.typesMod.SideCarHOC
import typingsSlinky.useSidecar.typesMod.SideCarMedium
import typingsSlinky.useSidecar.typesMod.SideCarMediumOptions
import typingsSlinky.useSidecar.typesMod.SideMedium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-sidecar", "createMedium")
  @js.native
  def createMedium[T](): SideMedium[T] = js.native
  @JSImport("use-sidecar", "createMedium")
  @js.native
  def createMedium[T](defaults: T): SideMedium[T] = js.native
  @JSImport("use-sidecar", "createMedium")
  @js.native
  def createMedium[T](defaults: T, middleware: MiddlewareCallback[T]): SideMedium[T] = js.native
  @JSImport("use-sidecar", "createMedium")
  @js.native
  def createMedium[T](defaults: js.UndefOr[scala.Nothing], middleware: MiddlewareCallback[T]): SideMedium[T] = js.native
  
  @JSImport("use-sidecar", "createSidecarMedium")
  @js.native
  def createSidecarMedium(): ReadonlySideCarMedium = js.native
  @JSImport("use-sidecar", "createSidecarMedium")
  @js.native
  def createSidecarMedium(options: SideCarMediumOptions): ReadonlySideCarMedium = js.native
  
  @JSImport("use-sidecar", "exportSidecar")
  @js.native
  def exportSidecar[T](medium: SideCarMedium, exported: ReactComponentClass[T]): ReactComponentClass[T with SideCarHOC] = js.native
  
  @JSImport("use-sidecar", "renderCar")
  @js.native
  def renderCar[T /* <: js.Array[_] */, K](WrappedComponent: RenderPropComponent[T, K], defaults: js.Function1[/* props */ K, T]): js.Function1[/* props */ CombinedProps[T, K], ReactElement] = js.native
  @JSImport("use-sidecar", "renderCar")
  @js.native
  def renderCar[T /* <: js.Array[_] */, K](
    WrappedComponent: RenderPropComponent[T, K],
    defaults: js.Function1[/* props */ K, T],
    options: Options
  ): js.Function1[/* props */ CombinedProps[T, K], ReactElement] = js.native
  
  @JSImport("use-sidecar", "setConfig")
  @js.native
  def setConfig(conf: PartialIConfig): Unit = js.native
  
  @JSImport("use-sidecar", "sidecar")
  @js.native
  def sidecar[T](importer: Importer[T]): ReactComponentClass[T with SideCarHOC] = js.native
  @JSImport("use-sidecar", "sidecar")
  @js.native
  def sidecar[T](importer: Importer[T], errorComponent: ReactElement): ReactComponentClass[T with SideCarHOC] = js.native
  
  @JSImport("use-sidecar", "useSidecar")
  @js.native
  def useSidecar[T](importer: Importer[T]): js.Tuple2[ReactComponentClass[T] | Null, js.Error | Null] = js.native
  @JSImport("use-sidecar", "useSidecar")
  @js.native
  def useSidecar[T](importer: Importer[T], effect: SideMedium[_]): js.Tuple2[ReactComponentClass[T] | Null, js.Error | Null] = js.native
}
