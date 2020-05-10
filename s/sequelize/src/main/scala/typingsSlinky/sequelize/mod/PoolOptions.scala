package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Connection Pool options
  *
  * @see Options
  */
@js.native
trait PoolOptions extends js.Object {
  /**
    * The maximum time, in milliseconds, that pool will try to get connection before throwing error
    */
  var acquire: js.UndefOr[Double] = js.native
  /*
    * The time interval, in milliseconds, for evicting stale connections
    */
  var evict: js.UndefOr[Double] = js.native
  /**
    * The maximum time, in milliseconds, that a connection can be idle before being released.
    */
  var idle: js.UndefOr[Double] = js.native
  /**
    * Maximum connections of the pool
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Minimum connections of the pool
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * A function that validates a connection. Called with client. The default function checks that client is an
    * object, and that its state is not disconnected.
    */
  var validate: js.UndefOr[js.Function1[/* client */ js.UndefOr[js.Any], Boolean]] = js.native
}

object PoolOptions {
  @scala.inline
  def apply(): PoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolOptions]
  }
  @scala.inline
  implicit class PoolOptionsOps[Self <: PoolOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcquire(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcquire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquire")(js.undefined)
        ret
    }
    @scala.inline
    def withEvict(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evict")(js.undefined)
        ret
    }
    @scala.inline
    def withIdle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: /* client */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

