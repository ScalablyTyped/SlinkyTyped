package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateIdentity extends js.Object {
  var aggregateIdentity: scala.Double = js.native
  var importedIdentity: scala.Double = js.native
  var none: scala.Double = js.native
  var serviceIdentity: scala.Double = js.native
}

object AggregateIdentity {
  @scala.inline
  def apply(
    aggregateIdentity: scala.Double,
    importedIdentity: scala.Double,
    none: scala.Double,
    serviceIdentity: scala.Double
  ): AggregateIdentity = {
    val __obj = js.Dynamic.literal(aggregateIdentity = aggregateIdentity.asInstanceOf[js.Any], importedIdentity = importedIdentity.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], serviceIdentity = serviceIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateIdentity]
  }
  @scala.inline
  implicit class AggregateIdentityOps[Self <: AggregateIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateIdentity(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportedIdentity(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importedIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceIdentity(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceIdentity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

