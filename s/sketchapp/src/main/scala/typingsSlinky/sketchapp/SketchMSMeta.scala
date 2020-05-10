package typingsSlinky.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSMeta extends js.Object {
  var app: String = js.native
  var appVersion: String = js.native
  var autosaved: Double = js.native
  var build: Double = js.native
  var commit: String = js.native
  var compatibilityVersion: Double = js.native
  var created: AnonApp = js.native
  var fonts: js.Array[String] = js.native
  var pagesAndArtboards: SketchMSPagesAndArtboards = js.native
  var saveHistory: js.Array[String] = js.native
  var variant: String = js.native
  var version: Double = js.native
}

object SketchMSMeta {
  @scala.inline
  def apply(
    app: String,
    appVersion: String,
    autosaved: Double,
    build: Double,
    commit: String,
    compatibilityVersion: Double,
    created: AnonApp,
    fonts: js.Array[String],
    pagesAndArtboards: SketchMSPagesAndArtboards,
    saveHistory: js.Array[String],
    variant: String,
    version: Double
  ): SketchMSMeta = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], autosaved = autosaved.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], compatibilityVersion = compatibilityVersion.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], pagesAndArtboards = pagesAndArtboards.asInstanceOf[js.Any], saveHistory = saveHistory.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSMeta]
  }
  @scala.inline
  implicit class SketchMSMetaOps[Self <: SketchMSMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutosaved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosaved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuild(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompatibilityVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibilityVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: AnonApp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFonts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagesAndArtboards(value: SketchMSPagesAndArtboards): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagesAndArtboards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveHistory(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

