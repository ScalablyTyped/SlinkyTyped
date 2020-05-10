package typingsSlinky.webdriverio.WebdriverIO

import typingsSlinky.webdriverio.AnonDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<webdriverio.WebdriverIO.HookFunctions, 'onPrepare' | 'onComplete' | 'before' | 'after' | 'beforeSession' | 'afterSession'> */
@js.native
trait _Hooks extends js.Object {
  var afterCommand: js.UndefOr[
    js.Function4[
      /* commandName */ String, 
      /* args */ js.Array[_], 
      /* result */ js.Any, 
      /* error */ js.UndefOr[js.Error], 
      Unit
    ]
  ] = js.native
  var afterHook: js.UndefOr[
    js.Function5[
      /* test */ js.Any, 
      /* context */ js.Any, 
      /* result */ AnonDuration, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var afterSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.native
  var afterTest: js.UndefOr[
    js.Function3[/* test */ Test, /* context */ js.Any, /* result */ AnonDuration, Unit]
  ] = js.native
  var beforeCommand: js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[_], Unit]] = js.native
  var beforeHook: js.UndefOr[
    js.Function4[
      /* test */ js.Any, 
      /* context */ js.Any, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var beforeSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.native
  var beforeTest: js.UndefOr[js.Function2[/* test */ Test, /* context */ js.Any, Unit]] = js.native
  var onReload: js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]] = js.native
}

object _Hooks {
  @scala.inline
  def apply(): _Hooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Hooks]
  }
  @scala.inline
  implicit class _HooksOps[Self <: _Hooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterCommand(
      value: (/* commandName */ String, /* args */ js.Array[_], /* result */ js.Any, /* error */ js.UndefOr[js.Error]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCommand")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterHook(
      value: (/* test */ js.Any, /* context */ js.Any, /* result */ AnonDuration, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHook")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAfterHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHook")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSuite(value: /* suite */ Suite => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSuite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSuite")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterTest(value: (/* test */ Test, /* context */ js.Any, /* result */ AnonDuration) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTest")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTest")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCommand(value: (/* commandName */ String, /* args */ js.Array[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCommand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeHook(
      value: (/* test */ js.Any, /* context */ js.Any, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHook")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBeforeHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHook")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSuite(value: /* suite */ Suite => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSuite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSuite")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeTest(value: (/* test */ Test, /* context */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReload(value: (/* oldSessionId */ String, /* newSessionId */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReload")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReload")(js.undefined)
        ret
    }
  }
  
}

