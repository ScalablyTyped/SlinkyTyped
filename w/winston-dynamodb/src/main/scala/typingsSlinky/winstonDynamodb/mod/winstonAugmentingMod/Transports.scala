package typingsSlinky.winstonDynamodb.mod.winstonAugmentingMod

import typingsSlinky.winstonDynamodb.mod.DynamoDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transports extends js.Object {
  var DynamoDB: typingsSlinky.winstonDynamodb.mod.DynamoDB = js.native
}

object Transports {
  @scala.inline
  def apply(DynamoDB: DynamoDB): Transports = {
    val __obj = js.Dynamic.literal(DynamoDB = DynamoDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transports]
  }
  @scala.inline
  implicit class TransportsOps[Self <: Transports] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamoDB(value: DynamoDB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamoDB")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

