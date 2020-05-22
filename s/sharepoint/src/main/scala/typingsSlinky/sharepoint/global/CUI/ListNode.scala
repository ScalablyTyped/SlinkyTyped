package typingsSlinky.sharepoint.global.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.ListNode")
@js.native
class ListNode[T] protected ()
  extends typingsSlinky.sharepoint.CUI.ListNode[T] {
  def this(
    data: T,
    prev: typingsSlinky.sharepoint.CUI.ListNode[T],
    next: typingsSlinky.sharepoint.CUI.ListNode[T]
  ) = this()
  /* CompleteClass */
  override var data: T = js.native
  /* CompleteClass */
  override var next: typingsSlinky.sharepoint.CUI.ListNode[T] = js.native
  /* CompleteClass */
  override var previous: typingsSlinky.sharepoint.CUI.ListNode[T] = js.native
}

