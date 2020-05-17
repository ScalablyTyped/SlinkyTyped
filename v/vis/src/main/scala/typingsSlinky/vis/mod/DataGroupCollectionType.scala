package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.vis.mod.DataGroup]
  - typingsSlinky.vis.mod.DataSet[typingsSlinky.vis.mod.DataGroup]
  - typingsSlinky.vis.mod.DataView[typingsSlinky.vis.mod.DataGroup]
*/
trait DataGroupCollectionType extends js.Object

object DataGroupCollectionType {
  @scala.inline
  implicit def apply(value: js.Array[DataGroup]): DataGroupCollectionType = value.asInstanceOf[DataGroupCollectionType]
  @scala.inline
  implicit def apply(value: DataSet[DataGroup]): DataGroupCollectionType = value.asInstanceOf[DataGroupCollectionType]
  @scala.inline
  implicit def apply(value: DataView[DataGroup]): DataGroupCollectionType = value.asInstanceOf[DataGroupCollectionType]
}

