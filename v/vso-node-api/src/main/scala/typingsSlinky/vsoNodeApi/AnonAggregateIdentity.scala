package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAggregateIdentity extends js.Object {
  var aggregateIdentity: Double = js.native
  var importedIdentity: Double = js.native
  var none: Double = js.native
  var serviceIdentity: Double = js.native
}

object AnonAggregateIdentity {
  @scala.inline
  def apply(aggregateIdentity: Double, importedIdentity: Double, none: Double, serviceIdentity: Double): AnonAggregateIdentity = {
    val __obj = js.Dynamic.literal(aggregateIdentity = aggregateIdentity.asInstanceOf[js.Any], importedIdentity = importedIdentity.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], serviceIdentity = serviceIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAggregateIdentity]
  }
  @scala.inline
  implicit class AnonAggregateIdentityOps[Self <: AnonAggregateIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateIdentity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportedIdentity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importedIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceIdentity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceIdentity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

