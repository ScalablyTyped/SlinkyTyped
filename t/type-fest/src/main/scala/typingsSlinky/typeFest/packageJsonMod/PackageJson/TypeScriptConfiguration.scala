package typingsSlinky.typeFest.packageJsonMod.PackageJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeScriptConfiguration extends js.Object {
  /**
  		Location of the bundled TypeScript declaration file.
  		*/
  var types: js.UndefOr[String] = js.native
  /**
  		Location of the bundled TypeScript declaration file. Alias of `types`.
  		*/
  var typings: js.UndefOr[String] = js.native
}

object TypeScriptConfiguration {
  @scala.inline
  def apply(): TypeScriptConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeScriptConfiguration]
  }
  @scala.inline
  implicit class TypeScriptConfigurationOps[Self <: TypeScriptConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
    @scala.inline
    def withTypings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typings")(js.undefined)
        ret
    }
  }
  
}

