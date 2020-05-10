package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInvalidPath extends js.Object {
  var invalidPath: Double = js.native
  var mergeContentNotFound: Double = js.native
  var none: Double = js.native
  var otherError: Double = js.native
  var pathInUse: Double = js.native
  var unknownAction: Double = js.native
  var unknownMergeType: Double = js.native
}

object AnonInvalidPath {
  @scala.inline
  def apply(
    invalidPath: Double,
    mergeContentNotFound: Double,
    none: Double,
    otherError: Double,
    pathInUse: Double,
    unknownAction: Double,
    unknownMergeType: Double
  ): AnonInvalidPath = {
    val __obj = js.Dynamic.literal(invalidPath = invalidPath.asInstanceOf[js.Any], mergeContentNotFound = mergeContentNotFound.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], otherError = otherError.asInstanceOf[js.Any], pathInUse = pathInUse.asInstanceOf[js.Any], unknownAction = unknownAction.asInstanceOf[js.Any], unknownMergeType = unknownMergeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInvalidPath]
  }
  @scala.inline
  implicit class AnonInvalidPathOps[Self <: AnonInvalidPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidPath(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeContentNotFound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeContentNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathInUse(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathInUse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknownAction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknownMergeType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownMergeType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

