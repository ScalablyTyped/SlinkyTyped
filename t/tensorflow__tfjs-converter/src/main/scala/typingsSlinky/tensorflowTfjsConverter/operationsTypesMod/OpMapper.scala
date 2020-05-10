package typingsSlinky.tensorflowTfjsConverter.operationsTypesMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpMapper extends js.Object {
  var attrs: js.UndefOr[js.Array[AttrParamMapper]] = js.native
  var category: js.UndefOr[Category] = js.native
  var customExecutor: js.UndefOr[OpExecutor] = js.native
  var inputs: js.UndefOr[js.Array[InputParamMapper]] = js.native
  var tfOpName: String = js.native
}

object OpMapper {
  @scala.inline
  def apply(tfOpName: String): OpMapper = {
    val __obj = js.Dynamic.literal(tfOpName = tfOpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpMapper]
  }
  @scala.inline
  implicit class OpMapperOps[Self <: OpMapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTfOpName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfOpName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrs(value: js.Array[AttrParamMapper]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: Category): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomExecutor(
      value: /* node */ GraphNode => Tensor[Rank] | js.Array[Tensor[Rank]] | (js.Promise[Tensor[Rank] | js.Array[Tensor[Rank]]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customExecutor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomExecutor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customExecutor")(js.undefined)
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[InputParamMapper]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(js.undefined)
        ret
    }
  }
  
}

