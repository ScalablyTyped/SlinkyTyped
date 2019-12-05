package typingsSlinky.useDashSidecar

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.std.Partial
import typingsSlinky.useDashSidecar.distEs5ConfigMod.IConfig
import typingsSlinky.useDashSidecar.distEs5RenderPropMod.CombinedProps
import typingsSlinky.useDashSidecar.distEs5RenderPropMod.Options
import typingsSlinky.useDashSidecar.distEs5RenderPropMod.RenderPropComponent
import typingsSlinky.useDashSidecar.distEs5TypesMod.Importer
import typingsSlinky.useDashSidecar.distEs5TypesMod.MiddlewareCallback
import typingsSlinky.useDashSidecar.distEs5TypesMod.SideCarHOC
import typingsSlinky.useDashSidecar.distEs5TypesMod.SideCarMedium
import typingsSlinky.useDashSidecar.distEs5TypesMod.SideCarMediumOptions
import typingsSlinky.useDashSidecar.distEs5TypesMod.SideMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar", JSImport.Namespace)
@js.native
object useDashSidecarMod extends js.Object {
  def createMedium[T](): SideMedium[T] = js.native
  def createMedium[T](defaults: T): SideMedium[T] = js.native
  def createMedium[T](defaults: T, middleware: MiddlewareCallback[T]): SideMedium[T] = js.native
  def createSidecarMedium(): SideCarMedium = js.native
  def createSidecarMedium(options: SideCarMediumOptions): SideCarMedium = js.native
  def exportSidecar[T](medium: SideCarMedium, exported: ReactComponentClass[T]): ReactComponentClass[T with SideCarHOC] = js.native
  def renderCar[T /* <: js.Array[_] */, K](WrappedComponent: RenderPropComponent[T, K], defaults: js.Function1[/* props */ K, T]): js.Function1[/* props */ CombinedProps[T, K], Element] = js.native
  def renderCar[T /* <: js.Array[_] */, K](
    WrappedComponent: RenderPropComponent[T, K],
    defaults: js.Function1[/* props */ K, T],
    options: Options
  ): js.Function1[/* props */ CombinedProps[T, K], Element] = js.native
  def setConfig(conf: Partial[IConfig]): Unit = js.native
  def sidecar[T](importer: Importer[T]): ReactComponentClass[T with SideCarHOC] = js.native
  def sidecar[T](importer: Importer[T], errorComponent: TagMod[Any]): ReactComponentClass[T with SideCarHOC] = js.native
  def useSidecar[T](importer: Importer[T]): js.Tuple2[ReactComponentClass[T] | Null, js.Error | Null] = js.native
  def useSidecar[T](importer: Importer[T], effect: SideMedium[_]): js.Tuple2[ReactComponentClass[T] | Null, js.Error | Null] = js.native
}

