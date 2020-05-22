package typingsSlinky.wordpressComponents.anon

import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`bottom left`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`bottom right`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`top left`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`top right`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.bottom
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Origin extends js.Object {
  var origin: js.UndefOr[top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)] = js.undefined
}

object Origin {
  @scala.inline
  def apply(origin: top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`) = null): Origin = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origin]
  }
}

