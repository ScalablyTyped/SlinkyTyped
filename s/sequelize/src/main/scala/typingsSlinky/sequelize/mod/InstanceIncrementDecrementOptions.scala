package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Instance
// ~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/instance.js
//
/**
  * Options used for Instance.increment method
  */
@js.native
trait InstanceIncrementDecrementOptions extends js.Object {
  /**
    * The number to increment by
    *
    * Defaults to 1
    */
  var by: js.UndefOr[Double] = js.native
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.native
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.native
  /**
    * A hash of attributes to describe your search. See above for examples.
    */
  var where: js.UndefOr[AnyWhereOptions | (js.Array[col | and | or | String])] = js.native
}

object InstanceIncrementDecrementOptions {
  @scala.inline
  def apply(): InstanceIncrementDecrementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIncrementDecrementOptions]
  }
  @scala.inline
  implicit class InstanceIncrementDecrementOptionsOps[Self <: InstanceIncrementDecrementOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("by")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: Boolean | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction(value: Transaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.undefined)
        ret
    }
    @scala.inline
    def withWhere(value: AnyWhereOptions | (js.Array[col | and | or | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.undefined)
        ret
    }
  }
  
}

