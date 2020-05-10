package typingsSlinky.ssf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSFDate extends js.Object {
  /** number of whole days since relevant epoch, 0 <= D */
  var D: Double = js.native
  /** integral number of hours since midnight, 0 <= H < 24 */
  var H: Double = js.native
  /** integral number of minutes since the last hour, 0 <= M < 60 */
  var M: Double = js.native
  /** integral number of seconds since the last minute, 0 <= S < 60 */
  var S: Double = js.native
  /** number of seconds since midnight, 0 <= T < 86400 */
  var T: Double = js.native
  /** integral day portion, subject to gregorian YMD constraints */
  var d: Double = js.native
  /** integral month portion, 1 <= m <= 12 */
  var m: Double = js.native
  /** integral day of week (0=Sunday .. 6=Saturday) 0 <= q <= 6 */
  var q: Double = js.native
  /** sub-second part of time, 0 <= u < 1 */
  var u: Double = js.native
  /** integral year portion, epoch_year <= y */
  var y: Double = js.native
}

object SSFDate {
  @scala.inline
  def apply(
    D: Double,
    H: Double,
    M: Double,
    S: Double,
    T: Double,
    d: Double,
    m: Double,
    q: Double,
    u: Double,
    y: Double
  ): SSFDate = {
    val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], H = H.asInstanceOf[js.Any], M = M.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], T = T.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSFDate]
  }
  @scala.inline
  implicit class SSFDateOps[Self <: SSFDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("T")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withU(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("u")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

