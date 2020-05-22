package typingsSlinky.sharepoint.global.CUI

import typingsSlinky.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.List")
@js.native
class List[T] ()
  extends typingsSlinky.sharepoint.CUI.List[T] {
  /* CompleteClass */
  override def add(data: T): scala.Unit = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[T] = js.native
  /* CompleteClass */
  override def getEnumeratorAtPos(): typingsSlinky.sharepoint.CUI.ListEnumerator[T] = js.native
  /* CompleteClass */
  override def get_count(): Double = js.native
  /* CompleteClass */
  override def get_item(index: Double): T = js.native
  /* CompleteClass */
  override def indexOf(data: T): Double = js.native
  /* CompleteClass */
  override def insert(index: Double, data: T): scala.Unit = js.native
  /* CompleteClass */
  override def remove(data: T): scala.Unit = js.native
}

