package typingsSlinky.typeFest.packageJsonMod.PackageJson

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.typeFest.AnonDictmoduleName
import typingsSlinky.typeFest.typeFestBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonStandardEntryPoints extends js.Object {
  /**
  		A hint to JavaScript bundlers or component tools when packaging modules for client side use.
  		*/
  var browser: js.UndefOr[String | (StringDictionary[String | `false`])] = js.native
  /**
  		A module ID with untranspiled code that is the primary entry point to the program.
  		*/
  var esnext: js.UndefOr[String | AnonDictmoduleName] = js.native
  /**
  		An ECMAScript module ID that is the primary entry point to the program.
  		*/
  var module: js.UndefOr[String] = js.native
}

object NonStandardEntryPoints {
  @scala.inline
  def apply(): NonStandardEntryPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonStandardEntryPoints]
  }
  @scala.inline
  implicit class NonStandardEntryPointsOps[Self <: NonStandardEntryPoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser(value: String | (StringDictionary[String | `false`])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(js.undefined)
        ret
    }
    @scala.inline
    def withEsnext(value: String | AnonDictmoduleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esnext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEsnext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esnext")(js.undefined)
        ret
    }
    @scala.inline
    def withModule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(js.undefined)
        ret
    }
  }
  
}

