package typingsSlinky.tensorflowTfjsData.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerObject[T]
  extends Container[T]
     with /* x */ StringDictionary[ContainerOrT[T]]

object ContainerObject {
  @scala.inline
  def apply[T](): ContainerObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerObject[T]]
  }
}

