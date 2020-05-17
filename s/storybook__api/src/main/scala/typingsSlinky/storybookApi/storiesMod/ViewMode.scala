package typingsSlinky.storybookApi.storiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.storybookApi.storybookApiStrings.story
  - typingsSlinky.storybookApi.storybookApiStrings.info
  - typingsSlinky.storybookApi.storybookApiStrings.settings
  - js.UndefOr[scala.Nothing]
*/
trait ViewMode extends js.Object

object ViewMode {
  @scala.inline
  def story: typingsSlinky.storybookApi.storybookApiStrings.story = "story".asInstanceOf[typingsSlinky.storybookApi.storybookApiStrings.story]
  @scala.inline
  def info: typingsSlinky.storybookApi.storybookApiStrings.info = "info".asInstanceOf[typingsSlinky.storybookApi.storybookApiStrings.info]
  @scala.inline
  def settings: typingsSlinky.storybookApi.storybookApiStrings.settings = "settings".asInstanceOf[typingsSlinky.storybookApi.storybookApiStrings.settings]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ViewMode): ViewMode = value.asInstanceOf[ViewMode]
}

