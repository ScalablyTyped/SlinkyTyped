package typingsSlinky.uifabricUtilities

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/IComponentAs", JSImport.Namespace)
@js.native
object icomponentasMod extends js.Object {
  type IComponentAs[T] = ReactComponentClass[IComponentAsProps[T]]
  type IComponentAsProps[T] = T with AnonDefaultRender[T]
}

