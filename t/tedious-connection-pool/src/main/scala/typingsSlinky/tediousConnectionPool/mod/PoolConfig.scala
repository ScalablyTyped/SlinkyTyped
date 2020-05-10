package typingsSlinky.tediousConnectionPool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Pool Configuration interface
  */
@js.native
trait PoolConfig extends js.Object {
  /**
    * Acquire timeout
    */
  var acquireTimeout: js.UndefOr[Double] = js.native
  /**
    * Idle timeout
    */
  var idleTimeout: js.UndefOr[Double] = js.native
  /**
    * Defines if logging is activated
    */
  var log: js.UndefOr[Boolean] = js.native
  /**
    * Maximum concurrent connections
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Minimum concurrent connections
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Retry delay
    */
  var retryDelay: js.UndefOr[Double] = js.native
}

object PoolConfig {
  @scala.inline
  def apply(): PoolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolConfig]
  }
  @scala.inline
  implicit class PoolConfigOps[Self <: PoolConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcquireTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquireTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcquireTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquireTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withIdleTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdleTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
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
    def withRetryDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelay")(js.undefined)
        ret
    }
  }
  
}

