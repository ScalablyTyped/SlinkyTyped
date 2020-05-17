package typingsSlinky.webdriverio.WebdriverIO

import typingsSlinky.webdriver.WebDriver.DesiredCapabilities
import typingsSlinky.webdriverio.anon.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookFunctions extends js.Object {
  var after: js.UndefOr[
    js.Function3[
      /* result */ Double, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.native
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
      /* result */ Duration, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var afterSession: js.UndefOr[
    js.Function3[
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.native
  var afterSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.native
  var afterTest: js.UndefOr[js.Function3[/* test */ Test, /* context */ js.Any, /* result */ Duration, Unit]] = js.native
  var before: js.UndefOr[
    js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
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
  var beforeSession: js.UndefOr[
    js.Function3[
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.native
  var beforeSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.native
  var beforeTest: js.UndefOr[js.Function2[/* test */ Test, /* context */ js.Any, Unit]] = js.native
  var onComplete: js.UndefOr[
    js.Function4[
      /* exitCode */ Double, 
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* results */ Results, 
      Unit
    ]
  ] = js.native
  var onPrepare: js.UndefOr[
    js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]
  ] = js.native
  var onReload: js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]] = js.native
}

object HookFunctions {
  @scala.inline
  def apply(): HookFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HookFunctions]
  }
  @scala.inline
  implicit class HookFunctionsOps[Self <: HookFunctions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(
      value: (/* result */ Double, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
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
      value: (/* test */ js.Any, /* context */ js.Any, /* result */ Duration, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit
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
    def withAfterSession(
      value: (/* config */ Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSession")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSession")(js.undefined)
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
    def withAfterTest(value: (/* test */ Test, /* context */ js.Any, /* result */ Duration) => Unit): Self = {
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
    def withBefore(value: (/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
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
    def withBeforeSession(
      value: (/* config */ Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSession")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSession")(js.undefined)
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
    def withOnComplete(
      value: (/* exitCode */ Double, /* config */ Config, /* capabilities */ DesiredCapabilities, /* results */ Results) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrepare(value: (/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrepare")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPrepare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrepare")(js.undefined)
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

