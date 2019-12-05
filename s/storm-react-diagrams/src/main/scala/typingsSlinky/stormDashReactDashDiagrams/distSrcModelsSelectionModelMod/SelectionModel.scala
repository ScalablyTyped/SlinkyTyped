package typingsSlinky.stormDashReactDashDiagrams.distSrcModelsSelectionModelMod

import typingsSlinky.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseEntity
import typingsSlinky.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseListener
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModel
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionModel extends js.Object {
  var initialX: Double
  var initialY: Double
  var model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]
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
}

