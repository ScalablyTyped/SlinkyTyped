package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.autosizeMod.AutoSize
import typingsSlinky.vegaTypings.autosizeMod.AutoSizeType
import typingsSlinky.vegaTypings.vegaTypingsStrings.content
import typingsSlinky.vegaTypings.vegaTypingsStrings.padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contains extends AutoSize {
  var contains: js.UndefOr[content | padding] = js.undefined
  var resize: js.UndefOr[Boolean] = js.undefined
  var `type`: AutoSizeType
}

object Contains {
  @scala.inline
  def apply(
    `type`: AutoSizeType,
    contains: content | padding = null,
    resize: js.UndefOr[Boolean] = js.undefined
  ): Contains = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contains]
  }
}

