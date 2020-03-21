package typingsSlinky.webpackBlocksUglify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractCommentsObject extends js.Object {
  var banner: js.UndefOr[Boolean | String | FileNameFunction] = js.undefined
  var condition: js.UndefOr[Boolean | String | js.RegExp | ExtractCommentsFunction] = js.undefined
  var filename: js.UndefOr[js.RegExp | FileNameFunction] = js.undefined
}

object ExtractCommentsObject {
  @scala.inline
  def apply(
    banner: Boolean | String | FileNameFunction = null,
    condition: Boolean | String | js.RegExp | ExtractCommentsFunction = null,
    filename: js.RegExp | FileNameFunction = null
  ): ExtractCommentsObject = {
    val __obj = js.Dynamic.literal()
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractCommentsObject]
  }
}

