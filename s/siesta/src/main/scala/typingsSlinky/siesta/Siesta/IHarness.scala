package typingsSlinky.siesta.Siesta

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @abstract
  */
@js.native
trait IHarness extends js.Object {
  var alsoPreload: js.Array[_] = js.native
  var autoCheckGlobals: Boolean = js.native
  var cachePreload: Boolean = js.native
  var defaultTimeout: Boolean = js.native
  var disableColoring: Boolean = js.native
  var expectedGlobals: js.Array[String] = js.native
  var isReadyTimeout: Double = js.native
  var keepNLastResults: Double = js.native
  var keepResults: Boolean = js.native
  var listenters: StringDictionary[js.Function2[/* event */ Event, /* repeated */ js.Any, Unit]] = js.native
  var maxThreads: Double = js.native
  var needDone: Boolean = js.native
  var overrideSetTimeout: Boolean = js.native
  var pauseBetweenTests: Double = js.native
  var preload: js.Array[_] = js.native
  var runCore: String = js.native
  var subTestTimeout: Double = js.native
  var testClass: ITest = js.native
  var title: String = js.native
  var transparentEx: Boolean = js.native
  var waitForTimeout: Double = js.native
  def configure(config: js.Any): Unit = js.native
  def start(descriptors: js.Any*): Unit = js.native
}

object IHarness {
  @scala.inline
  def apply(
    alsoPreload: js.Array[_],
    autoCheckGlobals: Boolean,
    cachePreload: Boolean,
    configure: js.Any => Unit,
    defaultTimeout: Boolean,
    disableColoring: Boolean,
    expectedGlobals: js.Array[String],
    isReadyTimeout: Double,
    keepNLastResults: Double,
    keepResults: Boolean,
    listenters: StringDictionary[js.Function2[/* event */ Event, /* repeated */ js.Any, Unit]],
    maxThreads: Double,
    needDone: Boolean,
    overrideSetTimeout: Boolean,
    pauseBetweenTests: Double,
    preload: js.Array[_],
    runCore: String,
    start: /* repeated */ js.Any => Unit,
    subTestTimeout: Double,
    testClass: ITest,
    title: String,
    transparentEx: Boolean,
    waitForTimeout: Double
  ): IHarness = {
    val __obj = js.Dynamic.literal(alsoPreload = alsoPreload.asInstanceOf[js.Any], autoCheckGlobals = autoCheckGlobals.asInstanceOf[js.Any], cachePreload = cachePreload.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), defaultTimeout = defaultTimeout.asInstanceOf[js.Any], disableColoring = disableColoring.asInstanceOf[js.Any], expectedGlobals = expectedGlobals.asInstanceOf[js.Any], isReadyTimeout = isReadyTimeout.asInstanceOf[js.Any], keepNLastResults = keepNLastResults.asInstanceOf[js.Any], keepResults = keepResults.asInstanceOf[js.Any], listenters = listenters.asInstanceOf[js.Any], maxThreads = maxThreads.asInstanceOf[js.Any], needDone = needDone.asInstanceOf[js.Any], overrideSetTimeout = overrideSetTimeout.asInstanceOf[js.Any], pauseBetweenTests = pauseBetweenTests.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], runCore = runCore.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), subTestTimeout = subTestTimeout.asInstanceOf[js.Any], testClass = testClass.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transparentEx = transparentEx.asInstanceOf[js.Any], waitForTimeout = waitForTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHarness]
  }
  @scala.inline
  implicit class IHarnessOps[Self <: IHarness] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlsoPreload(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alsoPreload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoCheckGlobals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCheckGlobals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCachePreload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePreload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigure(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDefaultTimeout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableColoring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableColoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpectedGlobals(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedGlobals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReadyTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadyTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepNLastResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepNLastResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListenters(value: StringDictionary[js.Function2[/* event */ Event, /* repeated */ js.Any, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxThreads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxThreads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrideSetTimeout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideSetTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPauseBetweenTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseBetweenTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreload(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunCore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runCore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubTestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTestTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestClass(value: ITest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparentEx(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparentEx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitForTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForTimeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

