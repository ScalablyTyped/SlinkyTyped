package typingsSlinky.typeFest.packageJsonMod.PackageJson

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scripts extends /* scriptName */ StringDictionary[String] {
  /**
  		Run **after** the package is installed.
  		*/
  var install: js.UndefOr[String] = js.native
  /**
  		Run **after** the package is installed and after `install`.
  		*/
  var postinstall: js.UndefOr[String] = js.native
  /**
  		Run **after** the tarball has been generated and moved to its final destination.
  		*/
  var postpack: js.UndefOr[String] = js.native
  /**
  		Run **after** the package is published.
  		*/
  var postpublish: js.UndefOr[String] = js.native
  /**
  		Run with the `npm restart` command, after `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
  		*/
  var postrestart: js.UndefOr[String] = js.native
  /**
  		Run with the `npm start` command, after `start`.
  		*/
  var poststart: js.UndefOr[String] = js.native
  /**
  		Run with the `npm stop` command, after `stop`.
  		*/
  var poststop: js.UndefOr[String] = js.native
  /**
  		Run with the `npm test` command, after `test`.
  		*/
  var posttest: js.UndefOr[String] = js.native
  /**
  		Run **after** the package is uninstalled.
  		*/
  var postuninstall: js.UndefOr[String] = js.native
  /**
  		Run **after** bump the package version.
  		*/
  var postversion: js.UndefOr[String] = js.native
  /**
  		Run **before** the package is installed.
  		*/
  var preinstall: js.UndefOr[String] = js.native
  /**
  		Run **before** a tarball is packed (on `npm pack`, `npm publish`, and when installing git dependencies).
  		*/
  var prepack: js.UndefOr[String] = js.native
  /**
  		Run both **before** the package is packed and published, and on local `npm install` without any arguments. This is run **after** `prepublish`, but **before** `prepublishOnly`.
  		*/
  var prepare: js.UndefOr[String] = js.native
  /**
  		Run **before** the package is published (Also run on local `npm install` without any arguments).
  		*/
  var prepublish: js.UndefOr[String] = js.native
  /**
  		Run **before** the package is prepared and packed, **only** on `npm publish`.
  		*/
  var prepublishOnly: js.UndefOr[String] = js.native
  /**
  		Run with the `npm restart` command, before `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
  		*/
  var prerestart: js.UndefOr[String] = js.native
  /**
  		Run with the `npm start` command, before `start`.
  		*/
  var prestart: js.UndefOr[String] = js.native
  /**
  		Run with the `npm stop` command, before `stop`.
  		*/
  var prestop: js.UndefOr[String] = js.native
  /**
  		Run with the `npm test` command, before `test`.
  		*/
  var pretest: js.UndefOr[String] = js.native
  /**
  		Run **before** the package is uninstalled and before `uninstall`.
  		*/
  var preuninstall: js.UndefOr[String] = js.native
  /**
  		Run **before** bump the package version and before `version`.
  		*/
  var preversion: js.UndefOr[String] = js.native
  /**
  		Run **after** the package is published.
  		*/
  var publish: js.UndefOr[String] = js.native
  /**
  		Run with the `npm restart` command. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
  		*/
  var restart: js.UndefOr[String] = js.native
  /**
  		Run with the `npm start` command.
  		*/
  var start: js.UndefOr[String] = js.native
  /**
  		Run with the `npm stop` command.
  		*/
  var stop: js.UndefOr[String] = js.native
  /**
  		Run with the `npm test` command.
  		*/
  var test: js.UndefOr[String] = js.native
  /**
  		Run **before** the package is uninstalled.
  		*/
  var uninstall: js.UndefOr[String] = js.native
  /**
  		Run **before** bump the package version.
  		*/
  var version: js.UndefOr[String] = js.native
}

object Scripts {
  @scala.inline
  def apply(): Scripts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scripts]
  }
  @scala.inline
  implicit class ScriptsOps[Self <: Scripts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("install")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("install")(js.undefined)
        ret
    }
    @scala.inline
    def withPostinstall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postinstall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostinstall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postinstall")(js.undefined)
        ret
    }
    @scala.inline
    def withPostpack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postpack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostpack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postpack")(js.undefined)
        ret
    }
    @scala.inline
    def withPostpublish(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postpublish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostpublish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postpublish")(js.undefined)
        ret
    }
    @scala.inline
    def withPostrestart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postrestart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostrestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postrestart")(js.undefined)
        ret
    }
    @scala.inline
    def withPoststart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poststart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoststart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poststart")(js.undefined)
        ret
    }
    @scala.inline
    def withPoststop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poststop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoststop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poststop")(js.undefined)
        ret
    }
    @scala.inline
    def withPosttest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posttest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosttest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posttest")(js.undefined)
        ret
    }
    @scala.inline
    def withPostuninstall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postuninstall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostuninstall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postuninstall")(js.undefined)
        ret
    }
    @scala.inline
    def withPostversion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostversion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postversion")(js.undefined)
        ret
    }
    @scala.inline
    def withPreinstall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preinstall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreinstall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preinstall")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepack")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepare(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepublish(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepublish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepublish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepublish")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepublishOnly(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepublishOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepublishOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepublishOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withPrerestart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerestart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrerestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerestart")(js.undefined)
        ret
    }
    @scala.inline
    def withPrestart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prestart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prestart")(js.undefined)
        ret
    }
    @scala.inline
    def withPrestop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prestop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrestop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prestop")(js.undefined)
        ret
    }
    @scala.inline
    def withPretest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPretest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretest")(js.undefined)
        ret
    }
    @scala.inline
    def withPreuninstall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preuninstall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreuninstall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preuninstall")(js.undefined)
        ret
    }
    @scala.inline
    def withPreversion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreversion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preversion")(js.undefined)
        ret
    }
    @scala.inline
    def withPublish(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.undefined)
        ret
    }
    @scala.inline
    def withRestart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
    @scala.inline
    def withTest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
    @scala.inline
    def withUninstall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUninstall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstall")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

