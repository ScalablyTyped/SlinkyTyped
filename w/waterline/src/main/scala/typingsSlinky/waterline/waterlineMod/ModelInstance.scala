package typingsSlinky.waterline.waterlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelInstance extends js.Object {
  var createdAt: js.UndefOr[js.Date] = js.undefined
  var id: js.UndefOr[Double | String] = js.undefined
  var updatedAt: js.UndefOr[js.Date] = js.undefined
  def save(): WaterlinePromise[this.type]
  def toJSON(): js.Any
}

object ModelInstance {
  @scala.inline
  def apply(
    save: () => WaterlinePromise[ModelInstance],
    toJSON: () => js.Any,
    createdAt: js.Date = null,
    id: Double | String = null,
    updatedAt: js.Date = null
  ): ModelInstance = {
    val __obj = js.Dynamic.literal(save = js.Any.fromFunction0(save), toJSON = js.Any.fromFunction0(toJSON))
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelInstance]
  }
}

