package typingsSlinky.vkOpenapi.vk.OpenAPI.Widgets

import typingsSlinky.vkOpenapi.vk.OpenAPI.NumericBoolean
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`18`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`20`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`22`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`24`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`30`
import typingsSlinky.vkOpenapi.vkOpenapiStrings.button
import typingsSlinky.vkOpenapi.vkOpenapiStrings.full
import typingsSlinky.vkOpenapi.vkOpenapiStrings.mini
import typingsSlinky.vkOpenapi.vkOpenapiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LikeOptions extends js.Object {
  var height: js.UndefOr[`18` | `20` | `22` | `24` | `30`] = js.undefined
  var pageImage: js.UndefOr[String] = js.undefined
  var pageTitle: js.UndefOr[String] = js.undefined
  var pageUrl: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[button | mini | vertical | full] = js.undefined
  var verb: js.UndefOr[NumericBoolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object LikeOptions {
  @scala.inline
  def apply(
    height: `18` | `20` | `22` | `24` | `30` = null,
    pageImage: String = null,
    pageTitle: String = null,
    pageUrl: String = null,
    `type`: button | mini | vertical | full = null,
    verb: NumericBoolean = null,
    width: js.UndefOr[Double] = js.undefined
  ): LikeOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (pageImage != null) __obj.updateDynamic("pageImage")(pageImage.asInstanceOf[js.Any])
    if (pageTitle != null) __obj.updateDynamic("pageTitle")(pageTitle.asInstanceOf[js.Any])
    if (pageUrl != null) __obj.updateDynamic("pageUrl")(pageUrl.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verb != null) __obj.updateDynamic("verb")(verb.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LikeOptions]
  }
}

