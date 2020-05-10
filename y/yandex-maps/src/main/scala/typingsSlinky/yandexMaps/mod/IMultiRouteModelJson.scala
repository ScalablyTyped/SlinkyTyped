package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMultiRouteModelJson extends js.Object {
  var params: IMultiRouteParams = js.native
  var referencePoints: js.Array[IMultiRouteReferencePoint] = js.native
}

object IMultiRouteModelJson {
  @scala.inline
  def apply(params: IMultiRouteParams, referencePoints: js.Array[IMultiRouteReferencePoint]): IMultiRouteModelJson = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], referencePoints = referencePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiRouteModelJson]
  }
  @scala.inline
  implicit class IMultiRouteModelJsonOps[Self <: IMultiRouteModelJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParams(value: IMultiRouteParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferencePoints(value: js.Array[IMultiRouteReferencePoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencePoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

