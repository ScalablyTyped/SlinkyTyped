package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAndroidStudio extends js.Object {
  var androidStudio: Double = js.native
  var appCode: Double = js.native
  var cLion: Double = js.native
  var dataGrip: Double = js.native
  var eclipse: Double = js.native
  var intelliJ: Double = js.native
  var mPS: Double = js.native
  var phpStorm: Double = js.native
  var pyCharm: Double = js.native
  var rubyMine: Double = js.native
  var tower: Double = js.native
  var unknown: Double = js.native
  var visualStudio: Double = js.native
  var webStorm: Double = js.native
}

object AnonAndroidStudio {
  @scala.inline
  def apply(
    androidStudio: Double,
    appCode: Double,
    cLion: Double,
    dataGrip: Double,
    eclipse: Double,
    intelliJ: Double,
    mPS: Double,
    phpStorm: Double,
    pyCharm: Double,
    rubyMine: Double,
    tower: Double,
    unknown: Double,
    visualStudio: Double,
    webStorm: Double
  ): AnonAndroidStudio = {
    val __obj = js.Dynamic.literal(androidStudio = androidStudio.asInstanceOf[js.Any], appCode = appCode.asInstanceOf[js.Any], cLion = cLion.asInstanceOf[js.Any], dataGrip = dataGrip.asInstanceOf[js.Any], eclipse = eclipse.asInstanceOf[js.Any], intelliJ = intelliJ.asInstanceOf[js.Any], mPS = mPS.asInstanceOf[js.Any], phpStorm = phpStorm.asInstanceOf[js.Any], pyCharm = pyCharm.asInstanceOf[js.Any], rubyMine = rubyMine.asInstanceOf[js.Any], tower = tower.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], visualStudio = visualStudio.asInstanceOf[js.Any], webStorm = webStorm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAndroidStudio]
  }
  @scala.inline
  implicit class AnonAndroidStudioOps[Self <: AnonAndroidStudio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidStudio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidStudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cLion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataGrip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataGrip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEclipse(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eclipse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntelliJ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intelliJ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhpStorm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phpStorm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPyCharm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyCharm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRubyMine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rubyMine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTower(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisualStudio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualStudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebStorm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webStorm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

