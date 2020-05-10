package typingsSlinky.webpackbar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If you plan to provide your own reporter,
  * don't forget to setting fancy and basic options to false to prevent conflicts.
  * A reporter should be instance of a class or plain object and functions for special hooks.
  * It is not necessary to implement all functions, webpackbar only calls those that exists
  */
@js.native
trait Reporter extends js.Object {
  var afterAllDone: js.UndefOr[ReporterContextFunc] = js.native
  /**
    * Called when _all_ compiles finished
    */
  var allDone: js.UndefOr[ReporterContextFunc] = js.native
  var beforeAllDone: js.UndefOr[ReporterContextFunc] = js.native
  /**
    * Called when a file changed on watch mode
    */
  var change: js.UndefOr[ReporterContextFunc] = js.native
  /**
    * Called when compile finished
    */
  var done: js.UndefOr[ReporterContextFunc] = js.native
  /**
    * Called when build progress updated
    */
  var progress: js.UndefOr[ReporterContextFunc] = js.native
  /**
    * Called when (re)compile is started
    */
  var start: js.UndefOr[ReporterContextFunc] = js.native
  /**
    * Called after each progress update
    */
  var update: js.UndefOr[ReporterContextFunc] = js.native
}

object Reporter {
  @scala.inline
  def apply(): Reporter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reporter]
  }
  @scala.inline
  implicit class ReporterOps[Self <: Reporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterAllDone(value: /* context */ WebpackBar => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAllDone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterAllDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAllDone")(js.undefined)
        ret
    }
    @scala.inline
    def withAllDone(value: /* context */ WebpackBar => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAllDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDone")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeAllDone(value: /* context */ WebpackBar => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAllDone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeAllDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAllDone")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* context */ WebpackBar => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withDone(value: /* context */ WebpackBar => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: /* context */ WebpackBar => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* context */ WebpackBar => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: /* context */ WebpackBar => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

