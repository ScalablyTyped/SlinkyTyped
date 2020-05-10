package typingsSlinky.stormReactDiagrams.selectionModelMod

import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseListener
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModel
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionModel extends js.Object {
  var initialX: Double = js.native
  var initialY: Double = js.native
  var model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener] = js.native
}

object SelectionModel {
  @scala.inline
  def apply(
    initialX: Double,
    initialY: Double,
    model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]
  ): SelectionModel = {
    val __obj = js.Dynamic.literal(initialX = initialX.asInstanceOf[js.Any], initialY = initialY.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionModel]
  }
  @scala.inline
  implicit class SelectionModelOps[Self <: SelectionModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

