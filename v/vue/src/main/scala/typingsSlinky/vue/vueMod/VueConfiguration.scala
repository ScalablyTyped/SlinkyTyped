package typingsSlinky.vue.vueMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueConfiguration extends js.Object {
  var async: Boolean
  var devtools: Boolean
  var ignoredElements: js.Array[String | js.RegExp]
  var keyCodes: StringDictionary[Double | js.Array[Double]]
  var optionMergeStrategies: js.Any
  var performance: Boolean
  var productionTip: Boolean
  var silent: Boolean
  def errorHandler(err: js.Error, vm: Vue, info: String): Unit
  def warnHandler(msg: String, vm: Vue, trace: String): Unit
}

object VueConfiguration {
  @scala.inline
  def apply(
    async: Boolean,
    devtools: Boolean,
    errorHandler: (js.Error, Vue, String) => Unit,
    ignoredElements: js.Array[String | js.RegExp],
    keyCodes: StringDictionary[Double | js.Array[Double]],
    optionMergeStrategies: js.Any,
    performance: Boolean,
    productionTip: Boolean,
    silent: Boolean,
    warnHandler: (String, Vue, String) => Unit
  ): VueConfiguration = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], devtools = devtools.asInstanceOf[js.Any], errorHandler = js.Any.fromFunction3(errorHandler), ignoredElements = ignoredElements.asInstanceOf[js.Any], keyCodes = keyCodes.asInstanceOf[js.Any], optionMergeStrategies = optionMergeStrategies.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], productionTip = productionTip.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], warnHandler = js.Any.fromFunction3(warnHandler))
    __obj.asInstanceOf[VueConfiguration]
  }
  @scala.inline
  implicit class VueConfigurationOps[Self <: VueConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevtools(value: Boolean): Self = this.set("devtools", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorHandler(value: (js.Error, Vue, String) => Unit): Self = this.set("errorHandler", js.Any.fromFunction3(value))
    @scala.inline
    def setIgnoredElementsVarargs(value: (String | js.RegExp)*): Self = this.set("ignoredElements", js.Array(value :_*))
    @scala.inline
    def setIgnoredElements(value: js.Array[String | js.RegExp]): Self = this.set("ignoredElements", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyCodes(value: StringDictionary[Double | js.Array[Double]]): Self = this.set("keyCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionMergeStrategies(value: js.Any): Self = this.set("optionMergeStrategies", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductionTip(value: Boolean): Self = this.set("productionTip", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarnHandler(value: (String, Vue, String) => Unit): Self = this.set("warnHandler", js.Any.fromFunction3(value))
  }
  
}

