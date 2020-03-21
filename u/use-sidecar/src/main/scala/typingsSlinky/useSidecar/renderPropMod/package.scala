package typingsSlinky.useSidecar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object renderPropMod {
  type CombinedProps[T /* <: js.Array[_] */, K] = typingsSlinky.useSidecar.AnonChildren[T] with K
  type RenderPropComponent[T /* <: js.Array[_] */, K] = slinky.core.ReactComponentClass[typingsSlinky.useSidecar.renderPropMod.CombinedProps[T, K]]
}
