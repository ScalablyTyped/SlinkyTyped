package typingsSlinky.slickgrid.Slick.Data

import typingsSlinky.slickgrid.Slick.Group
import typingsSlinky.slickgrid.Slick.GroupTotals
import typingsSlinky.slickgrid.Slick.RowMetadata
import typingsSlinky.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupItemMetadataProvider[T /* <: SlickData */] extends js.Object {
  def destroy(): Unit = js.native
  def getGroupRowMetadata(): RowMetadata[T] = js.native
  def getGroupRowMetadata(item: Group[T]): RowMetadata[T] = js.native
  def getTotalsRowMetadata(): RowMetadata[T] = js.native
  def getTotalsRowMetadata(item: GroupTotals[T]): RowMetadata[T] = js.native
  def init(): Unit = js.native
}

