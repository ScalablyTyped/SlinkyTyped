package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidPath extends js.Object {
  var invalidPath: scala.Double = js.native
  var mergeContentNotFound: scala.Double = js.native
  var none: scala.Double = js.native
  var otherError: scala.Double = js.native
  var pathInUse: scala.Double = js.native
  var unknownAction: scala.Double = js.native
  var unknownMergeType: scala.Double = js.native
}

object InvalidPath {
  @scala.inline
  def apply(
    invalidPath: scala.Double,
    mergeContentNotFound: scala.Double,
    none: scala.Double,
    otherError: scala.Double,
    pathInUse: scala.Double,
    unknownAction: scala.Double,
    unknownMergeType: scala.Double
  ): InvalidPath = {
    val __obj = js.Dynamic.literal(invalidPath = invalidPath.asInstanceOf[js.Any], mergeContentNotFound = mergeContentNotFound.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], otherError = otherError.asInstanceOf[js.Any], pathInUse = pathInUse.asInstanceOf[js.Any], unknownAction = unknownAction.asInstanceOf[js.Any], unknownMergeType = unknownMergeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidPath]
  }
  @scala.inline
  implicit class InvalidPathOps[Self <: InvalidPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidPath(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeContentNotFound(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeContentNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherError(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathInUse(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathInUse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknownAction(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknownMergeType(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownMergeType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

