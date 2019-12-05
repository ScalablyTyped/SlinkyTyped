package typingsSlinky.useDashSidecar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEs5TypesMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.useDashSidecar.Anon_Default

  type DefaultOrNot[T] = Anon_Default[T] | T
  type Importer[T] = js.Function0[js.Promise[DefaultOrNot[ReactComponentClass[T]]]]
  type MediumCallback[T] = js.Function1[/* data */ T, js.Any]
  type MiddlewareCallback[T] = js.Function2[/* data */ T, /* assigned */ Boolean, T]
  type SideCarComponent[T] = ReactComponentClass[T with SideCarHOC]
  type SideCarMedium = SideMedium[ReactComponentClass[js.Object]]
  type removeCb = js.Function0[Unit]
}
