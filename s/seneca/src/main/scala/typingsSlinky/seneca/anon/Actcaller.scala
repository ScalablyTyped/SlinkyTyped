package typingsSlinky.seneca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actcaller extends js.Object {
  // Trace action caller and place in args.caller$.
  var act_caller: js.UndefOr[Boolean] = js.native
  // Record and log callpoints (calling code locations).
  var callpoint: js.UndefOr[Boolean] = js.native
  // Throw (some) errors from seneca.act.
  var fragile: js.UndefOr[Boolean] = js.native
  // Print debug info to console
  var print: js.UndefOr[Options] = js.native
  // Shorten all identifiers to 2 characters.
  var short_logs: js.UndefOr[Boolean] = js.native
  // Fatal errors ... aren't fatal. Not for production!
  var undead: js.UndefOr[Boolean] = js.native
}

object Actcaller {
  @scala.inline
  def apply(): Actcaller = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actcaller]
  }
  @scala.inline
  implicit class ActcallerOps[Self <: Actcaller] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAct_caller(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("act_caller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAct_caller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("act_caller")(js.undefined)
        ret
    }
    @scala.inline
    def withCallpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withFragile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragile")(js.undefined)
        ret
    }
    @scala.inline
    def withPrint(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.undefined)
        ret
    }
    @scala.inline
    def withShort_logs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short_logs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShort_logs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short_logs")(js.undefined)
        ret
    }
    @scala.inline
    def withUndead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undead")(js.undefined)
        ret
    }
  }
  
}

