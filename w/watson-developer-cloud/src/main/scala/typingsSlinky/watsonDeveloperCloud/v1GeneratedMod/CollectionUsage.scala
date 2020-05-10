package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Summary of the collection usage in the environment. */
@js.native
trait CollectionUsage extends js.Object {
  /** Number of active collections in the environment. */
  var available: js.UndefOr[Double] = js.native
  /** Total number of collections allowed in the environment. */
  var maximum_allowed: js.UndefOr[Double] = js.native
}

object CollectionUsage {
  @scala.inline
  def apply(): CollectionUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionUsage]
  }
  @scala.inline
  implicit class CollectionUsageOps[Self <: CollectionUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum_allowed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum_allowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum_allowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum_allowed")(js.undefined)
        ret
    }
  }
  
}

