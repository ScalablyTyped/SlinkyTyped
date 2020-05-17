package typingsSlinky.uifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object icomponentasMod {
  type IComponentAs[T] = slinky.core.ReactComponentClass[typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAsProps[T]]
  type IComponentAsProps[T] = T with typingsSlinky.uifabricUtilities.anon.DefaultRender[T]
}
