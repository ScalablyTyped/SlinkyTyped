package typingsSlinky.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveLoader extends Resolve {
  var enforceModuleExtension: js.UndefOr[Boolean] = js.native
  /**
    * List of strings to append to a loader's name when trying to resolve it.
    */
  var moduleExtensions: js.UndefOr[js.Array[String]] = js.native
}

object ResolveLoader {
  @scala.inline
  def apply(): ResolveLoader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveLoader]
  }
  @scala.inline
  implicit class ResolveLoaderOps[Self <: ResolveLoader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnforceModuleExtension(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceModuleExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceModuleExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceModuleExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleExtensions")(js.undefined)
        ret
    }
  }
  
}

