package typingsSlinky.yogaLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YogaConfig extends js.Object {
  def isExperimentalFeatureEnabled(feature: YogaExperimentalFeature): Boolean = js.native
  def setExperimentalFeatureEnabled(feature: YogaExperimentalFeature, enabled: Boolean): Unit = js.native
  def setPointScaleFactor(factor: Double): Unit = js.native
}

object YogaConfig {
  @scala.inline
  def apply(
    isExperimentalFeatureEnabled: YogaExperimentalFeature => Boolean,
    setExperimentalFeatureEnabled: (YogaExperimentalFeature, Boolean) => Unit,
    setPointScaleFactor: Double => Unit
  ): YogaConfig = {
    val __obj = js.Dynamic.literal(isExperimentalFeatureEnabled = js.Any.fromFunction1(isExperimentalFeatureEnabled), setExperimentalFeatureEnabled = js.Any.fromFunction2(setExperimentalFeatureEnabled), setPointScaleFactor = js.Any.fromFunction1(setPointScaleFactor))
    __obj.asInstanceOf[YogaConfig]
  }
  @scala.inline
  implicit class YogaConfigOps[Self <: YogaConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsExperimentalFeatureEnabled(value: YogaExperimentalFeature => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExperimentalFeatureEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetExperimentalFeatureEnabled(value: (YogaExperimentalFeature, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExperimentalFeatureEnabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetPointScaleFactor(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPointScaleFactor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

