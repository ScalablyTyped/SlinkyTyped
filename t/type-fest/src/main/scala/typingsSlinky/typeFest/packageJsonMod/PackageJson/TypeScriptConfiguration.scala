package typingsSlinky.typeFest.packageJsonMod.PackageJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeScriptConfiguration extends js.Object {
  /**
  		Location of the bundled TypeScript declaration file.
  		*/
  var types: js.UndefOr[String] = js.undefined
  /**
  		Location of the bundled TypeScript declaration file. Alias of `types`.
  		*/
  var typings: js.UndefOr[String] = js.undefined
}

object TypeScriptConfiguration {
  @scala.inline
  def apply(types: String = null, typings: String = null): TypeScriptConfiguration = {
    val __obj = js.Dynamic.literal()
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (typings != null) __obj.updateDynamic("typings")(typings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeScriptConfiguration]
  }
}

