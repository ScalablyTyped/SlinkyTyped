package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.vis.mod.DataItem]
  - typingsSlinky.vis.mod.DataSet[typingsSlinky.vis.mod.DataItem]
  - typingsSlinky.vis.mod.DataView[typingsSlinky.vis.mod.DataItem]
*/
trait DataItemCollectionType extends js.Object

object DataItemCollectionType {
  @scala.inline
  implicit def apply(value: js.Array[DataItem]): DataItemCollectionType = value.asInstanceOf[DataItemCollectionType]
  @scala.inline
  implicit def apply(value: DataSet[DataItem]): DataItemCollectionType = value.asInstanceOf[DataItemCollectionType]
  @scala.inline
  implicit def apply(value: DataView[DataItem]): DataItemCollectionType = value.asInstanceOf[DataItemCollectionType]
}

