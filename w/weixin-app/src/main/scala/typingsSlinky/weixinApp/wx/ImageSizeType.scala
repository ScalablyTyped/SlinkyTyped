package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 媒体API列表
// 媒体-----图片
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.weixinApp.weixinAppStrings.original
  - typingsSlinky.weixinApp.weixinAppStrings.compressed
*/
trait ImageSizeType extends js.Object

object ImageSizeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compressed: typingsSlinky.weixinApp.weixinAppStrings.compressed = this.cast("compressed")
  @scala.inline
  def original: typingsSlinky.weixinApp.weixinAppStrings.original = this.cast("original")
}

