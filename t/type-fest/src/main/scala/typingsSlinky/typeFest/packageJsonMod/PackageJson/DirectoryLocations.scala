package typingsSlinky.typeFest.packageJsonMod.PackageJson

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryLocations
  extends /* key */ StringDictionary[js.Any] {
  /**
  		Location for executable scripts. Sugar to generate entries in the `bin` property by walking the folder.
  		*/
  var bin: js.UndefOr[String] = js.native
  /**
  		Location for Markdown files.
  		*/
  var doc: js.UndefOr[String] = js.native
  /**
  		Location for example scripts.
  		*/
  var example: js.UndefOr[String] = js.native
  /**
  		Location for the bulk of the library.
  		*/
  var lib: js.UndefOr[String] = js.native
  /**
  		Location for man pages. Sugar to generate a `man` array by walking the folder.
  		*/
  var man: js.UndefOr[String] = js.native
  /**
  		Location for test files.
  		*/
  var test: js.UndefOr[String] = js.native
}

object DirectoryLocations {
  @scala.inline
  def apply(): DirectoryLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryLocations]
  }
  @scala.inline
  implicit class DirectoryLocationsOps[Self <: DirectoryLocations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bin")(js.undefined)
        ret
    }
    @scala.inline
    def withDoc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(js.undefined)
        ret
    }
    @scala.inline
    def withExample(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("example")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExample: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("example")(js.undefined)
        ret
    }
    @scala.inline
    def withLib(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lib")(js.undefined)
        ret
    }
    @scala.inline
    def withMan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("man")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("man")(js.undefined)
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
  }
  
}

