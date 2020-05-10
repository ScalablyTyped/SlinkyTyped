package typingsSlinky.siesta.Siesta.Harness

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.siesta.Siesta.IHarness
import typingsSlinky.siesta.Siesta.ITest
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @singleton
  */
@js.native
trait IBrowser extends IHarness {
  var autoRun: Boolean = js.native
  var autoScrollElementsIntoView: Boolean = js.native
  var breakOnFail: Boolean = js.native
  var coverageUnit: String = js.native
  var disableCaching: Boolean = js.native
  var enableCodeCoverage: Boolean = js.native
  var excludeCoverageUnits: js.RegExp = js.native
  var hostPageUrl: String = js.native
  var includeCoverageUnits: js.RegExp = js.native
  var maintainViewportSize: Boolean = js.native
  var separateContext: Boolean = js.native
  var simulateEventsWith: String = js.native
  var speedRun: Boolean = js.native
  var useStrictMode: Boolean = js.native
  var viewDOM: Boolean = js.native
  var viewportHeight: Double = js.native
  var viewportWidth: Double = js.native
}

object IBrowser {
  @scala.inline
  def apply(
    alsoPreload: js.Array[_],
    autoCheckGlobals: Boolean,
    autoRun: Boolean,
    autoScrollElementsIntoView: Boolean,
    breakOnFail: Boolean,
    cachePreload: Boolean,
    configure: js.Any => Unit,
    coverageUnit: String,
    defaultTimeout: Boolean,
    disableCaching: Boolean,
    disableColoring: Boolean,
    enableCodeCoverage: Boolean,
    excludeCoverageUnits: js.RegExp,
    expectedGlobals: js.Array[String],
    hostPageUrl: String,
    includeCoverageUnits: js.RegExp,
    isReadyTimeout: Double,
    keepNLastResults: Double,
    keepResults: Boolean,
    listenters: StringDictionary[js.Function2[/* event */ Event_, /* repeated */ js.Any, Unit]],
    maintainViewportSize: Boolean,
    maxThreads: Double,
    needDone: Boolean,
    overrideSetTimeout: Boolean,
    pauseBetweenTests: Double,
    preload: js.Array[_],
    runCore: String,
    separateContext: Boolean,
    simulateEventsWith: String,
    speedRun: Boolean,
    start: /* repeated */ js.Any => Unit,
    subTestTimeout: Double,
    testClass: ITest,
    title: String,
    transparentEx: Boolean,
    useStrictMode: Boolean,
    viewDOM: Boolean,
    viewportHeight: Double,
    viewportWidth: Double,
    waitForTimeout: Double
  ): IBrowser = {
    val __obj = js.Dynamic.literal(alsoPreload = alsoPreload.asInstanceOf[js.Any], autoCheckGlobals = autoCheckGlobals.asInstanceOf[js.Any], autoRun = autoRun.asInstanceOf[js.Any], autoScrollElementsIntoView = autoScrollElementsIntoView.asInstanceOf[js.Any], breakOnFail = breakOnFail.asInstanceOf[js.Any], cachePreload = cachePreload.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), coverageUnit = coverageUnit.asInstanceOf[js.Any], defaultTimeout = defaultTimeout.asInstanceOf[js.Any], disableCaching = disableCaching.asInstanceOf[js.Any], disableColoring = disableColoring.asInstanceOf[js.Any], enableCodeCoverage = enableCodeCoverage.asInstanceOf[js.Any], excludeCoverageUnits = excludeCoverageUnits.asInstanceOf[js.Any], expectedGlobals = expectedGlobals.asInstanceOf[js.Any], hostPageUrl = hostPageUrl.asInstanceOf[js.Any], includeCoverageUnits = includeCoverageUnits.asInstanceOf[js.Any], isReadyTimeout = isReadyTimeout.asInstanceOf[js.Any], keepNLastResults = keepNLastResults.asInstanceOf[js.Any], keepResults = keepResults.asInstanceOf[js.Any], listenters = listenters.asInstanceOf[js.Any], maintainViewportSize = maintainViewportSize.asInstanceOf[js.Any], maxThreads = maxThreads.asInstanceOf[js.Any], needDone = needDone.asInstanceOf[js.Any], overrideSetTimeout = overrideSetTimeout.asInstanceOf[js.Any], pauseBetweenTests = pauseBetweenTests.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], runCore = runCore.asInstanceOf[js.Any], separateContext = separateContext.asInstanceOf[js.Any], simulateEventsWith = simulateEventsWith.asInstanceOf[js.Any], speedRun = speedRun.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), subTestTimeout = subTestTimeout.asInstanceOf[js.Any], testClass = testClass.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transparentEx = transparentEx.asInstanceOf[js.Any], useStrictMode = useStrictMode.asInstanceOf[js.Any], viewDOM = viewDOM.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForTimeout = waitForTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrowser]
  }
  @scala.inline
  implicit class IBrowserOps[Self <: IBrowser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoScrollElementsIntoView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollElementsIntoView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreakOnFail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakOnFail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoverageUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableCaching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCaching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableCodeCoverage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCodeCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludeCoverageUnits(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeCoverageUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostPageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeCoverageUnits(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCoverageUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaintainViewportSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainViewportSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparateContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separateContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSimulateEventsWith(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulateEventsWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeedRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseStrictMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStrictMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewDOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewDOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

