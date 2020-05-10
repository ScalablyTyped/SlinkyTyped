package typingsSlinky.webdriverio.WebdriverIO

import typingsSlinky.webdriver.WebDriver.DesiredCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof std.Pick<webdriverio.WebdriverIO.HookFunctions, 'onPrepare' | 'onComplete' | 'before' | 'after' | 'beforeSession' | 'afterSession'> ]: webdriverio.WebdriverIO.HookFunctions[K] | std.Array<webdriverio.WebdriverIO.HookFunctions[K]>} */
@js.native
trait HooksArray extends js.Object {
  var after: js.UndefOr[
    (js.Function3[
      /* result */ Double, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function3[
          /* result */ Double, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ])
  ] = js.native
  var afterSession: js.UndefOr[
    (js.Function3[
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function3[
          /* config */ Config, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ])
  ] = js.native
  var before: js.UndefOr[
    (js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
      ]
    ])
  ] = js.native
  var beforeSession: js.UndefOr[
    (js.Function3[
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function3[
          /* config */ Config, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ])
  ] = js.native
  var onComplete: js.UndefOr[
    (js.Function4[
      /* exitCode */ Double, 
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* results */ Results, 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function4[
          /* exitCode */ Double, 
          /* config */ Config, 
          /* capabilities */ DesiredCapabilities, 
          /* results */ Results, 
          Unit
        ]
      ]
    ])
  ] = js.native
  var onPrepare: js.UndefOr[
    (js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]
      ]
    ])
  ] = js.native
}

object HooksArray {
  @scala.inline
  def apply(): HooksArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HooksArray]
  }
  @scala.inline
  implicit class HooksArrayOps[Self <: HooksArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterFunction3(
      value: (/* result */ Double, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAfter(
      value: (js.Function3[
          /* result */ Double, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]) | (js.Array[
          js.UndefOr[
            js.Function3[
              /* result */ Double, 
              /* capabilities */ DesiredCapabilities, 
              /* specs */ js.Array[String], 
              Unit
            ]
          ]
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSessionFunction3(
      value: (/* config */ Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSession")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAfterSession(
      value: (js.Function3[
          /* config */ Config, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]) | (js.Array[
          js.UndefOr[
            js.Function3[
              /* config */ Config, 
              /* capabilities */ DesiredCapabilities, 
              /* specs */ js.Array[String], 
              Unit
            ]
          ]
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSession")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeFunction2(value: (/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBefore(
      value: (js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
          js.UndefOr[
            js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
          ]
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSessionFunction3(
      value: (/* config */ Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSession")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withBeforeSession(
      value: (js.Function3[
          /* config */ Config, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]) | (js.Array[
          js.UndefOr[
            js.Function3[
              /* config */ Config, 
              /* capabilities */ DesiredCapabilities, 
              /* specs */ js.Array[String], 
              Unit
            ]
          ]
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSession")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompleteFunction4(
      value: (/* exitCode */ Double, /* config */ Config, /* capabilities */ DesiredCapabilities, /* results */ Results) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnComplete(
      value: (js.Function4[
          /* exitCode */ Double, 
          /* config */ Config, 
          /* capabilities */ DesiredCapabilities, 
          /* results */ Results, 
          Unit
        ]) | (js.Array[
          js.UndefOr[
            js.Function4[
              /* exitCode */ Double, 
              /* config */ Config, 
              /* capabilities */ DesiredCapabilities, 
              /* results */ Results, 
              Unit
            ]
          ]
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrepareFunction2(value: (/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrepare")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnPrepare(
      value: (js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]) | (js.Array[
          js.UndefOr[
            js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]
          ]
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrepare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPrepare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrepare")(js.undefined)
        ret
    }
  }
  
}

