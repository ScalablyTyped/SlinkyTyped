package typingsSlinky.tensorflowTfjsConverter.compiledApiMod.TensorInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CooSparse. */
@js.native
trait ICooSparse extends js.Object {
  /** CooSparse denseShapeTensorName */
  var denseShapeTensorName: js.UndefOr[String | Null] = js.native
  /** CooSparse indicesTensorName */
  var indicesTensorName: js.UndefOr[String | Null] = js.native
  /** CooSparse valuesTensorName */
  var valuesTensorName: js.UndefOr[String | Null] = js.native
}

object ICooSparse {
  @scala.inline
  def apply(): ICooSparse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICooSparse]
  }
  @scala.inline
  implicit class ICooSparseOps[Self <: ICooSparse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDenseShapeTensorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("denseShapeTensorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDenseShapeTensorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("denseShapeTensorName")(js.undefined)
        ret
    }
    @scala.inline
    def withDenseShapeTensorNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("denseShapeTensorName")(null)
        ret
    }
    @scala.inline
    def withIndicesTensorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicesTensorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicesTensorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicesTensorName")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicesTensorNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicesTensorName")(null)
        ret
    }
    @scala.inline
    def withValuesTensorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuesTensorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuesTensorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuesTensorName")(js.undefined)
        ret
    }
    @scala.inline
    def withValuesTensorNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuesTensorName")(null)
        ret
    }
  }
  
}

