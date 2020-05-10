package typingsSlinky.tslint.exclusionsMod

import typingsSlinky.tslint.exclusionMod.Exclusion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocTypeExclusions extends js.Object {
  var overloadsSeparateDocs: js.UndefOr[Boolean] = js.native
  var requirements: js.Array[Exclusion[_]] = js.native
}

object DocTypeExclusions {
  @scala.inline
  def apply(requirements: js.Array[Exclusion[_]]): DocTypeExclusions = {
    val __obj = js.Dynamic.literal(requirements = requirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocTypeExclusions]
  }
  @scala.inline
  implicit class DocTypeExclusionsOps[Self <: DocTypeExclusions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequirements(value: js.Array[Exclusion[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverloadsSeparateDocs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overloadsSeparateDocs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverloadsSeparateDocs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overloadsSeparateDocs")(js.undefined)
        ret
    }
  }
  
}

