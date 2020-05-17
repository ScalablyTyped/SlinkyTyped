package typingsSlinky.useSidecar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Importer[T] = js.Function0[
    js.Promise[
      typingsSlinky.useSidecar.typesMod.DefaultOrNot[slinky.core.ReactComponentClass[T]]
    ]
  ]
  type MediumCallback[T] = js.Function1[/* data */ T, js.Any]
  type MiddlewareCallback[T] = js.Function2[/* data */ T, /* assigned */ scala.Boolean, T]
  type SideCarComponent[T] = slinky.core.ReactComponentClass[T with typingsSlinky.useSidecar.typesMod.SideCarHOC]
  type SideCarMedium = typingsSlinky.useSidecar.typesMod.SideMedium[slinky.core.ReactComponentClass[js.Object]]
  type removeCb = js.Function0[scala.Unit]
}
