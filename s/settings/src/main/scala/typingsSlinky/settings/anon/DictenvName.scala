package typingsSlinky.settings.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.settings.mod.PathOrModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictenvName
  extends  // error is thrown if 'common' object is not provided
/* envName */ StringDictionary[js.Any]
     with PathOrModule {
  var common: js.Any = js.native
  var forceEnv: js.UndefOr[String] = js.native
}

object DictenvName {
  @scala.inline
  def apply(common: js.Any): DictenvName = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictenvName]
  }
  @scala.inline
  implicit class DictenvNameOps[Self <: DictenvName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommon(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceEnv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceEnv")(js.undefined)
        ret
    }
  }
  
}

