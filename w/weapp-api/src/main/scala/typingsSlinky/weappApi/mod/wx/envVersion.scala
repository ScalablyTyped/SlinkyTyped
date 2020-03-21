package typingsSlinky.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.weappApi.weappApiStrings.develop
  - typingsSlinky.weappApi.weappApiStrings.trial
  - typingsSlinky.weappApi.weappApiStrings.release
*/
trait envVersion extends js.Object

object envVersion {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def develop: typingsSlinky.weappApi.weappApiStrings.develop = this.cast("develop")
  @scala.inline
  def release: typingsSlinky.weappApi.weappApiStrings.release = this.cast("release")
  @scala.inline
  def trial: typingsSlinky.weappApi.weappApiStrings.trial = this.cast("trial")
}

