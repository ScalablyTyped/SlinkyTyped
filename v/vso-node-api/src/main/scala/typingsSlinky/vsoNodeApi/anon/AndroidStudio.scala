package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidStudio extends js.Object {
  var androidStudio: scala.Double = js.native
  var appCode: scala.Double = js.native
  var cLion: scala.Double = js.native
  var dataGrip: scala.Double = js.native
  var eclipse: scala.Double = js.native
  var intelliJ: scala.Double = js.native
  var mPS: scala.Double = js.native
  var phpStorm: scala.Double = js.native
  var pyCharm: scala.Double = js.native
  var rubyMine: scala.Double = js.native
  var tower: scala.Double = js.native
  var unknown: scala.Double = js.native
  var visualStudio: scala.Double = js.native
  var webStorm: scala.Double = js.native
}

object AndroidStudio {
  @scala.inline
  def apply(
    androidStudio: scala.Double,
    appCode: scala.Double,
    cLion: scala.Double,
    dataGrip: scala.Double,
    eclipse: scala.Double,
    intelliJ: scala.Double,
    mPS: scala.Double,
    phpStorm: scala.Double,
    pyCharm: scala.Double,
    rubyMine: scala.Double,
    tower: scala.Double,
    unknown: scala.Double,
    visualStudio: scala.Double,
    webStorm: scala.Double
  ): AndroidStudio = {
    val __obj = js.Dynamic.literal(androidStudio = androidStudio.asInstanceOf[js.Any], appCode = appCode.asInstanceOf[js.Any], cLion = cLion.asInstanceOf[js.Any], dataGrip = dataGrip.asInstanceOf[js.Any], eclipse = eclipse.asInstanceOf[js.Any], intelliJ = intelliJ.asInstanceOf[js.Any], mPS = mPS.asInstanceOf[js.Any], phpStorm = phpStorm.asInstanceOf[js.Any], pyCharm = pyCharm.asInstanceOf[js.Any], rubyMine = rubyMine.asInstanceOf[js.Any], tower = tower.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], visualStudio = visualStudio.asInstanceOf[js.Any], webStorm = webStorm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidStudio]
  }
  @scala.inline
  implicit class AndroidStudioOps[Self <: AndroidStudio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidStudio(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidStudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppCode(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLion(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cLion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataGrip(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataGrip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEclipse(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eclipse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntelliJ(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intelliJ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPS(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhpStorm(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phpStorm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPyCharm(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyCharm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRubyMine(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rubyMine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTower(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisualStudio(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualStudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebStorm(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webStorm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

