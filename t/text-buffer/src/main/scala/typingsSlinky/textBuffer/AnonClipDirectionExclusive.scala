package typingsSlinky.textBuffer

import typingsSlinky.textBuffer.textBufferStrings.backward
import typingsSlinky.textBuffer.textBufferStrings.closest
import typingsSlinky.textBuffer.textBufferStrings.forward
import typingsSlinky.textBuffer.textBufferStrings.inside
import typingsSlinky.textBuffer.textBufferStrings.never
import typingsSlinky.textBuffer.textBufferStrings.overlap
import typingsSlinky.textBuffer.textBufferStrings.surround
import typingsSlinky.textBuffer.textBufferStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClipDirectionExclusive extends js.Object {
  var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object AnonClipDirectionExclusive {
  @scala.inline
  def apply(
    clipDirection: backward | forward | closest = null,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    invalidate: never | surround | overlap | inside | touch = null,
    reversed: js.UndefOr[Boolean] = js.undefined
  ): AnonClipDirectionExclusive = {
    val __obj = js.Dynamic.literal()
    if (clipDirection != null) __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClipDirectionExclusive]
  }
}

